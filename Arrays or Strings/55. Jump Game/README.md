# Jump Game

## Problem Explanation
You are given an integer array `nums`.  
- You start at the **first index** of the array.  
- Each element `nums[i]` represents the **maximum jump length** from that position.  

The task is to determine whether you can **reach the last index** of the array.  

- Return `true` if it is possible, otherwise return `false`.

---

## Example 1
Input: `nums = [2,3,1,1,4]`  
Output: `true`  
Explanation:  
- Jump 1 step from index 0 to 1, then jump 3 steps to reach the last index.  

---

## Example 2
Input: `nums = [3,2,1,0,4]`  
Output: `false`  
Explanation:  
- No matter what jumps you take, you will get stuck at index 3 (nums[3] = 0) and cannot reach the end.  

---

## Time Complexity
- **O(n)**  
  - Traverse the array once while tracking the farthest reachable index.

## Space Complexity
- **O(1)**  
  - Only a few variables are used (`last_position` or `farthest`), no extra arrays.
