class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>(); // store indices

        // for (int i = 0; i < n; i++) {
        //     while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
        //         int prevIndex = stack.pop();
        //         result[prevIndex] = i - prevIndex;
        //     }
        //     stack.push(i);
        // }

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }

            result[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }

        return result;
    }
}