class Solution {
    public void sortColors(int[] nums) {
        int j=1;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            while(j<nums.length){
                if(nums[i]>nums[j]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
                j++;
            }
            j=i+1;
        }
    }
}