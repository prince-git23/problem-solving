class Solution {
    public int maxSubArray(int[] nums) {
        int current=nums[0];
        int answer=nums[0];
        for(int i=1;i<nums.length;i++){
            current=Math.max(nums[i],nums[i]+current);
            answer=Math.max(answer,current);
        }
        return answer;
    }
}