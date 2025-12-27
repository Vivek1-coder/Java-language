/*
=====================================================
        JAVA OOPS – CLASS, OBJECT & METHODS
=====================================================

DEFINITION:
Object-Oriented Programming (OOP) is a programming
paradigm based on objects that contain data
(properties) and methods (behaviours).

-----------------------------------------------------
CORE OOPS CONCEPTS USED HERE
-----------------------------------------------------
1. Class
2. Object
3. Instance Variables
4. Local Variables
5. Methods
6. Method Overloading
7. Heap & Stack Memory
-----------------------------------------------------
*/


/*
Class -> A blueprint from which objects are created.

*/
class Calculator {

    /*
    -------------------------------------------------
    INSTANCE VARIABLES
    -------------------------------------------------
    - Declared inside a class but outside methods
    - Stored in Heap Memory
    - Each object has its own copy
    */

    int a;
    int b;

    /*
    -------------------------------------------------
    METHOD
    -------------------------------------------------
    DEFINITION:
    A method is a block of code that performs a
    specific task and can return a value.
    */

    // Local variables: num1, num2, r
    public int add(int num1, int num2) {
        int r = num1 + num2;   // local variable (stack memory)
        System.out.println("in add");
        return r;
    }

    /*
    -------------------------------------------------
    METHOD OVERLOADING
    -------------------------------------------------
    DEFINITION:
    Method overloading allows multiple methods with
    the same name but different parameter lists.
    */

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}

class Computer {

    /*
    -------------------------------------------------
    VOID METHOD
    -------------------------------------------------
    A method that does not return any value.
    */

    public void playmusic() {
        System.out.println("play music");
    }

    /*
    -------------------------------------------------
    METHOD WITH RETURN TYPE
    -------------------------------------------------
    */

    public String call(int cost) {
        if (cost < 10) {
            return "nothing";
        }
        return "pen";
    }
}

public class lec7 {
    public static void main(String[] args) {

        /*
        -------------------------------------------------
        LOCAL VARIABLES
        -------------------------------------------------
        Stored in Stack Memory
        */

        int num1 = 4;
        int num2 = 5;

        /*
        -------------------------------------------------
        OBJECT CREATION
        -------------------------------------------------
        new → allocates memory in heap
        calc → reference variable (stored in stack)
        Calculator() → constructor call
        */

        Calculator calc = new Calculator();

        int result = calc.add(num1, num2);
        int result2 = calc.add(3, 3, 4);

        System.out.println(result);

        /*
        -------------------------------------------------
        WHAT HAPPENS BEHIND THE SCENES
        -------------------------------------------------

        Java Source Code (.java)
              ↓ Compiler (javac)
        Bytecode (.class)
              ↓ JVM
        Machine Code (OS specific)

        JDK (Java Development Kit)
        = JRE + Development Tools

        JRE (Java Runtime Environment)
        = JVM + Core Libraries

        JVM (Java Virtual Machine)
        = Executes Bytecode
        */

        /*
        -------------------------------------------------
        USING ANOTHER CLASS
        -------------------------------------------------
        */

        Computer obj = new Computer();
        obj.playmusic();

        String str = obj.call(10);
        System.out.println(str);

        /*
        -------------------------------------------------
        MULTIPLE OBJECTS OF SAME CLASS
        -------------------------------------------------
        Each object has its own instance variables
        */

        Calculator obj1 = new Calculator();
        Calculator obj2 = new Calculator();

        obj1.a = 8;
        obj2.a = 9;

        // Values are independent for each object
        System.out.println(obj1.a + " " + obj2.a);
    }
}


/*
=====================================================
        OBJECT ORIENTED PROGRAMMING (JAVA)
=====================================================

OOP DEFINITION:
Object-Oriented Programming is a programming
paradigm based on objects that contain data
(properties) and methods (behaviours).

=====================================================
        CORE OOPS DEFINITIONS
=====================================================
*/

/*
1. CLASS
A class is a blueprint or template used to create
objects. It defines variables and methods.
*/

/*
2. OBJECT
An object is an instance of a class.
It represents a real-world entity with state
and behaviour.
*/

/*
3. INSTANCE VARIABLE
A variable declared inside a class but outside
any method. Each object has its own copy.
Stored in heap memory.
*/

/*
4. LOCAL VARIABLE
A variable declared inside a method or block.
Stored in stack memory and exists temporarily.
*/

/*
5. METHOD
A method is a block of code that performs a
specific task and may return a value.
*/

/*
6. CONSTRUCTOR
A constructor is a special method used to
initialize objects. It has the same name
as the class and no return type.
*/

/*
7. THIS KEYWORD
The 'this' keyword refers to the current object
of the class. It differentiates instance and
local variables.
*/

/*
8. ENCAPSULATION
Encapsulation is the wrapping of data and
methods into a single unit (class).
It provides data security.
*/

/*
9. DATA HIDING
Data hiding restricts direct access to data
using access modifiers like private.
*/

/*
10. ABSTRACTION
Abstraction hides implementation details
and shows only essential features.
Achieved using abstract classes and interfaces.
*/

/*
11. INHERITANCE
Inheritance allows one class to acquire
properties and methods of another class.
Implemented using 'extends'.
*/

/*
12. POLYMORPHISM
Polymorphism means one method having
multiple forms based on object type.
*/

/*
13. METHOD OVERLOADING
Multiple methods with same name but
different parameters in the same class.
Compile-time polymorphism.
*/

/*
14. METHOD OVERRIDING
Subclass provides its own implementation
of a parent class method.
Runtime polymorphism.
*/

/*
15. DYNAMIC METHOD DISPATCH
Method call is resolved at runtime based
on object type.
*/

/*
16. INTERFACE
An interface contains abstract methods.
Used to achieve 100% abstraction and
multiple inheritance.
*/

/*
17. ABSTRACT CLASS
A class that cannot be instantiated.
May contain abstract and concrete methods.
*/

/*
18. ACCESS MODIFIERS
Define visibility of variables and methods.

private   → within class
default   → within package
protected → package + subclass
public    → everywhere
*/

/*
19. STATIC KEYWORD
Static members belong to the class, not
to individual objects.
*/

/*
20. FINAL KEYWORD
final variable → constant
final method   → cannot be overridden
final class    → cannot be inherited
*/

/*
21. OBJECT REFERENCE
Stores the memory address of an object
and is used to access object members.
*/

/*
22. HEAP MEMORY
Stores objects and instance variables.
Managed by JVM and garbage collector.
*/

/*
23. STACK MEMORY
Stores method calls and local variables.
Follows LIFO order.
*/

/*
24. GARBAGE COLLECTION
Automatic removal of unused objects
from heap memory by JVM.
*/

/*
25. OBJECT CLASS
The Object class is the parent of all
Java classes.
*/

/*
26. COMPILE-TIME POLYMORPHISM
Achieved using method overloading.
*/

/*
27. RUNTIME POLYMORPHISM
Achieved using method overriding.
*/

/*
28. BINDING
Linking of method call to method body.

Early Binding → Compile time
Late Binding  → Runtime
*/

/*
29. IS-A RELATIONSHIP
Represents inheritance.
Example: Dog IS-A Animal.
*/

/*
30. HAS-A RELATIONSHIP
Represents association.
Example: Car HAS-A Engine.
*/

