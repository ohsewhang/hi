package e_class;

public class ArrayParam2 {
                                //student클래스를 쓸거다
	void input(int s) {
	//TODO
		
		
		
		
	}
	
	
				//여기대입	//ap2.input(new Student());를 스튜던트s에 대입.근데 이러케 직접 쓰는건 x
	void input(Student s) {     // 메소드    ,기존에 있는걸 불러옴
		s.prn();				//스튜던트의 파라미터를 만들어서 인풋에 
	}
	//매개변수 형이 Car인 메소드
	 void input(Car c){ // new Car();를 만들거나 new Car("abc");거나 new Car("abc","노랑")이거나 new Car("abc","노랑","300);input중복선언가능 이유은 타입이 다름. 오버로딩(중복가능)
		System.out.println(c.model); 
		System.out.println(c.color);                                //모른다면 일단 출력해본다.
		System.out.println(c.maxspeed);
	 	
	 }
	
	 
	
	
	
	
	public static void main(String[] args) {
		
		ArrayParam2 ap2 = new ArrayParam2();
		Car ca =new Car();
		ap2.input(ca);
		Student std = new Student();
		ap2.input(std);	//이렇게 쓰면 위의 student s (s.prn)실행.
		
		System.out.println("--------------");
		Car c1 = new Car();
		ap2.input(c1);
		Car c2 = new Car("볼보","빨강",400);
		ap2.input(c2);
		
		
	}
}
