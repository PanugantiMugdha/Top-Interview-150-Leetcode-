# Contains Nearby Duplicate

### Problem Statement
Given an integer array `nums` and an integer `k`, return `true` if there are **two distinct indices** `i` and `j` in the array such that:

### Example 1
**Input:**  
`nums = [1, 2, 3, 1], k = 3`  
**Output:**  
`true`

### Example 2
**Input:**  
`nums = [1, 0, 1, 1], k = 1`  
**Output:**  
`true`

### Example 3
**Input:**  
`nums = [1, 2, 3, 1, 2, 3], k = 2`  
**Output:**  
`false`

---

## Approach
We use a **HashMap** to store each element’s most recent index.  
When we encounter the same element again, we check the index difference:
- If it’s ≤ `k`, return `true`.
- Otherwise, continue scanning.

---

## Complexity
| Type | Complexity | Explanation |
|------|-------------|-------------|
| **Time** | O(n) | Each element is inserted/checked once in the map |
| **Space** | O(n) | At most all elements are stored in the map |
