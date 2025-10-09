# Ransom Note

## Problem Statement
Given two strings `ransomNote` and `magazine`, return `true` if `ransomNote` can be constructed by using the letters from `magazine`, and `false` otherwise.

Each letter in `magazine` can only be used **once** in `ransomNote`.

---

## Examples

**Example 1**  
Input: `ransomNote = "a"`, `magazine = "b"`  
Output: `false`

**Example 2**  
Input: `ransomNote = "aa"`, `magazine = "ab"`  
Output: `false`

**Example 3**  
Input: `ransomNote = "aa"`, `magazine = "aab"`  
Output: `true`

---

## Complexity
- **Time Complexity:** O(n + m)  
  - where `n` = length of `ransomNote`, `m` = length of `magazine`  
  - One pass through `magazine` and one pass through `ransomNote`.
- **Space Complexity:** O(1)  
  - Uses a fixed-size array of length 26 for lowercase English letters.
