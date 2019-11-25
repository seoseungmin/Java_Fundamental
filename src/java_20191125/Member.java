package java_20191125;

public class Member {
	// private이므로 다른 클래스에서 접근 불가.
	private String name;
	private String zipcode;
	private String address1;
	private String address2;
	private String ssn;
	private int age;
	private double height;
	private String password;
	private String email;
	
	//단축키: (Alt + Shift + s) >> r >> Tab >> Enter >> Tab*4 >> Enter
	
	//name에 대한 setter 메서드
	public void setName(String n) {
		name = n;
	}
	
	//name에 대한 getter 메서드
	public String getName(){
		return name;
	}
	
	public void setZipcode(String n) {
		zipcode = n;
	}
	
	public String getZipcode(){
		return zipcode;
	}
	
	public void setAddress1(String n) {
		address1 = n;
	}
	
	public String getAddress1(){
		return address1;
	}
	public void setAddress2(String n) {
		address2 = n;
	}
	
	public String getAddress2(){
		return address2;
	}
	
	public void setSsn(String n) {
		ssn = n;
	}
	
	public String getSsn(){
		return ssn;
	}
	
	public void setAge(int n) {
		age = n;
	}
	public int getAge(){
		return age;
	}
	
	public void setHeight(double n) {
		height = n;
	}
	public double getHeight(){
		return height;
	}
	
	public void setPassword(String n) {
		password = n;
	}
	public String getPassword(){
		return password;
	}
	
	public void setEmail(String n) {
		email = n;
	}
	public String getEmail(){
		return email;
	}
}// 이 훈련을 많이 할 것.