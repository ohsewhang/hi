package c_control;

public class ForExam {
  ForExam(){
	  int sum = 0;
	  for(int i=0;i<=100;i=i+i) {//1~100���� i=i+2 Ȧ���� int i��  0�̳�2���ϸ� ¦��
		  sum = sum + i; //sum+=i
		  System.out.println(i+"������ ��:"+sum);     //for�� �ȿ���� �������� ����.
	  }
	      System.out.println(sum);  //for���ۿ���� ���� ���ġ�� ����.
  }
}
