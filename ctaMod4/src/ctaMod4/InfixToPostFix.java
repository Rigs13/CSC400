package ctaMod4;
import java.util.Stack;

public class InfixToPostFix {

	/**
	 * Determines the precedence of an operator within the operator stack
	 * during the conversion of an infix expression.
	 * @param operator	char for precedence
	 * @return int		determined precedence, -1 represents non-operator fail-safe
	 */
	public static int precedence(char operator) {
		
		switch (operator) {
		
		// addition/subtraction are the lowest precedence
		case '+':
		case '-':
			return 1;
		// multiply and divide precedence
		case '*':
		case '/':
			return 2;
		// exponents have the highest precedence of the operators
		case '^':
			return 3;
		
		}
		
		// if none of these return -1
		return -1;
		
	} // end of precedence method
	
	/**
	 * Converts an infix expression to an equivalent postfix expression.
	 * @param infix		Infix expression to be converted
	 * @return postfix	Postfix expression from conversion
	 */
	public String toPostfix(String infix) {
		
		// attributes and vars
		Stack<Character> operatorStack = new Stack<>();
		StringBuilder postfix = new StringBuilder();
		int index = 0;
		
		while (index < infix.length()) {
			
			// marker for current character in infix string
			char c = infix.charAt(index);
			
			// switch case structuring
			switch (c) {
			// ignore blank spaces, periods, and inequalities
			case ' ':
			case '.':
			case '<':
			case '>':
				break;
			
			// push ( to operator stack
			case '(':
				operatorStack.push(c);
				break;
				
			case ')':
				char topOperator = operatorStack.pop();
				while (topOperator != '(') {
					postfix.append(topOperator);
					topOperator = operatorStack.pop();
				}
				break;
				
			// cases for operators
			case '+':
			case '-':
			case '*':
			case '/':
			case '^':
				while (!operatorStack.isEmpty() && precedence(c) <= precedence(operatorStack.peek())) {
					postfix.append(operatorStack.pop());
				}
				operatorStack.push(c);
				break;
				
			// use of default case to handle operands (letters/digits)
			default:
				StringBuilder operand = new StringBuilder();
				while (index < infix.length() && Character.isLetterOrDigit(c)) {
					operand.append(c);
					index++;
					if (index < infix.length()) {
						c = infix.charAt(index);
					}
				}
				// account for last char that is not operand
				index--; 
				postfix.append(operand.toString());
				break;
				
			} // end of switch
			
			// increase index to continue iteration across the infix string
			index++;
			
		}
		
		while (!operatorStack.isEmpty()) {
			postfix.append(operatorStack.pop());
		}
		
		return postfix.toString();
	} // end of toPostFix method
	
} // end of class
