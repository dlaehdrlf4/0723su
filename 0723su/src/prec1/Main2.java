package prec1;

import java.io.PrintWriter;

public class Main2 {

	public static void main(String[] args) {
		//���� , ��Ʈ��ũ, �����ͺ��̽� ���� Ŭ��������
		//���� ó���� �����մϴ�.
		PrintWriter pw = null;
		try {
			//���� ���丮�� ������ ����
			pw = new PrintWriter("C:\\Users\\503-25\\Desktop\\oh.txt");
			//���Ͽ� ���ڿ��� ���
			pw.println("�λ��ƾƾƾƾƾ�");
			//�������� ������ ������ ���� ���
			pw.flush();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(pw != null) {
				pw.close();
			}
		}
		

	}

}
