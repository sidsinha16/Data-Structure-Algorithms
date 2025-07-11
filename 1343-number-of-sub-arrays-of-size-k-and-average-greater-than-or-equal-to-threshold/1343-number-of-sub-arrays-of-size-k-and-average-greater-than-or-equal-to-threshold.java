class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
         
         int count = 0;
         int sum = 0;
         int i=0;
         int n = arr.length;

         while(i<n && i<k) { sum += arr[i]; i++; }

         if(sum/k >= threshold) {count++;}

         System.out.println(count);

         for(i=1; i<=n-k;i++){
            sum = sum - arr[i-1] + arr[i+k-1];
            if(sum/k >= threshold) {count++;}
         }

         return count;
    }
}