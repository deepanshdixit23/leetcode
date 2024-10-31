


/*class of the node of the DLL is as
/*
class Node {
    int data;
    Node prev, next;
    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}
*/
class Solution {
    public Node sortedInsert(Node head, int x) {
        Node newNode = new Node(x);

        // Case 1: Insert at the head (before the first element)
        if (head == null || head.data >= x) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            return newNode; // New head
        }

        // Case 2: Traverse the list to find the insertion point
        Node current = head;
        while (current.next != null && current.next.data < x) {
            current = current.next;
        }

        // Insert the new node
        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        }

        current.next = newNode;

        return head; // Return the head of the modified list
    }
}