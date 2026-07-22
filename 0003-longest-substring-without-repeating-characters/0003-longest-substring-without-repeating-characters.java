class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int currSize = 0;
        int MaxSize = 0;
        int left=0;
        for(int right=0; right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                currSize=set.size()-1;
                left++;
            }
            set.add(s.charAt(right));
            currSize=set.size();
            MaxSize = Math.max(currSize,MaxSize);
        }
        return MaxSize;
    }
}