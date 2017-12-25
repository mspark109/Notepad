package main;

import java.util.Random;

import common.EncryptionUtil;

public class Ex09_RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rn1 = new Random();
		for(int i=0; i<10; i++) System.out.println(rn1.nextInt(100));
		
		System.out.println("==========");
		Random rn2 = new java.security.SecureRandom();
		for(int j=0; j<10; j++) System.out.println(rn2.nextInt(100));
		
		
		/*String encryptStr = "";
		for(int i=0; i < 10; i++) {
			// 10자리 난수 생성
			encryptStr = EncryptionUtil.getRandom(10, false);
			System.out.println(encryptStr);
		}*/
		
	}

}
