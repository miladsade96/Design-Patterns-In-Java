# Iterator Pattern

The Iterator Pattern is a behavioral design pattern that provides a way to access elements of a collection sequentially
without exposing its underlying representation. It decouples the traversal logic from the collection, allowing multiple
traversals of the same collection to occur independently.

## 🔧 Structure

- Iterator (Interface):
    - Defines a standard interface for traversing a collection.
    - Typically, includes methods like `next()`, `hasNext()`, `current()`, and `remove()`.
- Concrete Iterator:
    - Implements the Iterator interface.
    - Maintains the current position during traversal.
    - Provides specific implementation for traversing a particular collection.
- Aggregate (Interface):
    - Defines an interface for creating an Iterator object.
    - Typically, includes a method like `createIterator()`.

- Concrete Aggregate:
    - Implements the Aggregate interface.
    - Returns an instance of the appropriate Concrete Iterator.
    - Contains the actual collection of objects to be traversed.
