# Longest Common Prefix

## Problem Explanation
Write a function to find the **longest common prefix string** among an array of strings.  

- If there is no common prefix, return an empty string `""`.  

---

## Examples

### Example 1
**Input:**  
`strs = ["flower","flow","flight"]`  
**Output:**  
`"fl"`  

---

### Example 2
**Input:**  
`strs = ["dog","racecar","car"]`  
**Output:**  
`""`  
**Explanation:**  
There is no common prefix among the input strings.  

---
**Time Complexity:** `O(n * m)`  
- `n = number of strings`  
- `m = length of the shortest string`  

**Space Complexity:** `O(1)`  
