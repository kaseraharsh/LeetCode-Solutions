class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String n=sb.toString();
        if(n.equals(s)) return true;
        else return false;  
    }
}