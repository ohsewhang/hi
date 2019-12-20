package h_api2;

public class Student{
	
	public int sno;  //학번  //필드
	public String name;//이름
	public int score;//점수
	
	
	Student(int sno){ //생성자
		this.sno = sno; //필드
	}

	Student(int sno, String name, int score){//매개변수를 전달받은
		this.sno =sno;
		this.name = name;
		this.score = score;
	}
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override//오브젝트가 가지고있는 투스트링이라는(자기자신해쉬값)값을 가져온다
	public String toString() {
		return sno + " - " +name+" - "+ score; 
	}
}
