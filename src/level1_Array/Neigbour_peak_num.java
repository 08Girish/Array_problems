package level1_Array;

class peak
{

}
public class Neigbour_peak_num {
    public static void main(String[] args) {
        int[] arr= {1,2,3,9,4,5,6,7};
        int n= arr.length;
        System.out.println(find_element(arr,n));
    }
    public static int find_element(int arr[], int n){
        if(n==0){
            return 0;
        }
        if(arr[0]>=arr[1])
        {
            return 0;
        }
       /* if (arr[n - 1] >= arr[n - 2]) {
            return n - 1;
        }*/
        for(int i = 1 ; i < n-1 ; i++){
            if(arr[i] >= arr[i-1] && arr[i] >=arr[i+1])
            {
                return arr[i];
            }
        }
        return 0;
    }
}
