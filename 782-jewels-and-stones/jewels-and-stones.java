class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        boolean [] isJewels = new boolean[128];
        for(char ch : jewels.toCharArray()){
            isJewels[ch] = true;
        }
        for(char ch : stones.toCharArray()){
            if(isJewels[ch]){
                count++;
            }
        }
        return count;
    }
}