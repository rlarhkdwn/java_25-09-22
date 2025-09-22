package day17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File03 {

	public static void main(String[] args) throws IOException {
		// 파일 읽ㄱ
		// 보조 스트림 사용 BufferedRead (FileReader)
		// 라인 단위르 일기 가능
		// 더 이상 읽을 라인이 없으면 null;
		// 기반 스트림을 매개변수로 포함해야함
		 
		BufferedReader br = new BufferedReader(new FileReader("D:\\web_0826_kkj\\memo\\writer.txt"));
		
		while (true) {
			String line = br.readLine(); // 한 라인으로 읽어들이기
			if (line == null) {
				break;
			}
			System.out.println(line);
		}
		br.close();

	}

}
