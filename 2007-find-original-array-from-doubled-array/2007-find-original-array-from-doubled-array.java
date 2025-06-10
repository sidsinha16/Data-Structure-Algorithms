class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if (n % 2 != 0) return new int[0];

        Map<Integer, Integer> map = new HashMap();
        
        Arrays.sort(changed);

        for (int change : changed) {
            map.put(change, map.getOrDefault(change, 0) + 1);
        }

        int[] newArr = new int[n / 2];
        int i = 0;
        for (int num : changed) {
            if (map.getOrDefault(num, 0) == 0) continue;

            if (num == 0) {
                // For 0, need at least 2 zeros to form a pair
                if (map.get(0) < 2) return new int[0];
                newArr[i++] = 0;
                map.put(0, map.get(0) - 2); // Decrement by 2
            } else {
                // For non-zero, check if num * 2 exists
                if (map.getOrDefault(num * 2, 0) == 0) return new int[0];
                newArr[i++] = num;
                map.put(num, map.get(num) - 1);
                map.put(num * 2, map.get(num * 2) - 1);
            }
        }

        return i == newArr.length ? newArr : new int[0];
    }
}