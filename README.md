# Java — Inheritance and Polymorphism

A Java OOP exercise that models employees and managers to demonstrate inheritance and method overriding.

## Concepts practiced

- Inheritance with `extends`
- Protected members
- Method overriding with `@Override`
- Polymorphism through a parent-class reference
- Validation of salary and bonus multiplier values

## Model

- `Employee` defines the employee name, base salary, and default salary calculation.
- `Manager` extends `Employee` and overrides `calculateSalary()` to apply a bonus multiplier.
- `Main` stores a manager in an `Employee` reference and invokes the overridden method.

## Requirements and execution

JDK 8 or newer.

```bash
javac -d out src/Employee.java src/Manager.java src/Main.java
java -cp out Main
```

## Language

[Leia em português](README.pt-br.md)
