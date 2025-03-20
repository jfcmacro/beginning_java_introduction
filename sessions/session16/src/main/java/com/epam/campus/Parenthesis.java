package com.epam.campus;

import java.util.Stack;

public class Parenthesis {

    public static boolean isAParenthesisLanguage(String str) {
	Stack<Character> stack = new Stack<>();
	for (int i = 0; i < str.length(); i++) {
	    switch(str.charAt(i)) {
	    case '(':
		stack.push('(');
		break;
	    case ')':
		if (!stack.empty() && stack.peek() == '(') {
		    stack.pop();
		}
		else if (stack.empty()) {
		    return false;
		}
		break;
	    }	    
	}

	return stack.empty();
    }

    public static void main(String...args) {
	String cadena1 = "()(())";
	String cadena2 = "";
	String cadena3 = ")((())";

	System.out.printf("%s es valida: %s%n", cadena1, isAParenthesisLanguage(cadena1));
	System.out.printf("%s es valida: %s%n", cadena2, isAParenthesisLanguage(cadena2));
	System.out.printf("%s es valida: %s%n", cadena3, isAParenthesisLanguage(cadena3));
    }
}
