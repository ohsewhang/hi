/*
 * �ʱⰪ���� ������ ������ 10�� �߻�.
 * �̸� �迭�� ���� �� ������ �ִ밪�� �ּҰ��� �˻��Ͽ� ���.
 * 1.������ �迭�� �����ϰ� �ʱⰪ 10���� ����.(�迭scores)
 * 2.�ִ밪,�ּҰ��� ������ ������ ����.(max.min)
 * 3.max�� �迭�� ù��° ���� ����.( �迭�� ù��° ���� �ִ� �� �̶�� �����ϰ� ����.
 * 4.min�� �迭�� ù��°���� ����.(�迭�� ù��° ���� �ּҰ��̴� ��� ���ϰ� ����.
 * 5.�ִ밪�� ã�� ���� ����.
 * 6.�ּҰ��� ã�� ���� ����.
 * 7.�ִ밪 �ּҰ� ���.
 */
package d_array;

public class ArrayExam2 {
	ArrayExam2() {
		int[] scores = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // ������ �迭 ����.1
		int max = scores[0]; // scores�� ù��° -�̰� �ִ밪 .3 max�� ���� 1 �����ϸ� �ִ밪�� 10.
		int min = scores[0]; // scores�� ù��°��-�̰� �ּҰ�.4
		for (int i = 1; i < scores.length; i++) { // scores.length ���̰� ������ �𸣴ϱ� .5
			if (max < scores[i])
				max = scores[i];
			// if(scores[i] > max)
		}
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] < min)
				min = scores[i];
		}

		System.out.println("�ִ밪" + max);
		System.out.println("�ּҰ�" + min);

	}// ������ ��

	public static void main(String[] args) {
		new ArrayExam2();
	}// ���� Ŭ���� ��
}// Ŭ���� ��
