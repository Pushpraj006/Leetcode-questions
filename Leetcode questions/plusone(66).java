class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] +=1;
                return digits; 
            }
            else{
                digits[i]=0;
            }
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}


// BY JAVASCRIPT

/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function(digits) {
    for(let i=digits.length-1;i>=0;i--){
        if(digits[i]<9){
            digits[i]++
            return digits
        }
        else{
            digits[i]=0;
        }
        
    
    }
    digits.unshift(1)
    return digits;
};
