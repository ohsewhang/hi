package e_class;

public class CarExam {
	public static void main(String[] args) {
		Car2 car = new Car2();
		car.setGas(5);
		
		if(car.isLeftGas()) {
			System.out.println("출발");
			car.run();
		}
		if(car.isLeftGas()) {
			System.out.println("주입 필요 없음");
		}else {
			System.out.println("주입 필요 있음");
		}
		
	}
}
