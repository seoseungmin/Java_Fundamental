package java_20191122.aa;

public class Notice {
	public int number;
	protected String title;
	int hit;
	private String regdate;
	public static void main (String[] args){
		Notice n =  new Notice();
		n.number =10;
		n.title = "title";
		n.hit = 100;
		//같은 패키지에서는 private 접근 불가
		n.regdate = "2019-11-22"
	}
}
