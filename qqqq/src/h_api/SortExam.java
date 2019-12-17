package h_api;

import java.util.Arrays;
import java.util.Objects;

import h_api2.Student;
import h_api2.StudentComp;

public class SortExam {

	//숫자형 배열값을 오름차순으로 전환
	public void numberSort() {//<-이걸 메인에서 불러준다.
		int[] n = {1,4,2,3,6,8,11,5,24,22,15,12,1};
		
		System.out.println("정렬전");
		System.out.println(Arrays.toString(n));
		int temp = 0; //for문이 두개피룡  
		for(int i = 0 ; i<n.length-1 ; i++) { //-1한 이유는 24.22.15까지갔는데 마지막 15는 비교대상이없기에//첫번째자리1이 기준.
			for(int j = i+1 ; j<n.length ; j++) {//기준다음이라 하나가 크다.//대상
				if(n[i]>n[j]){ //swap로직.  //이 부등호를 반대로 하면 내림차순
					temp = n[i]; //대피소에 n의 i번째를 저장
					n[i] = n[j]; //자리를 둘이 바꿔준다.
					n[j] = temp; //대피소값을 비교후 바꾸는.
				}//if
			}//for j			
		}//for i
		System.out.println("정렬후");
		System.out.println(Arrays.toString(n));
	}
	
	//문자형열 배열값을 오름차순으로 전환// equals같다안같다. compareto대소관계및 같다안같다.
	public void strSort() {	
		String[] n = new String[]  { 
				"11","zzzzzzzz","zz","가나다","멍멍이","똥개"};
			//기준을 세운다 기준은 멍멍이까지만 한다 똥개랑 마지막으로 비교되기에
		String temp = "";//기준값이 대피해야할 임시변수
		for(int i = 0 ; i<n.length-1 ; i++) {//기준
			for(int j = i+1;j<n.length ; j++) {//비교대상 기준의 다음칸.
				if(n[i].compareTo(n[j]) > 0) { // ni> nj보다 크면 양수값 / ni <nj 음수/ 같으면 0//여기선 0보다크면이필요하다/swap
					temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}//if
			
		}//j
		}//i	
		System.out.println(Arrays.toString(n));
		
		
	}	
	public void objSort() {//학번.성명.성적 순으로 골고루 만들어본다.
		Student[]n = new Student[] { //student배열에 다섯개가 들어가있음.
				new Student(10,"hong",60),//학번 순으로 정렬해서 찍었다면 김홍박이홍
				new Student(1,"kim",90),  //2번째 성적순
				new Student(3,"park",40),
				new Student(8,"lee",90),
				new Student(2,"hong",66)
		};	
		//System.out.println(Arrays.toString(n));
		Student temp =null;//student 타입 대피소
		for(int i = 0 ; i<n.length-1 ; i++) {//기준
			for(int j = i+1 ; j<n.length ; j++) {//대상
				int result = Objects.compare(n[i], n[j], new StudentComp());
				if(result>0) {//swap
					temp = n[i];//대피
					n[i] = n[j];
					n[j] = temp;
				}//if
			}//j
		}//i
		for(int i=0 ; i < n.length ; i++) {
			System.out.println(n[i]);//학번순으로 출력돼.
		}
	}
	
	
	
	public static void main(String[] args) {
		SortExam se = new SortExam();
		//se.numberSort();
		//se.strSort();
		se.objSort();
		
	}

}
