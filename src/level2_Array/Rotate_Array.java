package level2_Array;

public class Rotate_Array {
    public static  void rotate_array(int arr[],int d) {
        for (int i = d; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int j = 0; j < d; j++) {
            System.out.print(arr[j] + " ");
            //int temp[] = new int[];
        }
    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7};
        int d= 7;
        rotate_array(arr,d);
    }
}

