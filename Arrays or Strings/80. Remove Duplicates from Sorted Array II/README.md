# Remove Duplicates from Sorted Array II

## Problem Explanation
You are given a sorted integer array `nums` in non-decreasing order.  
The task is to remove duplicates **in-place** such that each unique element can appear **at most twice**.  

- After removal, the first `k` elements of `nums` should contain the allowed values in the same relative order.  
- The remaining elements beyond `k` do not matter.  
- The function should return `k`, the number of elements kept.  

This must be done **without allocating extra space**, i.e., in-place with **O(1) extra memory**.

---

## Time Complexity
- **O(n)**  
  - The array is traversed once.  
  - Each element is checked and conditionally placed into the valid range.  

## Space Complexity
- **O(1)**  
  - No additional data structures are used.  
  - Modifications happen directly within the input array.
