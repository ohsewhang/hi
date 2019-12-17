package f_inheri;

public class MyCar {
	KumhoTire[] front = new KumhoTire[2]; // fl,fr,b1,br; 
	HankuTire[] back  = new HankuTire[2]; //뒷바퀴 두개
	
	Tire[] tire = new Tire[4];//금호든 한국이든 다 쓸수있게.한곳으로
	
	
	

	public static void main(String[] args) { //얘랑 mycar는 연관없다
		MyCar m = new MyCar(); //생성
		m.tire[0] = new KumhoTire(); //타이어타입은 상관없음
		//m.front[0] = new HankuTire(); // 타입이 다르다. front는 new KunhoTire타입만 
		m.back[0] = new HankuTire(); //얘는 가능.백은 한국임.
		
		m.tire[0].run();//실ㅇ행
		m.back[0].run();//실행
		
		//instance객체가 Hanku Tire로 만들어져있는경우 참 /참일 경우 캐스팅o /펄스 캐스팅x
		Tire h2 = new KumhoTire();
		HankuTire h1 = new HankuTire();
		if(h1 instanceof HankuTire) {
			System.out.println("한국타이어로 만들어짐");
		}else {
			System.out.println("한국타이오로 만들어지지않음");
		}
		
		
		
		
	}

}
