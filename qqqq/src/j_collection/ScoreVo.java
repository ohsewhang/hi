/*
 * 
1.���� �����ӿ� �޴� �߰�<MemberMain>
  �������� - �Է�,��ȸ

2. JInternalFram= ScoreInput(�Է�),ScoreSearch(��ȸ)

3. ScoreVo
    ���ڿ� : �й�,����,��������
    ������ : �г�, ����,����,����,����,���(double)
    - �����ڸ� ���� �ʵ尪 ����
    - setter/getter �߰�
    - �й��� ������ ������ ��ü(hashCode(),equals()������)

4. ScoreDao(���������� �����ڵ�)
    - insert(ScoreVo vo)
    - update(String sno,ScoreVo vo)
    - delete(String sno)
    - list(String findStr)
 */
package j_collection;

public class ScoreVo {
 public	String sno;
 public String mName;
 public String exam;
 public int grade, kor,eng,mat,tot;
 public double avg;
 
 
 
 public void ScoreVo() {} //������ �Ű��������°� �ʼ������� �����ϴ°�����.
 public ScoreVo(String sno,String mName, String exam, int grade, int kor, int eng, int mat) {
	 
	 this.sno = sno;
	 this.mName = mName;
	 this.exam = exam;
	 this.grade = grade;
	 this.kor = kor; 
	 this.eng = eng;
	 this.mat  = mat;
	 this.tot= (kor+eng+mat);
	 this.avg = (double)tot/3;
	 
	 
	 
	 
 }
@Override
public boolean equals(Object obj) {	
	boolean r = false;
	if(obj instanceof ScoreVo) { //obj�� �ٸ� Ŭ�������� scorevo�� ������ �޽���. �´°�ü�� �Դ��� Ȯ���ؼ� ������ �ؿ� ĳ����.
		ScoreVo s = (ScoreVo)obj; //�ش� obj�� scorevoŸ���̸� ���ض�.
		if(getSno().equals(s.getSno())) r  =true; //�����Ŷ�� Ʈ��� �ؼ� ���� ����.
	}
	
	return super.equals(obj);
}
@Override
public int hashCode() {
	return sno.hashCode();
}
@Override
public String toString() {	
	return super.toString();
}




public String getSno() {
	return sno;
}
public void setSno(String sno) {
	this.sno = sno;
}
public String getmName() {
	return mName;
}
public void setmName(String mName) {
	this.mName = mName;
}
public String getExam() {
	return exam;
}
public void setExam(String exam) {
	this.exam = exam;
}
public int getGrade() {
	return grade;
}
public void setGrade(int grade) {
	this.grade = grade;
}
public int getKor() {
	return kor;
}
public void setKor(int kor) {
	this.kor = kor;
}
public int getEng() {
	return eng;
}
public void setEng(int eng) {
	this.eng = eng;
}
public int getMat() {
	return mat;
}
public void setMat(int mat) {
	this.mat = mat;
}
public int getTot() {
	return tot;
}
public void setTot(int tot) {
	this.tot = tot;
}
public double getAvg() {
	return avg;
}
public void setAvg(double avg) {
	this.avg = avg;
}
 
 
 
 
 
 
}
