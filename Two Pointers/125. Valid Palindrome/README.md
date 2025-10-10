# Valid Palindrome

## Problem Statement
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward.  
Alphanumeric characters include letters and numbers.

Given a string `s`, return `true` if it is a palindrome, or `false` otherwise.

---

## Examples

**Example 1**

Input:  
`s = "A man, a plan, a canal: Panama"`  
Output:  
`true`  

Explanation:  
After removing non-alphanumeric characters and converting to lowercase,  
`s` becomes `"amanaplanacanalpanama"`, which is a palindrome.

---

**Example 2**

Input:  
`s = "race a car"`  
Output:  
`false`  

Explanation:  
After cleaning, `s` becomes `"raceacar"`, which is **not** a palindrome.

---

**Example 3**

Input:  
`s = " "`  
Output:  
`true`  

Explanation:  
`s` becomes an empty string `""` after removing non-alphanumeric characters.  
Since an empty string reads the same forward and backward, it is a palindrome.

---

### Time Complexity
O(n)  
Where `n` is the length of the string `s`.  
Each character is processed once for cleaning and once during the palindrome check.

### Space Complexity
O(n)  
Because a new cleaned string is created using `replaceAll()`.
