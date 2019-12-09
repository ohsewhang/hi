/*
 *구구단 출력
 *작성자 : osw
 *작성일 : 2019.12
 */
package c_control;

public class ForExam1 {
	ForExam1() {
		
		for(int m =2; m <=3; m++) {
		System.out.println(m + "단입니다.");
		for (int n = 1; n <= 9; n++) {
			System.out.println(m + "x" + n + "=" + (m * n));

		}
	  }
	}
}
