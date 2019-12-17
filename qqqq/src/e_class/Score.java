package e_class;

public class Score { //필드만있는 게터세터는  = value object 라고 하낟.
	private String irum;
	private int kor;
	private int eng;
	private boolean pass;
	private char grade;
	private int[] level;
	private Score score;
	
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	//source getter,setter클릭 //게터와 세터를 수정해버리면 자동성이 사라진다.
	public int[] getLevel() {
		return level;
	}
	public void setLevel(int[] level) {
		this.level = level;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public String getIrum() {//필드명 첫번째가 대문자로 변함.
		return irum;
	}
	public void setIrum(String irum) {
		this.irum = irum;
	}
	public int getKor() {
		if(true) { //보안 
			return kor;			
		}else {
			return-1000;
		}
	}
	public void setKor(int kor) {
		if(kor>=0 && kor<=100) { //보안
			this.kor = kor;			
		}
		
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public boolean isPass() { //boolean 타입은 is
		return pass;
	}
	public void setPass(boolean pass) {
		this.pass = pass;
	}
	
	public static void main(String[] args) {
		
	}
}
