package c_control;

public class ForExam {
  ForExam(){
	  int sum = 0;
	  for(int i=0;i<=100;i=i+i) {//1~100까지 i=i+2 홀수만 int i를  0이나2로하면 짝수
		  sum = sum + i; //sum+=i
		  System.out.println(i+"까지의 합:"+sum);     //for문 안에출력 과정까지 본다.
	  }
	      System.out.println(sum);  //for문밖에출력 최종 결과치만 본다.
  }
}
