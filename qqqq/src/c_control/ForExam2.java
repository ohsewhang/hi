/*
 * �Ʒ��� ���� �������� �ִ�. x���� 1~100������ �ظ� ���Ͽ� ����Ͻÿ�.
 * y = 3x + 1;
 * x=1�϶� 1.y= 4
 * x��100�϶� 100, ������ 100�϶� 301
 */

package c_control;

public class ForExam2 {
	ForExam2(){
		int y=0;
		int x=0;
	for(x=1;x<100;x++) {
		y = 3 * x + 1;     //ù��°4d��   x�� �ι���4d�� y�� ����.
		System.out.printf("(%4d,%4d) \n", x,y);
	
//	x=2;
//	y = 3 * x + 1;     //ù��°4d��   x�� �ι���4d�� y�� ����.
//	System.out.printf("(%4d,%4d) \n", x,y);
		
	}
  }
}
