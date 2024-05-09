package level1_Array;

public class Reverse {
    public static void rev(int[] ar){
        int revarr[] = new int[ar.length];
        for(int i =0; i<ar.length; i++){
            revarr[i] = ar[ar.length -1 -i];
        }
        for(int i : revarr)
        {
            System.out.print(i +" ");
        }
       // return null;
    }

    public static void main(String[] args) {
        int[] ar={2,3,4,5,6,7};
        rev(ar);
    }
}
