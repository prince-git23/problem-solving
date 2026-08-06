class Solution {
    public boolean canShip(int days,int[] weights,int capacity){
        int currentload=0;
        int daysRequired=1;
        for(int weight : weights){
            if(currentload+weight<=capacity){
                currentload+=weight;
            }
            else{
                daysRequired++;
                currentload=weight;
            }
        }
        if(daysRequired<=days){
            return true;
        }
        else{
            return false;
        }
    }
    public int shipWithinDays(int[] weights, int days) {
        int maxweight=0;
        int sumweight=0;
        int capacity=Integer.MAX_VALUE;
        for(int weight : weights){
            maxweight=Math.max(maxweight,weight);
            sumweight+=weight;
        }
        while(maxweight<=sumweight){
            int mid=(maxweight+sumweight)/2; 
            if(canShip(days,weights,mid)){
                capacity=Math.min(mid,capacity);
                sumweight=mid-1;
            }
            else{
                maxweight=mid+1;
            }
        }
        return capacity;
    }
}