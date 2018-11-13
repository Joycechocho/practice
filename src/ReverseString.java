import java.lang.*;
import java.io.*;
import java.util.*;

public class ReverseString
{
    /* Method 1: convert string into bytes */
    String reverseStr1(String str)
    {
        byte [] strAsByteArray = str.getBytes();
        byte [] results = new byte[strAsByteArray.length];

        for (int i = 0; i < strAsByteArray.length; i++)
        {
            results[i] = strAsByteArray[strAsByteArray.length - i - 1];
        }

        return new String(results);
    }

    /* Method 2: reverse() method of the StringBuilder */
    String reverseStr2(String str)
    {
        StringBuilder strbuilder = new StringBuilder(str);
        return strbuilder.reverse().toString();
    }

    public static void main(String[] args)
    {
        String str = "FooBar";
        ReverseString reverseString = new ReverseString();

        System.out.println(reverseString.reverseStr2(str));
    }
}
