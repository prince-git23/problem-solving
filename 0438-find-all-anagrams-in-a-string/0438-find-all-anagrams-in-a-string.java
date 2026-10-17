class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int k = p.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        for(i=0;i<p.length();i++){
            char p1 = p.charAt(i);
            
            map.put(p1,map.getOrDefault(p1,0)+1);
        }
        for(i=0;i<s.length();i++){
            char s1 = s.charAt(i);
            if(map.containsKey(s1)){
                    map.put(s1,map.get(s1)-1);
                
            }
            
            if(i>=k){
                char old = s.charAt(i-k);
                if(map.containsKey(old)){
                    map.put(old,map.get(old)+1);
                }
            }
            if(i>=k-1 && map.values().stream().allMatch(value->value!=null && value==0)){
                map.put(s.charAt(i),0);
                list.add(i-k+1);
            }
        }
        return list;
    }
}