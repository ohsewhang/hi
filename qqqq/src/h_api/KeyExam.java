package h_api;

import java.util.HashMap;
import java.util.Map;

public class KeyExam {

	public static void main(String[] args) {
		HashMap<Key,String > hashMap = new HashMap<Key,String>(); //key��,value�� �ڿ� ��<Key,String>�ᵵ���Ƚᵵ���
				//string =value
		
		hashMap.put(new Key(1), "������"); //keyŬ������ �������̵��ϸ� ����������.
		hashMap.put(new Key(2), "ȫ�浿");
		hashMap.put(new Key(1), "������");//key���� �����ϸ� ���� ������ "������"�� ������Ʈ �ȴ�.
			
		
		String value = hashMap.get(new Key(1));//���⼭ ��ü�����ϸ� �ؽ��ڵ带 ������//get �ؽø��� �����ö��� get �����Է�put
	//new�� �����ϸ� �ؽ��ڵ带 ���� ������. �׷��� ���� ã�� ���� �ƴ� ���ο� �޸𸮿� ��ü�� �����ϱ⿡ �������� �ȳ��´�
		
		System.out.println(value);
	}

}
