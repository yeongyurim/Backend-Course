package ch12.sec05;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * String 문자열을 저장하고 조작할 때 사용
 * StringBuilder 효율적인 문자열 조작 기능이 필요할 때 사용
 * StringTokenizer 구분자로 연결된 문자열을 분리할 때 사용
 * 
 * String 클래스는 문자열을 저장하고 조작할 때 사용한다.
 * 문자열 리터럴은 자동으로 String 객체로 생성되지만, 
 * String 클래스의 다양한 생성자를 이용해서 직접 객체를 생성할 수도 있다.
 * 
 * 프로그램을 개발하다 보면 byte 배열을 원래 문자열로 변환하는 경우가 종종 있다.
 * 네트워크 통신으로 얻은 byte 배열을 원래 문자열로 변환하는 경우이다.
 */

/*
 * 한글 1자를 UTF-8로 인코딩하면 3바이트가 되고,
 * EUC-KR로 인코딩하면 2바이트가 된다.
 * 따라서 인코딩할 때 사용한 문자셋으로 디코딩을 해야만 한글이 올바르게 복원될 수 있다.
 */
public class ByteToStringExample {

	public static void main(String[] args) throws Exception {
		String data = "자바";
		
		// String->byte 배열(기본:UTF-8 인코딩)
		byte[] arr1 = data.getBytes(); // byte[] arr1 = data.getBytes("UTF-8");
		System.out.println("arr1: " + Arrays.toString(arr1));
		
		// byte 배열 -> String(기본: UTF-8 디코딩)
		String str1 = new String(arr1); // String str1 = new String(arr1, "UTF-8");
		System.out.println("str1: " + str1);
		
		// String -> byte 배열(EUC-KR 인코딩)
		byte[] arr2 = data.getBytes("EUC-KR");
		System.out.println("arr2: " + Arrays.toString(arr2));
		
		// byte 배열 -> String(기본: UTF-8 디코딩)
		String str2 = new String("EUC-KR");
		System.out.println("str2: " + str2);
	}

}
