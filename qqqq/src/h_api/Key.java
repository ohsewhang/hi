package h_api;

public class Key {
	public int number; //넘버는 생성자..에서 들어온 기본값으로 셋팅되어있음
	
	public Key(int n) {
		this.number = n;
	}
	@Override               //해시코드 재정의
	public int hashCode() { //이걸 생성하면 원하는 값이 나온다
		return this.number;
	}
	@Override //밑에 꺼가 잘됐는지 확인
	public boolean equals(Object obj) {  //매개변수는 모든 자바변수를 받을 수 있는 오브젝트로 설정
		
		boolean b =false;
		
		if(obj instanceof Key) {  //만일 key로 만들어진 object냐.
		Key k = (Key)obj;//위에 오브젝트타입을 키 타입으로 강제변환할거다.
		if(this.number == k.number) {
			b = true;
		}
		}
		
		return b;
	
	}
	
}
	
