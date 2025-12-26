/*
=====================================================
        JAVA LOOPS – NOTES
=====================================================

DEFINITION:
Loops are used to execute a block of code repeatedly
as long as a given condition is true.

-----------------------------------------------------
TYPES OF LOOPS IN JAVA
-----------------------------------------------------
1. while loop
2. do-while loop
3. for loop
-----------------------------------------------------
*/

public class lec6 {
    public static void main(String[] args) {

        /*
        -------------------------------------------------
        1. WHILE LOOP
        -------------------------------------------------
        DEFINITION:
        The while loop checks the condition first and
        executes the loop body only if the condition
        is true.

        Syntax:
        while(condition) {
            // code
        }
        */

        int i = 1; // Loop control variable (iterator)

        while (i < 5) {
            System.out.print("HIi ");
            i++;
        }

        /*
        NOTE:
        If the condition is always true, the loop
        becomes an infinite loop.

        Example:
        while(true) {
            // infinite execution
        }
        */

        /*
        -------------------------------------------------
        2. DO-WHILE LOOP
        -------------------------------------------------
        DEFINITION:
        The do-while loop executes the loop body at
        least once, even if the condition is false.

        Syntax:
        do {
            // code
        } while(condition);
        */

        do {
            System.out.println("hii");
            i++;
        } while (i <= 10);

        /*
        -------------------------------------------------
        3. FOR LOOP
        -------------------------------------------------
        DEFINITION:
        The for loop is used when the number of
        iterations is known in advance.

        Syntax:
        for(initialization; condition; increment) {
            // code
        }
        */

        for (i = 0; i <= 10; i++) {
            System.out.println("For loop");
            // Increment (i++) executes after each iteration
        }
    }
}
