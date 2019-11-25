package java_20191119;

public class IfDemo {
	public static void main(String[] args){
		//Run Configuration >> Argument >> Program arguments
		int month = Integer.parseInt(args[0]);
		
		String season = null;
		if(month==12 || month ==2){
			season = "겨울";
		}else if(month ==3 || month ==4 ||month == 5 ){
			season = "봄";
		}else if(month ==3 || month ==4 ||month == 5 ){
			season = "여름";
		}else if(month ==3 || month ==4 ||month == 5 ){
			season = "가을";
		}else{
			season = "업는 계절";
		}
		System.out.println(month + "월은"+season+"입니다.");
	}
}