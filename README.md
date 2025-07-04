# String-Calculator

This project implements the String Calculator using **TDD (Test-Driven Development)** in Java.  
Each feature was added step-by-step, following the **Red → Green → Refactor** cycle, with incremental commits.

---

### 🔟 Summary of Completed Steps:

1️⃣ **Step 1:** Return 0 for an empty string  
&nbsp;&nbsp;&nbsp;&nbsp;Input: `""` → Output: `0`

2️⃣ **Step 2:** Return the number itself for a single number  
&nbsp;&nbsp;&nbsp;&nbsp;Input: `"1"` → Output: `1`

3️⃣ **Step 3:** Return the sum of two comma-separated numbers  
&nbsp;&nbsp;&nbsp;&nbsp;Input: `"1,2"` → Output: `3`

4️⃣ **Step 4:** Support any number of comma-separated numbers  
&nbsp;&nbsp;&nbsp;&nbsp;Input: `"1,2,3,4"` → Output: `10`

5️⃣ **Step 5:** Allow newlines as delimiters (along with commas)  
&nbsp;&nbsp;&nbsp;&nbsp;Input: `"1\n2,3"` → Output: `6`

6️⃣ **Step 6:** Support a custom single-character delimiter  
&nbsp;&nbsp;&nbsp;&nbsp;Input: `"//;\n1;2"` → Output: `3`

7️⃣ **Step 7:** Throw an exception for negative numbers, listing all of them  
&nbsp;&nbsp;&nbsp;&nbsp;Input: `"1,-2,-3"` → Exception: `"negative numbers not allowed: -2,-3"`

8️⃣ **Step 8:** Ignore numbers greater than 1000  
&nbsp;&nbsp;&nbsp;&nbsp;Input: `"2,1001"` → Output: `2`  
&nbsp;&nbsp;&nbsp;&nbsp;Input: `"1000,1"` → Output: `1001`

9️⃣ **Step 9:** Support custom delimiters of any length  
&nbsp;&nbsp;&nbsp;&nbsp;Input: `"//[***]\n1***2***3"` → Output: `6`

🔟 **Step 10:** Support multiple custom delimiters of any length  
&nbsp;&nbsp;&nbsp;&nbsp;Input: `"//[***][%%]\n1***2%%3"` → Output: `6`  
&nbsp;&nbsp;&nbsp;&nbsp;Input: `"//[!!][@@]\n1!!2@@3"` → Output: `6`

---

### 🧪 Custom Test Cases

These edge cases were added to cover scenarios not explicitly mentioned in the prompt:

| Case | Input               | Expected | Description                              |
|------|---------------------|----------|------------------------------------------|
| 1    | `//;\n;;;`          | `0`      | Only delimiters, no numbers              |
| 2    | `1001,2000,5000`    | `0`      | All numbers > 1000, should be ignored    |
| 3    | `//[*][%]\n1*2%3`   | `6`      | Handles special character delimiters     |

---

### 🧾 Project Structure

- `StringCalculator.java` – Core logic
- `StringCalculatorTest.java` – Test cases for each step and custom scenarios

---

This implementation follows clean code, small commits, and a focus on correctness, readability, and testability — all aligned with **Incubyte’s Software Craftsperson** principles.
