package e_class;

public class Car {
	String model = "ġŲ";  //�����ִ°� arryparm2 car�� ����
	String color =  "����";
	int maxspeed = 0;
	
	Car(){  }                                               //4���� ������ �����.
	Car(String model){this.model = model;}									//�ʵ��  �޼ҵ� ������ �ƴϸ��; Ŭ�����ȿ��� ���� ��밡��.CLASS�ٷ� ���� ���� ����.	
	Car(String model, String color){this.model = model; this.color = color;}
	Car(String model, String color, int maxSpeed){this.model = model; this.color = color; this.maxspeed = maxSpeed;	}
	
	void speedUp() {//�޼ҵ����.
		this.maxspeed += 10;
	}
	public void speedDown() {
		this.maxspeed -= 10;
	}
	public static void main(String[] args) {
		Car c1 = new Car(); //�� classsŸ��
		Car c2 = new Car(" �׷��� "); // ���� classsŸ��
		Car c3 = new Car(" �׷��� " , " ���� ");
		Car c4 = new Car(" �׷��� ", " ���� ", 100);
		
		c1.maxspeed = 120;
		System.out.println("model"+c1.model);
		System.out.println("color"+c1.color);
		System.out.println("max speed"+c1.maxspeed);
		
	
		
		System.out.println("c4 spac....");
		System.out.println("model :"+ c4.model);
		System.out.println("color" + c4.color);
		System.out.println("max speed" + c4.maxspeed);
		
		System.out.println(" ===========================================");
		c1.speedUp();
		System.out.println("C1 max speed :"+ c1.maxspeed);
	
	}
}
