package c_control;

import java.util.Scanner;
public class DoWhile {
	DoWhile(){
			System.out.println("q를 누르면 종료");
			Scanner scanner = new Scanner(System.in);
			String inputString = null;
			
		do {
		  System.out.println(">");
		  inputString = scanner.nextLine();//키보드로 입력하는 값
		  System.out.println(inputString);
		}while(!inputString.equals("q"));//!이 앞에 붙으면 q가 아닌것은 계속 반복실행
		 								 //!이 없으면 q만 두로가서 반복실행
		System.out.println("프로그램종료");
	}//dowhile문 끝

}//class끝

