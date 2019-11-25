package java_20191122;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Customer.interestRate = 4.5; // 스테틱 변수는 객체 생성 안해도 가져다가 쓸 수 있다.(클래스가 다르므로 클래스 이름은 앞에 붙여줘야 한다)
			
			Customer c1 = new Customer();
			c1.name = "서승민";
			c1.email= "tjtmdals@hanyang.ac.kr";
			
			System.out.println(c1.name+" , "+ c1.email);
			
			Customer c2 = new Customer();
			c2.name = "손정의";
			c2.email= "masayosi@yahoo.co.jp";
			
			System.out.println(c2.name+" , "+ c2.email);
			
			Customer c3 = new Customer();
			c3.name = "베조스";
			c3.email= "ceo@amazon.com";
			
			System.out.println(c3.name+" , "+ c3.email);
			
			Customer c4 = c3;
			c4.name = "잡스";
			
			System.out.println(c3.name+" , "+ c3.email);
			
			Customer c5 = new Customer();
			c5.name = "손정의";
			c5.email= "masayosi@yahoo.co.jp";
			
			//그림을 그려보면 이해가 간다.
			System.out.println(c2==c5);
			System.out.println(c3==c4);
			
			//static 변수는 reference variable로 정급 가능하나 
			//일반적으로 클래스 이름을 접근한다.
			c1.interestRate = 10.2;
			System.out.println(c3.interestRate);
			
			Customer.interestRate = 12.2;
			System.out.println(Customer.interestRate);
			
			//Customer.BANKNAME = "국민은행"; // FINAL변수는 수정 불가능
	}

} 
