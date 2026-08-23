class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i]%2 == 0){
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }
        }
        int maxFreq = 0;
        int ans = -1;
        
        for(int keys : map.keySet()){
            int freq = map.get(keys);
            if(freq > maxFreq){
                maxFreq = freq;
                ans = keys;
            } else if(freq == maxFreq && keys < ans){
                ans = keys;
            }
        }
        
        return ans;
        
    }
}