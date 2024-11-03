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
 * @return {number[]}
 */
let traverse = function(root,arr){
    if(!root) return;



}

var averageOfLevels = function(root) {
if (!root) return;
    let arr = [];

    arr.push((root.val).toFixed(5));

    traverse(root.left,arr);

    

};

let myInteger = 42;

// Convert the integer to a float with five decimal places
let myFloat = myInteger.toFixed(5);

// Convert the string to a number

console.log((42/5).toFixed(5));

