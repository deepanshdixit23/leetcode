//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {


        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Read the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // Step 2: Initialize the array
        int[] arr = new int[n];
        
        // Step 3: Input elements into the array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
           
            Solution  temp = new Solution();


           ArrayList<Integer> v = temp.alternateSort(arr);

            for (int i = 0; i < v.size(); i++) System.out.print(v.get(i) + " ");

            System.out.println();
            System.out.println("~");

            scanner.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        Arrays.sort(arr);
        int [] ascarr = arr.clone();

        System.out.println(Arrays.toString(ascarr));
        
        // Reverse the array
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, d = 0, a = 0;


        while (i < arr.length) {
            if (i % 2 == 0) {
                list.add(arr[d]);
                d++;
            } else {
                list.add(ascarr[a]);
                a++;
            }
            i++;
        }

        return list;
    }
}
