/*
 * ��� ó���� �����ڸ� ����Ͽ� �ذ�.
 * ����,�ּ�,����ó�� ���ڿ��� �߻�.
 * name,address,phone�� ����.
 * ������ ���������� �߻��Ͽ� kor,eng,mat�� ����.
 * ����� ������ ����Ͽ� ����,����� tot,avg�� ����.
 * if~else if������ ��հ��� ����Ͽ� ������ ���ؼ� ������ ���� grade�� ����.
 * ó���� ��� ������ ǥ�� ��°��信 ���.
 */
package c_control;

public class Exam1 {
	Exam1(){
    String name = "������";
    String address = "���α�";
    String phone = "01047423124";
    int kor = 100, eng = 100, mat = 100;
	int tot = kor+eng+mat;
	int avg = tot/3;
	
    System.out.println("----------");	
	System.out.println("����ó�����");
	System.out.println("----------");
	System.out.println("���� :"+name);
	System.out.println("�ּ� :"+address);
	System.out.println("����ó:"+phone);
	System.out.println("���� :"+kor);
	System.out.println("���� :"+eng);
	System.out.println("���� :"+mat);
    System.out.println("���� :"+tot);
    System.out.println("��� :"+avg);
    char grade =' ';
    if(avg>=90) {grade='a';}
	else if(avg>=80) {grade='b';}
	else if(avg>=70) {grade='c';}
	else if(avg>=60) {grade='d';}
	else {grade='f';}
	System.out.println("����:"+grade);
}


	
	
public static void main(String[] args) {
	new Exam1();
	
	}
}
