/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {TreeNode}
 */

let swap = function (curr) {
  if (!curr) return;

  swap(curr.left);
  swap(curr.right);

  temp = curr.left;
  curr.left = curr.right;
  curr.right = temp;
};
var invertTree = function (root) {
  swap(root);

  return root;
};
