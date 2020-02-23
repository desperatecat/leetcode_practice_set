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
            else if (stack.isEmpty() || stack.pop() != c)   //suppose s is valid, the stack should contains a lot of ']' or '}' or ')', when all the left brackets are gone througth, c will jump to the right brackets, then this if will see whether c is right bracket or not, if not, return false
                return false;
	    }
	    return stack.isEmpty(); //suppose ']' is the first element, then the stack will never be empty, this will be false; suppose s is valid, the stack will keep popping until all right brackets are gone
    }
}