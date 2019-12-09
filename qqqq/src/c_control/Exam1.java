/*
 * 모든 처리는 생성자를 사용하여 해결.
 * 성명,주소,연라처가 문자열로 발생.
 * name,address,phone에 저장.
 * 성적이 정수형으로 발생하여 kor,eng,mat에 저장.
 * 저장된 성적을 사용하여 총점,평균을 tot,avg에 저장.
 * if~else if문으로 평균값을 사용하여 학점을 구해서 문자형 변수 grade에 저장.
 * 처리된 모든 내용을 표준 출렺갖잋에 출력.
 */
package c_control;

public class Exam1 {
	Exam1(){
    String name = "오세왕";
    String address = "종로구";
    String phone = "01047423124";
    int kor = 100, eng = 100, mat = 100;
	int tot = kor+eng+mat;
	int avg = tot/3;
	
    System.out.println("----------");	
	System.out.println("성적처리결과");
	System.out.println("----------");
	System.out.println("성명 :"+name);
	System.out.println("주소 :"+address);
	System.out.println("연락처:"+phone);
	System.out.println("국어 :"+kor);
	System.out.println("영어 :"+eng);
	System.out.println("수학 :"+mat);
    System.out.println("총점 :"+tot);
    System.out.println("평균 :"+avg);
    char grade =' ';
    if(avg>=90) {grade='a';}
	else if(avg>=80) {grade='b';}
	else if(avg>=70) {grade='c';}
	else if(avg>=60) {grade='d';}
	else {grade='f';}
	System.out.println("학점:"+grade);
}


	
	
public static void main(String[] args) {
	new Exam1();
	
	}
}
