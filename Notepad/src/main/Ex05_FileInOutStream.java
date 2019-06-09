package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex05_FileInOutStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("C:\\Dev\\eclipse\\workspace\\Jungle\\jain2.txt");
			out = new FileOutputStream("C:\\Dev\\eclipse\\workspace\\Jungle\\jaout2.txt");
			byte[] bs = new byte[5];
			while(true) {
				int count = in.read(bs);
				if(count == -1) break;
				
				// byte[] bs의 크기 5byte씩 잘라서 읽어와서 write
				out.write(bs, 0, count);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(in != null) {
					in.close();
				}
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			try {
				if(out != null) {
					out.close();
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
