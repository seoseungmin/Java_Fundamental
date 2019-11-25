package java_20191119;

public class OperatorDemo {
	public static void main(String[] args){
		int a = 7, b = 20;
		int c = 0;
		double d = 0;
		c = a + b;
		System.out.println(c);
		
		c = a - b;
		System.out.println(c);
		
		c = a * b;
		System.out.println(c);
		
		d = b / a;
		System.out.println(d);
		
		//산술연산자 사용하면 int로 자동 캐스팅된다.
		d = (double)b / (double)a;
		System.out.println(d);
		
		c = b % a;
		System.out.println(c);
		
		a +=b;// a = a + b; 라고 코딩하지 말 것
		
		int sum = 0;
		for(int i=1;i<=100;i++){
			sum += i;
		}
		System.out.println(sum);
		
			
		c = a++; // 대입 후 증가
		c = ++a; // 증가 후 대입
		
		a = 10;
		b = 20;
		
		boolean isSuccess = false;
		System.out.println(isSuccess);
		
		isSuccess = a<b;
		System.out.println(isSuccess);
		
		isSuccess = a>=b;
		System.out.println(isSuccess);
		
		isSuccess = a<=b;
		System.out.println(isSuccess);
		
		isSuccess = a==b;
		System.out.println(isSuccess);
		
		isSuccess = a != b;
		System.out.println(isSuccess);
		
		//short circuit(a가 false이면 뒤 연상을 하지 않음)
		isSuccess = (a==b) && (++a == ++b);
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b); 
		
		String sum1 = null;
		sum1 = 1 + 2 + 3 + 4 + "5";
		System.out.println(sum1);
		sum1 = "1" + 2 + 3 + 4 + 5;
		System.out.println(sum1);
		sum1 = "1" + (2 + 3 + 4 + 5);
		System.out.println(sum1);
	}
		
}