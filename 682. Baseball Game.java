/* You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.

You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:

An integer x.
Record a new score of x.
'+'.
Record a new score that is the sum of the previous two scores.
'D'.
Record a new score that is the double of the previous score.
'C'.
Invalidate the previous score, removing it from the record.
Return the sum of all the scores on the record after applying all the operations.

The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid. */

import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) 
        {
            if (!operations[i].equals("C") && !operations[i].equals("D") && !operations[i].equals("+"))
            {
                int a = Integer.parseInt(operations[i]);
                list.add(a);
            }
            else if (operations[i].equals("D")) 
            {  
                int a = list.get(list.size() - 1) * 2; 
                list.add(a);
            }
            else if (operations[i].equals("+")) 
            {  
                int a = list.get(list.size() - 1) + list.get(list.size() - 2); 
                list.add(a);
            }
            else 
            {  
                list.remove(list.size() - 1);  
            }
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++) 
        {
            sum += list.get(i);
        }

        return sum;
    }
}
