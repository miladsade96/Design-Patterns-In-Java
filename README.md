# Design Patterns in Java

## 🌟 Introduction

This repository contains implementations of classic design patterns in Java, following object-oriented design
principles. Each pattern includes:

- Java implementation with clear example
- Detailed explanation in its own README

## 🗂 Pattern Categories

### Behavioral Patterns

Patterns that deal with object interaction and responsibility distribution.

| Pattern                 | Description                                                                                                                                               | Implementation                                                                   |
|-------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------|
| Memento                 | Implementing the undo mechanisms                                                                                                                          | [View](src/main/java/design_patterns/behavioral/momento_pattern)                 |
| state                   | Allowing an object to alter its behavior based on its internal state                                                                                      | [View](src/main/java/design_patterns/behavioral/state_pattern)                   |
| Iterator                | Allowing access the elements of a collection without exposing its underlying representation                                                               | [View](src/main/java/design_patterns/behavioral/iterator_pattern)                |                                         
| Strategy                | Enables selecting an algorithm's behavior at runtime                                                                                                      | [View](src/main/java/design_patterns/behavioral/strategy_pattern)                |
| Template Method         | Defines the skeleton of an algorithm in a method, deferring some steps to subclasses                                                                      | [View](src/main/java/design_patterns/behavioral/template_method_pattern)         |
| Command                 | Turns a request into a stand-alone object containing all information about the request                                                                    | [View](src/main/java/design_patterns/behavioral/command_pattern)                 |
| Observer                | Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically         | [View](src/main/java/design_patterns/behavioral/observer_pattern)                |
| Mediator                | Reduces chaotic dependencies between objects by restricting direct communications between them and forcing them to collaborate only via a mediator object | [View](src/main/java/design_patterns/behavioral/mediator_pattern)                |
| Chain of Responsibility | Allows passing requests along a chain of handlers                                                                                                         | [View](src/main/java/design_patterns/behavioral/chain_of_responsibility_pattern) |
| Visitor                 | Allows adding new operations to existing object structures without modifying the structures themselves                                                    | [View](src/main/java/design_patterns/behavioral/visitor_pattern)                 |

### Creational Patterns

Patterns that deal with object creation mechanisms.

| Pattern   | Description                                                                                  | Implementation                                                     |
|-----------|----------------------------------------------------------------------------------------------|--------------------------------------------------------------------|
| Singleton | Ensures a class has only one instance and provides a global point of access to that instance | [View](src/main/java/design_patterns/creational/singleton_pattern) |

## 🚧 Ongoing Development

This repository is under active development, with more design patterns being implemented regularly. Future updates will
include additional creational, structural, and behavioral patterns, along with real-world examples, performance
considerations, and comparisons between similar patterns. Contributions and suggestions are welcome—feel free to open
an issue or submit a pull request! Stay tuned for more patterns like Interpreter, Chain of Responsibility, and Null
Object, coming soon.
