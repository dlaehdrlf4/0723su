package prec1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectMainprec3 {

	public static void main(String[] args) {
		//객체 단위로 데이터를 기록할 수 있는 클래스의 변수 선언
		ObjectInputStream ois = null;
		try {
			//파일에 객체 단위로 기록할 수 있는 클래스의 
			//객체 만들기
			ois = new ObjectInputStream(new FileInputStream("./oos.txt"));
			//read로 읽어 올 때 Object 타입으로 리턴하기 때문에
			//강제 형 변환을 해서 원래의 자료형으로 되돌려서 사용해야 합니다.
			Memberprec3 member = (Memberprec3)ois.readObject();
			System.out.println(member.getId());
			
			
		/*	Memberprec3 member = new Memberprec3();
			member.setId("dfsdf");
			member.setName("나나나");
			member.setPw("040403040404");
			*/
			// 객체 를 파일에 기록
			//oos.writeObject(member);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
