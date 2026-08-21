class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxAr = 0;

        while (start <= end) {
            int len = Math.min(height[start], height[end]);
            int wid = end - start;
            int temp = len * wid;
            maxAr = Math.max(maxAr, temp);
            if (height[start] < height[end] ) {
                start++;
            } else {
                end--;
            }

        }
        return maxAr;
    }
}