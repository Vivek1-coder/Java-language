/*
=====================================================
        PACKAGES, IMPORTS & ACCESS MODIFIERS (lec14)
=====================================================

PACKAGE:
- A package is a namespace that groups related classes and interfaces
- Helps avoid name conflicts
- Provides better code organization and access control

EXAMPLE:
package tools;   // creates a folder named "tools"

To use a class from a package:
import tools.Calc;

To import all classes from a package:
import tools.*;

NOTE:
- Use dot (.) instead of slash (/)
=====================================================
*/

import java.util.ArrayList;   // Importing built-in Java package

/*
-----------------------------------------------------
ACCESS MODIFIERS IN JAVA
-----------------------------------------------------

1. public
   - Accessible from anywhere
   - Across packages and classes

2. private
   - Accessible only within the same class
   - Used for data hiding

3. protected
   - Accessible within the same package
   - Accessible in child class outside the package

4. default (no keyword)
   - Accessible only within the same package

ACCESSIBILITY TABLE:

Modifier     Same Class   Same Package   Subclass   Other Package
---------------------------------------------------------------
public          ✔            ✔              ✔           ✔
protected       ✔            ✔              ✔           ❌
default         ✔            ✔             ❌           ❌
private         ✔            ❌            ❌           ❌
---------------------------------------------------------------

*/

/*
IMPORTANT RULES:
- Only ONE public class per file
- File name must match public class name
*/

public class lec14 {

    public static void main(String[] args) {

        /*
        -------------------------------------------------
        USING JAVA BUILT-IN PACKAGE
        -------------------------------------------------
        */

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
    }
}

// PACKAGE
// A collection of related classes and interfaces.

// IMPORT
// Used to access classes defined in other packages.

// ACCESS MODIFIERS
// Keywords that define the accessibility of classes, methods, and variables.

// DEFAULT ACCESS
// When no access modifier is specified, accessible only within the same package.

// java.util.Scanner
// java.util.ArrayList
// java.lang.String   // auto imported