# Factory Method Pattern

The Factory Method Pattern is a creational design pattern that provides an interface for creating objects in a
superclass, but allows subclasses to alter the type of objects that will be created. This pattern defines a method that
should be used for creating objects rather than calling a constructor directly.

## 🔧 Structure

The Factory Method pattern consists of four main components:

- Product (Interface):
    - Defines the interface of objects the factory method creates.
    - Declares the operations that all concrete products must implement.
- Concrete Product:
    - Implements the Product interface.
    - Provides specific implementation of the product.
    - Represents the actual objects being created.
- Creator (Abstract Class/Interface):
    - Declares the factory method that returns new product objects.
    - May provide a default implementation of the factory method.
    - Contains core business logic that relies on product objects.
- Concrete Creator:
    - Overrides the factory method to return an instance of a Concrete Product.
    - Decides which specific product class to instantiate.
    - May contain additional initialization logic for the product.

