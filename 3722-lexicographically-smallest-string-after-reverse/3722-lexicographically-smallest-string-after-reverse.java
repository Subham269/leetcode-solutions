class Solution {
    public String lexSmallest(String s) {
        String first="",last="",front="",back="",won="";
        String fin=s;
        for(int i=0;i<s.length();i++)
        {
            first=s.substring(0,i);
            last=s.substring(s.length()-i);
            front=first+reverse(s.substring(i,s.length()));
            back=reverse(s.substring(0,s.length()-i)) + last;
            if(front.compareTo(back)<=0)
            won=front;
            else
            won=back;
            if(won.compareTo(fin)<0)
            fin=won;

        }
        return fin;
    }
    public String reverse(String a)
    {
        if(a.length()<=1)
        return a;
        StringBuilder sb = new StringBuilder(a);
        return sb.reverse().toString();
    }
}