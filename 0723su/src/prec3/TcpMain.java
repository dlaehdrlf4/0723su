package prec3;

import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TcpMain {

	public static void main(String[] args) {
		
		try {
			// 서버에 접속
			InetAddress addr = InetAddress.getByName("192.168.0.237");
			Socket socket = new Socket(addr, 9999); //(ip,port); 
			//전송할 메시지 입력받기
			Scanner sc = new Scanner(System.in);
			System.out.println("전송할 메시지:");
			String msg = sc.nextLine();
			sc.close();
			
			//전송할 스트림 생성
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			//데이터 전송
			pw.println(msg);
			pw.flush();
			
			//전송했으면 닫으시오.
			socket.close();
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
