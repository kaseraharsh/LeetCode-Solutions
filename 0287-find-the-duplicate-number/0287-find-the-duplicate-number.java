class Solution {
    public int findDuplicate(int[] arr) {
        int n=arr.length;
        int i=0;
        while(i<n){
            if(arr[i]==i+1 || arr[i] ==n ) i++;
            else{
                int idx=arr[i]-1;
                if(arr[i]==arr[idx]) return arr[i];
                int temp= arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
            }
        }
        return 0;
        
    }
}