package main;

public class MainController {
	public static void main(String[] args){
		// static으로 클래스를 선언하면, 해당 객체는 자바가 컴파일 되는 순간 정의 됨. 그리고 이후 static이 아닌 객체가 정의 됨.
		// static객체에서 비 static 객체의 호출 불가. 아직 정의됮 않은 객체이기 때문.
		
		System.out.println("답: " + solution(123456789));

	}
	
	public static int solution(int Number) {
		int result = 0;
		
		// int의 String 형변환
		String a = Number+"";				// 묵시적 형변환	
		String b = Integer.toString(Number);// 걍 형변환
		String c = String.valueOf(Number);	// valueOf는 내부에서 Integer.toString을 호출
		
//		char[] arr  = a.toCharArray();
//		
//		for(int i=0; i < arr.length; i++){
//			result += (int)arr[i]-48;
//		}
//		
		for(int i=0; i < a.length(); i++){
			result += Integer.parseInt(String.valueOf(a.charAt(i)));
		}
		
		/*
		 * Integer.parseInt : String to Integer
		 * String.valueOf	: AnyType to String	
		 */
		
		return result;
	}
}
