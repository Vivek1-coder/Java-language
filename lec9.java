/*
=====================================================
        JAVA STRINGS – NOTES (lec9)
=====================================================

DEFINITION:
A String in Java is a sequence of characters.
Strings are IMMUTABLE in Java, meaning once created,
their value cannot be changed.

=====================================================
        STRING CREATION
=====================================================
*/

public class lec9 {
    public static void main(String[] args) {

        /*
        -------------------------------------------------
        1. STRING USING new KEYWORD
        -------------------------------------------------
        - Object created in Heap
        - Reference stored in Stack
        */

        String name = new String("Hello");

        /*
        IMMUTABILITY EXAMPLE
        - A new object is created
        - Old "Hello" remains unchanged
        */

        name = name + " World";
        System.out.println(name);            // Hello World

        /*
        STRING METHODS
        */

        System.out.println(name.charAt(1));  // e
        System.out.println(name.concat("!!"));// Hello World!!

        /*
        -------------------------------------------------
        2. STRING LITERAL
        -------------------------------------------------
        - Stored in String Constant Pool (SCP)
        - No duplicate objects allowed
        */

        String s1 = "Navin";
        String s2 = "Navin";

        /*
        Behind the scenes:
        - Only ONE object "Navin" is created in SCP
        - s1 and s2 point to same object
        */

        System.out.println(s1 == s2); // true (same reference)

        /*
        -------------------------------------------------
        MUTABLE vs IMMUTABLE STRINGS
        -------------------------------------------------

        IMMUTABLE:
        - String

        MUTABLE:
        - StringBuffer
        - StringBuilder
        */

        /*
        -------------------------------------------------
        3. STRINGBUFFER (Mutable & Thread-safe)
        -------------------------------------------------
        */

        StringBuffer sb = new StringBuffer("Hello");

        /*
        CAPACITY:
        - Default capacity = 16
        - Total = 16 + length of string
        */

        System.out.println(sb.capacity()); // 21
        System.out.println(sb.length());   // 5

        sb.append(" Reddy");
        System.out.println(sb);             // Hello Reddy

        /*
        CONVERT StringBuffer TO String
        */

        String str = sb.toString();

        /*
        STRINGBUFFER METHODS
        */

        sb.deleteCharAt(3);     // deletes character at index 3
        sb.insert(0, "Java ");  // inserts at beginning

        System.out.println(sb);

        /*
        -------------------------------------------------
        STRINGBUFFER vs STRINGBUILDER
        -------------------------------------------------

        StringBuffer:
        - Thread-safe
        - Slower
        - Used in multi-threaded environment

        StringBuilder:
        - NOT thread-safe
        - Faster
        - Used in single-threaded environment
        */
    }
}
