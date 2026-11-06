class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        power(new ArrayList<>(),0,nums,ans);
        return ans;
        
    }

    public void power(ArrayList<Integer> arr, int idx, int [] nums,  List<List<Integer>> ans){
        if(idx==nums.length){
            ans.add(new ArrayList<>(arr));
            return;
        }
        arr.add(nums[idx]);
        power(arr,idx+1, nums,ans);
        arr.remove(arr.size()-1);
        power(arr,idx+1,nums,ans);
    }
}