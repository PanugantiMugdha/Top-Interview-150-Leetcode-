# Remove Element

## Problem Explanation
You are given an integer array `nums` and an integer `val`.  
The task is to remove all occurrences of `val` **in-place** from the array.  
- After removal, the first `k` elements of `nums` should contain all the values that are **not equal** to `val`.  
- The remaining elements beyond `k` do not matter.  
- The function should return `k`, the count of elements not equal to `val`.

The order of the remaining elements may be changed, and the solution must modify the array in-place.

---

## Time Complexity
- **O(n)**  
  - Each element in `nums` is visited at most once.
  - Comparison and placement operations are constant time.

## Space Complexity
- **O(1)**  
  - The operation is performed in-place without using extra data structures.
