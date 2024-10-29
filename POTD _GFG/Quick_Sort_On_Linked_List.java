 public static Node quickSort(Node head) {
        return quickSortRecursive(head, getTail(head));
    }

    // Helper function to get the tail of the list
    private static Node getTail(Node node) {
        while (node != null && node.next != null) {
            node = node.next;
        }
        return node;
    }

    // Recursive QuickSort function for linked list
    private static Node quickSortRecursive(Node head, Node tail) {
        // Base case: If head is null or the list has only one element
        if (head == null || head == tail) {
            return head;
        }

        Node[] partitioned = partition(head, tail);
        Node newHead = partitioned[0];
        Node pivot = partitioned[1];
        Node newTail = partitioned[2];

        // Recursively sort the list before the pivot
        if (newHead != pivot) {
            Node temp = newHead;
            while (temp.next != pivot) {
                temp = temp.next;
            }
            temp.next = null;
            newHead = quickSortRecursive(newHead, temp);
            temp = getTail(newHead);
            temp.next = pivot;
        }

        // Recursively sort the list after the pivot
        pivot.next = quickSortRecursive(pivot.next, newTail);

        return newHead;
    }

    // Partition the list around a pivot and return the new head, pivot, and tail
    private static Node[] partition(Node head, Node tail) {
        Node pivot = tail;
        Node prev = null, curr = head, end = tail;
        Node newHead = null, newTail = null;

        // Traverse and partition the list
        while (curr != pivot) {
            if (curr.data < pivot.data) {
                if (newHead == null) {
                    newHead = curr;
                }
                prev = curr;
                curr = curr.next;
            } else {
                if (prev != null) {
                    prev.next = curr.next;
                }
                Node temp = curr.next;
                curr.next = null;
                end.next = curr;
                end = curr;
                curr = temp;
            }
        }

        if (newHead == null) {
            newHead = pivot;
        }

        newTail = end;
        return new Node[] { newHead, pivot, newTail };
    }