package g_exception;

public class ExceptionExam {

	public static void main(String[] args) {
		//NullPointerException
		String data = null; //스트링이란 객체가 생성되기 전   1.  String data = null;
		//String data = ""; 이건 객체가 생성된 것. 			2. System.out.println(data.toString());<<에러 //data가 null이기 때문에 찾아서 쓸 문자가 없기에
		try { //밑에 것이 오류라면 트라이 캐치 절
		System.out.println(data.toString());           //data란 객체에 사용할수있는 메소드를 쓴것.//data가 null이기 때문에 찾아서 쓸 문자가 없기에
		System.out.println("오류가 없는 경우 실행됨.");
		}catch(NullPointerException ex) {//NullPointerException을 모를 경우 Exception ex 만 써도 된다. 캐치절을 나열할때는 범위가 적은곳부터 순서대로 쓴다.좁은 것을 위에 놓는다. 
			System.out.println("문자열 변수 data에 값이 없음");
		}finally {
			System.out.println("오류 발생과 상관없이 무조건 실행");
		}
		//ArrayIndexOutofBoundsException(첨자오류)
		int[] s = {1,2,3};//첨자 0,1,2
		try {
		for(int i = 0 ; i<3 ; i++) {
			System.out.println(s[i]);
			} //이것은 i<=3이 문제 저건 4개다. =을 빼야 3개가 된다.		
		}catch(Exception ex) {
			ex.printStackTrace();//오류코드 출력
			
		}
			
		
		//System.out.println(s[3);//작성된것은 [3]
		
		//NumberFormatException
		try {
		data = "123";//공백에러
		int su = Integer.parseInt(data);//o
		}catch(NumberFormatException ex){		//data = "123a"; //문자열a가 있기에.
		 ex.printStackTrace();					//int su2 = Integer.parseInt(data);//x
		}finally {
			System.out.println("다음처리가진행");
		}
		//ClassCastException(형변환에 대한 오류)
	try {
		Car myCar = new Car(); //생성
		sportsCar c = (sportsCar)myCar; //부모를 만들어서 자식을 대입할수없다
	}catch(Exception ex) {
		System.out.println("형변환오류발생");
	}finally {
		System.out.println("끝");
	}
		//sportsCar q = new sportsCar();
		//Car z = (Car)q;
		
	}

}



