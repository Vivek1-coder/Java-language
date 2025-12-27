/*
=====================================================
                INTERFACES IN JAVA (lec19)
=====================================================

INTERFACE:
- A reference type in Java
- Can contain only abstract methods (before Java 8)
- All fields are public, static, and final by default
- Used to achieve multiple inheritance
=====================================================
*/

// Interface declaration
interface AA {
    int age = 20;          // final & static by default
    String area = "Hyderabad";  // final & static by default

    // Abstract methods (implicitly public)
    void show();
    void config();
}

// Interface extending another interface
interface Y extends AA {
    void run();
}

// Class implementing an interface
class B implements AA {

    @Override
    public void show() {
        System.out.println("show method implemented");
    }

    @Override
    public void config() {
        System.out.println("config method implemented");
    }
}

public class lec19 {
    public static void main(String[] args) {

        /*
        -------------------------------------------------
        INTERFACE USAGE
        -------------------------------------------------
        */

        AA obj;       // Interface reference
        obj = new B(); // Upcasting: Interface → Concrete class
        obj.show();
        obj.config();

        // obj.age = 30; ❌ ERROR (final variable)
        System.out.println("Age: " + AA.age);
        System.out.println("Area: " + AA.area);
    }
}

// INTERFACE
// A collection of abstract methods and constants to define a contract.

// IMPLEMENTS
// Keyword used by a class to implement an interface.

// EXTENDS
// Used by a class to inherit another class OR by interface to inherit another interface

// ABSTRACT CLASS vs INTERFACE
// Abstract class:
// - Can have instance variables
// - Can have constructors
// - Can have concrete methods

// Interface:
// - Cannot have instance variables (only public static final constants)
// - No constructors
// - All methods are abstract (unless default/static in Java 8+)


// Example
// interface Vehicle {
//     void start();
//     void stop();
// }

// interface Electric {
//     void charge();
// }

// class ElectricCar implements Vehicle, Electric {
//     public void start() { System.out.println("Car started"); }
//     public void stop()  { System.out.println("Car stopped"); }
//     public void charge(){ System.out.println("Car charging"); }
// }
