package h_api;

import java.util.Arrays;

public class Member implements Cloneable{  //얘네를 복사
  public String id, name,password;	//여기부분은 필드
  public int age;
  public boolean adult;
  public int [] scores;
  public Car car;
  
  public Member(String id, String name, String pssword, int age, boolean adult) {//생성자안에 멤버변수에 모두 입력
	this.id =id;
	this.name = name;
	this.password = password;
	this.age = age;
	this.adult = adult;
	scores = new int[] {10,20,30};
	car = new Car("벤츠");
	
  }
  public Member gerMember() {
	  Member cloned = null;
	  
	  try {
		cloned = (Member)clone();//멤버타입으로 클론을 변환.
		
		cloned.scores = Arrays.copyOf(this.scores,this.scores.length); //깊은복제
	           //copyof사용하면 새로운 배열을 원본배열만큼 만든다. 그리고 리턴한다.
		cloned.car = new Car(this.car.model);//카의 어떤모델명이 들어간지모르지만 자신이 가지고 있는 멤버 카는 벤츠 원본
		
	  } catch (Exception e) {	
	  	e.printStackTrace();
	  }
	  
	  return cloned;
  }
                      
}
