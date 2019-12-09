package c_control;

public class ForExam8 {
	ForExam8(){		
	int a = 0; // 난수 저장용 변수
	int s1 = 0;
	int s10 = 0;
	int s20 = 0;
	int s30 = 0;
	int s40 = 0;
	int s50 = 0;
	int s60 = 0;
	int s70 = 0;
	int s80 = 0;
	int s90 = 0;
		// 자리수 저장용 변수
           for(int i=1; i<=1000; i++){
			a = (int)(Math.random()*100)+1;
			if(a/10 == 0) { // 난수가 1부터 9일 때
				s1++;       // 단자리 개수를 하나 올린다.
			}
			else if(a/10 == 1) { //난수가 10부터 19일 때
				s10++; // 10자리의 개수를 하나 올린다.
			}
			else if(a/10 == 2) {
				s20++;
			}
			else if(a/10 == 3) {
				s30++;
			}
			else if(a/10 == 4) {
				s40++;
			}
			else if(a/10 == 5) {
				s50++;
			}
			else if(a/10 == 6) {
				s60++;
			}
			else if(a/10 == 7) {
				s70++;
			}
			else if(a/10 == 8) {
				s80++;
			}
			else if(a/10 == 9) {
				s90++;
			}
		}
		// 각각 저장된 개수를 출력하는 코드
		System.out.println("단자리 : "+s1);
		System.out.println("10자리 : "+s10);
		System.out.println("20자리 : "+s20);
		System.out.println("30자리 : "+s30);
		System.out.println("40자리 : "+s40);
		System.out.println("50자리 : "+s50);
		System.out.println("60자리 : "+s60);
		System.out.println("70자리 : "+s70);
		System.out.println("80자리 : "+s80);
		System.out.println("90자리 : "+s90);
	}
}