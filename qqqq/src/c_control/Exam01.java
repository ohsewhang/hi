package c_control;

public class Exam01 {
   Exam01(){
	String name = "ȫ�浿";
	String address ="����";
	String phone ="2124242";
	
	int kor = 30;
	int eng = 30;
	int mat = 30;
	double tot = kor+eng+mat; //�ڵ�����ȯ
	double avg = tot/3;
	
	char grade =' '; //if~else��.
	if(avg>=90) {grade = 'a';}
	else if(avg>=80) {grade = 'b';}//if(avg>=80 && avg<90)
	else if(avg>=70) {grade = 'c';}
	else if(avg>=60) {grade = 'd';}
	else {grade = 'f';}
	
	String msg = "����:"+name;  //�̷������� ����� �Ѵ�.
	msg +="\n�ּ�:"+address;
	msg +="\n����ó:"+phone;
	msg +="\n����:"+kor;
	msg +="\n����:"+eng;
	msg +="\n����:"+mat;
	msg +="\n����:"+tot;
	msg +="\n���:"+avg;
	msg +="\n����:"+grade;
	System.out.println(msg); //Main�̶�� Ŭ���� ����
	                        //������ ���Һд��� �� �� �����ϱ�����.
   }
  
}
