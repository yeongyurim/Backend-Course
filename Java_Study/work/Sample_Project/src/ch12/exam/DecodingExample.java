package ch12.exam;

import java.util.Arrays;

public class DecodingExample {

	public static void main(String[] args) throws Exception{
		byte[] bytes = { -20, -107, -120, -21, -123, -107 };
		String str = new String(bytes);
		byte[] bytes2 = str.getBytes("EUC-KR");
		String str2 = new String(bytes2,"EUC-KR");
		System.out.println("str: "+str +str2);
	}

}
