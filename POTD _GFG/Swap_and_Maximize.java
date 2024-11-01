/**
 * Temp
 */


 class Solution {
    
    public long max(Long[] arr,int n){
        
        Long max = Long.MIN_VALUE;
        int temp = 0;
        
       for(int i = 0 ; i < n ; i++){
           if(arr[i] > max){
               max = arr[i];
               temp = i;
           }
       }
       
       arr[temp] = 0L;
    //    System.out.println(max);
       return max;
        
    }
    
    public long min(Long[] arr, int n){
          Long min = Long.MAX_VALUE;
        int temp = 0;
        
       for(int i = 0 ; i < n ; i++){
           if(arr[i] < min && arr[i] != 0){
               min = arr[i];
               temp = i;
           }
       }
       
       arr[temp] = 0L;
    //    System.out.println(min);
       return min;
        
    }
    
    public long maxSum(Long[] arr) {
        // code here
        int n = arr.length;
        
        Long sum = 0L;
        
        Long min = 0L;
        
        Long max = 0L;
        
        Long first = 0L;
        
        Long Last = 0L;
        
       for(int i = 0; i < n ; i++){
           if(i % 2 == 0){
               min = min(arr, n);
               
               if(i == 0) first = min;
               if(i == n - 1) Last = min;
           }
           
           else{
               max = max(arr,n);
                if(i == n - 1) Last = max;
               
           }
           
           if(i != 0){
           sum = sum + Math.abs(min - max);
           }
       }

    //    System.out.println(sum);
       
       sum = sum + Math.abs(first - Last);
       
       return sum;
    }
}

public class Swap_and_Maximize {
public static void main(String[] args) {
    Solution sol = new Solution();

    Long [] arr = {4l,2l,1l,8l};

    System.out.println(sol.maxSum(arr));

}

    
}

