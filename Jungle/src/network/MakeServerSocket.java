package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MakeServerSocket {
	ServerSocket serverSocket = null;
	Socket socket = null;
	PrintWriter writer = null;
	BufferedReader reader = null;
	String lineStr;
	
	public MakeServerSocket() {
		// TODO Auto-generated constructor stub
		try {
			// 1. serverSocket을 만든다. (client로부터 연락을 받을 전화를 설치)
			serverSocket = new ServerSocket(2000); // 2000은 port번호
			
			while(true) {
				//통신용 socket
				//client로 부터 응답이 와서 serverSocket을 accept하면 다시 정보를 보낼 socket이 반환되서 나옴
				socket = serverSocket.accept();
				System.out.println("Client 요청");
				
				writer = new PrintWriter(socket.getOutputStream(), true);
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				//클라이언트에서 온 정보를 읽어서 다시 writer에 씀.
				while((lineStr = reader.readLine()) != null) {
					writer.write(lineStr);
					System.out.println("input : " + lineStr);
				}
				
				writer.close();
				reader.close();
				socket.close();
			}
		}catch(Exception e) {
			e.getMessage();
		}
	}
	
	public static void main(String[] args) {
		new MakeServerSocket();
	}
}
