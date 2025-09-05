# Design Patterns in Java

## 🌟 Introduction

This repository contains implementations of classic design patterns in Java, following object-oriented design
principles. Each pattern includes:

- Java implementation with clear example
- Detailed explanation in its own README

## 🗂 Pattern Categories

[//]: # (### Creational Patterns)

[//]: # ()

[//]: # (Patterns that deal with object creation mechanisms.)

[//]: # ()

[//]: # (| Pattern                                         | Description                                    | Implementation                      |)

[//]: # (|-------------------------------------------------|------------------------------------------------|-------------------------------------|)

[//]: # (| [Singleton]&#40;creational/singleton&#41;               | Ensures a class has only one instance          | [View]&#40;creational/singleton&#41;        |)

[//]: # (| [Factory Method]&#40;creational/factory-method&#41;     | Creates objects without specifying exact class | [View]&#40;creational/factory-method&#41;   |)

[//]: # (| [Abstract Factory]&#40;creational/abstract-factory&#41; | Creates families of related objects            | [View]&#40;creational/abstract-factory&#41; |)

[//]: # (| [Builder]&#40;creational/builder&#41;                   | Constructs complex objects step by step        | [View]&#40;creational/builder&#41;          |)

[//]: # (| [Prototype]&#40;creational/prototype&#41;               | Creates new objects by cloning prototypes      | [View]&#40;creational/prototype&#41;        |)

[//]: # ()

[//]: # (### Structural Patterns)

[//]: # ()

[//]: # (Patterns that deal with object composition and class relationships.)

[//]: # ()

[//]: # (| Pattern                           | Description                                       | Implementation               |)

[//]: # (|-----------------------------------|---------------------------------------------------|------------------------------|)

[//]: # (| [Adapter]&#40;structural/adapter&#41;     | Bridges incompatible interfaces                   | [View]&#40;structural/adapter&#41;   |)

[//]: # (| [Composite]&#40;structural/composite&#41; | Treats individual and composite objects uniformly | [View]&#40;structural/composite&#41; |)

[//]: # (| [Proxy]&#40;structural/proxy&#41;         | Provides a placeholder for another object         | [View]&#40;structural/proxy&#41;     |)

[//]: # (| [Flyweight]&#40;structural/flyweight&#41; | Shares objects to reduce memory usage             | [View]&#40;structural/flyweight&#41; |)

[//]: # (| [Facade]&#40;structural/facade&#41;       | Provides a simplified interface to a subsystem    | [View]&#40;structural/facade&#41;    |)

[//]: # (| [Bridge]&#40;structural/bridge&#41;       | Separates abstraction from implementation         | [View]&#40;structural/bridge&#41;    |)

### Behavioral Patterns

Patterns that deal with object interaction and responsibility distribution.

| Pattern         | Description                                                                                                                                               | Implementation                                                           |
|-----------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------|
| Memento         | Implementing the undo mechanisms                                                                                                                          | [View](src/main/java/design_patterns/behavioral/momento_pattern)         |
| state           | Allowing an object to alter its behavior based on its internal state                                                                                      | [View](src/main/java/design_patterns/behavioral/state_pattern)           |
| Iterator        | Allowing access the elements of a collection without exposing its underlying representation                                                               | [View](src/main/java/design_patterns/behavioral/iterator_pattern)        |                                         
| Strategy        | Enables selecting an algorithm's behavior at runtime                                                                                                      | [View](src/main/java/design_patterns/behavioral/strategy_pattern)        |
| Template Method | Defines the skeleton of an algorithm in a method, deferring some steps to subclasses                                                                      | [View](src/main/java/design_patterns/behavioral/template_method_pattern) |
| Command         | Turns a request into a stand-alone object containing all information about the request                                                                    | [View](src/main/java/design_patterns/behavioral/command_pattern)         |
| Observer        | Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically         | [View](src/main/java/design_patterns/behavioral/observer_pattern)        |
| Mediator        | Reduces chaotic dependencies between objects by restricting direct communications between them and forcing them to collaborate only via a mediator object | [View](src/main/java/design_patterns/behavioral/mediator_pattern)        |

## 🚧 Ongoing Development

This repository is under active development, with more design patterns being implemented regularly. Future updates will
include additional creational, structural, and behavioral patterns, along with real-world examples, performance
considerations, and comparisons between similar patterns. Contributions and suggestions are welcome—feel free to open
an issue or submit a pull request! Stay tuned for more patterns like Interpreter, Chain of Responsibility, and Null
Object, coming soon.
