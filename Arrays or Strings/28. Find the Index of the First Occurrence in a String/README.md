# Find the Index of the First Occurrence in a String

## Problem Statement
Given two strings `haystack` and `needle`, return the index of the **first occurrence** of `needle` in `haystack`.  
If `needle` is not part of `haystack`, return `-1`.

---

## Examples

**Example 1**

Input:  
`haystack = "sadbutsad"`  
`needle = "sad"`  

Output:  
`0`  

Explanation:  
`sad` occurs at index 0 and again at index 6. The first occurrence is at index 0.

---

**Example 2**

Input:  
`haystack = "leetcode"`  
`needle = "leeto"`  

Output:  
`-1`  

Explanation:  
`leeto` is not found in `leetcode`.

---

## Time Complexity
O((n - m + 1) * m)  
Where `n` is the length of `haystack` and `m` is the length of `needle`.  
In the worst case, we compare up to `m` characters for each starting index in `haystack`.

## Space Complexity
O(1)  
Only a few variables are used, so the algorithm requires constant extra space.
