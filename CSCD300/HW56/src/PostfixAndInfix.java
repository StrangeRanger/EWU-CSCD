/**
 * Author:      Hunter T.
 * Description: Handles postfix and infix expressions.
 *
 * Comment Key:
 *      A.1. - If the parentheses of the infix expression do not match...
 *      A.2. - If the infix expression is empty...
 *      A.3. - If the syntax of the infix expression is incorrect...
 *      B.1. - If 'character' exists as a key in the 'variables' hashtable...
 *      B.2. - If 'character' is '('...
 *      B.3. - If 'character' is ')'...
 */

import java.util.Hashtable;
import java.util.Stack;

/** Class for dealing with postfix and infix expressions. */
public class PostfixAndInfix {
    private final Hashtable<Character, Integer> stackValues       = new Hashtable<>();
    private final Hashtable<Character, Integer> currentItemValues = new Hashtable<>();
    private final Hashtable<Character, Double> variables          = new Hashtable<>();
    private final String                       infixExpression;
    private String                             postfixExpression = "";
    private Double                             postfixValue;

    /**
     * Constructor.
     *
     * @param infixExpression The infix expression passed by the calling class object.
     */
    public PostfixAndInfix(String infixExpression) {
        this.infixExpression = infixExpression.replaceAll("[ ]", "");
        this.variables.put('A', 8.0);
        this.variables.put('B', -1.0);
        this.variables.put('C', 7.0);
        this.variables.put('D', -4.0);
        this.variables.put('E', 11.0);
        this.variables.put('F', 9.0);
        this.variables.put('G', 3.2);
        this.variables.put('H', 6.325);
        this.variables.put('I', 8.0);
        this.variables.put('J', -3.333894);
        this.stackValues.put('(', 0);
        this.stackValues.put('^', 5);
        this.stackValues.put('*', 4);
        this.stackValues.put('/', 4);
        this.stackValues.put('%', 4);
        this.stackValues.put('+', 2);
        this.stackValues.put('-', 2);
        this.currentItemValues.put('(', 100);
        this.currentItemValues.put(')', 0);
        this.currentItemValues.put('^', 6);
        this.currentItemValues.put('*', 3);
        this.currentItemValues.put('/', 3);
        this.currentItemValues.put('%', 3);
        this.currentItemValues.put('+', 1);
        this.currentItemValues.put('-', 1);
    }

    /* [ Main Class Methods ]******************************************************* */

    /**
     * Return infixExpression.
     *
     * @return The value of infixExpression.
     */
    public String getInfixExpression() {
        return this.infixExpression;
    }

    /**
     * Return postfixExpression.
     *
     * @return The value of postfixExpression.
     */
    public String getPostfixExpression() {
        return this.postfixExpression;
    }

    /**
     * Return postfixValue.
     *
     * @return The value of postfixValue.
     */
    public Double getPostfixValue() {
        return this.postfixValue;
    }

    /**
     * Convert the infix expression into a postfix expression.
     *
     * @return True if the infix expression could be converted into a postfix
     *         expression, else false.
     */
    public Boolean infixConversion() {
        Stack<Character> stack = new Stack<>();
        char             character;

        if (! parenMatch(infixExpression)) {  // A.1.
            System.out.println(infixExpression + " --> Parens Not Match Error!");
            return false;
        } else if (infixExpression.replaceAll("[()]", "").isEmpty()) {  // A.2.
            System.out.println(infixExpression + " --> Empty infix expression Error!");
            return false;
        } else if (! validInfixSyntax(infixExpression)) {  // A.3.
            System.out.println(infixExpression + " --> Infix Syntax Error!");
            return false;
        }

        for (int i = 0; i < infixExpression.length(); i++) {
            character = infixExpression.charAt(i);

            if (variables.containsKey(character)) {  // B.1.
                postfixExpression += character;
            } else if (character == '(') {  // B.2.
                stack.push('(');
            } else if (character == ')') {  // B.3.
                while (stack.peek() != '(') {
                    postfixExpression += stack.pop();
                }
                stack.pop();
            } else {
                while (! stack.isEmpty() && operatorPrecedence(stack.peek(), character)) {
                    postfixExpression += stack.pop();
                }
                stack.push(character);
            }
        }

        while (! stack.isEmpty()) {
            postfixExpression += stack.pop();
        }

        return true;
    }

    /** Evaluate the postfix expressions. */
    public void postfixEvaluation() throws Exception {
        if (postfixExpression.equals("")) {
            throw new Exception(
                    "Infix expression hasn't been converted to a postfix expression!");
        }

        Stack<Double> stack = new Stack<>();
        char          character;
        double        right, left, tmp;

        for (int i = 0; i < postfixExpression.length(); i++) {
            character = postfixExpression.charAt(i);

            // If 'character' exists in dictionary 'variable'...
            if (variables.containsKey(character)) {
                stack.push(variables.get(character));
            } else {
                right = stack.pop();
                left  = stack.pop();

                switch (character) {
                    case '+': tmp = left + right; break;
                    case '-': tmp = left - right; break;
                    case '*': tmp = left * right; break;
                    case '/': tmp = left / right; break;
                    case '^': tmp = Math.pow(left, right); break;
                    case '%': tmp = left % right; break;
                    default:
                        throw new Exception("Invalid operator was provided: " + character);
                }

                stack.push(tmp);
            }
        }

        if (stack.size() == 1) {
            postfixValue = stack.pop();
        } else {
            throw new Exception("The postfix expression has an error in it!");
        }
    }

    /* [ Helper Methods ]*********************************************************** */

    /**
     * Check if the provided infixExpression has matching parentheses.
     *
     * @param string The string to perform parentheses matching on.
     *
     * @return True if parentheses properly match, else false.
     */
    private boolean parenMatch(String string) {
        Stack<Character> stack = new Stack<>();
        string                 = string.replaceAll("[^()]", "");
        char character;

        for (int i = 0; i < string.length(); i++) {
            character = string.charAt(i);

            if (character == '(') {
                stack.push(character);
            } else if (character == ')') {
                if (stack.isEmpty()) { return false; }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    /**
     * Ensure that the infix expression is valid.
     *
     * @param string The infix expression.
     *
     * @return True if the infix expression is valid, else false.
     */
    private boolean validInfixSyntax(String string) {
        char prevChar, curChar;
        string = string.replaceAll("[()]", "");

        for (int i = 1; i < string.length(); i++) {
            prevChar = string.charAt(i - 1);
            curChar  = string.charAt(i);

            if (variables.containsKey(prevChar) && variables.containsKey(curChar)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Determines the precedence of two operators.
     *
     * @param stackChar       The operator passed from the top of the stack from the
     *                        calling method.
     * @param currentItemChar The current item/operator passed from the calling method.
     *
     * @return True if the precedence of the stackChar is greater than the one
     *         currentItemChar, else false.
     */
    private boolean operatorPrecedence(char stackChar, char currentItemChar) {
        int stackVal;
        int currentItemVal;

        stackVal = stackValues.get(stackChar);
        if (currentItemValues.containsKey(currentItemChar)) {
            currentItemVal = currentItemValues.get(currentItemChar);
        } else {
            return false;
        }

        return stackVal > currentItemVal;
    }
}
