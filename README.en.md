<a id="readme-en"></a>

# 🧮 Calculator - TDD - Java

![Java 25](https://img.shields.io/badge/Java-25-ED8B00?logo=openjdk&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Wrapper%20included-C71A36?logo=apachemaven&logoColor=white)
![JUnit 5.10.2](https://img.shields.io/badge/JUnit-5.10.2-25A162?logo=junit5&logoColor=white)
![IntelliJ IDEA 2025](https://img.shields.io/badge/IntelliJ_IDEA-2025-000000?logo=intellijidea&logoColor=white)
![TDD](https://img.shields.io/badge/TDD-Red%20--%20Green%20--%20Refactor-1F6FEB)
![Docs ES EN](https://img.shields.io/badge/Docs-ES%20%7C%20EN-0A66C2)
![GitHub](https://img.shields.io/badge/GitHub-Repository-181717?logo=github&logoColor=white)

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

## 📘 Description

![Content](https://img.shields.io/badge/Content-project_overview-0A66C2) ![Approach](https://img.shields.io/badge/Approach-real_TDD-1F6FEB)

**Calculator - TDD - Java** is a simple calculator built in **Vanilla Java** following a **real TDD (Test-Driven Development)** approach. The project is organized around three clearly defined parts: `Calculator`, which contains the mathematical logic; `Main`, which runs the program and prints results to the console; and `CalculatorTest`, which validates the expected behavior through unit tests.

Its scope is intentionally clear: to demonstrate a small, clean, and professional implementation of basic arithmetic operations with a maintainable structure aligned with sound design practices.

---

## ⚙️ Technologies Used

![Stack](https://img.shields.io/badge/Stack-Java_25-ED8B00) ![Build](https://img.shields.io/badge/Build-Maven_Wrapper-C71A36)

- Java 25
- Maven
- Maven Wrapper (`mvnw` and `mvnw.cmd`)
- JUnit 5
- IntelliJ IDEA 2025
- Git
- GitHub

---

<a id="project-structure"></a>

## 🗂️ Project Structure

![Architecture](https://img.shields.io/badge/Architecture-src_main_test-6A5ACD) ![Wrapper](https://img.shields.io/badge/Wrapper-mvnw_%7C_mvnw.cmd-8A2BE2)

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

## 🧩 Main / Calculator / CalculatorTest

![Separation](https://img.shields.io/badge/Separation-responsibilities-0F766E) ![SRP](https://img.shields.io/badge/SOLID-SRP-2E8B57)

The class separation is intentional and is part of the educational value of the repository:

| File | Role | Responsibility |
| --- | --- | --- |
| `src/main/java/org/example/Main.java` | Entry point | Runs a simple console example and shows how to consume the calculator. |
| `src/main/java/org/example/Calculator.java` | Business logic | Implements `add`, `subtract`, `multiply`, and `divide`, including divide-by-zero validation. |
| `src/test/java/org/example/CalculatorTest.java` | Executable specification | Defines expected behavior with unit tests and protects the logic against regressions. |

This split makes it obvious which part demonstrates usage (`Main`), which part solves the problem (`Calculator`), and which part guarantees the behavior (`CalculatorTest`).

---

## 🚀 Implemented Features

![Operations](https://img.shields.io/badge/Operations-add_subtract_multiply_divide-FF8C00) ![Type](https://img.shields.io/badge/Data-double-8B5CF6)

The `Calculator` class provides four public methods to work with `double` values:

- `add(double firstNumber, double secondNumber)`: adds two numbers.
- `subtract(double firstNumber, double secondNumber)`: subtracts the second value from the first.
- `multiply(double firstNumber, double secondNumber)`: returns the product of both values.
- `divide(double firstNumber, double secondNumber)`: performs division and validates that the divisor is not zero.

### 🧠 Implemented Behavior

![Validation](https://img.shields.io/badge/Validation-divide_by_zero-D7263D) ![Scenarios](https://img.shields.io/badge/Scenarios-positive_negative_zero-2563EB)

The calculator performs mathematical operations based on the values received by each method and returns correct results with positive numbers, negative numbers, and zero. The implementation supports both exact and decimal division results, and it safely handles division by zero by throwing an `IllegalArgumentException`, preventing invalid runtime behavior.

---

## 💻 Program Execution

![EntryPoint](https://img.shields.io/badge/Entry_Point-Main.java-111827) ![Output](https://img.shields.io/badge/Output-console-1D4ED8)

The `Main` class creates an instance of `Calculator`, defines two sample values (`10` and `5`), and prints the result of the four main operations to the console.

**Expected output:**

```text
Addition: 15.0
Subtraction: 5.0
Multiplication: 50.0
Division: 2.0
```

### 🖼️ Evidence

![Preview](https://img.shields.io/badge/Preview-main_output-64748B)

![Main execution](./assets/img/CalculatorPantalla.png)

---

## 🧪 Tests

![Testing](https://img.shields.io/badge/Testing-JUnit_5-25A162) ![Quality](https://img.shields.io/badge/Quality-regression_safety-0EA5E9)

The project includes unit tests with **JUnit 5** to verify the behavior of each operation and ensure the business logic responds correctly across standard scenarios and edge cases.

### ✅ Covered Cases

![Coverage](https://img.shields.io/badge/Coverage-basic_operations-F59E0B) ![Exceptions](https://img.shields.io/badge/Exceptions-divide_by_zero-DC2626)

- addition with positive numbers
- addition with a positive and a negative number
- subtraction with a positive result
- subtraction with a negative result
- multiplication with positive numbers
- multiplication by zero
- division with an exact result
- division with a decimal result
- division by zero with the expected exception

### 🖼️ Evidence

![Preview](https://img.shields.io/badge/Preview-tests_passing-64748B)

![Passing tests in IntelliJ](./assets/img/CalculatorTest.png)

---

<a id="applied-tdd-methodology"></a>

## 🔁 Applied TDD Methodology

![Method](https://img.shields.io/badge/Method-Red_Green_Refactor-1F6FEB) ![Practice](https://img.shields.io/badge/Practice-test_first-0891B2)

This project follows the classic **real TDD** workflow, applying a short and controlled cycle for each feature:

1. Write the test first to define the expected behavior.
2. Run the test and confirm that it fails.
3. Implement the minimum solution required to make it pass.
4. Run the tests again to validate the change.
5. Refactor when appropriate while keeping the verified behavior intact.

This approach promotes more reliable code, fast feedback, and evolution guided by observable requirements.

### 🔴🟢♻️ Red -> Green -> Refactor in this repository

![Red](https://img.shields.io/badge/Red-test_failing-DC2626) ![Green](https://img.shields.io/badge/Green-minimum_code-16A34A) ![Refactor](https://img.shields.io/badge/Refactor-cleanup-7C3AED)

- **Red**: `CalculatorTest` defines what should happen first, for example when division by zero must throw an exception.
- **Green**: `Calculator` adds only the minimum logic required for that test to pass.
- **Refactor**: once the suite is green, `CalculatorTest` can simplify its shared setup by moving `Calculator` creation into `@BeforeEach`, removing duplication without changing the verified behavior.

In this project, `Main` does not drive the design of the logic. The tests drive the design, while `Main` remains a usage example rather than a behavior specification.

### 📈 What TDD adds here

![Feedback](https://img.shields.io/badge/Feedback-fast-0284C7) ![Safety](https://img.shields.io/badge/Safety-fewer_regressions-059669)

- it turns each requirement into a repeatable test;
- it reduces regressions when `Calculator` changes;
- it pushes responsibilities to stay small and easy to validate;
- it makes the link between expected behavior and implementation explicit.

---

## 🧱 Applied SOLID Principles

![SOLID](https://img.shields.io/badge/SOLID-applied-2E8B57) ![Principle](https://img.shields.io/badge/Principle-SRP-15803D)

This project applies the **Single Responsibility Principle (SRP)** in a clear way:

- `Calculator` has one responsibility: performing mathematical operations.
- `Main` has one responsibility: executing the sample flow and printing results.
- `CalculatorTest` has one responsibility: validating that the implemented behavior is correct.

This separation keeps the code easy to understand, easy to extend, and straightforward to test.

---

## 🏷️ Naming and Best Practices

![Naming](https://img.shields.io/badge/Naming-clear_and_professional-7C3AED) ![Readability](https://img.shields.io/badge/Readability-high-0F766E)

The project uses **clear, clean, and professional naming**, so every class, method, and variable communicates its intent without ambiguity. Names such as `Calculator`, `Main`, `CalculatorTest`, `firstNumber`, `secondNumber`, `add`, `subtract`, `multiply`, and `divide` describe exactly what they represent and make the code easy to read.

The structure also follows sound Java fundamentals: well-defined responsibilities, tests separated from production code, and an organization that supports maintainability and immediate readability.

---

<a id="how-to-run-the-project"></a>

## ▶️ How to Run the Project

![Run](https://img.shields.io/badge/Run-IntelliJ_and_terminal-2563EB) ![Compatibility](https://img.shields.io/badge/CLI-Windows_macOS_Linux-475569)

You can run the project in two common ways:

### 💡 From IntelliJ IDEA 2025

![IDE](https://img.shields.io/badge/IDE-IntelliJ_IDEA_2025-000000) ![SDK](https://img.shields.io/badge/SDK-JDK_25-F97316)

- Open the project as a Maven project.
- Make sure the configured SDK is **JDK 25**, because `pom.xml` compiles with `source` and `target` set to `25`.
- Run `src/main/java/org/example/Main.java` to see the console output.
- Run `src/test/java/org/example/CalculatorTest.java` to execute the test suite.
- You can also use the IntelliJ Maven tool window to run the `test` phase.

If you want to run the main class from IntelliJ, simply use the `Run 'Main.main()'` option on `Main.java`.

### 🖥️ From the terminal with Maven Wrapper

![Wrapper](https://img.shields.io/badge/Maven-Wrapper-C71A36) ![Commands](https://img.shields.io/badge/Commands-mvnw_and_mvnw.cmd-1D4ED8)

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

### ⌨️ From the terminal with globally installed Maven

![CLI](https://img.shields.io/badge/CLI-mvn-334155) ![Option](https://img.shields.io/badge/Option-global_Maven-9333EA)

You can also use Maven directly if it is already installed on your system:

```bash
mvn test
mvn clean package
java -cp target/classes org.example.Main
```

---

## 👨‍💻 Author

![Author](https://img.shields.io/badge/Author-David_Navarro-111827) ![Status](https://img.shields.io/badge/Project-documented-0A66C2)

**David Navarro**

---

## 🌐 Language Navigation

![Docs](https://img.shields.io/badge/Docs-bilingual-0A66C2) ![Languages](https://img.shields.io/badge/Languages-ES_EN-1D4ED8)

- English home: [README.en.md](#readme-en)
- Spanish README: [README.md](./README.md#readme-es)
- Run section in Spanish: [Cómo ejecutar el proyecto](./README.md#como-ejecutar-el-proyecto)
- TDD section in Spanish: [Metodología TDD aplicada](./README.md#metodologia-tdd-aplicada)
