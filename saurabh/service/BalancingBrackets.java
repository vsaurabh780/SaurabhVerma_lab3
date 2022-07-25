package com.saurabh.service;
import java.util.Stack;
public class BalancingBrackets {
public Boolean checkingBracketBalanced(String bracketExpression) {
		
		java.util.Stack<Character>stack = new Stack <Character>();
		
		for (int i = 0 ; i< bracketExpression.length();i++)
		{
		char character = bracketExpression.charAt(i);
		
		if (character =='(' || character == '[' || character=='{' )
		{
			stack.push(character);
			continue;  
		}
		
		}
	
		if (stack.isEmpty())
		return false;
		
		
		
		char c;
		int character = 0;
		switch (character) {
			
		 
		case '}':
			
			c = stack.pop();
			if (c=='{'|| c=='[')
				return false;
			break;
			
		case')':
			c= stack.pop();
			if (c == '{' || c =='[')
				return  false ;
			
			break;
			
			
		case']':
			c=stack.pop();
			if(c=='(' || c=='{')
				return false;
			break;

		}	
		return (stack .isEmpty());

	}
	 public static void main (String []args)
	 {
		 String expr = "([{}])";
		 if (areBracketsBalanced(expr))
			 System.out.println("The entered string has balanced Brackets");
		 else
			 System.out.println("The entered String do not contain Balanced Brackets");
	 }
	private static boolean areBracketsBalanced(String expr) {
		return false;
	}
}