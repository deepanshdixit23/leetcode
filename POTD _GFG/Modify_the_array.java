import java.util.*;

class Solution {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        // Complete the function
        
        ArrayList<Integer> list = new ArrayList<>();

        int l = arr.length;
        int count = 0;

        for (int i = 0 ; i < l ; i++) {

            if(arr[i] == 0) count++;

            else{

                if((i + 1) < l && arr[i] == arr[i + 1]){

                    list.add(arr[i] * 2);
                    arr[i + 1] = 0;

                }

                else{
                    list.add(arr[i]);
                }

            }
            

            
        }

        while(count > 0){
            list.add(0);
        }
        
        return list;
    }
}
