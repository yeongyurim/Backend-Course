package ch06.exam01;

public class MemberService {
	final String id = "hong";
	final String password = "12345";
	
	boolean login(String id, String password) {
		if(this.id.equals(id) && this.password.equals(password))
			return true; 
		else 
			return false;
	}
	
	void logout(String id) {
		if(this.id == id)
			System.out.println(this.id);
		else
			System.out.println("id가 잘못되었습니다!");
	}
}
