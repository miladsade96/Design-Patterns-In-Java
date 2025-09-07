# Chain of Responsibility Pattern

The Chain of Responsibility Pattern is a behavioral design pattern that allows passing requests along a chain of
handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler
in the chain. This pattern promotes loose coupling between senders and receivers of requests.

## 🔧 Structure

The Chain of Responsibility pattern consists of four main components:

- Handler (Interface/Abstract Class):
    - Defines an interface for handling requests.
    - Typically, includes a method like handleRequest() and a method to set the next handler.
    - May implement a default handling behavior that passes the request to the next handler.
- Concrete Handler:
    - Implements the Handler interface.
    - Handles requests it is responsible for.
    - Can access the next handler in the chain.
    - Decides whether to process the request or pass it along the chain.
- Client:
    - Initiates the request to a handler in the chain.
    - Doesn't need to know which handler will process the request.
- Request:
    - The object containing request details that gets passed along the chain.
    - May contain data needed by handlers to make processing decisions.
