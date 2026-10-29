# Java: Herança & Sobrescrita de Métodos

Um projeto prático focado na implementação de design orientado a objetos utilizando os conceitos de herança e polimorfismo dinâmico em Java.

## 🚀 Conceitos Praticados

* **Herança (`extends`):** Reutilização de código através da criação de uma classe especializada (`Manager`) que herda atributos e métodos de uma classe base (`Employee`).
* **Modificadores de Acesso (`protected`):** Permissão de acesso direto a atributos da classe mãe pelas subclasses, mantendo-os protegidos contra acesso de classes externas.
* **Sobrescrita de Métodos (`@Override`):** Redefinição do comportamento de um método da classe mãe dentro da classe filha para aplicar uma regra de negócio específica.
* **Casting de Tipos:** Conversão explícita de tipos numéricos `(int)` durante operações matemáticas que envolvem diferentes precisões (double para int).

## 📋 Funcionalidades

1. Estabelece uma estrutura base (`Employee`) com nome, salário base e lógica de cálculo padrão.
2. Cria uma subclasse especializada (`Manager`) que adiciona um multiplicador de bônus por desempenho.
3. Sobrescreve o cálculo salarial para aplicar o bônus dinamicamente sobre o salário base.
4. Executa e orquestra o sistema de forma segura dentro de uma classe `Main` padrão.

## 🛠️ Como Executar

1. Compile todos os arquivos de código simultaneamente:
   ```bash
   javac Employee.java Manager.java Main.java
   ```
2. Execute o bytecode gerado:
   ```bash
   java Main
   ```
