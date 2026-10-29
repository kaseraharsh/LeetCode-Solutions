class Solution {
    public int findPeakElement(int[] nums) {
        int left=0,right=nums.length-1;
        if(left==right) return left;
        while(left<=right){
            int mid=(left+right)/2;
            if(mid<nums.length-1&& nums[mid]<nums[mid+1]) left=mid+1;
            else if(mid>0 && mid<nums.length-1 && nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
            else right=mid-1;

        }
        return left;
        
    }
}