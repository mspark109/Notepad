package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MakeClientSocket {
	//통신을 위한 socket객체 하나만 생성
	Socket socket = null;
	PrintWriter writer = null;
	BufferedReader reader = null;
	
	public MakeClientSocket() {
		// TODO Auto-generated constructor stub
		try {
			socket = new Socket("localhost", 2000);
			//socket 객체로부터 InputStream, OutputStream얻어옴.
			writer = new PrintWriter(socket.getOutputStream(), true);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String str = null;
			//사용자가 입력한 값을 sReader에 담고
			BufferedReader sReader = new BufferedReader(new InputStreamReader(System.in));
			
			while((str = sReader.readLine()) != null) {
				writer.println(str);
				System.out.println("output : " + str);
			}
			
			writer.close();
			reader.close();
			sReader.close();
			socket.close();
		}catch(Exception e) {
			e.getMessage();
		}
	}
	
	public static void main(String[] args) {
		new MakeClientSocket();
	}
}
