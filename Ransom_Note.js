/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
var canConstruct = function (ransomNote, magazine) {
  let arr = new Array(26).fill(0);

  for (let ch of magazine) {
    arr[ch.charCodeAt(0) - 97]++;
  }

  for (let ele of ransomNote) {
    arr[ele.charCodeAt(0) - 97]--;
    if (arr[ele.charCodeAt(0) - 97] < 0) {
      return false;
    }
  }

  return true;
};

console.log(canConstruct((ransomNote = "az"), (magazine = "ab")));
