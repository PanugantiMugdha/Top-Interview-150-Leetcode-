# Length of Last Word

## Problem Explanation
You are given a string `s` consisting of words and spaces.  
A **word** is defined as a maximal substring of non-space characters.  

The task is to **return the length of the last word** in the string.  

---

## Example 1
Input: `s = "Hello World"`  
Output: `5`  
Explanation:  
- The last word is `"World"`  
- Length = 5  

---

## Example 2
Input: `s = "   fly me   to   the moon  "`  
Output: `4`  
Explanation:  
- The last word is `"moon"`  
- Length = 4  

---

## Example 3
Input: `s = "luffy is still joyboy"`  
Output: `6`  
Explanation:  
- The last word is `"joyboy"`  
- Length = 6  

---

## Time Complexity
- **O(n)** → we may scan the string once from the end to find the last word.  

## Space Complexity
- **O(1)** → no extra space needed apart from counters.
