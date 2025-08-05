class Solution {
    public List<String> commonChars(String[] words) {

        List<String>list=new ArrayList<>();

        String s=words[0];

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            boolean b=true;
            for(int j=0;j<words.length;j++)
            {
                if(!words[j].contains(String.valueOf(ch)))
                {
                    b=false;
                    break;
                }
            }
            if(b) list.add(String.valueOf(ch));
            for (int j = 1; j < words.length; j++) {
                    words[j] = words[j].replaceFirst(String.valueOf(ch), "");
                }
        }
      return list;  
    }
}