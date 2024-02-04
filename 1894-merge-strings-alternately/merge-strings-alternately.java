class Solution {
    public String mergeAlternately(String word1, String word2) {

        String result = ""; 

        if(word1.length() >= word2.length()){
            for(int i = 0; i < word2.length(); i++){
                result = result + word1.charAt(i) + word2.charAt(i);
            }
            for(int j = word2.length(); j < word1.length(); j++){
                result = result + word1.charAt(j);
            }
        }else{
            for(int i = 0; i < word1.length(); i++){
                result = result + word1.charAt(i) + word2.charAt(i);
            }
            for(int j = word1.length(); j < word2.length(); j++){
                result = result + word2.charAt(j);
            }
        }
        return result;
        
    }
}