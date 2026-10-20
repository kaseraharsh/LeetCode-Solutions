class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0,n=mat.length,m=mat[0].length;
        int a=mat[0][0];
        if(n==1 && m==1) return a;
        if(n%2==0 && m%2==0){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j) sum=sum+mat[i][j];
            }
        }
         for(int i=0;i<n;i++){
            for(int j=m-1;j>=0;j--){
                if(i+j==n-1) sum=sum+mat[i][j];
            }
        }
    }
    else{
          for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j) sum=sum+mat[i][j];
            }
        }
         for(int i=0;i<n;i++){
            for(int j=m-1;j>=0;j--){
                if(i+j==n-1) sum=sum+mat[i][j];
            }
        }
        sum=sum-mat[n/2][m/2];

    }
        return sum;
    }
}