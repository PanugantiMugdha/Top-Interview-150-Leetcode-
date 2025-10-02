class Solution {
    // public static void main(String[] args)
    // {
    //     String s="Hello World";
    //     System.out.println(lengthOfLastWord(s));
    // }
    public int lengthOfLastWord(String s) {
        String s1=s.trim();
        int count=0;
        for(int i=s1.length()-1;i>=0;i--)
        {
            if(s1.charAt(i) != ' ')
            {
                count++;
            }
            else
            {
                break;
            }
        }
        return count;
    }
}
