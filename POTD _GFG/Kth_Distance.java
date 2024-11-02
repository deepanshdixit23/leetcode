class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        // your code
        
        int n = arr.length;
        
        int num = 0;
        
        
        for(int i = 0 ; i < n ; i++){
            num = arr[i];
            
            for(int j = (i+1) ; j <= (i+k) && j < n ; j++){
                if(num == arr[j]) return true;
            }
            
        }
        
     return false;   
    }
}