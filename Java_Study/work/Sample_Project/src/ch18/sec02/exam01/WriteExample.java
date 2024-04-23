package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * OutputStream
 * 
 * void write(int b) - 1byte를 출력
 * void write(byte[] b) - 매개값으로 주어진 배열b의 모든 바이트를 출력
 * void write(byte[] b, int off, int len) - 매개값으로 주어진 배열b[off]부터 len개의 바이트를 출력
 * void flush() - 출력 버퍼에 잔류하는 모든 바이트를 출력
 * close() - 출력 스트림을 닫고 사용 메모리 해제
 */
public class WriteExample {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test1.db");
			
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
