/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfFour = function(n) {
    
    if(n===1) return true;

    let p=1;

    while(p<n)
    {
        p=p*4;
        if(p===n) return true;
    }
    return false;
};