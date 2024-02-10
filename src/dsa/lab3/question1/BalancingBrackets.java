package dsa.lab3.question1;

import java.util.Stack;

public class BalancingBrackets {

	public boolean StringChecker(String input) { 
		Stack<Character> stack = new Stack<>();
		for(char i:input.toCharArray()) 
		{
			if(i=='{' || i=='[' || i=='(')
			{
				stack.push(i);
				continue;
			}

			if(stack.isEmpty())
				return false;

			char value;
			switch(i)
			{
			case '}':	value=stack.pop();	
			if(value=='(' || value=='[')
				return false;

			break;
			case ']':	value=stack.pop();	
			if(value=='(' || value=='{')
				return false;
			break;
			case ')':	value=stack.pop();	
			if(value=='[' || value=='{')
				return false;
			break;
			}
		}
		return(stack.isEmpty());

	}



}
