package pm;

public class VendingMachine {
	// 자판기를 생성하고 특정한 생성자 함수 호출시
	// 1. 크기 4의 배열 (1. 레츠비 , 500원  2. 사이드 , 700원 3. 콜라 , 700원 4. 웰치스 ,1000원) 가 완성됌
	// 2. 화면엔 금액: scanf("%d",&금액) -> 입력된 금액으로 구매할 수 있는 음료 리스트를 출력
	// 여러가지 속성을 하나에 부여하고 싶을 때 객체를 사용하여 관리하면 된다. 구조체 -> 객체
	Drink[] drinks;
	int insertedMoney;
	
	VendingMachine() {
		drinks = new Drink[4];
		for(int i=0; i<drinks.length; i++)
			drinks[i] = new Drink();
		drinks[0].name = "레츠비";
		drinks[0].Price = 500;
		drinks[1].name = "사이다";
		drinks[1].Price = 700;
		drinks[2].name = "콜라";
		drinks[2].Price = 700;
		drinks[3].name = "웰치스";
		drinks[3].Price = 1000;
	}
	
	void setInsertedMoney(int insertedMoney) {
		if(insertedMoney > 0)
			this.insertedMoney = insertedMoney; 
	}
	
	void printDrinks() {
		StringBuffer message = new StringBuffer();
		int count = 0;
		for(int i=0; i<drinks.length; i++) {
			if(this.insertedMoney >= drinks[i].Price)
				message.append((++count)+". "+drinks[i].name+" ");
		}
		System.out.println(message);
	}
}
