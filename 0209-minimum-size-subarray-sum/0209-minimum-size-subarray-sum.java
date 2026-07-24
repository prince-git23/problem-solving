class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minSize = Integer.MAX_VALUE;
        int sum=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                sum-=nums[j];
                minSize = Math.min(minSize,i-j+1);
                j++;
            }
        }
        return minSize == Integer.MAX_VALUE ? 0 : minSize;
    }
}