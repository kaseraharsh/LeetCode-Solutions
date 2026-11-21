class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String s=countAndSay(n-1);
        int i=0,j=0;
        int freq=0;
        String ans="";
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                freq=j-i;
                ans= ans+freq;
                ans=ans+s.charAt(i);
                i=j;
            }
        }
          freq=j-i;
          ans= ans+freq;
          ans=ans+s.charAt(i);
          i=j;
          return ans;


        
    }
}