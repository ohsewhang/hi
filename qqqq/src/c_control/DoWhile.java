package c_control;

import java.util.Scanner;
public class DoWhile {
	DoWhile(){
			System.out.println("q�� ������ ����");
			Scanner scanner = new Scanner(System.in);
			String inputString = null;
			
		do {
		  System.out.println(">");
		  inputString = scanner.nextLine();//Ű����� �Է��ϴ� ��
		  System.out.println(inputString);
		}while(!inputString.equals("q"));//!�� �տ� ������ q�� �ƴѰ��� ��� �ݺ�����
		 								 //!�� ������ q�� �ηΰ��� �ݺ�����
		System.out.println("���α׷�����");
	}//dowhile�� ��

}//class��

