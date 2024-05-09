package level1_Array;

public class FindDulipcateCount {
    public static void duplicatecount(int[] ar1,int num)
    {
        int dup = 0 ;
        for(int i = 0; i < ar1.length; i++ )
        {
            if(ar1[i]==num)
            {
                dup++;
            }
        }
        System.out.println(num+ " : "+dup);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,3,3};
        int x= 3;
        duplicatecount(arr,x);
    }
}
