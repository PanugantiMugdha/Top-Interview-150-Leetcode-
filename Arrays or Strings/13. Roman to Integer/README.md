# Roman to Integer

## Problem Explanation
Roman numerals are represented by seven symbols:

| Symbol | Value |
|--------|-------|
| I      | 1     |
| V      | 5     |
| X      | 10    |
| L      | 50    |
| C      | 100   |
| D      | 500   |
| M      | 1000  |

### Rules
- Normally, numerals are written **largest to smallest** from left to right.  
  Example: `XII = 10 + 1 + 1 = 12`.  
- However, subtraction is used in **six cases**:
  - `IV = 4` (I before V)  
  - `IX = 9` (I before X)  
  - `XL = 40` (X before L)  
  - `XC = 90` (X before C)  
  - `CD = 400` (C before D)  
  - `CM = 900` (C before M)  

The task is to **convert a Roman numeral string `s` into an integer**.

---

## Example 1
Input: `s = "III"`  
Output: `3`  
Explanation: `III = 1 + 1 + 1 = 3`.  

---

## Example 2
Input: `s = "LVIII"`  
Output: `58`  
Explanation:  
- `L = 50`  
- `V = 5`  
- `III = 3`  
- Total = `58`.  

---

## Example 3
Input: `s = "MCMXCIV"`  
Output: `1994`  
Explanation:  
- `M = 1000`  
- `CM = 900`  
- `XC = 90`  
- `IV = 4`  
- Total = `1994`.  

---

## Constraints
- `1 <= s.length <= 15`  
- `s` contains only the characters: `I, V, X, L, C, D, M`  
- It is guaranteed that `s` is a valid Roman numeral in the range `[1, 3999]`.  

---

## Time Complexity
- **O(n)** → we scan the string once.  

## Space Complexity
- **O(n)** → only a mapping table for Roman symbols is used.
