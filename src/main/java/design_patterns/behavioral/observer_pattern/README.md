# Observer Pattern

The Observer Pattern is a behavioral design pattern that defines a one-to-many dependency between objects so that when
one object changes state, all its dependents are notified and updated automatically. This pattern is also known as the
Publish-Subscribe pattern.

## 🔧 Structure

The Observer pattern consists of four main components:

- Subject (Interface):
    - Maintains a list of observers.
    - Provides methods to attach, detach, and notify observers.
    - Defines the interface for objects that should be observed.
- Concrete Subject:
    - Implements the Subject interface.
    - Stores state of interest to observers.
    - Sends notifications to observers when its state changes.
- Observer (Interface):
    - Defines an updating interface for objects that should be notified of changes in a subject.
    - Typically, includes a method like update().

- Concrete Observer:
    - Implements the Observer interface.
    - Maintains a reference to the Concrete Subject.
    - Stores state that should stay consistent with the subject's state.
    - Implements the update operation to keep its state consistent with the subject.
