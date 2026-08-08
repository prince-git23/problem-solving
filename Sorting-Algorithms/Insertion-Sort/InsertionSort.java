public class InsertionSort {
    public static void main(String[] args) {
        int a[] = { 1, 4, 7, 10, 2, 3 };
        int key = 0;
        int j=0;
        for (int i = 1; i < a.length; i++) {
            j=i-1;
            key=a[i];
            while(a[j]>key && j>=0){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        //Print
        for(int arr : a){
            System.out.print(arr + " ");
        }
    }
}