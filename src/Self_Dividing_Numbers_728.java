import java.util.ArrayList;
import java.util.List;

public class Self_Dividing_Numbers_728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = left; i <= right; i++) {
            if(selfDividing(i)) {
                list.add(i);
            }
        }

        return list;

    }


    public boolean selfDividing(int n) {
        for (char c : String.valueOf(n).toCharArray()) {
            int a = Character.getNumericValue(c);
            if (a != 0) {
                if (n % a != 0) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Self_Dividing_Numbers_728 str = new Self_Dividing_Numbers_728();

        System.out.println(str.selfDividingNumbers(1,15));
    }
}
