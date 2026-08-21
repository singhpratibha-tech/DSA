class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> check = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            check.put(ch, check.getOrDefault(ch, 0) + 1);
        }
        for (Character key : map.keySet()) {
            if(!check.containsKey(key)){
                return false;
            }
            if(map.get(key) > check.get(key)){
                return false;
            }
           
        }
          return true;
    }
}