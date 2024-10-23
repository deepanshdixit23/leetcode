/**
 * @param {string} pattern
 * @param {string} s
 * @return {boolean}
 */
var wordPattern = function (pattern, s) {
  let arr = s.split(" ");

  if (arr.length != pattern.length) return false;

  let hm = new Map();
  let set = new Set();

  for (let i = 0; i < arr.length; i++) {
    if (hm.has(pattern[i])) {
      if (arr[i] == hm.get(pattern[i])) {
      } else return false;
    } else {
      if (set.has(arr[i])) {
        return false;
      } else {
        hm.set(pattern[i], arr[i]);
        set.add(arr[i]);
      }
    }
  }

  return true;
};

console.log(wordPattern((pattern = "aaaa"), (s = "dog cat cat dog")));
