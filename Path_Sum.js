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
 * @param {number} targetSum
 * @return {boolean}
 */
var temp = function (root, targetSum, sum) {
  if (!root) return 0;

  sum += root.val;

  if (!root.left && !root.right) {
    if (sum == targetSum) return true;
  }

  return temp(root.left, targetSum, sum) || temp(root.right, targetSum, sum);
};

var hasPathSum = function (root, targetSum) {
  return temp(root, targetSum, 0);
};
