class Solution {
    public int[][] generateMatrix(int n) {
        int top=0;
        int left=0;
        int bottom=n-1;
        int right=n-1;
        int count=1;
        int[][] a = new int[n][n];
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                a[top][i]=count;
                count++;
            }
            top++;
            for(int j=top;j<=bottom;j++){
                a[j][right]=count;
                count++;
            }
            right--;
            if(left<=right){
                for(int i=right;i>=left;i--){
                    a[bottom][i]=count;
                    count++;
                }
                bottom--;
            }
            if(top<=bottom){
                for(int j=bottom;j>=top;j--){
                    a[j][left]=count;
                    count++;
                }
                left++;
            }
        }
        return a;
    }
}