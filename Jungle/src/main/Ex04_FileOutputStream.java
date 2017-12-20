package main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex04_FileOutputStream {

	public static void main(String[] args) {
		
		OutputStream os = null;
		try {
			os = new FileOutputStream("C:\\Dev\\eclipse\\workspace\\Jungle\\jaout.txt");
			String str = "오늘 날씨는 아주 좋습니다.";
			//String 메소드 중 getBytes()는 문자열을 byte[]로 반환한다.
			byte[] bs = str.getBytes();
			os.write(bs);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(os != null) os.close();
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
