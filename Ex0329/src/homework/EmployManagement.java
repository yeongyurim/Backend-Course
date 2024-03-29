package homework;

import java.util.Scanner;

// CR(carriage return)

public class EmployManagement {
	EmpVO[] employeeArr;
	
	public EmployManagement() {
		employeeArr = new EmpVO[4];
		EmpVO emp = new EmpVO("120","일지매","사원","개발1팀");
		employeeArr[0] = emp;
		emp = new EmpVO("220","지매일","부장","인사부");
		employeeArr[1] = emp;
		emp = new EmpVO("320","홍길동","사원","안기부");
		employeeArr[2] = emp;
		emp = new EmpVO("430","김수한무","사장","개발1팀");
		employeeArr[3] = emp;
		
	}
	String searchName(String name) {
		// 인자인 name이 null이거나 공백일 경우에는 null을 반환하자!
		if(name == null || name.trim().length() == 0)
			return null; // 호출한 곳으로 null을 반환하면서 돌아간다.
		
		StringBuffer sb = new StringBuffer();
		boolean contains = false;
		
		for(int i=0; i<employeeArr.length; i++) {
			// 배열에 저장된 사원객체를 하나 얻어낸다.
			EmpVO e = employeeArr[i];
			if(e.ename.contains(name)) {
				contains = true;
				sb.append(e.empno);
				sb.append("|");
				sb.append(e.ename);
				sb.append("|");
				sb.append(e.position);
				sb.append("|");
				sb.append(e.dept);
				sb.append("\r\n");
			}
		}
		if(contains)
			return sb.toString();
		else
			return "해당 직원이 없습니다";
	}
	
	public static void main(String[] args) {
		EmployManagement em = new EmployManagement();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("검색할 사원명: ");
		String name = scanner.nextLine();
		
		System.out.println(em.searchName(name));
	}
}
