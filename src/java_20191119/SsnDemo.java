package java_20191119;

public class SsnDemo {
	public static void main(String[] args){
			
			int [] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 8};
			
						
			//1. 각 자리수를 2부터 9까지 곱하고 다시 2~5까지 곱해서 합을 구함.
			int sum;
			int sum1 = 0;
			int i = 2;
				for(i = 2;i < 10; i++){
					sum1 += arr[i-2]*i;
				}
			int sum2 = 0;
				for(i = 2;i < 6; i++){
					sum2 += arr[i+6]*i;
				}
				sum = sum1 + sum2;	
			//2. 총합을 11로 나운 나머지를 구한다.
				int re;
				re = sum % 11;
			
			//3. 11에서 나머지를 뺀다.
				re = 11 - re;
			
			//4. 3의 결과를 다시 10으로 나눈 나머지를 구한다.
			
				re = re % 10;
			//5. 4의 결과와 맨 마지막 숫자가 같으면 정상적인 주민번호
				
				if(re == arr[12]){
					System.out.println("정상적인 주민번호");
				}
				else 	{
					System.out.println("비정상적인 주민번호");
				}
			// 그렇지 않으면 정상적이지 않은 주민번호라고 메시지를 출력한다.
					
			
	}

}


