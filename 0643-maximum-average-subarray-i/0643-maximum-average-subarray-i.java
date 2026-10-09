class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans=Double.NEGATIVE_INFINITY;
        int n=nums.length;
        int prefix[]=new int[n];
        if(nums.length==1){
            return nums[0];
        }
        prefix[0]=nums[0];
        int i=0;
        for(i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        i=0;
        int j=k-i-1;
        while(j<n){
            if(i==0){
                ans=Math.max(ans,(double)prefix[j]/k);
            }
            else{
                ans=Math.max(ans,(double)(prefix[j]-prefix[i-1])/k);
            }           
            i++;
            j=k+i-1;
        }
        return ans;
    }
}