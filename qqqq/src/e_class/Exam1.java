/*
 * �� ������ (�Ű�������)���� �޾� �հ踦 ��ȯ�ϴ� �޼ҵ� ����(sum)
 * �� ������ (x,y)���� �޾�  x~y������ �հ踦 ���Ͽ��� ����(sum2)
 * ���� ���ΰ��� �Ǽ������� ���޹޾� �簢���� ���̸� ����Ͽ� ����(sum3)
 * ������ ���� �ϳ� ���޹޾� �������� �ϳ��� ���ڿ��� ����� ����(gugudan)
 */

package e_class;

public class Exam1 {
	int x = 0;
	int y = 0;
	
	int sum(int x,int y) {
		int sum = x + y;
		System.out.println(sum);
		return sum;
	}
	int sum2(int x,int y) {
		int sum = 0;
			
		for(int i = x ; i <= y ;i++) { //x�� y����
			 sum+=i;
		}
		return sum;
	}
	
	double sum3(double n1, double n2) {
		return n1*n2;
		
	}
	
		void gugudan(int dan){
			for(int i =1; i<=9 ;i++) {
			 int result = dan*i;
			 System.out.println(dan+"*"+i+"="+result);
			 
		 }
	 }
	 String gugudan2(int dan) {
		 String r = "";
		 for(int i =1; i<=9 ;i++) {
			 int result =dan*i;
			 r +=(dan+"*"+i+"="+result);
			 r +="\n";
		 }
		 return r;
	 }
	 public static void main(String[] args) {
			Exam1 e1 = new Exam1(); 
			
			int r1 = e1.sum(20,30);//�������� ���޹޾ƾ��ڴ�. �Ű������� ���⼭ ���ֳ�;
			System.out.println("�� ���� ��:"+r1); 
			
			int r2 = e1.sum2(1, 8);
			System.out.println("�հ�:"+r2);
			
			double r3 = e1.sum3(10.0, 20.0);
			System.out.println("�簢���� ����"+ r3);
			
			e1.gugudan(2);
			String r4 = e1.gugudan2(2);
			System.out.println("������");
			
		}
	 
	
	
}
