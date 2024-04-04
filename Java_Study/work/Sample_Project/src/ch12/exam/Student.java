package ch12.exam;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}

	/*
	 * Object의 hashCode() 메소드를 재정의해서 멤버변수들의 해시코드를 합한 해시코드로 반환후 리턴
	 */
	@Override
	public int hashCode() {
		int hashCode = studentNum.hashCode();
		return hashCode;
	}

	@Override // Object의 equals() 메소드 재정의
	public boolean equals(Object obj) { 
		if(obj instanceof Student student) { // obj가 Member 타입인지 검사하고 타입 변환 후 target 변수에 대입
			if (this.studentNum.equals(student.studentNum)) { // studentNum 문자열이 같은지 확인
				return true;
			}
		}
		return false;
	}
	
}
