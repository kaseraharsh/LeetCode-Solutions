class Solution {
    public double findMaxAverage(int[] nums, int k) {
         double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double currentavg= sum/k;
        if(nums.length<=k) return currentavg;
       double maxavg=currentavg;
       int i=1;
       for(int j=k;j<nums.length;j++){
        sum= sum+nums[j]-nums[i-1];
        currentavg= sum/k;
        if(currentavg>maxavg){
            maxavg=currentavg;
        }
        i++;
       }

       return maxavg;
    }
}