/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isSubsequence = function (s, t) {
  let i = 0;
  let j = 0;
  let str = "";

  while (true) {
    if (s == t) {
      return true;
    }
    ch = s[i];
    ch1 = t[j];

    // console.log(ch + " " + ch1);

    if (ch == ch1) {
      i++;
      j++;
      str += ch;
    } else if (ch != ch1) j++;

    if (str == s) {
      return true;
    }

    if (ch == undefined || ch1 == undefined) {
      break;
    }
  }

  return false;
};

console.log(isSubsequence((s = "axc"), (t = "ahbgdc")));
