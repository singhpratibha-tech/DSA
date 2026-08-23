class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max= 0;
        for(int i = 0; i < nums.length; i++){
            
            map.put(nums[i], map.getOrDefault(nums[i] , 0)+1);
        }
       Integer [] keys  = map.keySet().toArray(new Integer[0]);

       Arrays.sort(keys, (a,b) -> map.get(b)- map.get(a));

       int[] ans = new int[k];
       for(int i = 0; i < k; i++){
        ans[i] = keys[i];
       }
       return ans;
    }
}