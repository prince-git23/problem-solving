class Solution {
    public String smallestPalindrome(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        List<Character> chars = new ArrayList<>(freq.keySet());
        Collections.sort(chars);
        char middle=0;
        StringBuilder left = new StringBuilder();
        for(char ch : chars){
            int count = freq.get(ch);
            for(int i=0;i<count/2;i++){
                left.append(ch);
            }
            if(count%2 == 1){
                middle=ch;
            }
        }

        StringBuilder ans = new StringBuilder(left);
        if(middle != 0){
            ans.append(middle);
        }
        return ans.append(new StringBuilder(left).reverse()).toString();
    }
}