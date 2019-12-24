/*
 * 
1.메인 프레임에 메뉴 추가<MemberMain>
  성적관리 - 입력,조회

2. JInternalFram= ScoreInput(입력),ScoreSearch(조회)

3. ScoreVo
    문자열 : 학번,성명,시험종류
    숫자형 : 학년, 국어,영어,수학,총점,평균(double)
    - 생성자를 통한 필드값 설정
    - setter/getter 추가
    - 학번이 같으면 동일한 객체(hashCode(),equals()재정의)

4. ScoreDao(성적관리를 위한코드)
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
 
 
 
 public void ScoreVo() {} //생성자 매개변수없는거 필수적으로 생성하는게좋다.
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
	if(obj instanceof ScoreVo) { //obj가 다른 클래스에서 scorevo가 들어오면 펄스로. 맞는객체가 왔는지 확인해서 맞으면 밑에 캐스팅.
		ScoreVo s = (ScoreVo)obj; //해당 obj가 scorevo타입이면 비교해라.
		if(getSno().equals(s.getSno())) r  =true; //같은거라면 트루로 해서 값을 리턴.
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
