package org.techstuff;

import java.util.*;

/**
 * Created by andersonkmi on 8/7/2016.
 */
public class BalancedBrackets {
    public static boolean isBalanced(String expression) {
        Stack<Character> tokens = new Stack<>();
        char[] items = expression.toCharArray();

        for(int index = 0; index < items.length; index++) {
            switch(items[index]) {
                case '{':
                case '[':
                case '(':
                    tokens.push(items[index]);
                    break;

                case ')':
                    if(tokens.isEmpty()) {
                        return false;
                    }
                    if(tokens.pop() != '(') {
                        return false;
                    }
                    break;

                case ']':
                    if(tokens.isEmpty()) {
                        return false;
                    }

                    if(tokens.pop() != '[') {
                        return false;
                    }
                    break;

                case '}':
                    if(tokens.isEmpty()) {
                        return false;
                    }

                    if(tokens.pop() != '{') {
                        return false;
                    }
                    break;
            }
        }
        if(tokens.isEmpty()) {
            return true;
        }

        return false;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
