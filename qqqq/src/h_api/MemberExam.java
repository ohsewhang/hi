package h_api;

import java.util.Arrays;

public class MemberExam {

	public static void main(String[] args) {
		Member original = new Member("blue","hong","1234",25,true);
		
		Member Cloned = original.gerMember();//�Ű�����  ��������,germenber
		
		System.out.println("������ ��ü�� �ʵ尪");
		System.out.println("id : "+ Cloned.id);
		System.out.println("name:"+ Cloned.name);
		System.out.println("password"+Cloned.password);
		System.out.println("age:"+Cloned.age);
		System.out.println("adult:"+Cloned.adult);
		//�迭�� ����Ϸ��� ������ �־�������� �ؿ�ó��;;�Ϲ� ;;
		Cloned.scores[0] = 100;//������ �״�� ���纻�� ����
		System.out.println(Arrays.toString(original.scores)); //������.��������..������ �Ѽ� �ȴ�.
		System.out.println(Arrays.toString(Cloned.scores));	//���纻��.
			
		
		//System.out.println(Cloned.scores);		
		//System.out.println(original.scores);//�̷��� �ϸ� �ּҰ� ���´�.
		Cloned.car.model = "�ҳ�Ÿ"; //�̰ɷ� �����ϸ� ������ �ٲ��.
		
		System.out.println(original.car.model);//����
		System.out.println(Cloned.car.model);//���纻
		
	}

}
