package h_api;

import java.util.Arrays;
import java.util.Objects;

import h_api2.Student;
import h_api2.StudentComp;

public class SortExam {

	//������ �迭���� ������������ ��ȯ
	public void numberSort() {//<-�̰� ���ο��� �ҷ��ش�.
		int[] n = {1,4,2,3,6,8,11,5,24,22,15,12,1};
		
		System.out.println("������");
		System.out.println(Arrays.toString(n));
		int temp = 0; //for���� �ΰ��Ƿ�  
		for(int i = 0 ; i<n.length-1 ; i++) { //-1�� ������ 24.22.15�������µ� ������ 15�� �񱳴���̾��⿡//ù��°�ڸ�1�� ����.
			for(int j = i+1 ; j<n.length ; j++) {//���ش����̶� �ϳ��� ũ��.//���
				if(n[i]>n[j]){ //swap����.  //�� �ε�ȣ�� �ݴ�� �ϸ� ��������
					temp = n[i]; //���Ǽҿ� n�� i��°�� ����
					n[i] = n[j]; //�ڸ��� ���� �ٲ��ش�.
					n[j] = temp; //���ǼҰ��� ���� �ٲٴ�.
				}//if
			}//for j			
		}//for i
		System.out.println("������");
		System.out.println(Arrays.toString(n));
	}
	
	//�������� �迭���� ������������ ��ȯ// equals���پȰ���. compareto��Ұ���� ���پȰ���.
	public void strSort() {	
		String[] n = new String[]  { 
				"11","zzzzzzzz","zz","������","�۸���","�˰�"};
			//������ ����� ������ �۸��̱����� �Ѵ� �˰��� ���������� �񱳵Ǳ⿡
		String temp = "";//���ذ��� �����ؾ��� �ӽú���
		for(int i = 0 ; i<n.length-1 ; i++) {//����
			for(int j = i+1;j<n.length ; j++) {//�񱳴�� ������ ����ĭ.
				if(n[i].compareTo(n[j]) > 0) { // ni> nj���� ũ�� ����� / ni <nj ����/ ������ 0//���⼱ 0����ũ�����ʿ��ϴ�/swap
					temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}//if
			
		}//j
		}//i	
		System.out.println(Arrays.toString(n));
		
		
	}	
	public void objSort() {//�й�.����.���� ������ ���� ������.
		Student[]n = new Student[] { //student�迭�� �ټ����� ������.
				new Student(10,"hong",60),//�й� ������ �����ؼ� ����ٸ� ��ȫ����ȫ
				new Student(1,"kim",90),  //2��° ������
				new Student(3,"park",40),
				new Student(8,"lee",90),
				new Student(2,"hong",66)
		};	
		//System.out.println(Arrays.toString(n));
		Student temp =null;//student Ÿ�� ���Ǽ�
		for(int i = 0 ; i<n.length-1 ; i++) {//����
			for(int j = i+1 ; j<n.length ; j++) {//���
				int result = Objects.compare(n[i], n[j], new StudentComp());
				if(result>0) {//swap
					temp = n[i];//����
					n[i] = n[j];
					n[j] = temp;
				}//if
			}//j
		}//i
		for(int i=0 ; i < n.length ; i++) {
			System.out.println(n[i]);//�й������� ��µ�.
		}
	}
	
	
	
	public static void main(String[] args) {
		SortExam se = new SortExam();
		//se.numberSort();
		//se.strSort();
		se.objSort();
		
	}

}
