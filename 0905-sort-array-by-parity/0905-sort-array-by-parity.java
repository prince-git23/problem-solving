class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=1;
        int temp=0;
        while(j<nums.length){
            if((nums[i] & 0x1)!=0){
                if((nums[j] & 0x1)==0){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    i++;
                }
                else{
                    j++;
                }
            }
            else{
                i++;
                j++;
            }
        }
        return  nums;
    }
}