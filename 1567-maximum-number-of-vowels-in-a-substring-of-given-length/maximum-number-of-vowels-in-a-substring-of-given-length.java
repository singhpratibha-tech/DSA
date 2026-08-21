class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> vowels = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u')
            );

        HashSet<Character> window = new HashSet<>();

        int count = 0;
        int max = 0;
        for(int i = 0 ; i < k; i++){
            char ch = s.charAt(i);
            window.add(ch);
           if(vowels.contains(ch)){
            count++;
           }
        }
            

           max = count;
           for(int i = k ; i < s.length(); i++){
            char ch1 = s.charAt(i-k);
            char ch2 = s.charAt(i);
            window.remove(ch1);
            window.add(ch2);
            if(vowels.contains(ch1)){
                count--;
            }
            if(vowels.contains(ch2)){
                count++;
            }
            max = Math.max(max, count);
           }
           
        return max;
    }
}