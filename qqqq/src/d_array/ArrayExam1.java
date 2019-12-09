package d_array;

public class ArrayExam1 {
	ArrayExam1() {
		// 배열을 선언하면서 초기값을 대입하는 방법.
		int[] score = { 11, 12, 13, 14, 15 };// 배열에 12345가 들어감.[01234]로 저장.
		System.out.println(score[0]);
		System.out.println(score[4]);

		// 문자열형 배열을 선언하고 임의의 성명을 3개 저장.
		String[] name = { "k", "e", "g" };
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);

		name[0] = "개똥";
		name[1] = "똥개";
		name[2] = "멍멍";
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);

		// 배열을 선언한 후 초기값을 설정할 때는 반드시 앞에 new 데이터타입[] { };
		double[] height = null;
		height = new double[] { 150.5, 160, 160.5, };// 초기값 설정시 중괄호
		// double[] height = new double[]{150.5,160,160.5,}; 간단히.
		System.out.println(height[2]);
		// 10명의 몸무게를 저장할 수 있는 실수형 배열을 선언하자 좀
		double[] w = new double[10]; // 9아닌가;?
		// 랜덤함수를 사용하여 몸무게를 발생시켜 배열w에 저장을 하자.
		for (int i = 0; i < 10; i++) { // i<=9
			double d = Math.random() * 100; // 난수 발생
			w[i] = d;

		}
		// 몸무게 합계와 평균 계산
		double hap = 0;
		for (int i = 0; i < w.length; i++) { // .length 배열의 개수만큼 루핑.
			hap += w[i];
		}
		double avg = hap / w.length;
		System.out.printf("합계 = %5.1f \n", hap);
		System.out.printf("평균 = %5.3f \n", avg);

		for (int i = 0; i < 10; i++) {
			// System.out.printf("%5.1f \n",w[i]); //"%f"실수값 가져오는거고
			// %5.1는 소수점 첫자리까지만 나오게 두자리는 5.2 ....
		} // printf....?

	}

	public static void main(String[] args) {
		/*
		 * for(int i=0; i<args.length ; i++) { System.out.println( args [1]); }
		 */
		new ArrayExam1();
	}
}
