/**
 * @param {number} n
 * @return {boolean}
 */
var isHappy = function (n) {
  const set = new Set();

  while (true) {
    let sum = 0;

    if (set.has(n)) {
      return false;
    }

    set.add(n);

    while (n != 0) {
      sum += Math.floor(Math.pow(n % 10, 2));

      n = Math.floor(n / 10);
    }

    if (sum == 1) return true;

    n = sum;
  }
};

console.log(isHappy(19));
