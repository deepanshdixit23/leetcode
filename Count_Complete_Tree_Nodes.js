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
 * @return {number}
 */

var count = function (root) {
  if (!root) return 0;

  return 1 + count(root.left) + count(root.right);
};

var countNodes = function (root) {
  if (!root) return 0;

  return count(root.left) + count(root.right) + 1;
};
