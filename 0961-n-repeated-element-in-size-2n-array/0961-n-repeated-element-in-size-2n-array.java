class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> map =new HashSet<>();
        for(int num : nums){
            if(map.contains(num)){
                return num;
            }
            else{
                map.add(num);
            }
        }
        return 0;
    }
}