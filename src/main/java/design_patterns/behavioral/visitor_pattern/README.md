# Visitor Pattern

The Visitor Pattern is a behavioral design pattern that allows adding new operations to existing object structures
without modifying the structures themselves. It separates algorithms from the objects on which they operate, enabling
the definition of new operations without changing the classes of the elements.

## 🔧 Structure

The Visitor pattern consists of five main components:

- Visitor (Interface):
    - Declares a set of visiting methods that can take concrete elements as arguments.
    - Typically, includes a visit method for each type of concrete element.
- Concrete Visitor:
    - Implements each operation declared by the Visitor interface.
    - Implements the algorithm for all types of elements.
    - Stores local state that might accumulate during the traversal.
- Element (Interface):
    - Defines an accept method that takes a visitor as an argument.
    - Provides the entry point for visitors to operate on the element.
- Concrete Element:
    - Implements the Element interface.
    - Implements the accept method to call the appropriate visitor method.
    - Contains the data structure that visitors will operate on.
- Object Structure:
    - Maintains a collection of elements.
    - May provide methods for visitors to traverse all elements.
    - Can be a complex structure like a composite tree.
