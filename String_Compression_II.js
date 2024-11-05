/**
 * @param {string} s
 * @param {number} k
 * @return {number}
 */

 
let encoding = function (s){

let temp = "";
let count = 0;
let ans = "";

for (let i = 0; i < s.length + 1; i++) {

    if (temp == s[i]) {
        count++;
    }
    else {
        if(count == 0){
            temp = s[i];
            count++;
        }
        else{

            if(count == 1){
                 ans += temp + "";
                 temp = s[i];
                 count = 1;

            }
            else{
                ans += temp + "" + count;
                temp = s[i];
                count = 1;
            }
        }
    }
    
}
    
return ans;

}

let count = function(ans){

    for(let i = 0 ; i < ans.length ; i++){
        
    }

}

var getLengthOfOptimalCompression = function (s, k) {};


console.log(encoding("aaabcccd"));

console.log(count("aaabcccd"));
