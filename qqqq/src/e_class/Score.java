package e_class;

public class Score { //�ʵ常�ִ� ���ͼ��ʹ�  = value object ��� �ϳ�.
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
	//source getter,setterŬ�� //���Ϳ� ���͸� �����ع����� �ڵ����� �������.
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
	
	public String getIrum() {//�ʵ�� ù��°�� �빮�ڷ� ����.
		return irum;
	}
	public void setIrum(String irum) {
		this.irum = irum;
	}
	public int getKor() {
		if(true) { //���� 
			return kor;			
		}else {
			return-1000;
		}
	}
	public void setKor(int kor) {
		if(kor>=0 && kor<=100) { //����
			this.kor = kor;			
		}
		
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public boolean isPass() { //boolean Ÿ���� is
		return pass;
	}
	public void setPass(boolean pass) {
		this.pass = pass;
	}
	
	public static void main(String[] args) {
		
	}
}
