/*
 * �����ڿ� ���ϰ� �Ϲ� �޼ҵ忡 �ۼ��Ѵ�. ���� ����/��,��,/ ���Һд��� ȿ�������� �ϱ�����
 * ��������� ������ �������. ���������� �� ��ܿ� ������� ����. 
 */

package d_array;

import java.util.Scanner;

public class ArrayExam3 {
	// �޼ҵ� ����
	// 1.�޼ҵ����. /������/�� ������ /��ȯ��/�� ������ /�޼ҵ��/ /�Ű�����/...��ȯ���� ������ ������ �޼ҵ�.
	// ������ 2���� �迩�� �����ϰ� �ʱⰪ�� 4��3���� �����͸� ���� �ϴ� ����//
	public void test1() { // test1 �޼ҵ� ����. (ȣ���� �Ǿ� ��밡��). ��ȯ���� ���� �� void
		// int[][] s = new int[4][3];//�����Ͱ� ���ٸ� �̷���
		// 4��3���ϼ�.//System.out.println("test1�޼ҵ尡 ����ȴ�.");//������ Ŭ���� �ȿ��� (main����) ȣ�� �� ���
		// �ݵ�� this.�� �ٴ´�.������� ������ �޼ҵ�� this.�� �ٿ��� �ȴ�.
		int[][] s = new int[][] { // Ŭ���� �ۿ����� ��ü�� or ������Ʈ�� or �μ�Ʈ���� �ؾ��Ѵ�.
				{ 1, 2, 3 }, // ���簢�� ���·� �����.4��3��
				{ 2, 3, 5 }, // �迭�� �� 0.1.2. �ε������Ѵ�.���κ��̽��̴�.
				{ 4, 5, 6 }, // �� 0.1.2.3
				{ 7, 8, 9, }, };
		// �迭�� ��� ���.
		System.out.println("��� : " + s.length); // ���!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// ù��° ���� ����
		System.out.println("ù���� ���� �� �� :" + s[0].length);
		// �ι�° ���� ����° ���� ���� //4�����;ߴ�
		System.out.println("s[1][2] :" + s[1][2]);
		// ù��° ���� ������ �հ�
		int hap = s[0][0] + s[0][1] + s[0][2];
		System.out.println("s[1]���� �� :" + (s[0][0] + s[0][1] + s[0][2]));// ("s[1]���� �� :"+ hap)
		// ù��° ���� �հ�
		hap = s[0][0] + s[1][0] + s[2][0] + s[3][0];
		System.out.println("ù��°�����հ�:" + hap);
		// �ι�° ���� ���� �� ¦���� ��� 2.4�� /2�������� ���ڵ��� �ϳ��� �����ͼ� ¦������ �Ǵ�.
		if (s[1][0] % 2 == 0) {
			System.out.print(s[1][0] + "  ");
		} // int j = s[1][0]+s[1][1]+s[1][2];
		if (s[1][1] % 2 == 0) {
			System.out.print(s[1][1]);
		}
		if (s[1][2] % 2 == 0) {
			System.out.println(s[1][2]);
		}
		// ����°���� ¦���� ����� ���Ͻÿ�. ��%3
		int hap1 = 0, count = 0;
		double avg = 0;

		for (int i = 0; i < s.length; i++) {
			if (s[i][2] % 2 == 0) {
				hap1 += s[i][2];
				count++;
			}
			// �̰Ÿ� ���� if(s[0][2] %2==0) { hap+=s[0][2]; count ++;}
			// �ݺ��Ǵϱ� if(s[1][2] %2==0) {hap+=s[1][2]; count ++;}
		} // for�� ��
		if (count > 0) {
			avg = (double) hap1 / count;
		}
		System.out.println();
		System.out.println("���:" + avg);
		System.out.println("¦���� ����:" + count);
		System.out.println("�հ�:" + hap1);

	} // �޼ҵ� �����Ұ� �޼ҵ�� ��ĥ �� ����.=�޼ҵ�ȿ� �޼ҵ� �ȴ�...��..��...��..

	public int test2() { // ��ȯ��int��� .������� ������ ����� ����.test2�� test1�̶� �ڸ��� �ٲ㵵 �ȴ�.
		// ���ڿ� 1�����迭�� ������ ����(names) 5���� ���� //test1 ȣ���Ҷ� this .�� ���ش�.��������
		// ������ 2�����迭 (s) 5���� ����,���� ������ �����Ͻÿ�.
		String[] names = { "aa", "bb", "cc", "dd", "ee" }; // 1���� �迭. new String ��������
		int[][] s = { // 2�����迭 .new��������
				{ 10, 20 }, { 20, 30 }, { 30, 40 }, { 40, 50 }, { 50, 60 } };
		// �迭�� ù��° �л��� �̸��� ������ ����Ͻÿ� �� �� ������ ����� ����ҷ�
		int tot = 0;
		double avg = 0;

		System.out.println("name: " + names[0]); // �̸�aa
		System.out.println("kor : " + s[0][0]); // kor10
		System.out.println("eng :" + s[0][1]); // eng20
		tot = s[0][0] + s[0][1];
		avg = (double) tot / s[0].length; // avg = tot/2.0
		System.out.println("tot :" + tot);
		System.out.println("avg:" + avg);
		// ����° �л��� ���������� 100������ �����Ͻÿ�
		s[2][0] = 100;
		// ������ �л��� �̸��� ������� ����Ͻÿ�
		System.out.println("����°�л���:" + names[2]);
		System.out.println("����:" + s[2][0]);
		// ###�˻����### �л����� dd�� ����� ����,����,����,��� ����Ͽ� ����ϵ� "�ڷ���� ���"
		// �˻�� �Է��Ͽ� �˻��ϰ� �˻��� �����Ϸ��� 'quit'�� �Է�. �Է��ϵ��� ���α׷��� �����Ͻÿ�.
		Scanner scanner = new Scanner(System.in);
		String findStr = "";
		while (!findStr.equals("quit")) { // ��Ʈ�� ����Ʈ F �� ����
			System.out.println("�˻����̸���?");
			findStr = scanner.nextLine(); // ��ĳ�ʷκ��� ���ٴ����� �Է¹޴´�./�º��� findstr�� ������ ��ȯ���� ��Ʈ�� Ÿ���̶� ���
			int p = -1; // ã�������� ��ġ.�ʱⰪ�� 0�̸� �ȵȴ�............���κ��̽����� ã������..-�� �ַ� ����.-1�� �ϴ��ڵ带 �м��ؾ��Ѵ�.
			for (int i = 0; i < names.length; i++) { // names�� �ݺ�. /
				if (names[i].equals(findStr)) { // �̸��� ���.//�迭��i������ ���� �Է��� ���� ���Ĵ� ��.
					p = i;
					tot = s[i][0] + s[i][1]; // i�� �����ϴ°� i�� dd�� dd������ 3�̶� ���� ����.
					avg = tot / 2.0; // (double)tot/s[i].length
					// System.out.println(names[i]);
					System.out.println("--�˻����---");
					System.out.println("����:" + names[i]);
					System.out.println("����:" + s[i][0]);
					System.out.println("����:" + s[i][1]);
					System.out.println("����:" + tot);
					System.out.println("���:" + avg);
					break;
				} // if����

			} // for����
			if (p == -1) {
				System.out.println("�ڷ����"); // �̸��� ���ٸ� ���.
			}
		} // while��
		return 0; // ��ȯ��
	}// test2��

	public static void main(String[] args) { // �޼ҵ�(Ŭ������)���⼭ ȣ��� �ݵ�� ��ü���� �ʿ���.
		ArrayExam3 a3 = new ArrayExam3(); // ��ü ����. �����ڴ� ����ӽ��� ���ش�. ����ӽſ��� �������� �����ڴ� �Ű������� ���� �������̴�.
		// a3.test1();// a3�� �������ִ� �޼ҵ� �׽�Ʈ1�� �޼ҵ带 ȣ��. ��ȯ���� ���⿡ a3�տ� �ƹ��͵� �Ƚ��ش�. �� ��
		// test1�޼ҵ忡���� sysout���ָ� ��µȴ�.
		// \a3.test2();// a3�� �������ִ� �޼ҵ� test2 ȣ��.
		a3.test2();

	}// main��

}// class��
