# Singleton Pattern

The Singleton Pattern is a creational design pattern that ensures a class has only one instance and provides a global
point of access to that instance. This pattern is useful when exactly one object is needed to coordinate actions across
a system.

## 🔧 Structure

The Singleton pattern consists of one main component:

- Singleton Class:
    - Maintains a private static reference to its only instance.
    - Provides a public static method to access the instance.
    - Has a private constructor to prevent instantiation from outside.
    - May include lazy initialization to create the instance only when needed.
