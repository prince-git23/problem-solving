class Solution {
    static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            end--;
            start++;
        }
    }
    public boolean areSimilar(int[][] mat, int k) {
        int n=mat.length;
        int m = mat[0].length;
    
        int copy[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                copy[i][j] = mat[i][j];
            }
        }
        k=k%m;
        for(int i=0;i<n;i++){               
                if(i%2==0){
                    reverse(mat[i],0,k-1);
                    reverse(mat[i],k,m-1);
                    reverse(mat[i],0,m-1);
                }
                else{
                    reverse(mat[i],0,m-1);
                    reverse(mat[i],0,k-1);
                    reverse(mat[i],k,m-1);
                }
            }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] != copy[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}