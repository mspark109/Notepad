package main;

public class MainController {
	public static void main(String[] args){
		// static으로 클래스를 선언하면, 해당 객체는 자바가 컴파일 되는 순간 정의 됨. 그리고 이후 static이 아닌 객체가 정의 됨.
		// static객체에서 비 static 객체의 호출 불가. 아직 정의됮 않은 객체이기 때문.
		args = new String[3];
		
		args[0] = "안녕";
		args[1] = "반가워자바";
		
		
		System.out.println(args[0]);
        System.out.println(args[1]);

	}
}
