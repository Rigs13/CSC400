package ctaMod4;

/**
 * @author Semisi Rigby
 * This class is used to test the Infix to Postfix 
 * Conversion method included in the InfixToPostfixExample
 * class.
 */

public class PostFixConversionTest {

	public static void main(String[] args) {
		
		// create an instance of the InfixToPostFix class
		InfixToPostFix converter = new InfixToPostFix();
		
		// infix expressions 
		String infixExpression1 = "a - b + c";
		String infixExpression2 = "a/b*(c+(d-e))";
		String infixExpression3 = "(a+b)/(c-d)";
				
		// postfix expressions
		String postfixExpression1 = converter.toPostfix(infixExpression1);
		String postfixExpression2 = converter.toPostfix(infixExpression2);
		String postfixExpression3 = converter.toPostfix(infixExpression3);
				
		// Display results
		System.out.println("Testing the Infix to Postfix Expression Method.\n");
				
		System.out.println("Infix Expression 1: " + infixExpression1);
		System.out.println("Postfix Expression 1: " + postfixExpression1 + "\n");
				
		System.out.println("Infix Expression 2: " + infixExpression2);
		System.out.println("Postfix Expression 2: " + postfixExpression2 + "\n");
				
		System.out.println("Infix Expression 3: " + infixExpression3);
		System.out.println("Postfix Expression 3: " + postfixExpression3 + "\n");
	
	}
	
}
