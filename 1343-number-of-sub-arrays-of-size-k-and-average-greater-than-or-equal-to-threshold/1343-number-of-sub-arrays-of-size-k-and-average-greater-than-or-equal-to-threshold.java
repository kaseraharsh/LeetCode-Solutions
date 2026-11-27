class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int firstcurrentavg=sum/k;
        int count=0;
        if(firstcurrentavg>=threshold) count++;
        int i=1;
        for(int j=k;j<arr.length;j++){
            sum=sum+arr[j]-arr[i-1];
            int currentavg=sum/k;
            if(currentavg>=threshold) count++;
            i++;
        }
        return count;
       
    }
}