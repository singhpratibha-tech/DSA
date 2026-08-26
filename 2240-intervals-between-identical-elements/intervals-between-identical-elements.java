class Solution {
    public long[] getDistances(int[] arr) {
        long[] ans = new long[arr.length];
        HashMap<Integer, Long> count = new HashMap<>();
        HashMap<Integer, Long> sum = new HashMap<>();
        //calculating from left
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];

            long c = count.getOrDefault(num, 0L);
            long s = sum.getOrDefault(num, 0L);

            ans[i] += i*c - s;
            count.put(num, c+1);
            sum.put(num, s+i);
        }
        // clearing the map 
        count.clear();
        sum.clear();

        //counting from right
        for(int i = arr.length-1; i>= 0; i--){
             int num = arr[i];

            long c = count.getOrDefault(num, 0L);
            long s = sum.getOrDefault(num, 0L);

            ans[i] += s - i*c;
            count.put(num, c+1);
            sum.put(num, s+i);
        }
        return ans;
    }
}