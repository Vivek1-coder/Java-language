/*
=====================================================
        JAVA ARRAYS & OBJECT ARRAYS – NOTES
=====================================================

DEFINITION:
An array is a collection of elements of the same
data type stored in contiguous memory locations.

=====================================================
        SINGLE DIMENSION ARRAY
=====================================================
*/

class Student {
    String name;
    int rollno;
    int marks;
}

public class lec8 {
    public static void main(String[] args) {

        /*
        -------------------------------------------------
        1. SINGLE DIMENSION ARRAY
        -------------------------------------------------
        */

        int num[] = {5, 6, 7};          // Static initialization
        int num1[] = new int[4];        // Dynamic allocation

        /*
        MEMORY STRUCTURE:
        - Array reference stored in stack memory
        - Actual array stored in heap memory
        */

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.println();

        /*
        -------------------------------------------------
        2. MULTI-DIMENSIONAL ARRAY
        -------------------------------------------------
        */

        int arr[][] = new int[3][4];    // 3 rows, 4 columns

        /*
        JAGGED ARRAY
        (Each row can have different number of columns)
        */

        int arr2[][] = new int[3][];
        arr2[0] = new int[2];
        arr2[1] = new int[3];
        arr2[2] = new int[4];

        /*
        FILL ARRAY WITH RANDOM VALUES
        */

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random() * 100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        /*
        ARRAY LENGTH
        */

        int n = num.length;

        /*
        -------------------------------------------------
        FOR-EACH LOOP (ENHANCED FOR LOOP)
        -------------------------------------------------
        */

        for (int row[] : arr2) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        /*
        -------------------------------------------------
        DRAWBACKS OF ARRAY
        -------------------------------------------------
        - Fixed size
        - Same data type only
        - No built-in insert/delete operations
        - Traversal required for searching
        */

        /*
        -------------------------------------------------
        ARRAY OF OBJECTS
        -------------------------------------------------
        */

        Student s1 = new Student();
        s1.name = "Harsh";
        s1.rollno = 9211;
        s1.marks = 20;

        Student s2 = new Student();
        s2.name = "Aman";
        s2.rollno = 9212;
        s2.marks = 25;

        Student s3 = new Student();
        s3.name = "Ravi";
        s3.rollno = 9213;
        s3.marks = 30;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        /*
        Printing object reference
        */

        System.out.println(s1); // prints hashcode (address reference)

        /*
        ACCESSING OBJECT ARRAY
        */

        for (Student s : students) {
            System.out.println(s.name);
            System.out.println(s.rollno);
            System.out.println(s.marks);
        }

        /*
        FOR-EACH LOOP ON SIMPLE ARRAY
        */

        for (int value : num) {
            System.out.println(value);
        }

        /*
        =================================================
                MAP, FILTER & REDUCE (STREAM API)
        =================================================
        */

        /*
        MAP
        -------------------------------------------------
        DEFINITION:
        map() is used to transform each element of a
        stream into another form.

        Example: Multiply each number by 2
        */

        java.util.List<Integer> list =
                java.util.List.of(1, 2, 3, 4, 5);

        list.stream()
            .map(x -> x * 2)
            .forEach(System.out::println);

        /*
        FILTER
        -------------------------------------------------
        DEFINITION:
        filter() is used to select elements that satisfy
        a given condition.

        Example: Print even numbers
        */

        list.stream()
            .filter(x -> x % 2 == 0)
            .forEach(System.out::println);

        /*
        REDUCE
        -------------------------------------------------
        DEFINITION:
        reduce() combines all elements of a stream into
        a single value.

        Example: Sum of all numbers
        */

        int sum = list.stream()
                      .reduce(0, (a, b) -> a + b);

        System.out.println(sum);
    }
}
