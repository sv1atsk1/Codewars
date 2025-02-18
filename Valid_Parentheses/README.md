# Valid Parentheses

## Task Condition
Given a string `s` containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.

### Example 1:
Input: s = "()"  
Output: true  
Explanation: The parentheses are properly nested and matched.

### Example 2:
Input: s = "()[]{}"  
Output: true  
Explanation: All types of brackets are properly nested and matched.

### Example 3:
Input: s = "(]"  
Output: false  
Explanation: The parentheses are not properly matched.

### Example 4:
Input: s = "([])"  
Output: true  
Explanation: The brackets are properly nested and matched.

## Constraints:
- 1 <= s.length <= 104
-  s consists of parentheses only '()[]{}'.
