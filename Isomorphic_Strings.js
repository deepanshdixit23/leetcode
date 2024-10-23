/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function (s, t) {
  if (s.length != t.length) return false;

  const hm = new Map();

  function isValueInMap(map, value) {
    for (let val of map.values()) {
        if (val === value) {
            return true; // Value is found
        }
    }
    return false; // Value not found
}

  for (let i = 0; i < s.length; i++) {

    if (hm.has(s[i])) {
      
      if (hm.get(s[i]) == t[i]) {
      } else return false;

    } 
    
    
    else {

      if(isValueInMap(hm,t[i])){
        return false;
      }
      else hm.set(s[i], t[i]);
    }
  }

  return true;
};

console.log(isIsomorphic((s = "egg"), (t = "add")));
