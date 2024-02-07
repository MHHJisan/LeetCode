class Solution {
    public boolean repeatedSubstringPattern(String s) {

        int l = s.length();

        for(int i = l/2; i >= 1; i--){
            if(l%i == 0){
        
                String subStr = s.substring(0,i);
        
                StringBuilder str = new StringBuilder();
        
        
                for( int j = 0; j < l/i; j++){
                    str.append(subStr);
                }
                if(str.toString().equals(s)){
                    return true;
                }
            }
        }
        return false;
    }
}