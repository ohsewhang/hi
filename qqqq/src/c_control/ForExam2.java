/*
 * 아래와 같은 방정식이 있다. x값이 1~100사이인 해를 구하여 출력하시오.
 * y = 3x + 1;
 * x=1일때 1.y= 4
 * x가100일때 100, 와이파 100일때 301
 */

package c_control;

public class ForExam2 {
	ForExam2(){
		int y=0;
		int x=0;
	for(x=1;x<100;x++) {
		y = 3 * x + 1;     //첫번째4d는   x에 두번쨰4d는 y에 찍힘.
		System.out.printf("(%4d,%4d) \n", x,y);
	
//	x=2;
//	y = 3 * x + 1;     //첫번째4d는   x에 두번쨰4d는 y에 찍힘.
//	System.out.printf("(%4d,%4d) \n", x,y);
		
	}
  }
}
