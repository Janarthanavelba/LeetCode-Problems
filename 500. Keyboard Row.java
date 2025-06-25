/* Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.
Note that the strings are case-insensitive, both lowercased and uppercased of the same letter are treated as if they are at the same row.
In the American keyboard:
the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".

Example 1:
Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]
Explanation:
Both "a" and "A" are in the 2nd row of the American keyboard due to case insensitivity.

Example 2:
Input: words = ["omk"]
Output: []

Example 3:
Input: words = ["adsdf","sfd"]
Output: ["adsdf","sfd"] */

class Solution {
    public String[] findWords(String[] words) {

        List<String>list=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            String s=words[i].toLowerCase();
int c1=0,c2=0,c3=0;

            for(int j=0;j<s.length();j++)
            {
                char c=s.charAt(j);

                if(c=='q'||c=='w'||c=='e'||c=='r'||c=='t'||c=='y'||c=='u'||c=='i'||c=='o'||c=='p') c1++;
                else if(c=='a'||c=='s'||c=='d'||c=='f'||c=='g'||c=='h'||c=='j'||c=='k'||c=='l') c2++;
                else c3++;
            }
            if(c1!=0 && c2==0 && c3==0 || c1==0 && c2!=0 && c3==0 || c1==0 && c2==0 && c3!=0) list.add(words[i]);
        }
        String[]ss=new String[list.size()];
for(int i=0;i<list.size();i++)
{
    ss[i]=list.get(i);
}
return ss;
    }
}
