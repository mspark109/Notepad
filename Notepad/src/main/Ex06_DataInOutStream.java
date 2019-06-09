package main;

import java.io.*;

public class Ex06_DataInOutStream {

	public static void main(String[] args) {

		InputStream is= null;
		DataInputStream dis= null;
		
		OutputStream os= null;
		DataOutputStream dos= null;

		try {
			is = new FileInputStream("C:\\Dev\\eclipse\\workspace\\Jungle\\jain3.txt");
			dis = new DataInputStream(is);
			//while문을 이용해서 byte씩 읽어오지 않고 DataInputStream으로 한번에 얻어올 수 있다.
			String str = dis.readUTF();
			
			os = new FileOutputStream("C:\\Dev\\eclipse\\workspace\\Jungle\\jaout3.txt");
			dos = new DataOutputStream(os);
			dos.writeUTF(str);
		}catch(Exception e) {
			System.out.println("1: "+e.getMessage());
		}finally {
			if(dos!= null) {
				try {
					dos.close();
				}catch (Exception e) {
					System.out.println("2: "+e.getMessage());
				}
			}
			
			if(os != null) {
				try {
					os.close();
				}catch(Exception e) {
					System.out.println("3: "+e.getMessage());
				}
			}
			
			if(dis!= null) {
				try {
					dis.close();
				}catch (Exception e) {
					System.out.println("4: "+e.getMessage());
				}
			}
			
			if(is != null) {
				try {
					is.close();
				}catch(Exception e) {
					System.out.println("5: "+e.getMessage());
				}
			}
		}
	}

}
