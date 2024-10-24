/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} list1
 * @param {ListNode} list2
 * @return {ListNode}
 */
var mergeTwoLists = function (list1, list2) {
  let dummy = new ListNode();
  let current = dummy; // Pointer to build the merged list

  // Traverse both lists and merge
  while (list1 !== null && list2 !== null) {
    if (list1.val < list2.val) {
      current.next = list1; // Add list1's node
      list1 = list1.next; // Move list1's pointer forward
    } else {
      current.next = list2; // Add list2's node
      list2 = list2.next; // Move list2's pointer forward
    }
    current = current.next; // Move the merged list pointer
  }

  // If there are remaining nodes in either list, append them
  if (list1 !== null) {
    current.next = list1;
  } else if (list2 !== null) {
    current.next = list2;
  }

  // Return the next node of the dummy (head of the merged list)
  return dummy.next;
};
