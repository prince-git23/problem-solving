class Solution {
    public int longestOnes(int[] nums, int k) {
        int count=0;
        int answer=0;
        int left=0;
        int right=0;
        while(right<nums.length){
            if(nums[right] == 0 && k>0){
                count++;
                k--;               
            }
            else if(nums[right]==1){
                count++;
            }
            else{
                count++;
                k--;
                while(k<0){
                    if(nums[left]==0){
                    k++;
                    }
                    count--;
                    left++;
                }
            }
            answer=Math.max(answer,count);
            right++;
        }
        return answer;
    }
}