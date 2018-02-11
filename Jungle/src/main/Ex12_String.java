package main;

import common.EncryptionUtil;

public class Ex12_String {

	public static void main(String[] args) {
		
		// String은 메모리측면에서 비효율적으로 속도가 느리다.
		// 대안으로 나온것이 StringBuffer와 StringBuilder이며, 
		// 둘은 안에 메소드나 기능면에서 거의 같으나, StringBuilder가 좀더 나중에 나온것으로 좀 더 빠르다.
		
		String str = "0000001";
		
		for(int i=0; i< 7; i++) {
			System.out.println(str.charAt(i));
		}
		
		/*Random rn1 = new Random();
		for(int i=0; i<10; i++) System.out.println(rn1.nextInt(100));
		
		System.out.println("==========");
		Random rn2 = new java.security.SecureRandom();
		for(int j=0; j<10; j++) System.out.println(rn2.nextInt(100));*/
	}

}
