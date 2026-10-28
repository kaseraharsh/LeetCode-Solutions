class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int left =0,right=nums.length-1;
        while(left<=right){
            int mid=(right+left)/2;
            if(nums[mid]<target) left=mid+1;
            else if(nums[mid]>target) right=mid-1;
            else return true;
        }
        return false;
    }
}