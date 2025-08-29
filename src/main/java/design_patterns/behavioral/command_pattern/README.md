# Command Pattern

The Command Pattern is a behavioral design pattern that turns a request into a stand-alone object containing all
information about the request. This transformation allows for parameterizing methods with different requests, delaying
or queueing a request's execution, and supporting undoable operations.

## 🔧 Structure

The Command pattern consists of five main components:

- Command (Interface):
    - Declares an interface for executing an operation.
    - Typically, includes a method like execute() or undo().
- Concrete Command:
    - Implements the Command interface.
    - Defines a binding between a Receiver object and an action.
    - Implements execute() by invoking the corresponding operation(s) on the Receiver.
- Receiver:
    - Knows how to perform the operations associated with carrying out a request.
    - Contains the actual business logic that gets executed.
- Invoker:
    - Asks the command to carry out the request.
    - Holds a command and can trigger its execution.
    - May store commands for history, undo/redo functionality, or queuing.
- Client:
    - Creates a ConcreteCommand object and sets its receiver.
    - Configures the Invoker with the command object.
