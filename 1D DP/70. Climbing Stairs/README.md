# Climbing Stairs

## Problem Statement
You are climbing a staircase. It takes `n` steps to reach the top.  

Each time you can climb either **1** or **2** steps.  
Return the number of **distinct ways** you can climb to the top.  

---

## Examples

**Example 1**  
Input: `n = 2`  
Output: `2`  
Explanation:  
1. 1 step + 1 step  
2. 2 steps  

**Example 2**  
Input: `n = 3`  
Output: `3`  
Explanation:  
1. 1 step + 1 step + 1 step  
2. 1 step + 2 steps  
3. 2 steps + 1 step  

---

## Complexity
- **Time Complexity:** O(n) — single loop from 3 to n.  
- **Space Complexity:** O(1) — only constant extra variables used.
