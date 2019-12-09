package d_array;

import java.util.Scanner; //패키지 밑에.

public class ArrayExam4 {// 여기가 필드영역.여기서 변수 선언하면 밑에서 전부 사용할 수 있다./필드를 중간중간생성해서 사용하진않음.필드는 맨 첫번째 영역에
							// 쓴다(멤버형변수)
	String[] n = new String[10]; // 문자형 배열변수 /학생명
	int[][] s = new int[10][2]; // 10행.2열..? /성적저장.
	int count = 0; // 배열에 입력된 자료의 개수.

	// 무한 루프를 돌면서 메뉴를 출력
	ArrayExam4() {
		Scanner scanner = new Scanner(System.in);// 메뉴에 값을 입력할 스캐너를 생성
		boolean run = true;
		// 샘플용 데이터를 배열에 저장
		n[0] ="kim";
		n[1] ="hong";
		n[2] ="park";
		n[3] = "lee";
		s[0][0] = 90 ; s[0][1] = 80; //김씨
		s[1][0] = 70 ; s[1][1] = 30; 
		s[2][0] = 60 ; s[2][1] = 20;
		s[3][0] = 50 ; s[3][1] = 10;
		
		count = 4; //4번 반복한다.
		
		while (run) { // 조건(트루)가 맞다면 무한반복.
			System.out.println("------------------------------");
			System.out.println("1.입력 | 2.수정 | 3.조회및 출력  4.종료");
			System.out.println("------------------------------");
			System.out.println("메뉴 선택 :");
			int menu = scanner.nextInt();// 내가입력하는게 switch문으로/ if로 한다면
			switch (menu) { // if(menu==1) input()
			case 1: // else if(menu==2) modify()
				this.input(); // 1 호출 // else if(meni==3) search()
				break;
			case 2:
				this.modify();// 2
				break;
			case 3:
				this.search();// 3
				break;
			case 4:
				run = false;
				break;
			} // swich끝
		} // while끝
		System.out.println("프로그램이 종료되었습니다.");// case4에서 false가 되면 while문을 끝내고 나가기에 while문 끝자리에 case4의 출력할 내용을 쓴다.
	}// 생성자 끝

	// 학생의 성적 정보를 배열에 입력 //생성자에서 입력메소드 호출하면 인풋으로 갔다가 다시 생성자쪽으로 가는 걸 스택구조.
	public void input() {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		int kor = 0;
		int eng = 0;
		int tot = 0;
		double avg = 0;

		System.out.print("성명 : ");// 이름을 입력 받기 위해서
		name = scanner.nextLine(); //키보드입력
		System.out.print("국어 : ");
		kor = scanner.nextInt();
		System.out.print("영어 : ");
		eng = scanner.nextInt();

		tot = kor + eng;
		avg = (double) tot / 2;

		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
		n[count] = name;
		s[count][0] = kor;
		s[count][1] = eng;
		count++;

	}// input끝

	// 학생의 성정 정보를 수정
	// 1.수정할 학생명을 입력받아 검색을 한다.수정학생판단
	// 2.검색된 정보를 표시	
	// 3.관련데이터 수정
	// 4.수정된 데이터값  배열정보 수정
	public void modify() {
		Scanner scanner = new Scanner(System.in);
		String findName = "";
		System.out.print("검색할 학생명은?");
		findName = scanner.next();
	for(int i = 0 ; i<count ; i++){ //0은 배열 처음인데 그걸 전부 i로 .. 
		if(n[i].equals(findName)) {
		System.out.println("성명:"+n[i]);
		System.out.println("국어:"+s[i][0]);
		System.out.println("영어:"+s[i][1]);
		
		
		
		System.out.println("성적을 수정해라");
		System.out.print("국어:");
		s[i][0] = scanner.nextInt();
		
		System.out.print("영어:");
		s[i][1] = scanner.nextInt();
		}//if끝
		
	 }//포문끝
	
	}// modify끝

	// 학생의 성적 정보를 조회 및 출력\
	public void search() { //배열에 있는 값을 전부 출력   . 
		Scanner scanner = new Scanner(System.in);
		System.out.print("검색할 성명은?");
		String findName = scanner.nextLine(); //키보드입력
		int tot = 0;
		double avg = 0;
		
		for(int i = 0 ; i<count ; i++) {
		  if(n[i].equals(findName)) { //내가 출력하고 싶은 이름.가변장치를 쓰면 아무나 이름을 써도 검색된다. 스캐너를 생성하면 댐.if(n[i].equals(findName)|| findName.equals("")){ 라고 쓰면 3누르고 엔터치면 전부 나옴
			  //TODO (총점,평균을 계산하여 출력) 
			  
			 tot = s[i][0] +s[i][1];              //왜 s?
			 avg = (double)tot/2;
			 System.out.println("계산된 총점:"+ tot);
			 System.out.println("계산된 평균:"+avg);
			 
			System.out.print(n[i]+"  ");
			System.out.print(s[i][0] +" ");
			System.out.print(s[i][1]+" ");
			System.out.print(tot+" "); 
			System.out.printf("%5.1f",avg); //소수점을 할땐 printf %5.1다섯자리의 한자리만 출력
			System.out.println();
			
			
		  }//if문 끝.
	}//포 문 끝
		

	}// search끝

	public static void main(String[] args) {
		new ArrayExam4();

	}// main 끝
}// class끝
