/* Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21 */

class Solution {
    public int reverse(int x) {
        int a=0;
        if(x>0)
        {
        while(x>0)
        {
            int z=x%10;
            if (a > (Integer.MAX_VALUE - z) / 10) return 0;
            a=a*10+z;
            x=x/10;
        }
        return a;
        }
        else
        {
            x=x*(-1);
            while(x>0)
        {
            int z=x%10;
            if (a > (Integer.MAX_VALUE - z) / 10) return 0;
            a=a*10+z;
            x=x/10;
        }
        return -a;
        }
    }
}
