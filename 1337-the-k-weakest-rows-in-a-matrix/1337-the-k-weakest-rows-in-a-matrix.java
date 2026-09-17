class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int count[]=new int[mat.length];
        Integer rows[]=new Integer[mat.length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    count[i]+=1;
                }
            }
            rows[i]=i;
        }
        Arrays.sort(rows, (a, b) -> Integer.compare(count[a], count[b]));
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=rows[i];
        }
        return ans;
    }
}