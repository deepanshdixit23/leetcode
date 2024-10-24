/**
 * @param {number[]} nums
 * @return {string[]}
 */
var summaryRanges = function (nums) {
    let list = [];

    let i = 0;

    let j = 0;

    let str = "";

    while(i < nums.length){

        if(nums[i] == j){
        
        if(str == ""){
            
            str = str + i;

        }

        else str = str + "->" +i;

    }
i++;
    }
};


console.log(summaryRanges([0, 1, 2, 4, 5, 7]));
