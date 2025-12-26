/*
=====================================================
        JAVA DATA TYPES & OUTPUT STATEMENTS
=====================================================

DEFINITION:
A data type specifies the type of data a variable
can store and the amount of memory it occupies.

Java is a statically typed language, which means
every variable must be declared with a data type
before use.

-----------------------------------------------------
PRIMITIVE DATA TYPES IN JAVA
-----------------------------------------------------
1. Integer Types
2. Floating-Point Types
3. Character Type
4. Boolean Type
-----------------------------------------------------
*/

class lec1 {
    public static void main(String[] args) {

        /*
        -------------------------------------------------
        1. INTEGER DATA TYPES
        -------------------------------------------------
        Used to store whole numbers.
        */

        int num = 3;  // int → 4 bytes

        /*
         * Other integer types:
         * byte  → 1 byte (range: -128 to 127)
         * short → 2 bytes
         * long  → 8 bytes
         */

        /*
        -------------------------------------------------
        2. FLOATING-POINT DATA TYPES
        -------------------------------------------------
        Used to store decimal numbers.
        */

        float marks = 6.5f;   // float → 4 bytes (suffix 'f' is mandatory)
        double per = 87.4;    // double → 8 bytes (default decimal type)

        /*
        -------------------------------------------------
        3. CHARACTER DATA TYPE
        -------------------------------------------------
        Used to store a single character.
        Java uses Unicode, hence char takes 2 bytes.
        */

        char ch = '1';  // Character literal

        /*
        In C/C++:
        char → 1 byte (ASCII)
        */

        /*
        -------------------------------------------------
        4. BOOLEAN DATA TYPE
        -------------------------------------------------
        Used to store logical values.
        Only two possible values: true or false.
        */

        boolean isPassed = false; // No 0 or 1 allowed

        /*
        -------------------------------------------------
        OUTPUT STATEMENTS
        -------------------------------------------------
        Used to display output on the console.
        */

        System.out.println(num);           // Prints value and moves to new line
        System.out.println("Hello World"); // Prints text and moves to new line
        System.out.print("Hello World");   // Prints text without new line
    }
}
