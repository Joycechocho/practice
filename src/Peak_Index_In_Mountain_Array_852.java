import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Peak_Index_In_Mountain_Array_852 {
    public int peakIndexInMountainArray(int[] A) {

        int max = 0;
        int position = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
                position = i;
            }
        }

        return position;

    }

    public static void main(String[] args)
    {
        int[] A = {0,1,0};
        Peak_Index_In_Mountain_Array_852 arr = new Peak_Index_In_Mountain_Array_852();

        System.out.println(arr.peakIndexInMountainArray(A));
    }
}
