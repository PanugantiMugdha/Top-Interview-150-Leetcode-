# Remove Duplicates from Sorted Array

## Problem Explanation
You are given a sorted integer array `nums` in non-decreasing order.  
The task is to remove duplicates **in-place** such that each unique element appears only once.  
- After removal, the first `k` elements of `nums` should contain all the unique elements in the same relative order as the original array.  
- The remaining elements beyond `k` do not matter.  
- The function should return `k`, the count of unique elements.

---

## Time Complexity
- **O(n)**  
  - Each element is visited once while comparing with its previous value.
  - All operations are constant time per element.

## Space Complexity
- **O(1)**  
  - The array is modified in-place without using additional data structures.
