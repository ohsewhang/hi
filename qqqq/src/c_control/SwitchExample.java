package c_control;

public class SwitchExample {
	
  public SwitchExample() {
	  String a ="";          //����� �ѹ��� �ϴ� ��. 
	  int num = 0;
	  
	  for(int i=0 ; i<5 ;i=i+1 ) {  //�ݺ��� ����;500��;����
	  num = (int)(Math.random()*6) +1;//int num = (int)(Math.random()*6) +1;�� int�� �����ڹؿ� �θ� ����. 
	  if(num<1 || num>6) { 
	    System.out.println("��ȣ�����߻�");  //�����ڿ� ���ڸ� �ٲٸ� �� �� �ִ�.
	    System.exit(0); //�ý��� ����.
	  }
	 
	  switch(num) {
	  case 1 :
	a= ("1 �Դϴ�.");	//  System.out.println("1 �Դϴ�.");
		  break;
	  case 2 :
	a= ("2 �Դϴ�.");	 // System.out.println("2 �Դϴ�.");
		  break;
	  case 3 :
	a = ("3 �Դϴ�.");	 // System.out.println("3 �Դϴ�.");
          break;
	  case 4 :
	a = ("4 �Դϴ�.");	 // System.out.println("4 �Դϴ�.");
		  break;
	  case 5 :
	a = ("5 �Դϴ�.");	 // System.out.println("5 �Դϴ�.");
		  break;
	  default :
	a = ("6 �Դϴ�.");	//System.out.println("6 �Դϴ�.");
		  break;                //mainŬ�������� ����.
		  } //����ġ ��.
	 System.out.println(a);
	}//���� ��
	
	 
  	}//������ ��.
}