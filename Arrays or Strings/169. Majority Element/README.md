# Majority Element

## Problem Explanation
You are given an integer array `nums` of size `n`.  
The task is to find the **majority element**, which is defined as the element that appears more than `⌊n / 2⌋` times.  

It is guaranteed that a majority element always exists in the array.

---

## Time Complexity
- **O(n)**  
  - Using the Boyer–Moore Voting Algorithm, the array is scanned once.  
  - Each operation (comparison/increment/decrement) takes constant time.

## Space Complexity
- **O(1)**  
  - The Boyer–Moore algorithm keeps only two variables:  
    - `candidate` (possible majority element)  
    - `count` (vote balance)  
  - No additional data structures are required.
