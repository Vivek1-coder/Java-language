/*
=====================================================
        STATIC KEYWORD, CONSTRUCTOR & STATIC BLOCK
                        (lec10)
=====================================================

STATIC KEYWORD:
- Belongs to the class, not to objects
- Shared among all objects of the class
- Loaded when class is loaded by JVM

=====================================================
*/

class Mobile {

    String brand;      // Instance variable (object specific)
    int price;         // Instance variable
    static String name; // Static variable (class level)

    /*
    -------------------------------------------------
    CONSTRUCTOR
    -------------------------------------------------
    - Special method
    - Same name as class
    - No return type
    - Called automatically when object is created
    */

    public Mobile() {
        System.out.println("Constructor called");
    }

    /*
    -------------------------------------------------
    STATIC BLOCK
    -------------------------------------------------
    - Executes ONLY ONCE
    - Executes when class is loaded
    - Used to initialize static variables
    - Executes BEFORE constructor
    */

    static {
        name = "Phone";
        System.out.println("Static block is called");

        /*
        Flow:
        JVM → Class Loader → Static Block → Constructor
        */
    }

    /*
    -------------------------------------------------
    INSTANCE METHOD
    -------------------------------------------------
    - Can access instance + static variables
    */

    public void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    /*
    -------------------------------------------------
    STATIC METHOD
    -------------------------------------------------
    - Can access ONLY static variables directly
    - Cannot access instance variables
    */

    public static void show1() {
        System.out.println("In static method");
        System.out.println("Name: " + name);
    }

    /*
    Static method accessing instance variable
    by using object reference
    */

    public static void show1(Mobile obj) {
        System.out.println("Brand: " + obj.brand);
    }
}

public class lec10 {
    public static void main(String[] args) throws ClassNotFoundException {

        /*
        -------------------------------------------------
        OBJECT CREATION
        -------------------------------------------------
        */

        Mobile mob1 = new Mobile();
        mob1.brand = "Apple";
        mob1.price = 400;

        Mobile mob2 = new Mobile();
        mob2.brand = "Samsung";
        mob2.price = 450;

        Mobile mob3 = new Mobile();
        mob3.brand = "Apple";
        mob3.price = 500;

        /*
        -------------------------------------------------
        STATIC VARIABLE USAGE
        -------------------------------------------------
        - Common for all objects
        - Accessed using class name
        */

        Mobile.name = "Smartphone";

        mob1.show();
        mob2.show();
        mob3.show();

        /*
        STATIC METHOD CALL
        */

        Mobile.show1();
        Mobile.show1(mob1);

        /*
        -------------------------------------------------
        LOADING CLASS WITHOUT OBJECT
        -------------------------------------------------
        - Static block will execute
        - No object creation required
        */

        Class.forName("Mobile");
    }
}

// STATIC VARIABLE
// A variable shared by all objects of a class.

// STATIC METHOD
// A method that can be called without creating an object.

// STATIC BLOCK
// A block that executes when the class is loaded by JVM.

// CONSTRUCTOR
// Used to initialize objects automatically at creation.

// INSTANCE VARIABLE
// A variable unique to each object.

