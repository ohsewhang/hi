package e_class;

public class ArrayParam {

	ArrayParam(int[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]); // �ؿ��� ���޹��� �迭�� ���.
		}
	}																		//������!~~~�迭Ÿ�Թ���~~~~~~~~~~~~~~~~~~~

	int arraySum(int[] s) { // ��� ��ȯ�� ������ �޼ҵ��.
		int sum = 0;
		for (int i = 0; i < s.length; i++) {
			sum += s[i];
		}
		return sum;// �ؿ� hap�� ���� ����
	}

	// ���޹��� �迭���� �ִ��� ���Ͽ� ��������

	int arrayMax(int[] k) { // �޼ҵ� // sda(int[])������ �迭�̶�� �ǹ̸� �ۼ��̴�.//�ִ밪 �ϳ��� ���ϱ⿡ �տ� int[]���ƴ� int�� ���ش�.
		int max = k[0];

		for (int i = 1; i < k.length; i++) { // 0���� ����� ���� k=0�̶� �ѹ��� �񱳶� 2��°���� ���Ϸ��� i=1
			if (max < k[i])
				max = k[i];
		}
		return max;
	}
	//���޹��� �迭���� �ּڰ��� ���Ͽ� ����
	int arraymin(int[] q) {
		int min = q[0];
		for(int i = 0 ; i<q.length ; i++) {
			if(min >q[i])min = q[i];
		}
		return min;
	}
	
	//�ϳ��� �޼ҵ忡�� �ִ񰪰� �ּڰ��� ���ÿ� ��ȯ�Ͻö�
	int[] maxMin(int[]s) {
		int[] m = new int[2];//�������迭2��
		m[0] = s[0];//max       m0�� �ƽ���    ????????????????
		m[1] = s[0];//min       m1�� ������ �ٲ��� ���ϰ��� m= new int[]{max,min};�� �߰� ���ش�.
		for(int i = 1; i<s.length ; i++) {
			if(m[0] <s[i])       m[0] = s[i];
			else if(m[1] > s[i]) m[1] = s[i];
		}
		
			
		
		return m;//�迭�� m�� �迭��ü�� ��Ÿ����.
		
	}
	
	
	public static void main(String[] args) {
		int[] abc = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		ArrayParam ap1 = new ArrayParam(abc); // (��������)�Ű������� abcŸ��(�������迭Ÿ��)���� ArrayParam ap1��ü����
		int hap = ap1.arraySum(abc); // array sum�� ����. s�� ���Եȴ�.
		System.out.println(hap);
		int m = ap1.arrayMax(abc); // �ִ�
		System.out.println("�ִ밪 : " + m);// �ִ�
		int v = ap1.arraymin(abc);		//�ּڰ�.
		System.out.println("�ּڰ� : " + v);
		System.out.println("======================");
		int[]r = ap1.maxMin(abc);// = int[]r = new int[2]�� ����.
		System.out.println("�ִ�r[0] :"+r[0]);
		System.out.println("�ּڰ�r[1] :"+r[1]);
		
	}// main ��

}// class ��
