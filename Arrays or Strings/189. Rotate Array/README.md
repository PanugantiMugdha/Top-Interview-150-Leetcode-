# Rotate Array

## Problem Explanation
You are given an integer array `nums` and an integer `k`.  
The task is to **rotate the array to the right by `k` steps**, where `k` is non-negative.  

- Rotating once moves the last element to the front.  
- Rotating `k` times repeats this process `k` times.  
- The result must be stored in-place without using extra space for another array (beyond O(1)).

---

## Time Complexity
- **O(n)**  
  - Each element is moved exactly once using the reversal method.  
  - The three-step reversal approach requires scanning the array three times.

## Space Complexity
- **O(1)**  
  - Rotation is done in-place using array reversal.  
  - No additional arrays or data structures are used.
