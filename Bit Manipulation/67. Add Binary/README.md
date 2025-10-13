# Add Binary

## Problem Description

Given two binary strings `a` and `b`, return their sum as a binary string.

Both input strings represent non-negative binary numbers without leading zeros (except for the zero itself).

---

## Examples

### Example 1:
**Input:**  
```text
a = "11", b = "1"
```
**Output:** 100

---

## Time Complexity

**O(max(n, m))**  
Where `n` and `m` are the lengths of the binary strings `a` and `b`.  
Each character in both strings is processed once during the addition, and the final reversal of the result also takes linear time.  
Hence, the overall time complexity is linear with respect to the longer input string.

## Space Complexity

**O(max(n, m))**  
A `StringBuilder` is used to store the result, which can be at most one character longer than the longer of the two input strings (in case of a carry).  
Apart from this, only a few integer variables are used for iteration and carry tracking.
