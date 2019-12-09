/*1~1000까지의 수중 5배수 이거나 7의 배수만 출력하시오
 *         type2
 * for(int i=5 ; i<=1000;i=i+5){
 *  System.out.println(i+" ");
 *  }
 *  for(int i=7 ; i<=1000; i=i+7){
 *  System.out.println(i+" ");
 *  } 
 */	

package c_control;

public class ForExam4 {
	ForExam4(){ 
		
		for(int i =1;i<=100;i++) { //루핑
			if(i%5==0 ||i%7==0) {  
			System.out.println(i);
		}
	}
	
	
	}
}
