package level1_Array;

import java.util.Arrays;

public class Kth_Element {
    public static void sort(int arr[],int k){
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }

    public static void main(String[] args) {
        int arr[]={2,34,1,3,4};
        int k= 5;
        sort(arr,k);
    }
}
