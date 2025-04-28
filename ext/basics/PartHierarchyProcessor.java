package ext.basics;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

public class PartHierarchyProcessor {

    public static String TOP_PARENT_NUMBER = "";

    public static void main(String[] args) {
        process();
    }

    public static void process() {
        try {
            String jsonPath = "C:\\ptc\\Windchill_13.0\\Windchill\\codebase\\netmarkets\\jsp\\treegridExt\\ds\\test_data\\part.data.json";
            InputStream is = new FileInputStream(jsonPath);
            JSONObject jsonObject = new JSONObject(new JSONTokener(is));
            JSONArray suggestions = jsonObject.getJSONArray("Suggestions");

            Map<String, String> pvTreeIdToPartNumber = new HashMap<>();
            Map<String, List<String>> parentToChildren = new HashMap<>();
            Set<String> placeholderParts = new HashSet<>();
            Map<String, JSONObject> latestEntries = new LinkedHashMap<>();
            Map<String, String> partNumberToName = new HashMap<>(); // 🔁 ADDED

            // First pass: PVTreeId -> PartNumber + detect placeholder
            for (int i = 0; i < suggestions.length(); i++) {
                JSONObject obj = suggestions.getJSONObject(i);
                String pvTreeId = obj.optString("PVTreeId", "");
                String partNumber = obj.optString("PartNumber", "");
                String name = obj.optString("Name", "");

                pvTreeIdToPartNumber.put(pvTreeId, partNumber);
                partNumberToName.put(partNumber, name); // 🔁 Store PartNumber → Name

                if (pvTreeId.startsWith("/PPT") || pvTreeId.startsWith("/MPT")) {
                    placeholderParts.add(partNumber);
                }

                // Check if this is the priority parent based on the empty "PVParentTreeId"
                String parentTreeId = obj.optString("PVParentTreeId", "");
                if (parentTreeId == null || parentTreeId.isBlank()) {
                    TOP_PARENT_NUMBER = partNumber;
                }

                String parentId = obj.optString("PVParentTreeId", "");
                if (!parentId.isEmpty()) {
                    String comboKey = name + "::" + parentId;
                    latestEntries.put(comboKey, obj); // Keep last occurrence
                }
            }

            // Build parent-child relationships using latest entries
            for (JSONObject obj : latestEntries.values()) {
                String parentId = obj.optString("PVParentTreeId", "");
                String parentPart = pvTreeIdToPartNumber.getOrDefault(parentId, parentId);
                String childPart = obj.optString("PartNumber", "");
                parentToChildren.computeIfAbsent(parentPart, k -> new ArrayList<>()).add(childPart);
            }

            // Check usage links
            Map<String, Map<String, Boolean>> parentChildLinkMap = new HashMap<>();
            for (Map.Entry<String, List<String>> entry : parentToChildren.entrySet()) {
                String parent = entry.getKey();
                Map<String, Boolean> childMap = new HashMap<>();
                for (String child : entry.getValue()) {
                    boolean exists = checkPartUsageLinkExists(parent, child); // Stubbed
                    childMap.put(child, exists);
                }
                parentChildLinkMap.put(parent, childMap);
            }

            // Process hierarchy
            Set<String> visited = new HashSet<>();

            // 1. Print priority parent first
            if (parentChildLinkMap.containsKey(TOP_PARENT_NUMBER)) {
                System.out.println("\n>> Printing Priority Parent and its hierarchy first:\n");
                printHierarchy(TOP_PARENT_NUMBER, parentChildLinkMap, partNumberToName, visited);
            }

            // 2. Print remaining parts
            for (String parent : parentChildLinkMap.keySet()) {
                if (!visited.contains(parent)) {
                    printHierarchy(parent, parentChildLinkMap, partNumberToName, visited);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Stub: Replace with actual Windchill QuerySpec/API
    private static boolean checkPartUsageLinkExists(String parent, String child) {
        return false;
    }

    // Helper method to print hierarchy
    private static void printHierarchy(String parent, Map<String, Map<String, Boolean>> parentChildLinkMap,
                                       Map<String, String> partNumberToName, Set<String> visited) {
        if (visited.contains(parent)) return;
        visited.add(parent);

        // Print the parent with its name
        System.out.println("Parent: " + parent + " - " + partNumberToName.getOrDefault(parent, ""));

        // Process children recursively
        Map<String, Boolean> children = parentChildLinkMap.getOrDefault(parent, Collections.emptyMap());
        for (Map.Entry<String, Boolean> entry : children.entrySet()) {
            String child = entry.getKey();
            System.out.println("  Child: " + child + " - " + partNumberToName.getOrDefault(child, "")
                    + " -> Exists: " + entry.getValue());
            //printHierarchy(child, parentChildLinkMap, partNumberToName, visited);
        }
    }
}
