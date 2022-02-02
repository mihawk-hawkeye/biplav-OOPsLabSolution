package lab3DSA;

import java.util.Scanner;
import java.util.Stack;

public class BalancingBracket {

	public static void main(String[] args) {

		String str = null;
		Scanner sc =new Scanner(System.in); 
		System.out.println("Enter String:");
		str =sc.next();
		System.out.println("string provided: "+ str);
		
		//System.out.println(checkIfBracketBal(str));
System.out.println( checkIfBracketBal(str)?"The entered String has Balanced Brackets":"The entered Strings do not contain Balanced Brackets" );
	}

	private static boolean checkIfBracketBal(String str) {
		
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch == '(' || ch=='{' || ch== '[' ) {
				stack.push(ch);							// inserting opening bracket characters
				continue;
			}
			if(stack.isEmpty())
				return false;
			
		//	System.out.println("before pop element :"+ch);
			char pop = stack.pop();
		//	System.out.println("after pop element :"+pop);
			switch(ch) {
			case ')' :
				if(pop != '(')
					return false;
				break;
			case '}' :
				if(pop != '{')
					return false;
				break;
			case ']' :
				if(pop != '[')
					return false;
				break;
			default: return false;
			}
		}
		return stack.isEmpty();    	
		
	}

}
