package main;

import thread.ThreadTest;

public class Ex07_Thread01 {
	public static void main(String[] args) {
		ThreadTest threadTest = new ThreadTest();
		Thread thread = new Thread(threadTest, "A");
		thread.start();// start()메소드가 run()메소드를 호출해준다.
		
		System.out.println(Thread.currentThread().getName());
		
	}
}
