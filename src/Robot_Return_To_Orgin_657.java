public class Robot_Return_To_Orgin_657 {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'U':
                    x = x + 1;
                    break;
                case 'D':
                    x = x - 1;
                    break;
                case 'L':
                    y = y - 1;
                    break;
                case 'R':
                    y = y + 1;
                    break;
            }
        }
        return x == 0 && y == 0;
    }
}
