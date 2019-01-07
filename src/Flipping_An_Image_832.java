import java.util.Arrays;

public class Flipping_An_Image_832 {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int[] row : A) {

            for (int i = 0; i < row.length / 2; i++) {
                int temp = row[i];
                row[i] = row[row.length - 1 - i];
                row[row.length - 1 - i] = temp;
            }
            for (int j = 0; j < row.length; j++) {
                row[j] = row[j] ^ 1;
            }

        }
        return A;
    }

    public static void main(String[] args)
    {
        int[][] A = {{1,1,0},{1,0,1},{0,0,0}};
        Flipping_An_Image_832 arr = new Flipping_An_Image_832();

        System.out.println(Arrays.deepToString(arr.flipAndInvertImage(A)));
    }

}
