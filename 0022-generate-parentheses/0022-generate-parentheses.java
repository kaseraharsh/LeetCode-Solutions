class Solution {

    public void generate( String s, int n,int l,int r, List<String> ans  ){
        if(r==n){
            ans.add(s);
            return;
        }
        if(l<n) generate(s+"(",n,l+1,r,ans);
        if(r<l) generate(s+")",n,l,r+1,ans);


    }
    public List<String> generateParenthesis(int n) {
         List<String> ans = new  ArrayList<>();
         generate("",n,0,0,ans);
         return ans;
        
    }
}