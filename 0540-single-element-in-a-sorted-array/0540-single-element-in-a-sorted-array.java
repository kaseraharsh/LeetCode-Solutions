class Solution {
    public int singleNonDuplicate(int[] nums) {
      int n=nums.length;
      if(n==1) return nums[0];
      if(nums[0]!= nums[1]) return nums[0];
      if(nums[n-1]!= nums[n-2]) return nums[n-1];
      int l=0,r=n-1;
      while(l<=r){
        int mid=(r-l)/2+l;
        if(nums[mid+1]!=nums[mid] && nums[mid-1]!=nums[mid]){
            return nums[mid]; 
        }else{

        
            int p=mid,d=mid;
            if(nums[mid-1]==nums[mid]) p=mid-1;
            else if(nums[mid+1]==nums[mid]) d=mid+1;
            int countleft=p-l;
            int countright=r-d;
            if(countleft%2==0) l=d+1;
            else r=p-1;
        }
      } 
      return -1;
    }
}