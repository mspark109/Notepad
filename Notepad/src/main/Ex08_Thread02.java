package main;

import thread.ThreadTest2;

public class Ex08_Thread02 {
	public static void main(String[] args) {
		ThreadTest2 threadTest = new ThreadTest2();
		threadTest.setName("B");
		threadTest.start();// start()메소드가 run()메소드를 호출해준다.
		
		System.out.println(Thread.currentThread().getName());
		
	}
}
