class Solution {
    public int[] sortArray(int[] nums) {
      mergesort(nums);
      return nums;
        
        
    }
    public void mergesort(int [] arr){
        int n=arr.length;
        if(n<=1) return;
        int []a= new int [n/2];
        int [] b = new int [n-n/2];
        int idx=0;
        for(int i=0;i<a.length;i++){
            a[i]=arr[idx];
            idx++;
        }
        for(int i=0;i<b.length;i++){
            b[i]=arr[idx];
            idx++;
        }
        mergesort(a);
        mergesort(b);
        merge(a,b,arr);
    }

    public void merge(int [] a,int []b, int []arr){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                arr[k]=a[i];
                k++;
                i++;
            }else{
                arr[k]=b[j];
                k++;
                j++;
            }
        }
        while(i<a.length) arr[k++]=a[i++];
        while(j<b.length) arr[k++]=b[j++];
    }

}