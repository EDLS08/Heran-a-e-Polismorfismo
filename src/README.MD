# Java: Inheritance & Method Overriding

A practical project focused on implementing object-oriented design using inheritance and dynamic polymorphism in Java.

## 🚀 Concepts Practiced

* **Inheritance (`extends`):** Reusing code by creating a specialized class (`Manager`) that inherits attributes and methods from a base class (`Employee`).
* **Access Modifiers (`protected`):** Allowing subclass methods direct access to parent fields while keeping them protected from external classes.
* **Method Overriding (`@Override`):** Redefining the behavior of a parent method inside the subclass to implement specific business logic.
* **Type Casting:** Converting numerical data types explicitly `(int)` during mathematical operations involving different precisions.

## 📋 Features

1. Establishes a base `Employee` blueprint with name, base salary, and calculation logic.
2. Specializes a `Manager` subclass that adds a custom performance bonus multiplier.
3. Overrides the salary calculation pipeline to dynamically apply the bonus to the base income.
4. Executes and orchestrates the system safely inside a standard `Main` class.

## 🛠️ How to Run

1. Compile all source files simultaneously:
   ```bash
   javac Employee.java Manager.java Main.java
   ```
2. Run the executable bytecode:
   ```bash
   java Main
   ```
