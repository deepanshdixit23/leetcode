class Solution {
    public boolean isLengthEven(Node head) {
        
        int count = 0;
        // code here
        while(head != null){
            count++;
            head = head.next;
        }
        
        return count%2 == 0;
    }
}