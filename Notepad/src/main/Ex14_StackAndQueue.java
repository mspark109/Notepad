package main;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex14_StackAndQueue {

	public static void main(String[] args) {
		// Stack은 push, Queue는 add
		// Stack은 empty, Queue는 isEmpty
		
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(1);
		st.push(2);
		st.push(3);
//		st.push(4);

		System.out.println(st.size());
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		System.out.println("=========================");

		
		
		Queue<Integer> que = new LinkedList<Integer>();
		
		que.add(1);
		que.add(2);
		que.add(3);
		System.out.println(que.size());
		System.out.println(que.peek());
		System.out.println(que.poll());
		System.out.println(que.peek());
		
		while(!que.isEmpty()) {
			System.out.println(que.poll());
		}
		
	}

}
