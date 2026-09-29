class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list =new ArrayList<>();
        combination(list,1,new ArrayList<>(),n,k);
        return list;
    }
    private static void combination(List<List<Integer>> list,int start,List<Integer> ans,int n, int k){
        if(k==0){
            list.add(new ArrayList<>(ans));
            return;
        }
        for(int i=start;i<=n;i++){
            ans.add(i);
            combination(list,i+1,ans,n,k-1);
            ans.remove(ans.size()-1);
        }
    }
}