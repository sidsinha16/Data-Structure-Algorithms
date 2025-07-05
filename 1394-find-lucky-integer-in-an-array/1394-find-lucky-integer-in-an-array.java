class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = -1;
        for(int i= 0; i< arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getKey().equals(entry.getValue())){
            result = Math.max(result, entry.getKey());
            }
        }
        return result;
    }
}