package f_inheri;

public class HankuTire implements Tire {

	@Override
	public void run() {//기존에 있던 Tire에서 런 메소드를 재정의함.(추상메소드에 있는 메소드들은 반드시 재정의 해야함.)
		System.out.println("한국타이어가 굴러굴러");
		
	}

}
