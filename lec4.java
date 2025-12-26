/*
=====================================================
        JAVA OPERATORS – NOTES
=====================================================

DEFINITION:
Operators are special symbols used to perform
operations on variables and values.

-----------------------------------------------------
TYPES OF OPERATORS COVERED
-----------------------------------------------------
1. Assignment Operators
2. Arithmetic Operators
3. Increment / Decrement Operators
4. Relational Operators
5. Logical Operators
-----------------------------------------------------
*/

class lec4 {
    public static void main(String[] args) {

        /*
        -------------------------------------------------
        1. ARITHMETIC & ASSIGNMENT OPERATORS
        -------------------------------------------------
        Arithmetic Operators:
        +  (Addition)
        -  (Subtraction)
        *  (Multiplication)
        /  (Division)
        %  (Modulus)

        Assignment Operator:
        =  (Assigns value)
        */

        int num1 = 7;
        int num2 = 5;

        int result = num1 + num2; // Addition

        /*
        -------------------------------------------------
        COMPOUND ASSIGNMENT OPERATORS
        -------------------------------------------------
        These operators perform operation and assignment
        in a single step.
        */

        num1 += 2; // num1 = num1 + 2
        num1 -= 2; // num1 = num1 - 2
        num1 *= 2; // num1 = num1 * 2

        /*
        -------------------------------------------------
        2. INCREMENT & DECREMENT OPERATORS
        -------------------------------------------------
        ++ increases value by 1
        -- decreases value by 1
        */

        num1++; // Post-increment
        num1--; // Decrement
        ++num1; // Pre-increment

        /*
        -------------------------------------------------
        DIFFERENCE BETWEEN PRE & POST INCREMENT
        -------------------------------------------------
        */

        int num = 7;

        int res1 = num++;  // Post-increment
        // First value is assigned (7), then num becomes 8

        int res2 = ++num;  // Pre-increment
        // First num becomes 9, then value is assigned

        /*
        -------------------------------------------------
        3. RELATIONAL OPERATORS
        -------------------------------------------------
        Used to compare two values.
        Result is always boolean (true / false).

        <   less than
        >   greater than
        ==  equal to
        !=  not equal to
        >=  greater than or equal to
        <=  less than or equal to
        */

        boolean check = num1 > num2;

        /*
        -------------------------------------------------
        4. LOGICAL OPERATORS
        -------------------------------------------------
        Used to combine multiple conditions.
        Result is boolean.

        &&  Logical AND (short-circuit)
        ||  Logical OR  (short-circuit)
        !   Logical NOT
        */

        /*
        SHORT-CIRCUIT OPERATORS:
        - && stops evaluation if first condition is false
        - || stops evaluation if first condition is true
        This improves performance and avoids errors.
        */

        boolean logicResult = (num1 > num2) && (num2 > 0);

        /*
        -------------------------------------------------
        OUTPUT
        -------------------------------------------------
        */

        System.out.println(result);
    }
}
