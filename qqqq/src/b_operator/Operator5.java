package b_operator;

public class Operator5 {
  
	int value = 356;
	
	 
	 Operator5(){
	 
     System.out.println(value/100*100);  //10의 자리수는 버리는.
	  
     //(가)세금계산,12,340 ->12,300 10단위는 절삭(12340/100 ->123*100=12300)
     //10단위라면 100으로 나눈 후 100으로 곱합
     //단 단위이면 10으로 나눈 후 10으로 곱함
     int a=12340;
     int q=a/100*100; 
     System.out.println(q);	
	 //(나)이자계산,12,340.5->12,400->10단위 이하의 금액 절상.
     //10단위라면 99.999을 더한 후 100으로 나눈 후 100을 곱함
	int v =12340;
	int r2 =(int)(v+50.999)/100*100;
	System.out.println(r2);
      //12340+99.999=1243999->정수형캐스팅
	
	 //101p다음 연습문제들
	int top =5;
	int bot =10;
	int h = 7;
	double t =(double)(top+bot)*h/2;
	System.out.println(t);
	
	boolean  kk, nn;
	String s,zz;
	int x = 10;
	int y = 5;
	kk = (x>7)&&(y<=5);
	 s = (kk)?"참" : "거짓";
	nn = (x%3==2) || (y%2!=1);
	zz = (nn)?"참" :"거짓";
	System.out.println(s);
	System.out.println(zz);
	} 
 public static void main(String[] args) {
	new Operator5();  
  }
}
