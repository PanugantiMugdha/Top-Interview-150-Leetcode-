# Plus One

## Problem Description

You are given a large integer represented as an integer array `digits`, where each `digits[i]` is the `iᵗʰ` digit of the integer.  
The digits are ordered from most significant to least significant in left-to-right order.  
The large integer does not contain any leading zeros.

Increment the large integer by one and return the resulting array of digits.

---

## Examples

### Example 1:
**Input:**  
```text
digits = [1,2,3]
```
**Output:** [1,2,4]

 ---

 ## Time Complexity

**O(n)**  
Where `n` is the number of digits in the array.  
Each element is processed once, starting from the last digit.

## Space Complexity

**O(n)**  
In the worst case (when all digits are `9`), a new array of size `n + 1` is created to store the result.  
Otherwise, only a few variables are used, which is constant space.
