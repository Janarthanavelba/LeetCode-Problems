/* A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
A self-dividing number is not allowed to contain the digit zero.

Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right] (both inclusive). */

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer>list=new ArrayList<>();

        for(int i=left;i<=right;i++)
        {
            int num=i;
            int c=0,cc=0;
            int j=i;
            while(j>0)
            {
                cc++;
                int a=j%10;
                if(a != 0 && num % a == 0) c++;
                j=j/10;
            }

            if(c==cc) list.add(num);
        }

        return list;
        
    }
}
