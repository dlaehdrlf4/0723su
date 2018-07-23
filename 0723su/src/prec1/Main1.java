package prec1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main1 {

	public static void main(String[] args) {
		//1. BufferedReader ��ü �����
		BufferedReader br = null;
		
		try {
		
			br = new BufferedReader(new FileReader("C:\\Users\\503-25\\Desktop\\access_log.txt"));
			ArrayList<String> list = new ArrayList<>();	
			
			Map<String,Integer> map = new HashMap<>();
			//2. �ٴ����� ������ �о ���
			//5. HashMap�� �̿��ؼ� ������ ip �� Ʈ���� �հ� ���
			HashMap<String, Integer> traffic = new HashMap<>();
			
			while(true) {
			String line = br.readLine();
			if(line == null) {
				break;
			}
			//System.out.println(line);
			//3. �ٴ����� ������ �о �������� �����ؼ� 
			String [] ar = line.split(" ");
			//ip�� ����� �����͸� �����ɴϴ�.
			Integer count = map.get(ar[0]);
			if(count == null) {
				map.put(ar[0], 1);
				//ip�� ����� �����Ͱ� ������ 1�� �����մϴ�.
			}else {
				map.put(ar[0], count + 1 );
				//����� �����Ͱ� ������ 1�� ���ؼ� �����մϴ�.
			}
			
			Integer traf = traffic.get(ar[0]);
			if(traf == null) {
				if(!ar[9].equals("\"-\"") && !ar[9].equals("-")) {
					traffic.put(ar[0], Integer.parseInt(ar[9]) );
				}
			}else {
				if(!ar[9].equals("\"-\"") && !ar[9].equals("-")) {
					traffic.put(ar[0],traf + Integer.parseInt(ar[9]));
				}
				
				
				
			}
			
			
			//�ʿ� ��� �����͸� ���
			Set<String> keySet = map.keySet();
			for(String key : keySet) {
				System.out.println(key + ":" + map.get(key));
			}
			System.out.println("===================================");
			keySet = traffic.keySet();
			for(String key : keySet) {
				System.out.println(key + ":" + traffic.get(key));
			}
			}
			/*for(String n : list) {
				System.out.println(n);
			}*/
		}catch(Exception e){
			System.out.println("���� �߻�" + e.getMessage());
		}finally {
			try {
				if(br != null) {
				br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
