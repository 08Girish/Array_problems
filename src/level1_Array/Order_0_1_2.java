package level1_Array;

import static java.util.Collections.swap;



public class Order_0_1_2 {
    public static void order(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        for (int i = 0; i<arr.length -1;) {
            if (arr[i] == 0) {
                swap(arr, low, i);
                low++;
                i++;
            }
            if(arr[i]==2)
            {
                swap(arr,i,high);
               // high--;
            }
            else
            {
                i++;
            }
        }
        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //    public void print(int arr[],int arr_size){}
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 1, 0, 1};
        order(arr);
    }
}
