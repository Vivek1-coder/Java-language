/*
=====================================================
        INHERITANCE & METHOD OVERRIDING (lec13)
=====================================================

INHERITANCE:
- One class acquires the properties and methods of another class
- Implemented using 'extends' keyword
- Represents an "IS-A" relationship
  Example:
    Car IS-A Vehicle
    AdvCalc IS-A Calc

TYPES OF INHERITANCE IN JAVA:
1. Single Level
2. Multilevel
❌ Multiple inheritance using classes is NOT supported
   (to avoid ambiguity problem)
=====================================================
*/

class Calc {

    public void show() {
        System.out.println("In show() of Calc");
    }

    public void config() {
        System.out.println("In config() of Calc");
    }
}

/*
-----------------------------------------------------
SINGLE LEVEL INHERITANCE
-----------------------------------------------------
*/

class AdvCalc extends Calc {

    /*
    METHOD OVERRIDING:
    - Same method name
    - Same parameters
    - Same return type
    - Happens at runtime (Runtime Polymorphism)
    */

    @Override
    public void show() {
        System.out.println("In show() of AdvCalc");
    }
}

/*
-----------------------------------------------------
MULTI-LEVEL INHERITANCE
-----------------------------------------------------
*/

class SuperAdvCalc extends AdvCalc {
    public void power() {
        System.out.println("Power method");
    }
}

public class lec13 {
    public static void main(String[] args) {

        /*
        -------------------------------------------------
        POLYMORPHISM (Runtime)
        -------------------------------------------------
        Parent reference → Child object
        */

        Calc obj = new AdvCalc();  // Upcasting
        obj.show();    // Calls AdvCalc's show()
        obj.config();  // Calls Calc's config()

        /*
        OUTPUT:
        In show() of AdvCalc
        In config() of Calc
        */
    }
}


// class A {
//     void show() {}
// }
//
// class B {
//     void show() {}
// }
//
// ❌ ERROR: Ambiguity
// class C extends A, B {}


// INHERITANCE
// A mechanism where one class acquires properties and methods of another class.

// METHOD OVERRIDING
// Redefining a parent class method in child class with same signature.

// POLYMORPHISM
// One method behaving differently for different objects.

// UPCASTING
// Parent reference holding child object (Calc obj = new AdvCalc()).

// IS-A RELATIONSHIP
// Inheritance represents IS-A relationship.
