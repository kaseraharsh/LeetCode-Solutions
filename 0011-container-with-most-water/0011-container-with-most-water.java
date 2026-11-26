class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1, maxarea=0;
        int currentarea=0;
        while(i<j){
            int min=Math.min(height[i],height[j]);
            int width= j-i;
            currentarea= min*width;
            if(currentarea>maxarea){
                maxarea=currentarea;
            }
            if(height[i]>height[j]) j--;
            else i++;
        }
        return maxarea;

    }
}