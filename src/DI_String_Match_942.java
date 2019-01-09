import java.util.Arrays;

public class DI_String_Match_942 {
    public int[] diStringMatch(String S) {
        int min = 0, max = S.toCharArray().length, N = S.toCharArray().length;
        int[] A = new int[N + 1];

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'I') {
                A[i] = min++;
            }
            if (S.charAt(i) == 'D') {
                A[i] = max--;
            }
        }
        A[N] = min;

        return A;
    }

    public static void main(String[] args)
    {
        String S = "DDI";
        DI_String_Match_942 str = new DI_String_Match_942();

        System.out.println(Arrays.toString(str.diStringMatch(S)));
    }
}
