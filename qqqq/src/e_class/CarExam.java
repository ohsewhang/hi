package e_class;

public class CarExam {
	public static void main(String[] args) {
		Car2 car = new Car2();
		car.setGas(5);
		
		if(car.isLeftGas()) {
			System.out.println("���");
			car.run();
		}
		if(car.isLeftGas()) {
			System.out.println("���� �ʿ� ����");
		}else {
			System.out.println("���� �ʿ� ����");
		}
		
	}
}
