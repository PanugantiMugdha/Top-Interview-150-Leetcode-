# Best Time to Buy and Sell Stock II

## Problem Explanation
You are given an integer array `prices` where `prices[i]` represents the stock price on the **i-th day**.  

- You may buy and/or sell the stock on any day.  
- However, you can hold **at most one share** at a time.  
- You may buy and sell on the same day, but never hold more than one share.  

Your goal is to **maximize the total profit**.  

---

## Example 1
Input: `prices = [7,1,5,3,6,4]`  
Output: `7`  
Explanation:  
- Buy on day 2 at price = 1, sell on day 3 at price = 5 → Profit = 4  
- Buy on day 4 at price = 3, sell on day 5 at price = 6 → Profit = 3  
- Total profit = 4 + 3 = 7  

---

## Example 2
Input: `prices = [1,2,3,4,5]`  
Output: `4`  
Explanation:  
- Buy on day 1 at price = 1, sell on day 5 at price = 5 → Profit = 4  

---

## Example 3
Input: `prices = [7,6,4,3,1]`  
Output: `0`  
Explanation: No profitable transactions are possible, so result is 0.  

---

## Time Complexity
- **O(n)**  
  - Traverse the array once, adding up all positive price differences.  

## Space Complexity
- **O(1)**  
  - Only a few variables are used to track total profit.  
