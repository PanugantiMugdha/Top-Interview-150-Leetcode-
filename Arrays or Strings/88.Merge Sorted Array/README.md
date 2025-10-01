# Merge Sorted Array

## Problem Explanation
You are given two sorted integer arrays, `nums1` and `nums2`, and two integers `m` and `n` representing the number of valid elements in each array.  
- `nums1` has a size of `m + n`, where the first `m` elements are valid and the remaining `n` elements are placeholders (0s) to accommodate the merge.  
- `nums2` has a size of `n` containing valid elements.  

The task is to merge the two arrays into a single sorted array in **non-decreasing order**, with the result stored directly inside `nums1`.

---

## Time Complexity
- **O(m + n)**  
  - Each element from both arrays is compared and placed exactly once.
  - The algorithm makes at most `m + n` comparisons/placements.

## Space Complexity
- **O(1)**  
  - The merge is performed in-place within `nums1`, requiring no additional data structures.
