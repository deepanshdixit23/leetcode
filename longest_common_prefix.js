/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {

    let ts = "";
    let ans = "";
    let bool = true;

    for(let i = 0 ; i < strs[0].length ; i++){
      
      ts = (strs[0][i]);


      for(let j = 1; j < strs.length ; j++){

        if(ts != strs[j][i]){
             bool = false;
             break;
        }

      }

      if(bool == true){

        ans += ts;
        
    }
    else {
        break;
    }
      
        
    }

    

    return ans;
    
};
    

// console.log(longestCommonPrefix(["flower","flow","flight"]));