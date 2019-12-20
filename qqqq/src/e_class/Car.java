package e_class;

public class Car {
	String model = "치킨";  //여기있는게 arryparm2 car에 찍힘
	String color =  "검정";
	int maxspeed = 0;
	
	Car(){  }                                               //4가지 생성자 만든다.
	Car(String model){this.model = model;}									//필드는  메소드 영역만 아니면댐; 클래스안에서 어디든 사용가능.CLASS바로 밑이 가장 좋다.	
	Car(String model, String color){this.model = model; this.color = color;}
	Car(String model, String color, int maxSpeed){this.model = model; this.color = color; this.maxspeed = maxSpeed;	}
	
	void speedUp() {//메소드생성.
		this.maxspeed += 10;
	}
	public void speedDown() {
		this.maxspeed -= 10;
	}
	public static void main(String[] args) {
		Car c1 = new Car(); //앞 classs타입
		Car c2 = new Car(" 그렌저 "); // 앞은 classs타입
		Car c3 = new Car(" 그렌저 " , " 빨강 ");
		Car c4 = new Car(" 그렌저 ", " 빨강 ", 100);
		
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
