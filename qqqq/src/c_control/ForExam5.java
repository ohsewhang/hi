//1~1000사이의 수중 소수만을 구하여 출력하시오(소수:1과 자신이외의 자연수로 나누어 떨어지지 않는 자연수)
package c_control;
 
public class ForExam5 {
	ForExam5(){  //1.3.5.6.11.13.17...소수 /짝수4.6.8....소수x) //n  n/2	
		for(int i = 1; i<=1000 ; i++) {
		    boolean b = true; //i가 소수
			for(int j=2 ; j < i ; j++) {
			  if(i%j==0) {
				  b = false;//25라면 5로 나눠져서 b는 펄스
				  break; //펄스면 빠져나간다.
				  //i가 25라면 j는 2~24까지 반복 25/234 5
			  }
		  } 
			if(b) {  //펄스라서 출력안하고 다시 포문으로 반복.
			System.out.println(i);  //포문에서 조건을 제시하기에 여기서 실행.
			}
			
		
		
		
		
		
		
		
		
		
		
		
	}
}
}