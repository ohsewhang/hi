package h_api;

import java.util.Objects;

import h_api2.Student;
import h_api2.StudentComp;

public class CompareExam {

	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(100);
		Student s3 = new Student(2);
								//s1��,s2�񱳴��
		int result = Objects.compare(s1, s2, new StudentComp());//3��° �Ű�������  StudentComp�� �񱳹��
		System.out.println(result);
	}

}
