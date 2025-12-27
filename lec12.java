/*
=====================================================
        INHERITANCE & CONSTRUCTOR CHAINING (lec12)
=====================================================

INHERITANCE:
- One class acquires the properties and methods of another class
- Achieved using 'extends' keyword
- Every class in Java implicitly extends Object class

CONSTRUCTOR CHAINING:
- Calling one constructor from another constructor
- Happens using super() and this()
=====================================================
*/

class A {

    // Default constructor
    public A() {
        // Implicitly: class A extends Object
        System.out.println("In A (default constructor)");
    }

    // Parameterized constructor
    public A(int a) {
        System.out.println("In A parameterized constructor: " + a);
    }
}

class B extends A {

    // Default constructor
    public B() {
        /*
        By default, Java inserts:
        super();  // calls default constructor of parent class
        */
        System.out.println("In B (default constructor)");
    }

    // Parameterized constructor
    public B(int a) {

        /*
        IMPORTANT RULES:
        - super() or this() must be the FIRST statement
        - Only one of them can be used at a time
        */

        super(a);   // Calls parameterized constructor of class A
        // this();  ❌ ERROR if used together with super()

        System.out.println("In B parameterized constructor: " + a);
    }
}

public class lec12 {
    public static void main(String[] args) {

        /*
        OBJECT CREATION
        */

        B obj = new B();
        /*
        OUTPUT:
        In A (default constructor)
        In B (default constructor)
        */

        B obj1 = new B(8);
        /*
        OUTPUT:
        In A parameterized constructor: 8
        In B parameterized constructor: 8
        */
    }
}

// both keywords can not be used together
// super(a);
// this();   // ❌ ERROR


// INHERITANCE
// A mechanism where one class acquires the properties of another class.

// SUPER KEYWORD
// Used to call parent class constructor or access parent class members.

// THIS KEYWORD
// Refers to the current object of the class.

// CONSTRUCTOR CHAINING
// Process of calling constructors from parent to child classes.

// OBJECT CLASS
// The root class of Java hierarchy; every class extends Object implicitly.
