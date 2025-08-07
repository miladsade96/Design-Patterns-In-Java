# Memento Pattern

The Memento Pattern is a behavioral design pattern that allows an object to save and restore its previous state without
exposing its internal structure. It is particularly useful for implementing undo/redo functionality, snapshots, or
checkpoints in applications.

## 🔧 Structure

The Memento pattern consists of three main components:

- Originator:
    - The object whose state needs to be saved.
    - Creates a Memento containing a snapshot of its current state.
    - Can restore its state from a Memento.

- Memento:
    - A lightweight, immutable object that stores the state of the Originator.
    - Provides methods to retrieve the saved state (but only the Originator can modify it).

- Caretaker:
    - Manages and keeps track of multiple Mementos.
    - Never modifies or examines the contents of a Memento.
    - Requests a Memento from the Originator and stores it.
    - Can pass a Memento back to the Originator to restore its state.
