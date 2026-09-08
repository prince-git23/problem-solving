class Solution {
    public String makeFancyString(String s) {
        char prev=s.charAt(0);
        StringBuilder str = new StringBuilder();
        str.append(prev);
        int count=1;    
        for(int i=1;i<s.length();i++){
            if(prev == s.charAt(i)){
                count++;
            }
            else{
                prev=s.charAt(i);
                count=1;
            }
            if(count<3)
                str.append(s.charAt(i));
        }           
        return str.toString();
    }
}