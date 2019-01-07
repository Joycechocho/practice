/*
* In a array A of size 2N, there are N+1 unique elements,
* and exactly one of these elements is repeated N times.

* Return the element repeated N times.



* Example 1:

* Input: [1,2,3,3]
* Output: 3
*/


// Hints: If we ever find a repeated element, it must be the answer.

import java.util.*;

public class N_Repeated_Elements_961 {
    public int repeatedNTimes(int[] A) {
        int element = 0;

        Set<Integer> uniques = new HashSet<Integer>();
        for (int a : A) {
            if (uniques.contains(a)) {
                element = a;
            } else {
                uniques.add(a);
            }
        }

        return element;

    }

    public static void main(String[] args)
    {
        int[] A = {1,2,3,3};
        N_Repeated_Elements_961 arr = new N_Repeated_Elements_961();

        System.out.println(arr.repeatedNTimes(A));
    }
}
