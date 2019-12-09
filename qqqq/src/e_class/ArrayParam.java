package e_class;

public class ArrayParam {

	ArrayParam(int[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]); // 밑에서 전달받은 배열을 출력.
		}
	}																		//정수형!~~~배열타입문제~~~~~~~~~~~~~~~~~~~

	int arraySum(int[] s) { // 얘넨 반환형 때문에 메소드다.
		int sum = 0;
		for (int i = 0; i < s.length; i++) {
			sum += s[i];
		}
		return sum;// 밑에 hap에 값을 저장
	}

	// 전달받은 배열에서 최댓값을 구하여 리턴하자

	int arrayMax(int[] k) { // 메소드 // sda(int[])정수형 배열이라는 의미만 작성이다.//최대값 하나만 구하기에 앞에 int[]가아닌 int만 써준다.
		int max = k[0];

		for (int i = 1; i < k.length; i++) { // 0부터 실행시 위에 k=0이라 한번더 비교라 2번째부터 비교하려고 i=1
			if (max < k[i])
				max = k[i];
		}
		return max;
	}
	//전달받은 배열에서 최솟값을 구하여 리턴
	int arraymin(int[] q) {
		int min = q[0];
		for(int i = 0 ; i<q.length ; i++) {
			if(min >q[i])min = q[i];
		}
		return min;
	}
	
	//하나의 메소드에서 최댓값과 최솟값을 동시에 반환하시라
	int[] maxMin(int[]s) {
		int[] m = new int[2];//정수형배열2개
		m[0] = s[0];//max       m0을 맥스로    ????????????????
		m[1] = s[0];//min       m1을 민으로 바꾼후 리턴값에 m= new int[]{max,min};을 추가 해준다.
		for(int i = 1; i<s.length ; i++) {
			if(m[0] <s[i])       m[0] = s[i];
			else if(m[1] > s[i]) m[1] = s[i];
		}
		
			
		
		return m;//배열명 m은 배열전체를 나타낸다.
		
	}
	
	
	public static void main(String[] args) {
		int[] abc = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		ArrayParam ap1 = new ArrayParam(abc); // (생성자임)매개변수가 abc타입(정수형배열타입)으로 ArrayParam ap1객체만듬
		int hap = ap1.arraySum(abc); // array sum에 들어간다. s에 대입된다.
		System.out.println(hap);
		int m = ap1.arrayMax(abc); // 최댓값
		System.out.println("최대값 : " + m);// 최댓값
		int v = ap1.arraymin(abc);		//최솟값.
		System.out.println("최솟값 : " + v);
		System.out.println("======================");
		int[]r = ap1.maxMin(abc);// = int[]r = new int[2]와 같음.
		System.out.println("최댓값r[0] :"+r[0]);
		System.out.println("최솟값r[1] :"+r[1]);
		
	}// main 끝

}// class 끝
