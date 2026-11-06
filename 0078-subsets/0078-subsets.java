class Solution {
  
    public List<List<Integer>> subsets(int[] nums) {
        return power(new ArrayList<>(),0,nums);
        
    }

    public List<List<Integer>> power(ArrayList<Integer> arr, int idx,int [] nums){
          List<List<Integer>> ans= new ArrayList<>();
        if(idx==nums.length){
             ans.add(new ArrayList<>(arr));
            return ans;

        }
        arr.add(nums[idx]);
        ans.addAll(power(arr, idx + 1, nums));
        arr.remove(arr.size()-1);
        ans.addAll(power(arr, idx + 1, nums));

        return ans;

        
    }
}