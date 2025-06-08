class Solution {
    // first sort the string 
    // create a map if same key is there then add thoes idx
    //add it to list
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            String sorted = sorting(str);
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }

    static String sorting(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars); 
    }
}