# Jump Game II - Minimum Jumps

## Problem Explanation
You are given a **0-indexed array** `nums` of length `n`.  
- You start at index `0`.  
- Each element `nums[i]` represents the **maximum forward jump length** from that index.  
  - From index `i`, you can jump to any index `i + j` where `0 <= j <= nums[i]` and `i + j < n`.  

Your goal is to **reach the last index (`n - 1`) in the minimum number of jumps**.  

It is guaranteed that you can always reach the last index.

---

## Example 1
Input: `nums = [2,3,1,1,4]`  
Output: `2`  
Explanation:  
- Jump 1 step from index 0 → index 1  
- Jump 3 steps from index 1 → index 4 (last index)  
- Total jumps = 2  

---

## Example 2
Input: `nums = [2,3,0,1,4]`  
Output: `2`  
Explanation:  
- Jump 1 step from index 0 → index 1  
- Jump 3 steps from index 1 → index 4 (last index)  
- Total jumps = 2  

---

## Time Complexity
- **O(n)**  
  - Traverse the array once while tracking the **farthest reachable index** and counting jumps.  

## Space Complexity
- **O(1)**  
  - Only a few variables are used (`jumps`, `currentEnd`, `farthest`), no extra arrays.
