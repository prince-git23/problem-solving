class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int sq[] =new int[n];
        int left=0;
        int right=n-1;
        for(int i=n-1;i>=0;i--){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                sq[i]=nums[left]*nums[left];
                left++;
            }
            else{
                sq[i]=nums[right]*nums[right];
                right--;
            }
        }
        return sq; 
    }
}