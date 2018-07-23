package prec2;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main1 {

	public static void main(String[] args) {
		try {
			//주소 정보 1개 가져오기
			InetAddress addr = InetAddress.getByName("www.naver.com"); // ip주소를 확인할 수 있다.
			System.out.println(addr);
			System.out.println("================");
			InetAddress [] addr1 = InetAddress.getAllByName("www.naver.com");

			for(InetAddress imsi : addr1) {
				System.out.println(imsi);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
