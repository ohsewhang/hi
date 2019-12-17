package h_api;

import java.util.Arrays;

public class Member implements Cloneable{  //��׸� ����
  public String id, name,password;	//����κ��� �ʵ�
  public int age;
  public boolean adult;
  public int [] scores;
  public Car car;
  
  public Member(String id, String name, String pssword, int age, boolean adult) {//�����ھȿ� ��������� ��� �Է�
	this.id =id;
	this.name = name;
	this.password = password;
	this.age = age;
	this.adult = adult;
	scores = new int[] {10,20,30};
	car = new Car("����");
	
  }
  public Member gerMember() {
	  Member cloned = null;
	  
	  try {
		cloned = (Member)clone();//���Ÿ������ Ŭ���� ��ȯ.
		
		cloned.scores = Arrays.copyOf(this.scores,this.scores.length); //��������
	           //copyof����ϸ� ���ο� �迭�� �����迭��ŭ �����. �׸��� �����Ѵ�.
		cloned.car = new Car(this.car.model);//ī�� ��𵨸��� ���������� �ڽ��� ������ �ִ� ��� ī�� ���� ����
		
	  } catch (Exception e) {	
	  	e.printStackTrace();
	  }
	  
	  return cloned;
  }
                      
}
