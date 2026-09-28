class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        permutation(list,new ArrayList<>(),nums);
        return list;
    }
    private void permutation(List<List<Integer>> list,List<Integer> ans,int nums[]){
        //last vala like abc k baad ghee khtm c pr h 
        //Cause recursion dekh or remaining array dekh
        if(nums.length==0){
            //We are adding in last
            list.add(new ArrayList<>(ans));
            return;
        }
        for(int i=0;i<nums.length;i++){
            ans.add(nums[i]);
            int remaining[] = new int[nums.length-1];
            for(int j=0,k=0;j<nums.length;j++){
                if(j==i) continue;
                remaining[k++]=nums[j];
            }
            permutation(list,ans,remaining);
            //Brand new
            ans.remove(ans.size()-1);
        }
    }
}