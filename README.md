# Java ArithmeticException: Division by Zero

This repository demonstrates a common Java error: an `ArithmeticException` caused by division by zero. The `Bug.java` file contains code that throws this exception. The `BugSolution.java` file provides a solution showing best practices for handling this type of exception.

## Running the Code

1. Clone this repository.
2. Compile and run `Bug.java`. You should see an `ArithmeticException`.
3. Compile and run `BugSolution.java`. This version handles the potential exception gracefully.

## Learning Points

* Always validate inputs to avoid division by zero.
* Use try-catch blocks to handle potential exceptions and prevent program crashes.
* Provide informative error messages to aid debugging.