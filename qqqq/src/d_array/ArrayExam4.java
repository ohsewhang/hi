package d_array;

import java.util.Scanner; //��Ű�� �ؿ�.

public class ArrayExam4 {// ���Ⱑ �ʵ念��.���⼭ ���� �����ϸ� �ؿ��� ���� ����� �� �ִ�./�ʵ带 �߰��߰������ؼ� �����������.�ʵ�� �� ù��° ������
							// ����(���������)
	String[] n = new String[10]; // ������ �迭���� /�л���
	int[][] s = new int[10][2]; // 10��.2��..? /��������.
	int count = 0; // �迭�� �Էµ� �ڷ��� ����.

	// ���� ������ ���鼭 �޴��� ���
	ArrayExam4() {
		Scanner scanner = new Scanner(System.in);// �޴��� ���� �Է��� ��ĳ�ʸ� ����
		boolean run = true;
		// ���ÿ� �����͸� �迭�� ����
		n[0] ="kim";
		n[1] ="hong";
		n[2] ="park";
		n[3] = "lee";
		s[0][0] = 90 ; s[0][1] = 80; //�达
		s[1][0] = 70 ; s[1][1] = 30; 
		s[2][0] = 60 ; s[2][1] = 20;
		s[3][0] = 50 ; s[3][1] = 10;
		
		count = 4; //4�� �ݺ��Ѵ�.
		
		while (run) { // ����(Ʈ��)�� �´ٸ� ���ѹݺ�.
			System.out.println("------------------------------");
			System.out.println("1.�Է� | 2.���� | 3.��ȸ�� ���  4.����");
			System.out.println("------------------------------");
			System.out.println("�޴� ���� :");
			int menu = scanner.nextInt();// �����Է��ϴ°� switch������/ if�� �Ѵٸ�
			switch (menu) { // if(menu==1) input()
			case 1: // else if(menu==2) modify()
				this.input(); // 1 ȣ�� // else if(meni==3) search()
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
			} // swich��
		} // while��
		System.out.println("���α׷��� ����Ǿ����ϴ�.");// case4���� false�� �Ǹ� while���� ������ �����⿡ while�� ���ڸ��� case4�� ����� ������ ����.
	}// ������ ��

	// �л��� ���� ������ �迭�� �Է� //�����ڿ��� �Է¸޼ҵ� ȣ���ϸ� ��ǲ���� ���ٰ� �ٽ� ������������ ���� �� ���ñ���.
	public void input() {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		int kor = 0;
		int eng = 0;
		int tot = 0;
		double avg = 0;

		System.out.print("���� : ");// �̸��� �Է� �ޱ� ���ؼ�
		name = scanner.nextLine(); //Ű�����Է�
		System.out.print("���� : ");
		kor = scanner.nextInt();
		System.out.print("���� : ");
		eng = scanner.nextInt();

		tot = kor + eng;
		avg = (double) tot / 2;

		System.out.println("���� : " + tot);
		System.out.println("��� : " + avg);
		n[count] = name;
		s[count][0] = kor;
		s[count][1] = eng;
		count++;

	}// input��

	// �л��� ���� ������ ����
	// 1.������ �л����� �Է¹޾� �˻��� �Ѵ�.�����л��Ǵ�
	// 2.�˻��� ������ ǥ��	
	// 3.���õ����� ����
	// 4.������ �����Ͱ�  �迭���� ����
	public void modify() {
		Scanner scanner = new Scanner(System.in);
		String findName = "";
		System.out.print("�˻��� �л�����?");
		findName = scanner.next();
	for(int i = 0 ; i<count ; i++){ //0�� �迭 ó���ε� �װ� ���� i�� .. 
		if(n[i].equals(findName)) {
		System.out.println("����:"+n[i]);
		System.out.println("����:"+s[i][0]);
		System.out.println("����:"+s[i][1]);
		
		
		
		System.out.println("������ �����ض�");
		System.out.print("����:");
		s[i][0] = scanner.nextInt();
		
		System.out.print("����:");
		s[i][1] = scanner.nextInt();
		}//if��
		
	 }//������
	
	}// modify��

	// �л��� ���� ������ ��ȸ �� ���\
	public void search() { //�迭�� �ִ� ���� ���� ���   . 
		Scanner scanner = new Scanner(System.in);
		System.out.print("�˻��� ������?");
		String findName = scanner.nextLine(); //Ű�����Է�
		int tot = 0;
		double avg = 0;
		
		for(int i = 0 ; i<count ; i++) {
		  if(n[i].equals(findName)) { //���� ����ϰ� ���� �̸�.������ġ�� ���� �ƹ��� �̸��� �ᵵ �˻��ȴ�. ��ĳ�ʸ� �����ϸ� ��.if(n[i].equals(findName)|| findName.equals("")){ ��� ���� 3������ ����ġ�� ���� ����
			  //TODO (����,����� ����Ͽ� ���) 
			  
			 tot = s[i][0] +s[i][1];              //�� s?
			 avg = (double)tot/2;
			 System.out.println("���� ����:"+ tot);
			 System.out.println("���� ���:"+avg);
			 
			System.out.print(n[i]+"  ");
			System.out.print(s[i][0] +" ");
			System.out.print(s[i][1]+" ");
			System.out.print(tot+" "); 
			System.out.printf("%5.1f",avg); //�Ҽ����� �Ҷ� printf %5.1�ټ��ڸ��� ���ڸ��� ���
			System.out.println();
			
			
		  }//if�� ��.
	}//�� �� ��
		

	}// search��

	public static void main(String[] args) {
		new ArrayExam4();

	}// main ��
}// class��
