import java.util.List;

public class Hamming_Distance_461 {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;

        return Integer.bitCount(xor);
    }

    public static void main(String[] args)
    {
        Hamming_Distance_461 dis = new Hamming_Distance_461();

        System.out.println(dis.hammingDistance(1, 4));
    }
}
