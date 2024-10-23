/**
 * @param {number[]} nums
 * @param {number} k
 * @return {boolean}
 */
var containsNearbyDuplicate = function (nums, k) {
  const set = new Set();
  const map = new Map();

  let i = 0;

  while (i < nums.length) {
    if (set.has(nums[i])) {
      console.log(nums[i]);

      if (Math.abs(map.get(nums[i]) - i) <= k) {
        return true;
      } else {
        map.set(nums[i], i);
      }
    } else {
      set.add(nums[i]);
      map.set(nums[i], i);
    }
    i++;
  }

  return false;
};

console.log(containsNearbyDuplicate((nums = [1, 0, 1, 1]), (k = 1)));
