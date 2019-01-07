import java.util.Arrays;

public class Sort_Array_By_Parity_905 {
    public int[] sortArrayByParity(int[] A) {

        int[] result = new int[A.length];
        int start_index = 0;
        int end_index = A.length - 1;

        for (int i = 0; i < A.length; i++ ) {
            if (A[i] % 2 == 0) {
                result[start_index++] = A[i];
            } else {
                result[end_index--] = A[i];
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        int[] A = {3, 1, 2 ,1};
        Sort_Array_By_Parity_905 arr = new Sort_Array_By_Parity_905();

        System.out.println(Arrays.toString(arr.sortArrayByParity(A)));
    }
}
