package d_array;

public class ArrayExam5 {
	ArrayExam5(){
		//���� fOR���� ����Ͽ� �հ� ����� ���϶�.
		int[] s = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		double avg = 0;
		
		for(int k:s) { //s�� k�� ���������� �ϳ��� ����
			
			sum += k;
			
			
		}//���� ��
			avg = (double)sum/s.length;
			
			System.out.println("�հ�:"+sum);
			System.out.println("���:"+avg);
	
		
	
	
	
	}//�����ڳ�
	
	
	public static void main(String[] args) {
		new ArrayExam5();
		
	}//���γ�
}//Ŭ������
