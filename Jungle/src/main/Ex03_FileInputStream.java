package main;

import java.io.FileInputStream;
import java.io.InputStream;

public class Ex03_FileInputStream {

	public static void main(String[] args) {
		// IO관련 API는 try문 안에서 실행하도록 강제한다.
		try {
			// 경로에서 '\'문자는 아래와 같이 두개씩 넣어줘야 한다.
			InputStream is = new FileInputStream("C:\\Dev\\eclipse\\workspace\\Jungle\\jain.txt");
			
			while (true) {
				int i = is.read();
				System.out.println("데이터 : " + i);
				// read()메소드는 더이상 읽을게 없을경우 -1을 반환한다.
				if(i == -1) break;
			}
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
