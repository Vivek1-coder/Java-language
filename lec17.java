/*
=====================================================
        TYPE CASTING IN JAVA (lec17)
=====================================================

TYPE CASTING:
- Converting one data type into another

TYPES OF TYPE CASTING IN OOP:
1. Upcasting   (Parent ← Child)
2. Downcasting (Child ← Parent)

NOTE:
- Type casting works only with inheritance
=====================================================
*/

class A {
    public void show1() {
        System.out.println("In A show()");
    }
}

class B extends A {
    public void show2() {
        System.out.println("In B show()");
    }
}

public class lec17 {

    public static void main(String[] args) {

        /*
        -------------------------------------------------
        UPCASTING
        -------------------------------------------------
        Parent reference → Child object
        */

        A obj = new B();   // Upcasting (implicit)
        obj.show1();      // Allowed
        // obj.show2();   ❌ Not accessible using parent reference

        /*
        -------------------------------------------------
        DOWNCASTING
        -------------------------------------------------
        Child reference ← Parent reference
        */

        B obj1 = (B) obj;   // Explicit downcasting
        obj1.show2();      // Allowed
        obj1.show1();      // Also accessible
    }
}

// UPCASTING
// Converting a child object reference to a parent type.
// Example: A obj = new B();

// DOWNCASTING
// Converting a parent reference back to child type.
// Example: B obj = (B) obj;

// IMPLICIT CASTING
// Done automatically by JVM (Upcasting).

// EXPLICIT CASTING
// Must be done manually using casting operator (Downcasting).

