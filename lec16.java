/*
=====================================================
        FINAL & ABSTRACT KEYWORDS (lec16)
=====================================================

FINAL KEYWORD:
- Used with variable, method, and class
- Restricts modification

ABSTRACT KEYWORD:
- Used with classes and methods
- Used to achieve abstraction (hide implementation)
=====================================================
*/

class A {
    // Normal class
}

/*
-----------------------------------------------------
ABSTRACT CLASS
-----------------------------------------------------
*/

abstract class Car {

    /*
    ABSTRACT METHOD:
    - Has no body
    - Must be implemented in child class
    */
    public abstract void drive();

    /*
    CONCRETE METHOD:
    - Normal method with body
    */
    public void playMusic() {
        System.out.println("Playing music");
    }
}

/*
-----------------------------------------------------
CONCRETE CHILD CLASS
-----------------------------------------------------
*/

class Merc extends Car {

    // Implementing abstract method
    @Override
    public void drive() {
        System.out.println("Mercedes is driving");
    }
}

public class lec16 {

    public static void main(String[] args) {

        /*
        -------------------------------------------------
        FINAL KEYWORD
        -------------------------------------------------
        */

        final int num = 8;   // Constant value
        // num = 10; ❌ ERROR (cannot change final variable)

        /*
        FINAL CLASS (Example)
        final class A { }
        → Cannot be inherited
        */

        /*
        FINAL METHOD
        → Cannot be overridden
        */

        /*
        -------------------------------------------------
        OBJECT CLASS
        -------------------------------------------------
        */

        A obj = new A();

        // Object class methods
        System.out.println(obj);           // Calls obj.toString()
        System.out.println(obj.equals(obj)); // true

        /*
        -------------------------------------------------
        ABSTRACT CLASS USAGE
        -------------------------------------------------
        */

        Car car = new Merc();   // Upcasting
        car.drive();
        car.playMusic();
    }
}


// FINAL VARIABLE
// A variable whose value cannot be changed once assigned.

// FINAL METHOD
// A method that cannot be overridden.

// FINAL CLASS
// A class that cannot be inherited.

// ABSTRACT CLASS
// A class that cannot be instantiated and may contain abstract methods.

// ABSTRACT METHOD
// A method without implementation that must be implemented by child class.

// CONCRETE CLASS
// A class that provides implementation of all abstract methods.
