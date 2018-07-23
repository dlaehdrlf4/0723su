package prec1;

import java.io.PrintWriter;

public class Main2 {

	public static void main(String[] args) {
		//파일 , 네트워크, 데이터베이스 관련 클래스들은
		//예외 처리를 강제합니다.
		PrintWriter pw = null;
		try {
			//현재 디렉토리에 파일을 생성
			pw = new PrintWriter("C:\\Users\\503-25\\Desktop\\oh.txt");
			//파일에 문자열을 기록
			pw.println("인생아아아아아아");
			//마지막에 버퍼의 내용을 전부 출력
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
