package main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q2_StackAndQueue {

	
	// que 로 stack구현
	public static void main(String[] args) {
//		Queue<Integer> que = new LinkedList<Integer>();
//		
//		que.add(1);
//		que.add(2);
//		que.add(3);
//		System.out.println("Queue : " + que.toString());
//		que = solution1(que, "pop");
//		que = solution1(que, "pop");
//		que = solution1(que, "pop");
//		
//		System.out.println("남은 Queue : " + que.toString());
		
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println("Stack : " + stack.toString());
		
		stack = solution2(stack, "poll");
		System.out.println("Stack : " + stack.toString());
		stack = solution2(stack, "poll");
		System.out.println("Stack : " + stack.toString());
	}
	
	// Queue로 Stack의 pop() 구현
    public static Queue<Integer> solution1(Queue<Integer> que, String func) {
       
    	Queue<Integer> tempQue = new LinkedList<Integer>();
    	
    	if("pop".equals(func)) {
    		if(que.size() < 1) {System.out.println("que가 비었습니다.");return que;}
	    	while(que.size() > 1) {
	    		tempQue.add(que.poll());
	    	}
	    	System.out.println(que.poll());
	    	
	    	while(!tempQue.isEmpty()) {
	    		que.add(tempQue.poll());
	    	}
	    	return que;
    	}
    	return que;
    }
    
    // Stack으로 Queue의 poll() 구현
    public static Stack<Integer> solution2(Stack<Integer> stack, String func) {
        
    	Stack<Integer> tempStack1 = new Stack<Integer>();
    	Stack<Integer> tempStack2 = new Stack<Integer>();
    	
    	if("poll".equals(func)) {
    		if(stack.size() < 1) {System.out.println("stack이 비었습니다.");return stack;}
	    	while(stack.size() > 1) {
	    		tempStack1.push(stack.pop());
	    	}
	    	System.out.println(stack.pop());
	    	
	    	while(!tempStack1.isEmpty()) {
	    		tempStack2.push(tempStack1.pop());
	    	}
	    	return tempStack2;
    	}
    	return tempStack2;
    }

}
