package prec3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPclient {

	public static void main(String[] args) {
		
		try {
			DatagramSocket ds = new DatagramSocket();
			Scanner sc = new Scanner(System.in);
			System.out.println("������ �޽���");
			String a = sc.nextLine();
			
			DatagramPacket dp = new DatagramPacket(a.getBytes(),a.getBytes().length,InetAddress.getByName("192.168.0.254"),4000);
			
			ds.send(dp); // ��Ŷ�� ����� �����ض�
			
			
			sc.close();
			ds.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
