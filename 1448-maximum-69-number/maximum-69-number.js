/**
 * @param {number} num
 * @return {number}
 */
var maximum69Number  = function(num) {

    let n=num;
    let s=n.toString();
    for(let i=0;i<s.length;i++)
    {
        let arr = s.split(''); 
        if (arr[i] == '9') arr[i] = '6';
        else arr[i] = '9';

        let nn = Number(arr.join(''));

        if(nn>n) n=nn;
        
        arr[i]=s[i];
    }    
    return n;
};