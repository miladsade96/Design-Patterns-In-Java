# Strategy Pattern

The Strategy Pattern is a behavioral design pattern that enables selecting an algorithm's behavior at runtime. It
defines a family of algorithms, encapsulates each one, and makes them interchangeable. This pattern lets the algorithm
vary independently of clients that use it.

## 🔧 Structure

The Strategy pattern consists of three main components:

- Context:
    - Maintains a reference to a Strategy object.
    - May define an interface that lets the Strategy access its data.
    - Delegates the algorithm execution to the current Strategy.

- Strategy (Interface):
    - Declares an interface common to all supported algorithms.
    - The Context uses this interface to call the algorithm defined by a Concrete Strategy.

- Concrete Strategies:
    - Implement the Strategy interface using specific algorithms.
    - Each class provides a different variation or implementation of the algorithm.
