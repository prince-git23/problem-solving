class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        String words[] = title.split(" ");
        for(int i=0 ; i<words.length;i++){
            if(!sb.isEmpty()){
                sb.append(" "); 
            }
            if(words[i].length()<3){
                sb.append(words[i].toLowerCase());
                
            }
            else{
                words[i]=words[i].toLowerCase();
                sb.append(Character.toUpperCase(words[i].charAt(0)));
                sb.append(words[i].substring(1,words[i].length()));
            } 
        }
        return sb.toString();
    }
}