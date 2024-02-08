class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {

        Arrays.sort(arr);

        int diff = arr[1] - arr[0];
        if(diff == 0){
            for (int i = arr.length - 1; i > 0; i--) {
                if ((arr[i] - arr[i - 1]) != diff) {
                    return false;
                }
            }
            return true;
        }
        else if (diff != 1) {
            for (int i = arr.length - 1; i > 0; i--) {
                if ((((arr[i] - arr[i - 1]) % diff) != 0) || ((arr[i] - arr[i - 1]) == 0)) {
                    return false;
                }
            }
            return true;
        }else{
            for (int i = arr.length - 1; i > 0; i--) {
                if ((arr[i] - arr[i - 1]) != diff) {
                    return false;
                }
            }
            return true;
        }

    }
}