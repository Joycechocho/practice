/* You're given strings J representing the types of stones that are jewels,
* and S representing the stones you have.  Each character in S is a type of
* stone you have.  You want to know how many of the stones you have are also
* jewels.
*
* The letters in J are guaranteed distinct, and all characters in J and S are
* letters. Letters are case sensitive, so "a" is considered a different type
*   of stone from "A".
*
* Example 1:
*
* Input: J = "aA", S = "aAAbbbb"
* Output: 3
*/


import java.util.Arrays;

public class Jewels_And_Stones_771 {
    public int numJewelsInStones(String J, String S) {
        int numOfStones = 0;

        String[] Sary = S.split("");
        String[] Jary = J.split("");

        for (int i = 0; i < Sary.length; i++ ) {
            if(Arrays.asList(Jary).contains(Sary[i])) {
                numOfStones++;
            }

        }

        return numOfStones;
    }
}
