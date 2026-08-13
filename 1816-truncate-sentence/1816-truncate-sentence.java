class Solution {
    public String truncateSentence(String s, int k) {
        String truncate[] = s.split(" ");
        String str="";
        for(int i=0;i<k;i++){
            if(str==""){
                str+=truncate[i];
            }else{
                str+=" "+truncate[i];
            }
        }
        return str;
    }
}