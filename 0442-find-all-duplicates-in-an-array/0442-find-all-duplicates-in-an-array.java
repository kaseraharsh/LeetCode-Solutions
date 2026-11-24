class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> ans= new ArrayList<Integer>();
        int n=arr.length;
        int i=0;
        while(i<n){
            if(arr[i]==i+1) i++;
            else{
                int idx=arr[i]-1;
                if(arr[i]==arr[idx]){
                     if (!ans.contains(arr[i])) {
                        ans.add(arr[i]);
                    }
                    i++;
                }else{
                     int temp= arr[i];
                     arr[i]=arr[idx];
                     arr[idx]=temp;
                }
            }
            
        }
        return ans;
        
    }
}