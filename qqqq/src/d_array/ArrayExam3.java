/*
 * 생성자에 안하고 일반 메소드에 작성한다. 따로 따로/입,출,/ 역할분담을 효율적으로 하기위해
 * 멤버끼리는 순서가 상관없다. 관례적으로 맨 상단에 멤버들을 쓴다. 
 */

package d_array;

import java.util.Scanner;

public class ArrayExam3 {
	// 메소드 가능
	// 1.메소드생성. /접근자/가 나오며 /반환형/이 나오고 /메소드명/ /매개변수/...반환형이 있으면 무조건 메소드.
	// 정수형 2차원 배여을 선언하고 초기값을 4형3열의 데이터를 대입 하는 문제//
	public void test1() { // test1 메소드 생성. (호출이 되야 사용가능). 반환형이 없을 시 void
		// int[][] s = new int[4][3];//데이터가 없다면 이렇게
		// 4행3열완성.//System.out.println("test1메소드가 실행된다.");//동일한 클래스 안에서 (main제외) 호출 할 경우
		// 반드시 this.이 붙는다.멤버끼리 변수든 메소드든 this.을 붙여도 된다.
		int[][] s = new int[][] { // 클래스 밖에서는 객체명 or 오브젝트명 or 인선트명을 해야한다.
				{ 1, 2, 3 }, // 직사각형 형태로 만든다.4행3열
				{ 2, 3, 5 }, // 배열은 행 0.1.2. 인덱스라한다.제로베이스이다.
				{ 4, 5, 6 }, // 열 0.1.2.3
				{ 7, 8, 9, }, };
		// 배열의 행수 출력.
		System.out.println("행수 : " + s.length); // 출력!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// 첫번째 행의 열수
		System.out.println("첫번쨰 행의 열 수 :" + s[0].length);
		// 두번째 행의 세번째 열의 값은 //4가나와야댐
		System.out.println("s[1][2] :" + s[1][2]);
		// 첫번째 행의 값들의 합계
		int hap = s[0][0] + s[0][1] + s[0][2];
		System.out.println("s[1]행의 합 :" + (s[0][0] + s[0][1] + s[0][2]));// ("s[1]행의 합 :"+ hap)
		// 첫번째 열의 합계
		hap = s[0][0] + s[1][0] + s[2][0] + s[3][0];
		System.out.println("첫번째열의합계:" + hap);
		// 두번째 행의 값들 중 짝수만 출력 2.4만 /2번쨰행의 숫자들을 하나씩 가져와서 짝수인지 판단.
		if (s[1][0] % 2 == 0) {
			System.out.print(s[1][0] + "  ");
		} // int j = s[1][0]+s[1][1]+s[1][2];
		if (s[1][1] % 2 == 0) {
			System.out.print(s[1][1]);
		}
		if (s[1][2] % 2 == 0) {
			System.out.println(s[1][2]);
		}
		// 세번째열의 짝수의 평균을 구하시오. 합%3
		int hap1 = 0, count = 0;
		double avg = 0;

		for (int i = 0; i < s.length; i++) {
			if (s[i][2] % 2 == 0) {
				hap1 += s[i][2];
				count++;
			}
			// 이거를 루핑 if(s[0][2] %2==0) { hap+=s[0][2]; count ++;}
			// 반복되니까 if(s[1][2] %2==0) {hap+=s[1][2]; count ++;}
		} // for문 끝
		if (count > 0) {
			avg = (double) hap1 / count;
		}
		System.out.println();
		System.out.println("평균:" + avg);
		System.out.println("짝수의 개수:" + count);
		System.out.println("합계:" + hap1);

	} // 메소드 생성불가 메소드는 겹칠 수 없다.=메소드안에 메소드 안댕...ㅇ..ㅇ...ㅇ..

	public int test2() { // 반환형int사용 .멤버들은 순서에 상관이 없어.test2를 test1이랑 자리를 바꿔도 된다.
		// 문자열 1차원배열에 임의의 성명(names) 5개를 대입 //test1 호출할때 this .를 써준다.생략가능
		// 정수형 2차원배열 (s) 5명의 국어,영어 성적을 대입하시오.
		String[] names = { "aa", "bb", "cc", "dd", "ee" }; // 1차원 배열. new String 생략가능
		int[][] s = { // 2차원배열 .new생략가능
				{ 10, 20 }, { 20, 30 }, { 30, 40 }, { 40, 50 }, { 50, 60 } };
		// 배열의 첫번째 학생인 이름과 성적을 출력하시오 그 후 총점과 평균을 출력할래
		int tot = 0;
		double avg = 0;

		System.out.println("name: " + names[0]); // 이름aa
		System.out.println("kor : " + s[0][0]); // kor10
		System.out.println("eng :" + s[0][1]); // eng20
		tot = s[0][0] + s[0][1];
		avg = (double) tot / s[0].length; // avg = tot/2.0
		System.out.println("tot :" + tot);
		System.out.println("avg:" + avg);
		// 세번째 학생의 국어점수를 100점으로 수정하시오
		s[2][0] = 100;
		// 세번쨰 학생의 이름과 국어성적을 출력하시오
		System.out.println("세번째학생명:" + names[2]);
		System.out.println("국어:" + s[2][0]);
		// ###검색기능### 학생명이 dd인 사람의 국어,영어,총점,평균 계산하여 출력하되 "자료없음 출력"
		// 검색어를 입력하여 검색하고 검색을 중지하려면 'quit'를 입력. 입력하도록 프로그램을 수정하시오.
		Scanner scanner = new Scanner(System.in);
		String findStr = "";
		while (!findStr.equals("quit")) { // 컨트롤 쉬프트 F 열 정리
			System.out.println("검색할이름은?");
			findStr = scanner.nextLine(); // 스캐너로부터 한줄단위로 입력받는다./좌변에 findstr인 이유는 반환형이 스트링 타입이라 사용
			int p = -1; // 찾았을때의 위치.초기값이 0이면 안된당............제로베이스에서 찾을때는..-를 주로 쓴다.-1은 하단코드를 분석해야한다.
			for (int i = 0; i < names.length; i++) { // names를 반복. /
				if (names[i].equals(findStr)) { // 이름만 출력.//배열의i번쨰가 내가 입력한 값과 같냐는 뜻.
					p = i;
					tot = s[i][0] + s[i][1]; // i를 대입하는건 i가 dd라서 dd점수는 3이라 같이 나옴.
					avg = tot / 2.0; // (double)tot/s[i].length
					// System.out.println(names[i]);
					System.out.println("--검색결과---");
					System.out.println("성명:" + names[i]);
					System.out.println("국어:" + s[i][0]);
					System.out.println("영어:" + s[i][1]);
					System.out.println("총점:" + tot);
					System.out.println("평균:" + avg);
					break;
				} // if문끝

			} // for문끝
			if (p == -1) {
				System.out.println("자료없음"); // 이름이 없다면 출력.
			}
		} // while끝
		return 0; // 반환형
	}// test2끝

	public static void main(String[] args) { // 메소드(클래스밖)여기서 호출시 반드시 객체명이 필요함.
		ArrayExam3 a3 = new ArrayExam3(); // 객체 생성. 생성자는 가상머신이 해준다. 가상머신에서 빌려오는 생성자는 매개변수가 없는 생성자이다.
		// a3.test1();// a3이 가지고있는 메소드 테스트1인 메소드를 호출. 반환값이 없기에 a3앞에 아무것도 안써준다. 그 후
		// test1메소드에가서 sysout해주면 출력된다.
		// \a3.test2();// a3가 가지고있는 메소드 test2 호출.
		a3.test2();

	}// main끝

}// class끝
