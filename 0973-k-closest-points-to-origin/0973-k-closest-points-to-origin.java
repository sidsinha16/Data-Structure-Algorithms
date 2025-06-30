public int[][] kClosest(int[][] points, int k) {
    PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
        (a, b) -> Integer.compare(
            dist(b), dist(a)  // max-heap by distance
        )
    );

    for (int[] point : points) {
        maxHeap.offer(point);
        if (maxHeap.size() > k) {
            maxHeap.poll();  // remove farthest
        }
    }

    int[][] result = new int[k][2];
    int i = 0;
    for (int[] point : maxHeap) {
        result[i++] = point;
    }
    return result;
}

private int dist(int[] p) {
    return p[0] * p[0] + p[1] * p[1];  // no sqrt needed
}
