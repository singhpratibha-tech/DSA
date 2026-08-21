class Solution {
    public int maxVowels(String s, int k) {

        HashSet<Character> vowels = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u')
        );

        int count = 0;
        int max = 0;

        // First window
        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);

            if (vowels.contains(ch)) {
                count++;
            }
        }

        max = count;

        // Sliding window
        for (int i = k; i < s.length(); i++) {

            char ch1 = s.charAt(i - k); // leaving
            char ch2 = s.charAt(i);     // entering

            if (vowels.contains(ch1)) {
                count--;
            }

            if (vowels.contains(ch2)) {
                count++;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}