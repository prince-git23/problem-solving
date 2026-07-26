class Solution {
    public int pivotIndex(int[] nums) {
        int total =0;
        int left=0;
        int right=0;
        for(int num : nums){
            total+=num;
        }
        for(int i=0;i<nums.length;i++){   
                right = total - left - nums[i];
                if(left==right){
                    return i;
                }
                left = left + nums[i];
                if(right==0 && i==0){
                    return 0;
                }
        }
        return -1;
    }
}