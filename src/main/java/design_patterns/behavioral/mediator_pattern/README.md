# Mediator Pattern

The Mediator Pattern is a behavioral design pattern that reduces chaotic dependencies between objects by restricting
direct communications between them and forcing them to collaborate only via a mediator object. This pattern promotes
loose coupling by preventing objects from referring to each other explicitly.

## 🔧 Structure

The Mediator pattern consists of four main components:

- Mediator (Interface):
    - Defines an interface for communicating with Colleague objects.
    - Typically, includes methods for registering colleagues and handling notifications.
- Concrete Mediator:
    - Implements the Mediator interface.
    - Coordinates communication between Colleague objects.
    - Knows about and maintains references to all colleagues.
    - Contains the complex communication logic between components.
- Colleague (Interface/Abstract Class):
    - Defines an interface for objects that communicate through the Mediator.
    - Typically, includes a reference to the Mediator object.
- Concrete Colleague:
    - Implements the Colleague interface.
    - Communicates with other colleagues only through the Mediator.
    - Notifies the mediator when its state changes or when it needs to communicate with others.

---

# Implementing Mediator Pattern Using Observer Pattern

The Mediator pattern can be effectively implemented using the Observer pattern by treating the mediator as both an
observable subject and an observer of its colleagues. Here's how it works in plain English:

## Basic Concept

Instead of having colleagues communicate directly through method calls to the mediator, we can use the observer pattern
to create a more dynamic and decoupled implementation. The mediator becomes a central hub that both observes changes in
colleagues and gets observed by colleagues.

## Implementation Steps

1. Mediator as Observable: The mediator acts as a subject that colleagues can observe. When something important happens
   that other colleagues need to know about, the mediator notifies all observing colleagues.
2. Colleagues as Observers: Each colleague registers itself as an observer of the mediator. This way, they can receive
   notifications about events happening in the system without knowing who triggered them.

3. Colleagues as Observable: Colleagues can also act as subjects that the mediator observes. When a colleague's state
   changes, or it needs to communicate, it notifies the mediator (its observer).

4. Two-Way Communication:
    - When a colleague has something to communicate, it notifies the mediator (which is observing it)
    - The mediator processes this notification and then notifies all other colleagues (which are observing the mediator)

5. Decoupled Interaction: Colleagues never communicate directly with each other. They only:
    - Send notifications to the mediator (when they have something to share)
    - Receive notifications from the mediator (when something relevant happens)

## Benefits of This Approach

- Complete Decoupling: Colleagues have no knowledge of each other
- Flexible Communication: The mediator can filter, transform, or route messages as needed
- Easy Extensibility: New colleagues can be added without modifying existing ones
- Dynamic Relationships: Communication patterns can change at runtime

