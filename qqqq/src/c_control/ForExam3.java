//1~1000까지의 합계가 5000이 넘는 순간만 출력하시오.
package c_control;                //1.1~1000까지 루핑
 								  //루핑과정 중의 합계 /포문 안의 연산식
public class ForExam3 {		      //
	  ForExam3(){
		  
		      int sum = 0;      //sum선언 .합계.
		      for(int i=1 ; i<=1000 ;i++) { //1~1000까지 루핑.
		    	  sum += i;        //sum에 누적하려면 포문 위에. 그렇지않으면 계속 사라지고 생성 반복
		    	  //   System.out.println(i+","+sum); //1부터 전부 출력                  
			  if(sum>=5000) {
				  System.out.println(i+","+sum); 
				  break;
			  }
			   //type2
		  }   //for( i=1 ; sum<5000 ; i++)  //포문으로 
	    	  //sum += i;         
		     // System.out.println((i-1)+","+sum); 
	  }
}
	

