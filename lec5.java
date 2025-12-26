/*
=====================================================
        JAVA CONTROL STATEMENTS – NOTES
=====================================================

DEFINITION:
Control statements are used to control the flow
of execution of a program based on conditions.

-----------------------------------------------------
TYPES OF CONTROL STATEMENTS
-----------------------------------------------------
1. Conditional Statements (if, if-else, else-if)
2. Ternary Operator
3. Switch Statement
-----------------------------------------------------
*/

public class lec5 {
    public static void main(String[] args) {

        int x = 20;

        /*
        -------------------------------------------------
        1. IF–ELSE STATEMENT
        -------------------------------------------------
        DEFINITION:
        Executes a block of code if the condition is
        true; otherwise executes the else block.
        */

        if (x <= 20)
            System.out.println("Hello");
        else
            System.out.println("Bye");

        /*
        -------------------------------------------------
        IF STATEMENT WITHOUT ELSE
        -------------------------------------------------
        Executes code only when condition is true.
        */

        if (x <= 20)
            System.out.println("Hello");

        /*
        -------------------------------------------------
        IF–ELSE–IF LADDER
        -------------------------------------------------
        DEFINITION:
        Used to check multiple conditions sequentially.
        Only the first true condition is executed.
        */

        if (x <= 35) {
            System.out.println("Hello1");
            System.out.println("Hello2");
            System.out.println("Hello3");
        }
        else if (x > 40) {
            System.out.println("Hello4");
        }
        else {
            System.out.println("tata");
            System.out.println("Hello5");
        }

        /*
        -------------------------------------------------
        2. TERNARY OPERATOR (?:)
        -------------------------------------------------
        DEFINITION:
        A shorthand replacement for if–else statement.
        
        Syntax:
        condition ? value_if_true : value_if_false;
        */

        boolean even = (x % 2 == 0) ? true : false;

        System.out.println(even);
        System.out.println("Bye");

        /*
        -------------------------------------------------
        3. SWITCH STATEMENT
        -------------------------------------------------
        DEFINITION:
        Used to execute one block of code from multiple
        options based on a variable value.
        */

        int n = 1;

        switch (n) {
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                // break prevents fall-through
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
                break;

            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Enter a valid number");
        }

        /*
        NOTE:
        - break stops execution of switch
        - Without break, all cases below will execute
        - default executes if no case matches
        */
    }
}
