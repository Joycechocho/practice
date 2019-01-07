public class Delete_Columns_To_Make_Sorted_944 {
    public int minDeletionSize(String[] A) {
        int count = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A[0].length(); j++ ) {
                if (A[i].charAt(j) > A[i+1].charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        String[] A = {"zyxa","wvub","tsrc"};
        Delete_Columns_To_Make_Sorted_944 str = new Delete_Columns_To_Make_Sorted_944();

        System.out.println(str.minDeletionSize(A));
    }
}
