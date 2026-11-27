class Solution {
    public int removeDuplicates(int[] nums) {
       int []arr=new int[nums.length];
       int k=0;
       arr[k]=nums[0];
       for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[i-1]){
            k++;
            arr[k]=nums[i];
        }
       }
       for(int i=0;i<=k;i++){
        nums[i]=arr[i];
       }
       return k+1;

    }
}