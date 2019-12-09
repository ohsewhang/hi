package c_control;

public class Exam01 {
   Exam01(){
	String name = "홍길동";
	String address ="종로";
	String phone ="2124242";
	
	int kor = 30;
	int eng = 30;
	int mat = 30;
	double tot = kor+eng+mat; //자동형변환
	double avg = tot/3;
	
	char grade =' '; //if~else문.
	if(avg>=90) {grade = 'a';}
	else if(avg>=80) {grade = 'b';}//if(avg>=80 && avg<90)
	else if(avg>=70) {grade = 'c';}
	else if(avg>=60) {grade = 'd';}
	else {grade = 'f';}
	
	String msg = "성명:"+name;  //이런식으로 출력을 한다.
	msg +="\n주소:"+address;
	msg +="\n연락처:"+phone;
	msg +="\n국어:"+kor;
	msg +="\n영어:"+eng;
	msg +="\n수학:"+mat;
	msg +="\n총점:"+tot;
	msg +="\n평균:"+avg;
	msg +="\n학점:"+grade;
	System.out.println(msg); //Main이라는 클래스 생성
	                        //이유는 역할분담을 한 후 통합하기위해.
   }
  
}
