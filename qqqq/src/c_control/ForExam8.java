package c_control;

public class ForExam8 {
	ForExam8(){		
	int a = 0; // ���� ����� ����
	int s1 = 0;
	int s10 = 0;
	int s20 = 0;
	int s30 = 0;
	int s40 = 0;
	int s50 = 0;
	int s60 = 0;
	int s70 = 0;
	int s80 = 0;
	int s90 = 0;
		// �ڸ��� ����� ����
           for(int i=1; i<=1000; i++){
			a = (int)(Math.random()*100)+1;
			if(a/10 == 0) { // ������ 1���� 9�� ��
				s1++;       // ���ڸ� ������ �ϳ� �ø���.
			}
			else if(a/10 == 1) { //������ 10���� 19�� ��
				s10++; // 10�ڸ��� ������ �ϳ� �ø���.
			}
			else if(a/10 == 2) {
				s20++;
			}
			else if(a/10 == 3) {
				s30++;
			}
			else if(a/10 == 4) {
				s40++;
			}
			else if(a/10 == 5) {
				s50++;
			}
			else if(a/10 == 6) {
				s60++;
			}
			else if(a/10 == 7) {
				s70++;
			}
			else if(a/10 == 8) {
				s80++;
			}
			else if(a/10 == 9) {
				s90++;
			}
		}
		// ���� ����� ������ ����ϴ� �ڵ�
		System.out.println("���ڸ� : "+s1);
		System.out.println("10�ڸ� : "+s10);
		System.out.println("20�ڸ� : "+s20);
		System.out.println("30�ڸ� : "+s30);
		System.out.println("40�ڸ� : "+s40);
		System.out.println("50�ڸ� : "+s50);
		System.out.println("60�ڸ� : "+s60);
		System.out.println("70�ڸ� : "+s70);
		System.out.println("80�ڸ� : "+s80);
		System.out.println("90�ڸ� : "+s90);
	}
}