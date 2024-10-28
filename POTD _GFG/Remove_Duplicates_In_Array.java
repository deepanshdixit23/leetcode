

class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        
        
        ArrayList<Integer> hash = new ArrayList<>();
        
        for(int i = 0 ; i < arr.length ; i++){
            if(hash.contains(arr[i])){
                continue;
            }
            else hash.add(arr[i]);
        }
        
        
        
        
        return hash;
    }
}