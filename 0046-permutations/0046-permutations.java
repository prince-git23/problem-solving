class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        permutation(list ,new ArrayList<>() , nums);
        return list;
    }
    private static void permutation(List<List<Integer>> list,List<Integer> ans, int nums[]){
        if(nums.length==0){
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

            ans.remove(ans.size()-1);
        }
    }
}