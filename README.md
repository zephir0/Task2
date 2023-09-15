
# TASK2 - NumberAnalyzer
NumberAnalyzer is a simple Java program designed to find all pairs of integers from a given list that sum up to a specific target value (13 in this case). It reads integers from the standard input, analyzes them, and prints the pairs that match the criteria.

## Features
- Accepts a list of integers separated by spaces.
- Validates the input and handles cases where non-integer values are provided.
- Displays all pairs that sum to the target value in the ascending order based on the first value in the pair.
## Structure Note
All functionalities of the program are contained within a single class, NumberAnalyzer, to maintain the simplicity and clarity of the task.
## Usage
Run the program:
```  
java NumberAnalyzer.java
```  
When prompted, input a list of integers separated by spaces. If you enter non-integer values, the program will notify you and skip those values.

Example:
```
Enter a list of integers separated by spaces:  
1 2 10 7 5 3 6 6 13 0 orange 
orange is not a valid integer.  
0 13
3 10
6 7
6 7
```