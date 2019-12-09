package e_class;

public class Static {
	static int v1 = 5000; //정적형 메소드(공용자원)모든 객체가 하나의 값만 사용. 초기화는 1회만 된다. / 클래스.멤버 명 or 객체명.멤버로 출력해도 된다.
		   int v2 = 5000; //인스턴스형 객체에 포함되어있는 값.(멤버)
	
	
	
	
	
	public static void main(String[] args) {
		Static s1 = new Static();
		s1.v1 = 1000;
		s1.v2 = 1000;//s1이 가지고 있는 v2
		
		Static s2 = new Static();
		System.out.println(s2.v1); //1000 초기화가 한번 되고 초기화 되지않음.
		System.out.println(Static.v1);//위에랑 같음.
		System.out.println(s2.v2); //5000 얘는 초기화가 된것임.
	}

}
