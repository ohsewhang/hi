package h_api2;

import java.util.Comparator;
												//Comparator S1,S2배열
public class StudentComp implements Comparator<Student>{//<student>는 student만 적용시킨다는 뜻.<>제너릭?
	char flag = 'n' ; //falg에 탑재된 변수가 n이면 학번순! s이면 성적순으로 정렬하게한다. 기본값n
	
	public StudentComp(char flag) {
		this.flag = flag;	
	}
	@Override					//compare 왼쪽이 작으면 - ,같으면 0 ,크면 +
	public int compare(Student s1, Student s2) {//s1과s2
		int result = 0;
		if(flag == 'n') {
			result = s1.sno - s2.sno; //학번순   왼쪽이 작으면 - ,같으면 0 ,크면 +
		}else {
			result = s1.score - s2.score;//성적순   왼쪽이 작으면 - ,같으면 0 ,크면 +
		}
		return result;
		//return s1.score - s2.score; //score를 sno로 바꾸면 학번순, 
		
	}
}

/*public class StudentComp implements Comparator{       <>제너릭 안쓰면
	
	@Override			
	public int compare(Object o1, Student o2) {     오브젝으로 쓰고 
		Student s1 = (student)o1;    강제변환 써줘야댐
		Student s2 = (student)o2;    강제변환 써줘야댐
		return s1.score - s2.score;  
		
	}
}
*/