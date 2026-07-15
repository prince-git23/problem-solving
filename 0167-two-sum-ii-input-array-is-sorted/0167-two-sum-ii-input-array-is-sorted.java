class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int p = 0;
       int q = numbers.length-1;
        ArrayList<Integer> arr = new ArrayList<>();
        int res [] = new int[2];
        while(p<q){
            int sum = 0;
            sum = numbers[p] + numbers[q];
            if(sum ==  target){
                arr.add(p+1);
                arr.add(q+1);

                res[0]=arr.get(0);
                res[1]=arr.get(1);
                return res;
            }
            else if(sum<target){
                p++;
            }
            else{
                q--;
            }
        }
        return res;
    }
}