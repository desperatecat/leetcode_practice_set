//https://leetcode.com/problems/basic-calculator-ii/discuss/650964/Java-solution-using-Stack
class Solution {
    public int calculate(String s) {
        int num = 0, result = 0;
        char op = '+';
        Stack<Integer> stack = new Stack<>();
        
        for (char ch: (s + "+").toCharArray()) {
            if (ch == ' ') continue;
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else {
                switch (op) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop() * num);
                        break;
                    case '/':
                        stack.push(stack.pop() / num);
                }
                op = ch;
                num = 0;
            }
        }
        
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        
        return result;
    }
}