package java_20191119;

public class CastingDemo {
	public static void main(String[] args){
		//overflow 발생하여 compile error발생
		//byte b1 = 250;
		
		byte b1 = (byte)129;// circuit 발생,이 경우 권장하지 않음
		System.out.println(b1);
		
		int i1 = (int) 125.35;//cut 발생
		System.out.println(i1);
		
		double d1 = 124.5f;//auto casting
		
		byte b2 = 10;
		byte b3 = 20;
		//산술연산자는 반환값이 int이기 때문에 전체를 byte로  casting해야 에러가 발생하지 않는다.
		byte b4 = (byte)(b2 + b3);
		System.out.println(b4);
		
		int a1 = 10_000_000; //tip
	}
}
	