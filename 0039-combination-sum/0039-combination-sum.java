class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        combination(list,new ArrayList<>(),candidates,target,0,0);
        return list;
    }
    private static void combination(List<List<Integer>> list,List<Integer> ans, int c[],int target,int idx,int sum){
        if(target== sum){
            list.add(new ArrayList<>(ans));
            return;
        }
        if(target<sum){
            return;
        }
        for(int i=idx;i<c.length;i++){
            sum+=c[i];
            ans.add(c[i]);
            combination(list,ans,c,target,i,sum);
            sum-=c[i];
            ans.remove(ans.size()-1);
        }
    }
}