class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineletters = new HashMap<>();
        for( int i=0; i < magazine.length(); i++){
            char m = magazine.charAt(i);
            int count = magazineletters.getOrDefault(m,0);
            magazineletters.put(m, count + 1);
        }

        for(int i =0; i< ransomNote.length(); i++){
            char r =ransomNote.charAt(i);
            int count = magazineletters.getOrDefault(r,0);
            if (count == 0){
                return false;
            }
            magazineletters.put(r, count - 1);
        }
        return true;
    }
}