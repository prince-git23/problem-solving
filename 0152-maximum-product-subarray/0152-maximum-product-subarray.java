class Solution {
    public int maxProduct(int[] nums) {
        int currentMax=nums[0];
        int currentMin=nums[0];
        int answer=nums[0];
        for(int i=1;i<nums.length;i++){
            int tempMax=currentMax;
            int tempMin=currentMin;
            tempMax*=nums[i];
            tempMin*=nums[i];
            currentMax=Math.max(nums[i],Math.max(tempMax,tempMin));
            currentMin=Math.min(nums[i],Math.min(tempMax,tempMin));
            answer=Math.max(currentMax,answer);
        }
        return answer;
    }
}