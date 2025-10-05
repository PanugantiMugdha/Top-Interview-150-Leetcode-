# Valid Parentheses

## Problem Statement
Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['`, and `']'`, determine if the input string is **valid**.

An input string is valid if:
- Open brackets must be closed by the same type of brackets.  
- Open brackets must be closed in the correct order.  
- Every closing bracket has a corresponding opening bracket of the same type.  

---

## Examples

**Example 1**  
Input: `s = "()"`  
Output: `true`  

**Example 2**  
Input: `s = "()[]{}"`  
Output: `true`  

**Example 3**  
Input: `s = "(]"`  
Output: `false`  

---

## Complexity

- **Time Complexity:** O(n²) — due to contains() and replace(). 
- **Space Complexity:** O(n) — for using replace() which creates a new string.
