/* Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Example 1:
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

Example 2:
Input: digits = ""
Output: []

Example 3:
Input: digits = "2"
Output: ["a","b","c"] */

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> l1 = new ArrayList<>();
        
        for (int i = 0; i < digits.length(); i++) {
            if (digits.charAt(i) == '2') l1.add("abc");
            if (digits.charAt(i) == '3') l1.add("def"); 
            if (digits.charAt(i) == '4') l1.add("ghi");
            if (digits.charAt(i) == '5') l1.add("jkl");
            if (digits.charAt(i) == '6') l1.add("mno"); 
            if (digits.charAt(i) == '7') l1.add("pqrs");
            if (digits.charAt(i) == '8') l1.add("tuv");
            if (digits.charAt(i) == '9') l1.add("wxyz"); 
        }

        List<String> res = new ArrayList<>();
        if (l1.size() == 0) return res;

        res.add(""); 

        for (int i = 0; i < l1.size(); i++) 
        {
            String letters = l1.get(i);
            List<String> temp = new ArrayList<>();

            for (int j = 0; j < res.size(); j++) 
            {
                String prefix = res.get(j);

                for (int k = 0; k < letters.length(); k++) 
                {
                    temp.add(prefix + letters.charAt(k));
                }
            }

            res = temp;
        }

        return res;
    }
}
