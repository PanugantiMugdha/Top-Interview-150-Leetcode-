# Is Subsequence

## Problem Explanation
Given two strings `s` and `t`, return `true` if `s` is a **subsequence** of `t`, otherwise `false`.

- A **subsequence** is formed by deleting some (or none) characters from the original string without changing the relative order of the remaining characters.  

**Example:**  
- `"ace"` is a subsequence of `"abcde"` → `true`  
- `"aec"` is **not** a subsequence of `"abcde"` → `false`

---

## Examples

### Example 1
**Input:**  
`s = "abc"`, `t = "ahbgdc"`  
**Output:**  
`true`  

### Example 2
**Input:**  
`s = "axc"`, `t = "ahbgdc"`  
**Output:**  
`false`  

---

## Solution Approach
1. Use **two pointers** `i` for `s` and `j` for `t`.  
2. Traverse `t`:  
   - If `s[i] == t[j]`, move both pointers.  
   - Otherwise, move `j` only.  
3. If `i` reaches the end of `s`, return `true`.  
4. Otherwise, return `false`.

---

## Time Complexity
- Each character in `t` is visited at most once → **O(n)**, where `n = t.length()`  
- Each character in `s` is visited at most once → **O(m)**, where `m = s.length()`  

✅ **Overall:** `O(n)` (since `n >= m`)  

---

## Space Complexity
- Only pointers and counters used → **O(1)**  
