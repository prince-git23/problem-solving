class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder(s);
        int j = s.length() - 1;
        int i = 0;
        while(i<j){
            char ch1 = sb.charAt(i);
            char ch2 = sb.charAt(j);
            if(!String.valueOf(ch1).matches("[a-zA-Z]")){
                i++;
            }
            else if(!String.valueOf(ch2).matches("[a-zA-Z]")){
                j--;
            }else{
                sb.setCharAt(i,ch2);
                sb.setCharAt(j,ch1);
                i++;
                j--;
            }
        }
        return sb.toString();
    }
}