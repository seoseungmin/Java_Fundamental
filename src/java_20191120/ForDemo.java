package java_20191120;

public class ForDemo {
	public static void main(String[] args) {
		String str = "hello";
		int a1 = 10;
		int a2 = 20;
		double d1 = 12.4567;
		System.out.printf("%s , %d, %d ", str, a1, a2);
		// printf에 비해 문장쓰기가 복잡(위 쪽에 비해서) & print한 후에 한 줄 내려가는게 안됨(println은
		// 됨)(따라서 printf는 마지막에 %n 붙여줘야 됨)
		System.out.println(str + " , " + a1 + " , " + a2);

		int sum = 0;
		long start = System.currentTimeMillis(); // 1970년 1월 1일 12시 기준으로 지금 시작을
													// 밀리세컨으로 표현한 시간
		for (int i = 1; i <= 50; i++) {
			sum += 2 * i;
		}
		long end = System.currentTimeMillis();
		System.out.printf("1부터 100까지의 합은 %d입니다.%n", sum);
		System.out.printf("경과시간:%d.%n", (end - start));

		int k;
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				k = i * j;
				System.out.println(i + "곱하기" + j + "=" + k);
			}
		}
		for (int i = 9; i > 1; i--) {
			for (int j = 1; j < 10; j++) {
				k = i * j;
				System.out.println(i + "곱하기" + j + "=" + k);
			}
		}

		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println("");
		}

	}

}