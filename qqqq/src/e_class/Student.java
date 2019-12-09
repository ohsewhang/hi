/*
 * 매개변수가 없는 생성자로 객체를 생성하면 이름. 주소 . 연락처르
 * "홍길동",종로구,010-1111-1111, 으로 필드를 초기화 하쇼(irum ,address,phone)
 * 이름을 파라메터로 전달하면 전달된 이름만 필드에 적용되는 생성자를 중복 선언 하시오
 * 이름,주소,연락처를  파라미터를 전달하면 모든 값을 필드에 적용하는 생성자를 중복 선언 하시오.
 * main()를 작성하여 위의 요구조건이 처리되는지를 테스트 하시오.
 */
package e_class;
                                         //총3개의 형 ,다원형
public class Student {
	String irum;
	String address;
	String phone;
	
	Student(){ //생성자의 역할: 필드의 초기화  (매개변수가 없는 생성자.2.
		this.irum = "홍길동";            //이 내용의 prn이 arrayparam2에.
		this.address = "종로구";
		this.phone = "010-1111-1111";		
	} //3.생성자를 중복선언.매개변수의 순서가 다르거나 바꿔야댐
	Student(String n){
		this.irum = n;//3번째 요구조건
		
	}
	//4번..요구조건 
	Student(String n, String a, String p){
		this.irum =n;
		this.address = a;
		this.phone = p;
		
	}
	void prn() {
		System.out.println("성명: " +this.irum);  //홍길동 종로구 010.....
		System.out.println("주소: "+ this.address);
		System.out.println("연락처 :" + this.phone);
		System.out.println("========================================");	
		//밑에와 다르게 s1이 없기에 this를 찍는다
	}

	void prn1() {
		System.out.println("성명: " +this.irum);
		System.out.println("주소: "+ this.address);
		System.out.println("연락처 :" + this.phone);
		System.out.println("========================================");
		}
	void prn2() {
		System.out.println("성명: " +this.irum);
		System.out.println("주소: "+ this.address);
		System.out.println("연락처 :" + this.phone);
		System.out.println("========================================");	
	}
	
	
	//테스트-------------------
	public static void main(String[] args) {
		Student s1 = new Student();
	//	System.out.println("성명: " +s1.irum);       클래스안에 넣어둔다. 한방에 뽑기위해
	//	System.out.println("주소: "+ s1.address);
	//	System.out.println("연락처 :" + s1.phone);
		s1.prn();
	//System.out.println("========================================");	
		Student s2 = new Student("매미");
		//System.out.println("성명:"+s2.irum);
		//System.out.println("주소:"+s2.address);
		//System.out.println("연락처:"+s2.phone);
		s2.prn1();
	//System.out.println("========================================");	
		Student s3 = new Student("춘향이","남원","010-23-211");
		//System.out.println("성명:"+s3.irum);
		//System.out.println("주소:"+s3.address);
		//System.out.println("연락처:"+s3.phone);
		s3.prn2();
	}//main끝

}//class끝
