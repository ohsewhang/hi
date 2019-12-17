package g_exception;
                                    //예외 떠넘기기
public class ExceptionExam2 {

	
	public ExceptionExam2() throws Exception { //생성자
		this.method();			//생성자가 throdws Excetuion을 해서 메인으로 감.
	}
	
	
	
	public void method()throws Exception {//메소드 //예외처리 throws Exception으로 던지다.생성자에게
		int su = 100;
		int su2=10;//첨엔0
		System.out.println(su/su2);
		throw new Exception("강제로 예외를 발생시킴");
	
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		try {
			new ExceptionExam2(); //여기서 try catch문 실행.
		} catch (Exception e) {
			System.out.println("프로그램은 실행되지만 0으로 못나눔.");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
			System.out.println("끝");
	}		
}
