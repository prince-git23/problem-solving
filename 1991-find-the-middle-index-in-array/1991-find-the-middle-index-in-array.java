class Solution {
    public int findMiddleIndex(int[] nums) {
        int b_sum=0;
        int a_sum=0;
        if(nums.length==1){
            return 0;
        }
        for(int num : nums){
            a_sum+=num;
        }
        a_sum-=nums[0];
        if (a_sum == 0) {
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            b_sum+=nums[i-1];
            a_sum-=nums[i];
            if(b_sum == a_sum){
                return i;
            }
        }
        return -1;
    }
}