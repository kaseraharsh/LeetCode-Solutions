class Solution {
    public int[] twoSum(int[] arr, int target) {
        int [] ans= new int[2];
        int n= arr.length;
        for(int i=0; i<n;i++){
            int value=target-arr[i];
            int l=i+1,r=n-1;
            while(l<=r){
                int mid=(l+r)/2;
                if(arr[mid]>value) r=mid-1;
                else if(arr[mid]<value) l=mid+1;
                else{
                    ans[0]=i+1;
                    ans[1]=mid+1;
                    break;
                }
            }
        }
        return ans;
        
    }
}