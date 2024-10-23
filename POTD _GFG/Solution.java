
import java.util.ArrayList;

class Node {
    int data;
    Node next;

    public Node (int data){
        this.data = data;
        this.next = null;
    }
}


class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {

        if(head == null || n <= 0){
            return 0;
        }

        ArrayList<Integer> arr = new ArrayList<>();
       
       
        while(head != null){
            arr.add(head.data);
            head = head.next;
        }

        int l = arr.size();
        int sum = 0;

        for(int x : arr){

            if(l == n){

                sum+=x;

            }

            l--;

        }


       
  return sum;     
    }
}