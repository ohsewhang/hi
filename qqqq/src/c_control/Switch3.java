/*
 *정수형 성적이 score에 저장되어있다. score를 사용하여 학점을 구하되
 * switch문을 사용하여 처리하시오.
 */


package c_control;

public class Switch3 {
	Switch3(){
		int score = 80;
		char c =' ';
		
		switch(score/10) {
		case 10:		
		case 9:			
			c='A';break;
		case 8:			
			c='B';break;
		case 7:			
			c='C';break;	
		case 6:			
			c='D';break;
		default :
			c='F'; break;
			 
		}
		System.out.println("학점:"+c);
		System.out.println("성적:"+score);
		
		//switch-->if
	if(score>=90) c='A';
	else if(score>=80) c='B';
	else if(score>=70) c='C';
	else if(score>=60) c='D';
	else               c='F';
	System.out.println(c);
	System.out.println(score);
	
  
		
	}




} 
