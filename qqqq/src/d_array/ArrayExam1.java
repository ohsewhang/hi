package d_array;

public class ArrayExam1 {
	ArrayExam1() {
		// �迭�� �����ϸ鼭 �ʱⰪ�� �����ϴ� ���.
		int[] score = { 11, 12, 13, 14, 15 };// �迭�� 12345�� ��.[01234]�� ����.
		System.out.println(score[0]);
		System.out.println(score[4]);

		// ���ڿ��� �迭�� �����ϰ� ������ ������ 3�� ����.
		String[] name = { "k", "e", "g" };
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);

		name[0] = "����";
		name[1] = "�˰�";
		name[2] = "�۸�";
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);

		// �迭�� ������ �� �ʱⰪ�� ������ ���� �ݵ�� �տ� new ������Ÿ��[] { };
		double[] height = null;
		height = new double[] { 150.5, 160, 160.5, };// �ʱⰪ ������ �߰�ȣ
		// double[] height = new double[]{150.5,160,160.5,}; ������.
		System.out.println(height[2]);
		// 10���� �����Ը� ������ �� �ִ� �Ǽ��� �迭�� �������� ��
		double[] w = new double[10]; // 9�ƴѰ�;?
		// �����Լ��� ����Ͽ� �����Ը� �߻����� �迭w�� ������ ����.
		for (int i = 0; i < 10; i++) { // i<=9
			double d = Math.random() * 100; // ���� �߻�
			w[i] = d;

		}
		// ������ �հ�� ��� ���
		double hap = 0;
		for (int i = 0; i < w.length; i++) { // .length �迭�� ������ŭ ����.
			hap += w[i];
		}
		double avg = hap / w.length;
		System.out.printf("�հ� = %5.1f \n", hap);
		System.out.printf("��� = %5.3f \n", avg);

		for (int i = 0; i < 10; i++) {
			// System.out.printf("%5.1f \n",w[i]); //"%f"�Ǽ��� �������°Ű�
			// %5.1�� �Ҽ��� ù�ڸ������� ������ ���ڸ��� 5.2 ....
		} // printf....?

	}

	public static void main(String[] args) {
		/*
		 * for(int i=0; i<args.length ; i++) { System.out.println( args [1]); }
		 */
		new ArrayExam1();
	}
}
