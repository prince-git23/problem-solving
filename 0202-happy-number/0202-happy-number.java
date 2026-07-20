class Solution {
    public boolean isHappy(int n) {
        int fast =square(square(n));
        int slow=square(n);
        while(fast!=slow){
            fast =square(square(fast));
            slow=square(slow);
            if(fast==1 || slow ==1){
                return true;
            }
        }
        return slow==1;
    }
    public int square(int n){
        int sum=0;
        while(n>0){
            int digit = n%10;
            sum += digit*digit;
            n = n/10;
        }
        return sum;
    }
}