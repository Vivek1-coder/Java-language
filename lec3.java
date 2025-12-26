/*
=====================================================
        JAVA TYPE CONVERSION & TYPE CASTING
=====================================================

DEFINITION:
Type Conversion is the process of converting one
data type into another.

There are TWO types:
1. Implicit Type Conversion (Widening)
2. Explicit Type Casting (Narrowing)

-----------------------------------------------------
1. IMPLICIT TYPE CONVERSION (WIDENING)
-----------------------------------------------------
- Done automatically by Java
- Converts smaller data type to larger data type
- No data loss
- byte → short → int → long → float → double
-----------------------------------------------------
*/

class lec3 {
    public static void main(String[] args) {

        // Implicit Type Conversion (Widening)
        byte b = 127;
        int a = 256;

        a = b;  // byte → int (automatic, safe conversion)

        /*
        -------------------------------------------------
        2. EXPLICIT TYPE CASTING (NARROWING)
        -------------------------------------------------
        - Done manually by programmer
        - Converts larger data type to smaller data type
        - Data loss may occur
        - Syntax: (datatype) value
        -------------------------------------------------
        */

        a = 12;
        b = (byte) a;  // int → byte (explicit casting)

        /*
        -------------------------------------------------
        FLOAT TO INT TYPE CASTING
        -------------------------------------------------
        - Decimal part is lost
        - Only integer part is stored
        */

        float f = 5.6f;
        int x = (int) f;   // x = 5 (0.6 is discarded)

        /*
        -------------------------------------------------
        OVERFLOW IN TYPE CASTING
        -------------------------------------------------
        - byte range: -128 to 127
        - Value exceeding range wraps around
        - Formula: value % 256
        */

        a = 256;
        b = (byte) a;     // 256 % 256 = 0

        /*
        -------------------------------------------------
        TYPE PROMOTION IN EXPRESSIONS
        -------------------------------------------------
        - byte, short, and char are promoted to int
          during arithmetic operations
        */

        byte b1 = 10;
        byte c1 = 30;

        int result = b1 * c1;  // type promotion (byte → int)
    }
}

/*
-----------------------------------------------------
HOW TO RUN JAVA PROGRAM
-----------------------------------------------------

Modern Java:
java Hello.java

Older Java:
javac Hello.java
java Hello
-----------------------------------------------------
*/
