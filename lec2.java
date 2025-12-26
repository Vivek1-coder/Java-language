/*
=====================================================
        JAVA LITERALS – NOTES
=====================================================

DEFINITION:
A literal is a fixed value that is directly written
in the source code. Literals represent constant
values assigned to variables.

-----------------------------------------------------
TYPES OF LITERALS IN JAVA
-----------------------------------------------------
1. Integer Literals
2. Floating-Point Literals
3. Character Literals
4. Boolean Literals
5. String Literals
-----------------------------------------------------
*/

class lec2 {
    public static void main(String[] args) {

        /*
        -------------------------------------------------
        1. INTEGER LITERALS
        -------------------------------------------------
        Integer literals are whole numbers without
        any fractional part.
        */

        int num1 = 585;        // Decimal literal (base 10)

        int num2 = 0b101;      // Binary literal (base 2)
                               // 0b101 = 5 in decimal

        int num3 = 0x8E;       // Hexadecimal literal (base 16)
                               // 0x8E = 142 in decimal

        int num4 = 100_00_00_000; // Numeric literal with underscores
                                  // Improves readability
                                  // Value = 100000000

        /*
        -------------------------------------------------
        2. FLOATING-POINT LITERALS
        -------------------------------------------------
        Floating-point literals represent numbers
        with decimal points or exponential form.
        */

        double num = 49;       // Integer assigned to double (implicit casting)

        double n2 = 12e10;     // Exponential notation
                               // 12 × 10¹⁰

        /*
        -------------------------------------------------
        3. CHARACTER LITERALS
        -------------------------------------------------
        A character literal is a single character
        enclosed in single quotes.
        Java uses Unicode (2 bytes).
        */

        char c = 'a';          // Character literal
        c++;                   // Increments Unicode value ('a' → 'b')

        /*
        -------------------------------------------------
        NOTE:
        - Java allows arithmetic operations on char
          because it internally stores Unicode values.
        */
    }
}
