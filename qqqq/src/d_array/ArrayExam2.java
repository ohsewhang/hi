/*
 * 초기값으로 정수형 성적이 10개 발생.
 * 이를 배열에 저장 후 성적중 최대값과 최소값을 검사하여 출력.
 * 1.정수형 배열을 선언하고 초기값 10개를 대입.(배열scores)
 * 2.최대값,최소값을 저장할 변수를 선언.(max.min)
 * 3.max에 배열의 첫번째 값을 저장.( 배열의 첫번째 값이 최대 값 이라고 편정하고 시작.
 * 4.min에 배열의 첫번째값을 저장.(배열의 첫번째 값이 최소값이다 라고 편성하고 시작.
 * 5.최대값을 찾기 위한 루핑.
 * 6.최소값을 찾기 위한 루핑.
 * 7.최대값 최소값 출력.
 */
package d_array;

public class ArrayExam2 {
	ArrayExam2() {
		int[] scores = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 정수형 배열 선언.1
		int max = scores[0]; // scores의 첫번째 -이게 최대값 .3 max는 현재 1 루핑하면 최대값은 10.
		int min = scores[0]; // scores의 첫번째값-이게 최소값.4
		for (int i = 1; i < scores.length; i++) { // scores.length 길이가 얼마인지 모르니까 .5
			if (max < scores[i])
				max = scores[i];
			// if(scores[i] > max)
		}
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] < min)
				min = scores[i];
		}

		System.out.println("최대값" + max);
		System.out.println("최소값" + min);

	}// 생성자 끝

	public static void main(String[] args) {
		new ArrayExam2();
	}// 메인 클래스 끝
}// 클래스 끝
