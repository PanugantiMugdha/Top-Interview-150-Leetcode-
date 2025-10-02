# Best Time to Buy and Sell Stock

## Problem Explanation
You are given an array `prices` where `prices[i]` represents the stock price on the **i-th day**.  
The goal is to **maximize profit** by:
- Choosing one day to **buy** a stock.
- Choosing another future day to **sell** the stock.

You must return the **maximum profit** possible.  
If no profit can be made, return **0**.

---

## Example 1
Input: `prices = [7,1,5,3,6,4]`  
Output: `5`  
Explanation:  
- Buy on day 2 at price = 1.  
- Sell on day 5 at price = 6.  
- Profit = 6 - 1 = 5.  

---

## Example 2
Input: `prices = [7,6,4,3,1]`  
Output: `0`  
Explanation: No future day offers a higher price than the buy day, so no profit is possible.  

---

## Time Complexity
- **O(n)**  
  - Traverse the array once, tracking the minimum price so far and maximum profit.

## Space Complexity
- **O(1)**  
  - Only a few variables are stored (`minPrice`, `maxProfit`), no extra data structures.
