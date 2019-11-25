package java_20191119;

public class CharLiteralDemo {
	public static void main(String[] args){
		//1.유니코드 표현 >>'\u0000';
		char c1 = '\uC11C';
		char c2 = '\uC2B9';
		char c3 = '\uBBFC';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		// 2.아스키코드 표현 
		// 48~57 >>  0~9
		// 65~90 >>  A~Z
		// 97~122 >> a~z
		
		char c4 = 97;
		System.out.println(c4);
		
		//3. 문자 표현 >> ''
		char c5 = 'a';
		char c6 = '서';
		System.out.println(c5);
		System.out.println(c6);
		
		//escape char
		// \n >> line feed
		// \t >> tab
		// \\ >> \
		// \" >> "
		// \' >> '
		
		
		System.out.println("hello\n"+"world");
		System.out.println("hello\t"+"world");
		
		String path = "C:\\dev\\eclipse";
		System.out.println(path);
	}
}
