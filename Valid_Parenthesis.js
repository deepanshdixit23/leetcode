/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function (s) {
  let arr = [];

  for (let char of s) {
    if (char == "(" || char == "{" || char == "[") {
      arr.push(char);
    } else {
      if (char == ")" && arr[arr.length - 1] == "(") arr.pop();
      else if (char == "}" && arr[arr.length - 1] == "{") arr.pop();
      else if (char == "]" && arr[arr.length - 1] == "[") arr.pop();
      else return false;
    }
  }

  if (arr.length > 0) return false;

  return true;
};

console.log(isValid("()[]{}"));
