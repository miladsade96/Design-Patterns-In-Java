# Template Method Pattern

The Template Method Pattern is a behavioral design pattern that defines the skeleton of an algorithm in a method,
deferring some steps to subclasses. It lets subclasses redefine certain steps of an algorithm without changing the
algorithm's structure.

## 🔧 Structure

The Template Method pattern consists of two main components:

- Abstract Class:
    - Defines the template method that implements the algorithm's skeleton.
    - Declares abstract primitive operations that subclasses must implement.
    - May provide hook methods (optional steps) with default implementations.

- Concrete Classes:
    - Implement the abstract primitive operations defined in the abstract class.
    - May override hook methods to provide custom behavior.
    - Provide specific implementations for the variable parts of the algorithm.
