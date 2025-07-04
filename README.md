# String-Calculator

This project implements the String Calculator using TDD (Test-Driven Development) in Java. Each feature was added step-by-step, following the TDD cycle and committed incrementally.

🔟 Summary of Completed Steps:

1️⃣ Step 1: Return 0 for an empty string
- Input: "" → Output: 0

2️⃣ Step 2: Return the number itself for a single number
- Input: "1" → Output: 1

3️⃣ Step 3: Return the sum of two comma-separated numbers
- Input: "1,2" → Output: 3

4️⃣ Step 4: Support any number of comma-separated numbers
- Input: "1,2,3,4" → Output: 10

5️⃣ Step 5: Allow new lines as delimiters (along with commas)
- Input: "1\n2,3" → Output: 6

6️⃣ Step 6: Support a custom single-character delimiter
- Input: "//;\n1;2" → Output: 3

7️⃣ Step 7: Throw an exception for negative numbers, listing all of them
- Input: "1,-2,-3" → Exception: "negative numbers not allowed: -2,-3"

8️⃣ Step 8: Ignore numbers greater than 1000
- Input: "2,1001" → Output: 2
- Input: "1000,1" → Output: 1001

9️⃣ Step 9: Support custom delimiters of any length
- Input: "//[***]\n1***2***3" → Output: 6

🔟 Step 10: Support multiple custom delimiters of any length
- Input: "//[***][%%]\n1***2%%3" → Output: 6
- Input: "//[!!][@@]\n1!!2@@3" → Output: 6

-->CUSTOM TEST CASES
          | Case | Input             | Expected | Description                           |
          | ---- | ----------------- | -------- | ------------------------------------- |
          | 1    | `//;\n;;;`        | `0`      | Only delimiters, no numbers           |
          | 2    | `1001,2000,5000`  | `0`      | All numbers > 1000, should be ignored |
          | 3    | `//[*][%]\n1*2%3` | `6`      | Handles special character delimiters  |

🧾 Project Structure:
- `StringCalculator.java` – Core logic
- `StringCalculatorTest.java` – Test cases for each step

This implementation follows clean code, small commits, and a focus on correctness, readability, and testability — all aligned with Incubyte's Software Craftsperson principles.
