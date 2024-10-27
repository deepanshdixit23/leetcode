//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
class Solution {
    public boolean findTriplet(int[] arr) {
        
        int n = arr.length;
        
        int i = 0;
        int j = 0;
        
        int k = 0;
        
        int sum = 0;
        
        Arrays.sort(arr);
        
        while(i < (n)){
            
            j = i + 1;
            
            while(j < (n) ){
   
                k = j + 1;
                
                while ( k < (n)){
                    
                    if(arr[i] + arr[j] == arr[k] || arr[i] + arr[k] == arr[j] || arr[j] + arr[k] == arr[i] )return true;
                k++;}
                j++;
            }
            
            i++;
        }
        
        return false;
    }
}

//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            boolean res = obj.findTriplet(arr);
            if (res)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}

// } Driver Code Ends