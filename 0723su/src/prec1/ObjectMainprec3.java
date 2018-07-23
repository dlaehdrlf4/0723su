package prec1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectMainprec3 {

	public static void main(String[] args) {
		//��ü ������ �����͸� ����� �� �ִ� Ŭ������ ���� ����
		ObjectInputStream ois = null;
		try {
			//���Ͽ� ��ü ������ ����� �� �ִ� Ŭ������ 
			//��ü �����
			ois = new ObjectInputStream(new FileInputStream("./oos.txt"));
			//read�� �о� �� �� Object Ÿ������ �����ϱ� ������
			//���� �� ��ȯ�� �ؼ� ������ �ڷ������� �ǵ����� ����ؾ� �մϴ�.
			Memberprec3 member = (Memberprec3)ois.readObject();
			System.out.println(member.getId());
			
			
		/*	Memberprec3 member = new Memberprec3();
			member.setId("dfsdf");
			member.setName("������");
			member.setPw("040403040404");
			*/
			// ��ü �� ���Ͽ� ���
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
