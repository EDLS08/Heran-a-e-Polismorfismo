# Java — Herança e Polimorfismo

Exercício de POO em Java que representa funcionários e gerentes para demonstrar herança e sobrescrita de métodos.

## Conceitos praticados

- Herança com `extends`
- Membros com modificador `protected`
- Sobrescrita de métodos com `@Override`
- Polimorfismo por meio de uma referência da classe base
- Validação dos valores de salário e multiplicador de bônus

## Modelo

- `Employee` define o nome, o salário-base e o cálculo padrão do salário.
- `Manager` estende `Employee` e sobrescreve `calculateSalary()` para aplicar um multiplicador de bônus.
- `Main` armazena um gerente em uma referência do tipo `Employee` e chama o método sobrescrito.

## Requisitos e execução

JDK 8 ou superior.

```bash
javac -d out src/Employee.java src/Manager.java src/Main.java
java -cp out Main
```

## Idioma

[Read in English](README.md)
