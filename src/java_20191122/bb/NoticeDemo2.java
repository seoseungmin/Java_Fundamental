package java_20191122.bb;
//서로 다른 패키지의 클래스를 사용하기 위해서는 반드시 import 해줘야 한다.
import java_20191122.aa.Notice;


public class NoticeDemo2 extends Notice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Notice n = new Notice();
			n.number =10;
			//n.title = "title";
			//n.hit = 100;
			//n.regdate = "2019-11-22"
			
			//Notice 클래스를 상속받은  NoticeDemo2클래스로 객체를 생성한 후에는
			//protected 접근이 가능함.
			NoticeDemo2 nc = new NoticeDemo2();
			nc.number = 10; //public
			nc.title = "title"; //protected
	}
}
