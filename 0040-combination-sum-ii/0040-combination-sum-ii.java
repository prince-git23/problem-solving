class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        combination(list,new ArrayList<>(),candidates,target,0,0);
        return list;
    }
    private static void combination(List<List<Integer>> list,List<Integer> ans,int c[],int target,int sum,int idx){
        if(sum==target){
            Collections.sort(ans);
            if(list.contains(ans)){
                return;
            }
            list.add(new ArrayList<>(ans));
            return;
        }
        if(sum>target){
            return;
        }
        for(int i=idx;i<c.length;i++){
            if(i>idx && c[i]==c[i-1]){
                continue;
            }
            ans.add(c[i]);
            sum+=c[i];
            combination(list,ans,c,target,sum,i+1);
            sum-=c[i];
            ans.remove(ans.size()-1);
        }
    }
}