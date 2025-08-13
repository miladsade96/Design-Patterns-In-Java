# State Pattern

The State Pattern is a behavioral design pattern that allows an object to alter its behavior when its internal state
changes. The object will appear to change its class, delegating state-specific behavior to separate state objects.
This pattern is particularly useful for implementing finite state machines or managing complex state transitions in
a clean and maintainable way.

## 🔧 Structure

The State pattern consists of three main components:

- Context:
    - Maintains an instance of a concrete state that defines the current behavior.
    - Provides methods to switch between states.
    - Delegates state-specific behavior to the current state object.

- State (Interface/Abstract Class):
    - Defines a common interface for all concrete states.
    - Declares methods that represent state-specific behavior.

- Concrete States:
    - Implement the State interface, providing behavior associated with a particular state of the Context.
    - May trigger transitions to other states by modifying the Context's current state.
