package ch12.exam;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return new StringBuilder()
				.append(id)
				.append(": ")
				.append(name)
				.toString();
	}
	
	
}
