package c_control;

public class Switch {
  Switch(){
	  int  time =(int)(Math.random()*4)+8;
	  System.out.println("[����ð� :"+time+"��]");
	switch(time) {
		case 8:
		System.out.println("���");
		case 9:
		System.out.println("ȸ��");
		case 10:
		System.out.println("����");
		default: //�� ���� �̱⿡ �ڿ� ����� �����ʴ´�.
		System.out.println("�ܱ�");
		
	}
  }
}
