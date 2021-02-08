package main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ValidBrackets {

    public static boolean isValid(String brackets) {

        Stack stack = new Stack(brackets.length());

        int count =0;
        for(count =0; count<brackets.length(); count++){
            char ch = brackets.charAt(count);
            boolean valid = false;
            switch (ch){
                case '(' : case '{' : case '[' :
                    stack.push(ch);
                    break;
                case ')':
                    if(stack.isEmpty() || (ch = stack.pop())!='('){
                        valid=true;
                    }
                    break;
                case '}':
                    if(stack.isEmpty() || (ch = stack.pop())!='{'){
                        valid=true;
                    }
                    break;
                case ']':
                    if(stack.isEmpty() || (ch = stack.pop())!='['){
                        valid=true;
                    }
                    break;
            }
            if(valid){
                break;
            }
        }
        if(stack.isEmpty() && count==brackets.length()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(ValidBrackets.isValid("[[{}]()]"));
    }

    static class Stack{
        char[] stack;
        int top;

        public Stack(int a){
            stack = new char[a];
            this.top = -1;
        }

        public void push(char ch){
            stack[++top] = ch;
        }

        public char pop(){
            return stack[top--];
        }

        public boolean isEmpty(){
            if(top ==-1){
                return true;
            }
            return false;
        }
    }
}
//public class Q4_Barce {
//	
//	public static String solution(String s) {
//		Stack<String> stack = new Stack<>();
//		Queue<String> queue = new LinkedList<>();
//		
//		if(s.length()%2 == 1) {
//			return "false";
//		}
//		
//		for(char c : s.toCharArray()) {
//			if( c == '(' || c == '{' || c == '[') {
//				stack.push(String.valueOf(c));
//			} else {
//				queue.add(String.valueOf(c));
//			}
//		}
//		
//		while(!stack.isEmpty()) {
//			switch(stack.pop()) {
//			case "(" :
//						if(")".equals(queue.poll())) 
//							continue;
//						
//				break;
//			case "{" :
//						if("}".equals(queue.poll())) 
//							continue;
//				break;	
//			case "[" :
//						if("]".equals(queue.poll())) 
//							continue;
//				break;
//			}
//			return "false";
//		}
//		
//		return "true";
//	}
//		
//	public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in);
//		String s = scan.next();
//		
//		System.out.println(solution(s));
//		
//	}
	



