class Solution {
    public void moveZeroes(int[] a) {
        int i=0;
        int j=0;
        int temp =0;
        while(j!=a.length){
            if(a[i]==0 && a[j]!=0){
                temp=a[i];
                a[i] = a[j];
                a[j]=temp;
                i++;
                j++;
            }
            else if(a[i] == 0 || a[j]==0){
                j++;
            }
            else{
                i++;
                j++;
            }
        }
    }
}