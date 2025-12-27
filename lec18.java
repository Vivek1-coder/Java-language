/*
=====================================================
        INNER CLASS & ANONYMOUS INNER CLASS (lec18)
=====================================================

INNER CLASS:
- A class defined inside another class
- Used to logically group classes
- Can access all members of outer class (even private)

TYPES:
1. Member Inner Class
2. Anonymous Inner Class
=====================================================
*/

class A {

    int age;

    public void show() {
        System.out.println("In show() of A");
    }

    /*
    -------------------------------------------------
    MEMBER INNER CLASS
    -------------------------------------------------
    */

    class B {
        public void config() {
            System.out.println("In config() of inner class B");
        }
    }
}

public class lec18 {

    public static void main(String[] args) {

        /*
        -------------------------------------------------
        OUTER CLASS OBJECT
        -------------------------------------------------
        */

        A obj = new A();
        obj.show();

        /*
        -------------------------------------------------
        INNER CLASS OBJECT
        -------------------------------------------------
        Syntax:
        OuterClass.InnerClass ref = outerObj.new InnerClass();
        */

        A.B obj1 = obj.new B();
        obj1.config();

        /*
        -------------------------------------------------
        ANONYMOUS INNER CLASS
        -------------------------------------------------
        - No class name
        - Used to override methods on the fly
        - Mostly used with interfaces & abstract classes
        */

        A obj2 = new A() {
            @Override
            public void show() {
                System.out.println("In overridden show() using anonymous class");
            }
        };

        obj2.show();
    }
}

// INNER CLASS
// A class defined inside another class.

// MEMBER INNER CLASS
// A non-static class inside another class.

// ANONYMOUS INNER CLASS
// A class without a name, used to override methods instantly.

// USE CASE
// Anonymous classes are commonly used in:
// - Abstract classes
// - Interfaces (before Java 8 lambdas)
