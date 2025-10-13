# Linked List Cycle

## Problem Description

Given the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the `next` pointer.  

Internally, `pos` is used to denote the index of the node that the tail's `next` pointer is connected to.  
Note that `pos` is not passed as a parameter.

Return `true` if there is a cycle in the linked list. Otherwise, return `false`.

---

## Examples

### Example 1:
**Input:**  
```text
head = [3,2,0,-4], pos = 1
```
**Output:**true
 --- 
  ## Time Complexity

**O(n)**  
Where `n` is the number of nodes in the linked list.  
In the worst case, both pointers (`slow` and `fast`) traverse all nodes before either meeting (when a cycle exists) or reaching the end (when no cycle exists).

## Space Complexity

**O(1)**  
Only two pointers (`slow` and `fast`) are used for traversal, so the algorithm requires constant extra space regardless of the list size.
