package j_collectionExam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import j_collection.MemberVo;
      												//�ݵ�� ������ �ϰ� ���� add�� ���ش�.
public class HashSetExam {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		//����ȭ ��Ų���� �ؽ��� ���� �¿�. //����ȭ �Ҷ� ������ �ڽİ�ü�� �߰������ (�ʵ�,�޼ҵ�)�� ����Ҽ�����
		set.add("Java");
		set.add("JDBC");
		set.add("Sevlet/JSP");
		set.add("Java"); //���� �ڹٿ� �ߺ��ż� ��ü�������.Set�÷����� ����ִ� ������ ��µǴ� ������ �����ʴ�. 
		set.add("JAVA");
		set.add("mYbaits");
		 
		System.out.println("size = "+ set.size());
		
		Iterator<String> iter = set.iterator(); //�����ϱ����� ���ͽ���
		while(iter.hasNext()) {
			String temp =  iter.next();//�ؽ�Ʈ�� ��Ʈ���̰� �׷��� ��Ʈ��Ÿ�� ����
			System.out.println(temp);
		}
		System.out.println("=========���� for��============");
		for(String temp:set) {
			System.out.println(temp);
		}
		
		set.remove("JDBC");
		set.remove("mYbaits");
		System.out.println("=====================");
		System.out.println("���� ��  :"+set.size());
		iter = set.iterator(); //���� �������ִ� iter��Ȱ��
		while(iter.hasNext()) {
			String temp = iter.next();
			System.out.println(temp);
		}
		
		set.clear();
		if(set.isEmpty())System.out.println("�ڷᰡ ����ֽ��ϴ�");
		System.out.println("=====================");
	//=====================================================================
		Set<MemberVo> memberSet = new HashSet<MemberVo>();
		memberSet.add(new MemberVo("a001", "1111 ", "hong", "010-1234"));
		memberSet.add(new MemberVo("a002", "1111 ", "hong", "010-1234"));
		memberSet.add(new MemberVo("a002", "1111 ", "hong", "010-0000"));
		
		memberSet.add(new MemberVo("a002", "2222 ", "kim", "010-1234")); //��� ����ȴ�. ���̵𰡰��� ������ȣ�� ���Ƽ�
		System.out.println("MemberSet size:" + memberSet.size()); //��4���� 3�Ǹ� ����. mebervo���� �ؽ��ڵ�� eqauals �� ����4��.
		
		Iterator<MemberVo> iter2 = memberSet.iterator();
		while(iter2.hasNext()) {
		MemberVo vo = iter2.next();
		 System.out.println(vo);
	}
		MemberVo delvo = new MemberVo("a002", "1111 ", "hong", "010-0000"); //�̵����͸� �����.
		memberSet.remove(delvo);
		
		System.out.println("--------���� fOR��------------");
		for(MemberVo vo : memberSet) {
			System.out.println(vo);
		}
	}
	
}
