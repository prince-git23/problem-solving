class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
       int current = 1001;
       for (int n : nums){
            if(n != current){
                current = n;
                nums[count] = current;
                count ++;
            }else continue;
       }
       return count;
    }
}
