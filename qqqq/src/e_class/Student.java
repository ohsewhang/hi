/*
 * �Ű������� ���� �����ڷ� ��ü�� �����ϸ� �̸�. �ּ� . ����ó��
 * "ȫ�浿",���α�,010-1111-1111, ���� �ʵ带 �ʱ�ȭ �ϼ�(irum ,address,phone)
 * �̸��� �Ķ���ͷ� �����ϸ� ���޵� �̸��� �ʵ忡 ����Ǵ� �����ڸ� �ߺ� ���� �Ͻÿ�
 * �̸�,�ּ�,����ó��  �Ķ���͸� �����ϸ� ��� ���� �ʵ忡 �����ϴ� �����ڸ� �ߺ� ���� �Ͻÿ�.
 * main()�� �ۼ��Ͽ� ���� �䱸������ ó���Ǵ����� �׽�Ʈ �Ͻÿ�.
 */
package e_class;
                                         //��3���� �� ,�ٿ���
public class Student {
	String irum;
	String address;
	String phone;
	
	Student(){ //�������� ����: �ʵ��� �ʱ�ȭ  (�Ű������� ���� ������.2.
		this.irum = "ȫ�浿";            //�� ������ prn�� arrayparam2��.
		this.address = "���α�";
		this.phone = "010-1111-1111";		
	} //3.�����ڸ� �ߺ�����.�Ű������� ������ �ٸ��ų� �ٲ�ߴ�
	Student(String n){
		this.irum = n;//3��° �䱸����
		
	}
	//4��..�䱸���� 
	Student(String n, String a, String p){
		this.irum =n;
		this.address = a;
		this.phone = p;
		
	}
	void prn() {
		System.out.println("����: " +this.irum);  //ȫ�浿 ���α� 010.....
		System.out.println("�ּ�: "+ this.address);
		System.out.println("����ó :" + this.phone);
		System.out.println("========================================");	
		//�ؿ��� �ٸ��� s1�� ���⿡ this�� ��´�
	}

	void prn1() {
		System.out.println("����: " +this.irum);
		System.out.println("�ּ�: "+ this.address);
		System.out.println("����ó :" + this.phone);
		System.out.println("========================================");
		}
	void prn2() {
		System.out.println("����: " +this.irum);
		System.out.println("�ּ�: "+ this.address);
		System.out.println("����ó :" + this.phone);
		System.out.println("========================================");	
	}
	
	
	//�׽�Ʈ-------------------
	public static void main(String[] args) {
		Student s1 = new Student();
	//	System.out.println("����: " +s1.irum);       Ŭ�����ȿ� �־�д�. �ѹ濡 �̱�����
	//	System.out.println("�ּ�: "+ s1.address);
	//	System.out.println("����ó :" + s1.phone);
		s1.prn();
	//System.out.println("========================================");	
		Student s2 = new Student("�Ź�");
		//System.out.println("����:"+s2.irum);
		//System.out.println("�ּ�:"+s2.address);
		//System.out.println("����ó:"+s2.phone);
		s2.prn1();
	//System.out.println("========================================");	
		Student s3 = new Student("������","����","010-23-211");
		//System.out.println("����:"+s3.irum);
		//System.out.println("�ּ�:"+s3.address);
		//System.out.println("����ó:"+s3.phone);
		s3.prn2();
	}//main��

}//class��
