package ext.basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> existingChildren = new HashSet();
		existingChildren.add("4AHE0524HH0003");
		existingChildren.add("4AHE0AAA4R0001");
		existingChildren.add("4ACC4500XXP0008");
		
		Map<String, Set<String>> mockData = new HashMap<>();
		
		mockData.put("P761059102", new HashSet<>(Arrays.asList("4AHE0524HH0003", "4AHE0AAA4R0001", "4ACC4500XXP0008")));
        mockData.put("P410104666", new HashSet<>(Arrays.asList("4AHE0524HH0003", "4AHE0AAA4R0001")));
		
        
        for (Map.Entry<String, Set<String>> entry : mockData.entrySet()) {
			String partNumber = entry.getKey();
			Set<String> partChildren = entry.getValue();
			
			partChildren.forEach(p -> System.out
					.println("  " + p ));

			if (existingChildren.equals(partChildren)) {
				System.out.println("✅ Matching part found: " + partNumber);
			}
		}
	}

}
