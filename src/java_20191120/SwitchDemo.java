package java_20191120;

public class SwitchDemo {
	public static void main(String[] args){
	
	int month = Integer.parseInt(args[0]);
	
	switch(month){
	case 1:
	case 2:
	case 12:
		System.out.println("지금은 겨울");
		break;
	case 3:
	case 4:
	case 5:
		System.out.println("지금은 봄");
		break;
	case 6:
	case 7:
	case 8:
		System.out.println("지금은 여름");
		break;
	case 9:
	case 10:
	case 11:
		System.out.println("지금은 가을");
		break;	
	default : System.out.println("없는 계절"); // 디폴트문장은 중간에 끼거나 맨 위에 있어도 상관 없다.(어차피 맨 마지막에 실행됨)
				}
		}
}