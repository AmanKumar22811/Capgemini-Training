# Infix to Postfix Program in Java


## Problem Statement
Write a Java program to convert an Infix expression to Postfix expression using Stack.

---

## Java Program

```java
import java.util.Stack;
import java.util.Scanner;

public class InfixToPostfix {

    // Method to check operator precedence
    public static int precedence(char ch) {
        if (ch == '+' || ch == '-')
            return 1;
        else if (ch == '*' || ch == '/')
            return 2;
        else if (ch == '^')
            return 3;
        else
            return -1;
    }

    // Method to convert infix to postfix
    public static String convert(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            // If operand, add to postfix
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            }

            // If '(', push to stack
            else if (ch == '(') {
                stack.push(ch);
            }

            // If ')', pop until '('
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // remove '('
            }

            // If operator
            else {
                while (!stack.isEmpty() &&
                       precedence(ch) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Infix Expression: ");
        String input = sc.nextLine();

        String result = convert(input);
        System.out.println("Postfix Expression: " + result);

        sc.close();
    }
}
```

## OUTPUT :

![Infix To Postfix](image.png)
