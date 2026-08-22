class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int start = 0;
        int end = 0;
        int max = 0;

        while(end < s.length()){
             char ch1 = s.charAt(start);
             char ch2 = s.charAt(end);

            if(set.contains(ch2)){
                set.remove(ch1);
                start++;
            }
            if(!set.contains(ch2)){
                set.add(ch2);
                end++;
            }
            max = Math.max(max, end-start);

        }
        return max;
    }
}