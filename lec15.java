/*
=====================================================
        POLYMORPHISM & DYNAMIC METHOD DISPATCH (lec15)
=====================================================

POLYMORPHISM:
- One method having many behaviors
- Same method call behaves differently for different objects

TYPES OF POLYMORPHISM IN JAVA:
1. Compile-time Polymorphism (Early Binding)
   → Method Overloading
2. Runtime Polymorphism (Late Binding)
   → Method Overriding
   → Dynamic Method Dispatch
=====================================================
*/

class A {
    public void show() {
        System.out.println("In A show()");
    }
}

class B extends A {

    // Method Overriding
    @Override
    public void show() {
        System.out.println("In B show()");
    }
}

public class lec15 {

    public static void main(String[] args) {

        /*
        -------------------------------------------------
        RUNTIME POLYMORPHISM
        -------------------------------------------------
        */

        A obj = new A();   // Parent object
        obj.show();       // Calls A's show()

        obj = new B();    // Parent reference → Child object (Upcasting)
        obj.show();       // Calls B's show() at runtime

        /*
        OUTPUT:
        In A show()
        In B show()
        */

        /*
        JVM decides which method to call at runtime
        based on the actual object, not the reference type
        */
    }
}

// POLYMORPHISM
// Ability of a method to take multiple forms.

// COMPILE-TIME POLYMORPHISM
// Method call resolved at compile time (Method Overloading).

// RUNTIME POLYMORPHISM
// Method call resolved at runtime (Method Overriding).

// DYNAMIC METHOD DISPATCH
// JVM decides which overridden method to call at runtime
// based on the object type.

// UPCASTING
// Parent class reference holding child class object.

