<a id="readme-en"></a>

# Calculator - TDD - Java

![Java 25](https://img.shields.io/badge/Java-25-ED8B00?logo=openjdk&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Wrapper%20included-C71A36?logo=apachemaven&logoColor=white)
![JUnit 5.10.2](https://img.shields.io/badge/JUnit-5.10.2-25A162?logo=junit5&logoColor=white)
![TDD](https://img.shields.io/badge/TDD-Red%20--%20Green%20--%20Refactor-1F6FEB)
![Docs ES EN](https://img.shields.io/badge/Docs-ES%20%7C%20EN-0A66C2)

**Language:** [Español](./README.md#readme-es) | **English**

**Quick navigation**

- [Description](#description)
- [Project Structure](#project-structure)
- [Main / Calculator / CalculatorTest](#project-roles)
- [How to Run the Project](#how-to-run-the-project)
- [Applied TDD Methodology](#applied-tdd-methodology)
- [Go to the Spanish version](./README.md#readme-es)

**Same navigation in Spanish**

- [Descripción](./README.md#descripcion)
- [Roles del proyecto](./README.md#roles-del-proyecto)
- [Cómo ejecutar el proyecto](./README.md#como-ejecutar-el-proyecto)
- [Metodología TDD aplicada](./README.md#metodologia-tdd-aplicada)

---

<a id="description"></a>

## Description

**Calculator - TDD - Java** is a simple calculator built in **Vanilla Java** following a **real TDD (Test-Driven Development)** approach. The project is organized around three clearly defined parts: `Calculator`, which contains the mathematical logic; `Main`, which runs the program and prints results to the console; and `CalculatorTest`, which validates the expected behavior through unit tests.

Its scope is intentionally clear: to demonstrate a small, clean, and professional implementation of basic arithmetic operations with a maintainable structure aligned with sound design practices.

---

## Technologies Used

- Java 25
- Maven
- Maven Wrapper (`mvnw` and `mvnw.cmd`)
- JUnit 5
- IntelliJ IDEA 2025
- Git
- GitHub

---

<a id="project-structure"></a>

## Project Structure

```text
calculadora-tdd-java/
|-- .mvn/
|   `-- wrapper/
|-- assets/
|   `-- img/
|       |-- CalculatorPantalla.png
|       `-- CalculatorTest.png
|-- src/
|   |-- main/
|   |   |-- java/
|   |   |   `-- org/
|   |   |       `-- example/
|   |   |           |-- Calculator.java
|   |   |           `-- Main.java
|   |   `-- resources/
|   `-- test/
|       `-- java/
|           `-- org/
|               `-- example/
|                   `-- CalculatorTest.java
|-- mvnw
|-- mvnw.cmd
|-- pom.xml
|-- README.md
`-- README.en.md
```

The presence of `.mvn/`, `mvnw`, and `mvnw.cmd` lets you run Maven through the project wrapper instead of depending on a global Maven installation.

---

<a id="project-roles"></a>

## Main / Calculator / CalculatorTest

The class separation is intentional and is part of the educational value of the repository:

| File | Role | Responsibility |
| --- | --- | --- |
| `src/main/java/org/example/Main.java` | Entry point | Runs a simple console example and shows how to consume the calculator. |
| `src/main/java/org/example/Calculator.java` | Business logic | Implements `add`, `subtract`, `multiply`, and `divide`, including divide-by-zero validation. |
| `src/test/java/org/example/CalculatorTest.java` | Executable specification | Defines expected behavior with unit tests and protects the logic against regressions. |

This split makes it obvious which part demonstrates usage (`Main`), which part solves the problem (`Calculator`), and which part guarantees the behavior (`CalculatorTest`).

---

## Implemented Features

The `Calculator` class provides four public methods to work with `double` values:

- `add(double firstNumber, double secondNumber)`: adds two numbers.
- `subtract(double firstNumber, double secondNumber)`: subtracts the second value from the first.
- `multiply(double firstNumber, double secondNumber)`: returns the product of both values.
- `divide(double firstNumber, double secondNumber)`: performs division and validates that the divisor is not zero.

### Implemented Behavior

The calculator performs mathematical operations based on the values received by each method and returns correct results with positive numbers, negative numbers, and zero. The implementation supports both exact and decimal division results, and it safely handles division by zero by throwing an `IllegalArgumentException`, preventing invalid runtime behavior.

---

## Program Execution

The `Main` class creates an instance of `Calculator`, defines two sample values (`10` and `5`), and prints the result of the four main operations to the console.

**Expected output:**

```text
Addition: 15.0
Subtraction: 5.0
Multiplication: 50.0
Division: 2.0
```

### Evidence

![Main execution](./assets/img/CalculatorPantalla.png)

---

## Tests

The project includes unit tests with **JUnit 5** to verify the behavior of each operation and ensure the business logic responds correctly across standard scenarios and edge cases.

### Covered Cases

- addition with positive numbers
- addition with a positive and a negative number
- subtraction with a positive result
- subtraction with a negative result
- multiplication with positive numbers
- multiplication by zero
- division with an exact result
- division with a decimal result
- division by zero with the expected exception

### Evidence

![Passing tests in IntelliJ](./assets/img/CalculatorTest.png)

---

<a id="applied-tdd-methodology"></a>

## Applied TDD Methodology

This project follows the classic **real TDD** workflow, applying a short and controlled cycle for each feature:

1. Write the test first to define the expected behavior.
2. Run the test and confirm that it fails.
3. Implement the minimum solution required to make it pass.
4. Run the tests again to validate the change.
5. Refactor when appropriate while keeping the verified behavior intact.

This approach promotes more reliable code, fast feedback, and evolution guided by observable requirements.

### Red -> Green -> Refactor in this repository

- **Red**: `CalculatorTest` defines what should happen first, for example when division by zero must throw an exception.
- **Green**: `Calculator` adds only the minimum logic required for that test to pass.
- **Refactor**: once the suite is green, the code can be cleaned up safely without breaking verified behavior.

In this project, `Main` does not drive the design of the logic. The tests drive the design, while `Main` remains a usage example rather than a behavior specification.

### What TDD adds here

- it turns each requirement into a repeatable test;
- it reduces regressions when `Calculator` changes;
- it pushes responsibilities to stay small and easy to validate;
- it makes the link between expected behavior and implementation explicit.

---

## Applied SOLID Principles

This project applies the **Single Responsibility Principle (SRP)** in a clear way:

- `Calculator` has one responsibility: performing mathematical operations.
- `Main` has one responsibility: executing the sample flow and printing results.
- `CalculatorTest` has one responsibility: validating that the implemented behavior is correct.

This separation keeps the code easy to understand, easy to extend, and straightforward to test.

---

## Naming and Best Practices

The project uses **clear, clean, and professional naming**, so every class, method, and variable communicates its intent without ambiguity. Names such as `Calculator`, `Main`, `CalculatorTest`, `firstNumber`, `secondNumber`, `add`, `subtract`, `multiply`, and `divide` describe exactly what they represent and make the code easy to read.

The structure also follows sound Java fundamentals: well-defined responsibilities, tests separated from production code, and an organization that supports maintainability and immediate readability.

---

<a id="how-to-run-the-project"></a>

## How to Run the Project

You can run the project in two common ways:

### From IntelliJ IDEA 2025

- Open the project as a Maven project.
- Make sure the configured SDK is **JDK 25**, because `pom.xml` compiles with `source` and `target` set to `25`.
- Run `src/main/java/org/example/Main.java` to see the console output.
- Run `src/test/java/org/example/CalculatorTest.java` to execute the test suite.
- You can also use the IntelliJ Maven tool window to run the `test` phase.

If you want to run the main class from IntelliJ, simply use the `Run 'Main.main()'` option on `Main.java`.

### From the terminal with Maven Wrapper

The wrapper is the recommended option because the repository already includes `mvnw`, `mvnw.cmd`, and `.mvn/wrapper`.

**Windows**

```powershell
.\mvnw.cmd test
.\mvnw.cmd clean package
java -cp target/classes org.example.Main
```

**macOS / Linux**

```bash
./mvnw test
./mvnw clean package
java -cp target/classes org.example.Main
```

If `mvnw` does not have execution permission:

```bash
chmod +x mvnw
```

### From the terminal with globally installed Maven

You can also use Maven directly if it is already installed on your system:

```bash
mvn test
mvn clean package
java -cp target/classes org.example.Main
```

---

## Author

**David Navarro**

---

## Language Navigation

- English home: [README.en.md](#readme-en)
- Spanish README: [README.md](./README.md#readme-es)
- Run section in Spanish: [Cómo ejecutar el proyecto](./README.md#como-ejecutar-el-proyecto)
- TDD section in Spanish: [Metodología TDD aplicada](./README.md#metodologia-tdd-aplicada)
