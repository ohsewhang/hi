package h_api2;

import java.util.Comparator;
												//Comparator S1,S2�迭
public class StudentComp implements Comparator<Student>{//<student>�� student�� �����Ų�ٴ� ��.<>���ʸ�?
	char flag = 'n' ; //falg�� ž��� ������ n�̸� �й���! s�̸� ���������� �����ϰ��Ѵ�. �⺻��n
	
	public StudentComp(char flag) {
		this.flag = flag;	
	}
	@Override					//compare ������ ������ - ,������ 0 ,ũ�� +
	public int compare(Student s1, Student s2) {//s1��s2
		int result = 0;
		if(flag == 'n') {
			result = s1.sno - s2.sno; //�й���   ������ ������ - ,������ 0 ,ũ�� +
		}else {
			result = s1.score - s2.score;//������   ������ ������ - ,������ 0 ,ũ�� +
		}
		return result;
		//return s1.score - s2.score; //score�� sno�� �ٲٸ� �й���, 
		
	}
}

/*public class StudentComp implements Comparator{       <>���ʸ� �Ⱦ���
	
	@Override			
	public int compare(Object o1, Student o2) {     ���������� ���� 
		Student s1 = (student)o1;    ������ȯ ����ߴ�
		Student s2 = (student)o2;    ������ȯ ����ߴ�
		return s1.score - s2.score;  
		
	}
}
*/