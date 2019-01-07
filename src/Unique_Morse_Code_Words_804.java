import java.util.HashSet;

public class Unique_Morse_Code_Words_804 {
    private int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        HashSet<String> number = new HashSet<>();

        for (String word : words) {
            StringBuilder encodedString = new StringBuilder("");
            for (char c : word.toCharArray()) {
                int position = c - 'a';
                encodedString.append(morse[position]);
            }

            number.add(encodedString.toString());

        }

        return number.size();
    }

    public static void main(String[] args)
    {
        String[] words = {"gin", "zen", "gig", "msg"};
        Unique_Morse_Code_Words_804 str = new Unique_Morse_Code_Words_804();

        System.out.println(str.uniqueMorseRepresentations(words));
    }
}
