class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int day = 1, i = 0, count = 0, n = events.length;

        while (i < n || !minHeap.isEmpty()) {
            // Add all events starting today
            while (i < n && events[i][0] <= day) {
                minHeap.offer(events[i++][1]); // add end day
            }

            // Remove all expired events
            while (!minHeap.isEmpty() && minHeap.peek() < day) {
                minHeap.poll();
            }

            // Attend the earliest ending event
            if (!minHeap.isEmpty()) {
                minHeap.poll();
                count++;
            }

            day++;
        }

        return count;
    }
}
