package main;

import common.EncryptionUtil;

public class Ex09_RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String encryptStr = "";
		for(int i=0; i < 10; i++) {
			// 10자리 난수 생성
			encryptStr = EncryptionUtil.getRandom(10, false);
			System.out.println(encryptStr);
		}
		
	}

}
