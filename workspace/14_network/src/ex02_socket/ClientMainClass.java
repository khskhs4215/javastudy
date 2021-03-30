package ex02_socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientMainClass {

	public static void main(String[] args) {
		
		// Socket : 클라이언트
		
		Socket client = null;
		
		try {
			
			// 클라이언트 생성
			client = new Socket();
			
			System.out.println("클라이언트가 서버에 접속을 시도합니다.");
			
			// 클라이언트가 서버에 접속을 시도
			client.connect(new InetSocketAddress("localhost", 4966));
			// socket.connect(new InetSocketAddress(InetAddress.getByName("localhost"), 4966));
			
			// 접속 성공
			System.out.println("클라이언트가 서버에 접속되었습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if ( !client.isClosed() ) { client.close(); }
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}