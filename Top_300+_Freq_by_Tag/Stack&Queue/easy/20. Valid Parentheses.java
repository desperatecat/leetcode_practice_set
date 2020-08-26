//https://leetcode.com/problems/valid-parentheses/discuss/9178/Short-java-solution

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
	    for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            
            //suppose ']' is the first element of s, then the stack will be empty, stack.isEmpty() is true, which will make s as invalid; 
            //suppose s is valid, the stack should contains a lot of ']' or '}' or ')', when all the left brackets are gone througth, c will jump to the right brackets, then this if will check whether c is relative right bracket or not, if not, return false
            else if (stack.isEmpty() || stack.pop() != c)   //stack.pop() will actually pop up the top element, no matter the if statement is true or false; stack.peek() will return the top element of a stack, but not pop out any element
                return false;
	    }
	    return stack.isEmpty(); //The stack must be empty if the parentheses is valid. If not, such as "((", the stack will still hold two ')' chars. The stack is not empty.
    }
}