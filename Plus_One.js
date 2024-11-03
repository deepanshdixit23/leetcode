/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function (digits) {
  let n = digits.length;

  let temp = n + 1;

  if (n == 0) return digits;

  n--;

  while (temp--) {
    if (n < 0) {
      digits.unshift(1);
      break;
    }

    if (digits[n] + 1 < 10) {
      digits[n]++;
      break;
    }

    if (digits[n] + 1 >= 10) {
      digits[n] = 0;
      n--;
    }
  }
  return digits;
};

//  console.log(plusOne([9,9]));
