package algorithms.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class ValidParentheses {
    public static boolean isValid(String s) {
        if (s.length() %2 ==1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();

        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                stack.add(c);
            } else {
                if (!stack.isEmpty() && c == map.get(stack.peek())) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(]"));
    }
}