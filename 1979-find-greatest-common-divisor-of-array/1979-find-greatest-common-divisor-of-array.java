class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
        if(min>nums[i]) min=nums[i];
       }
        for(int i=0;i<nums.length;i++){
        if(max<nums[i]) max=nums[i];
       }
       return gcd(min,max);
    // int hcf=1;
    // for(int i=1; i<=min; i++){
    //     if(min%i==0 && max%i==0){
    //         hcf=i;
    //     }
    // }
    // return hcf;
        
    }
    public int gcd(int a, int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
}