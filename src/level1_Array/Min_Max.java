package level1_Array;

import java.util.Arrays;

public class Min_Max {
    public static void find_min_max(int[] arr){
        Arrays.sort(arr);
        System.out.println("Minimum Element : "+arr[0]);
        System.out.println("Maximum Element : "+arr[arr.length-1]);
        //return "min and max found...";
    }

    public static void main(String[] args) {
        int[] arr={1,5,3,19,44};
        find_min_max(arr);
    }
}
