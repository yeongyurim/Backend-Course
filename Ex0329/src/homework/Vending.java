package homework;

public class Vending {
	// 자판기를 의미하는 클래스
	Drink[] ar = new Drink[4]; // null 값으로 초기화된 Drink객체배열
	
	// 배열에 음료객체 4개를 생성하여
	// 초기화 하는 기능
	public void init() {
		Drink d1 = new Drink();
		d1.setName("레츠비");
		d1.setPrice(500);
		
		Drink d2 = new Drink();
		d2.setName("사이다");
		d2.setPrice(700);
		
		Drink d3 = new Drink();
		d3.setName("콜라");
		d3.setPrice(700);
		
		Drink d4 = new Drink();
		d4.setName("웰치스");
		d4.setPrice(1000);
		
		ar[0] = d1;
		ar[1] = d2;
		ar[2] = d3;
		ar[3] = d4;
	} // 초기화 기능의 끝
	
	// 금액을 하나 받아서 해당 금액에 선택가능한
	// 음료의 이름을 전달하는 기능
	public String insertCoin(int money) {
		// 배열에 저장된 각 음료의 가격과 인자로 받은 money를
		// 비교하여 money가 크거나 같다면 해당 음료의 이름을
		// 문자열로 조합하여 반환하는 기능
		/*
		String msg = "";
		for(int i=0; i<ar.length; i++) {
			if(money >= ar[i].price)
				msg = msg + (i+1) +". " + ar[i].name + " ";
		}
		*/  //이렇게 하면 리소스가 많아져서 속도가 느려진다.
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<ar.length; i ++) {
				if(money >= ar[i].price) {
					sb.append(ar[i].name);
					sb.append(",");
				}
		} // for의 끝
		
		// 마지막에 있는 ","를 삭제
		// 그렇다면 마지막에 있는 ","의 위치값(index)을 알아내야 한다.
		// 위치 알아내는 기능 : indexOf(",") : 검색 기준이 왼쪽부터
		// 				 lastIndexOf(",") : 검색 기준이 오른쪽부터
		
		int idx = sb.lastIndexOf(",");
		String msg = sb.substring(0,idx);
		return msg;
	}
}
