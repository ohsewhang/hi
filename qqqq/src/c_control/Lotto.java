package c_control;

public class Lotto {
 private int n[] = new int[6];//�ʵ�(����) ����.�ʵ����� �ڵ� �ʱ�ȭ.private��������!![]�迭�������.new�� ����� ���� ������.
 int count = 0;//count�� Ŭ������ �ø��� //����n�� pro,prn������ ��밡��. �׷��� ��ȯ�� x
 void process() {          //process�޼ҵ�-1.�Ұ�ȣ 2.��ȯ���� �ݵ�� �־���� ���� �� void.
  boolean b = false;//�ߺ����� �ʾҴٶ�� ����.
  this.n[count] = (int)(Math.random()*45)+1;//random�� void static random�̶� static�� ������ �ʿ䰡 ����.
  for(int i=0; i<count ; i++) {
	if(n[i]==n[count]){                      //����staticvoidmainã��
     b = true;                              //������ã��.������ main����ӽ�	                             
	}                                       //
  }
  
  if( !b ) {              //�ߺ������ʾ����� ī��Ʈ�� ����.
	  count++; 
	  this.prn();
	  
  }
 }   //this ��� �Լ��� ��Ī�Ҷ��� this�� ����. //[count]��������.
  
 void prn() {  // ���
	 System.out.println(n[count-1] );     //n,pro,prn �ν㽺�� ->��ü�� �������Ѵ�.
 }                          //count-1���ϸ� process��������µǱ⿡ 5��ī��Ʈ�ҋ�6���� �ʰ��� �׷���-1)
          //
 public static void main(String[] args) {
 Lotto k = new Lotto(); //��ü����.��ü�� �ּҸ� �˱����� ����k�� �º���.k=lotto����.
   int a = 6; //����.a=6���ߺ������ʴ°����� ����.
 //  for(a=0;a<6;a++) {//for��(;;)�ݺ�Ƚ�� ����.(�����)���� ù��°�����̱⿡for���ȿ����� ��밡��
   for(;k.count<a;) { //count�� 5�����ϸ� 6���� ����.���� count++�� ������ ��⿡ �յڿ� �Ƚᵵ �ȴ�. 
   k.process(); //k�� static�������� �����ż� static��.
	                       //;��������� ��������;true�� ������ ���ѹݺ�.������� ������ ���ش�
    //mian�� ����ȭ �����ش�. a(0~6)�� ���� ����ǰ� �ϱ�����   
   }                      //a==0�� ����� ������ 0,1���ѹݺ� ����,�ٸ��� ������ a<6�̸� 6���ݺ�
    /* k.process();
     k.prn();
     k.process();
     k.prn();
     k.process();
     k.prn();
     k.process();
     k.prn();
     k.process();
     k.prn();
     k.process();
     k.prn();
    */
 }
}
