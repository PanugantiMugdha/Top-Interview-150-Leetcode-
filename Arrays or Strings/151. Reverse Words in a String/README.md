# Reverse Words in a String

## Problem Explanation
You are given a string `s` that may contain:
- Leading spaces
- Trailing spaces
- Multiple spaces between words  

A **word** is defined as a sequence of non-space characters.  
Your task is to:
1. Reverse the order of words
2. Ensure only a single space separates words
3. Remove any leading or trailing spaces  

---

## Examples

### Example 1
**Input:**  
`s = "the sky is blue"`  
**Output:**  
`"blue is sky the"`

---

### Example 2
**Input:**  
`s = "  hello world  "`  
**Output:**  
`"world hello"`  
**Explanation:**  
No leading/trailing spaces remain.

---

### Example 3
**Input:**  
`s = "a good   example"`  
**Output:**  
`"example good a"`  
**Explanation:**  
Multiple spaces between words reduced to one.

---

## Solution Approach
1. Use `split(" +")` → splits the string into words, ignoring multiple spaces.  
2. Traverse the words array from end to start.  
3. Append words into a `StringBuilder`, ensuring single spaces.  
4. Return the reversed string.

---

## Time Complexity
- **Splitting:** `O(n)` (where `n` = length of string)  
- **Reversing & building new string:** `O(n)`  
✅ **Overall:** **O(n)**  

---

## Space Complexity
- The `split` function creates an array of words → `O(n)` in worst case.  
- `StringBuilder` also stores the result → `O(n)`  
✅ **Overall:** **O(n)**  
