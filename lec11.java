/*
=====================================================
            ENCAPSULATION IN JAVA (lec11)
=====================================================

ENCAPSULATION:
- Wrapping data (variables) and methods into a single unit (class)
- Data is hidden using 'private' access modifier
- Access is provided using public getters and setters

BENEFITS:
- Data hiding
- Security
- Better control over data
- Code reusability & maintainability
=====================================================
*/

class Human {

    /*
    -------------------------------------------------
    PRIVATE INSTANCE VARIABLES
    -------------------------------------------------
    - Cannot be accessed directly outside the class
    */

    private int age;
    private String name;

    /*
    -------------------------------------------------
    CONSTRUCTORS
    -------------------------------------------------
    - Called automatically when object is created
    - Used to initialize variables
    */

    // Parameterized constructor
    public Human(int age, String name) {
        this.age = age;      // this → current object
        this.name = name;
        System.out.println("Constructor called");
    }

    // Constructor overloading
    public Human(int age) {
        this.age = age;
    }

    /*
    -------------------------------------------------
    GETTERS AND SETTERS
    -------------------------------------------------
    - Getter → returns value
    - Setter → modifies value
    */

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Validation can be added here
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class lec11 {
    public static void main(String[] args) {

        /*
        -------------------------------------------------
        OBJECT CREATION
        -------------------------------------------------
        */

        Human obj = new Human(23, "Chamanlal");

        // Direct access is NOT allowed
        // obj.age = 10;     ❌
        // obj.name = "ABC";❌

        /*
        Accessing data using getters and setters
        */

        obj.setAge(25);
        obj.setName("Ramesh");

        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}

// ENCAPSULATION
// Binding data and methods together and hiding data using private access.

// GETTER
// A method that returns the value of a private variable.

// SETTER
// A method that updates the value of a private variable.

// THIS KEYWORD
// Refers to the current calling object.

// CONSTRUCTOR
// A special method that initializes objects automatically.
