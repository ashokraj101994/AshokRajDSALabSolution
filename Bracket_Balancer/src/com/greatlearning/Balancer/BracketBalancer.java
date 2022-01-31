package com.greatlearning.Balancer;
import java.util.Scanner;
import java.util.Stack;
public class BracketBalancer {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		String str="{([])";
	    Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
		 if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='(') {
			 stack.push(str.charAt(i));
		 }
		 else if(!stack.empty()&&((str.charAt(i)=='}' && (stack.peek()=='{') || (str.charAt(i)==')' && stack.peek()=='(') || (str.charAt(i)==']') && stack.peek()=='['))) {
			 stack.pop();
		 }
		 else {
			 stack.push(str.charAt(i));
		 }
		}
		if(stack.empty()) {
			System.out.println("The entered String has Balanced Brackets");
		}else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	   		

	}

}
