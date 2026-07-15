class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int p = 0;
       int q = numbers.length-1;

        while(p<q){
            int sum = 0;
            sum = numbers[p] + numbers[q];
            if(sum<target){
                p++;
            }
            else if(sum>target){
                q--;
            }
            else{
                break;
            }
        }
        return new int[]{
            p+1,q+1
        };
    }
}