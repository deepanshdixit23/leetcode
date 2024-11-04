/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */

let binary = function (nums, target) {
  let start = 0;
  let end = nums.length - 1;
  let mid = 0;

  while (start <= end) {
    mid = Math.floor((start + end) / 2);

    if (nums[mid] == target) {
      return mid;
    }
    if (nums[mid] < target) start = mid + 1;

    if (nums[mid] > target) end = mid - 1;

    // console.log(start + " " + mid + " " + end );
  }

  return end + 1;
};

var searchInsert = function (nums, target) {
  let n = nums.length;

  if (n == 0) return 0;

  if (target < nums[0]) return 0;

  if (nums[n - 1] < target) return n;

  return binary(nums, target);
};

// console.log(searchInsert([1,3,4,6,9,10,45],44));
