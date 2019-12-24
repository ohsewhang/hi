package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class MapExam {
	
	//<String,Integer>
	public void test1() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		//������ �߰�
		map.put("hong", 90);
		map.put("lee", 80);
		map.put("park", 50);
		map.put("kim", 70);
		map.put("chio", 40);
		
		System.out.println("size:"+map.size());
	
		//Ű������ value ���.
		System.out.println(map.get("lee"));//80
		
		Set<String> set = map.keySet(); //set������ �����������.
				
		Iterator<String> iter = set.iterator();  //Ű���� �ϳ���.
		
		while(iter.hasNext()) {
			String key = iter.next();
			int value = map.get(key); //map���� key�� �ش��ϴ� value���� �����Ͷ�.
			System.out.println(key + " : " +value);
	
		}

		//Map.Entery
		Set<Map.Entry<String,Integer>> set2  = map.entrySet();//set2�� ����.
		
		Iterator<Map.Entry<String, Integer>> iter2 = set2.iterator(); //��Ʈ�������� ������ �ִ� ��.
		while(iter2.hasNext()) {
			Map.Entry<String,Integer> entry = iter2.next();
		}
		map.put("chio", 99);
		map.remove("chio");
		
		System.out.println();
		System.out.println("-------------");
		
		//how1 (keyshot)
		Set<String> set3 = map.keySet();
		Iterator<String> iter3 = set3.iterator();
		while(iter3.hasNext()) {
			String key = iter3.next();
			System.out.println(key + " : "+ map.get(key));
		}
		
		//how2 (Map.entry)
		Set<Map.Entry<String, Integer>> set4 =map.entrySet();
		Iterator<Map.Entry<String, Integer>> iter4 = set4.iterator();
		while(iter4.hasNext()) {
			Map.Entry<String, Integer> entry = iter4.next();
			System.out.println(entry.getKey()+ " : " + entry.getValue());
			
		}System.out.println("----------");
		//how3(for)
		
		for(Map.Entry<String, Integer> d : set4) {
			System.out.println(d.getKey() + " : " +d.getValue());
		}
	}
	
	//key ���� ������ Student type �� ���
	
	public void test2() {
		Map<Student,String> map = new HashMap<Student, String>();//�� ����.
		
		//ǲ���� �߰�
		map.put(new Student(100,"hong"),"010-1111-1111" );
		map.put(new Student(200,"kim"),"010-2222-2222" );
		map.put(new Student(300,"gang"),"010-1234-1234" );
		
		prn(map);//map�̶� �Ķ���Ͱ��� ���� prnȣ��
		//����
		System.out.println("������---------------------");
		map.put(new Student(300,"gang"),"010-5353-3225");
		prn(map);
		//����
		System.out.println("������--------------------");
		map.remove(new Student(300,"gang"));
		prn(map);
		
	}
	public void prn(Map<Student, String> map ) {//MapŸ��         prn�޼ҵ����.
	Set<Student> set  =	map.keySet();
	Iterator<Student> iter = set.iterator();
	while(iter.hasNext()) {
		Student key = iter.next();
		String value = map.get(key);
		System.out.println(key + ">>>>" + value);
	}
	}
	
	public void test3() {
		Map<Integer,Student> map = new HashMap<Integer , Student>();
		//�߰�
		map.put(20190101, new Student(20190101,"ȫ��"));//ȫ���� �߰����Ѷ�..
		map.put(20190102, new Student(20190102,"�ھ�"));
		map.put(20190103, new Student(20190103,"�达"));
		map.put(20190104, new Student(20190104,"�־�"));
		prn2(map);
		System.out.println("-----------------------------");
		//�ھ��� �达�� ����
					map.put(20190102, new Student(20190102,"�达"));
					prn2(map);
			
				
					System.out.println("------����----------------");
		//ȫ���� ����
				
					map.remove(20190101, new Student(20190101,"ȫ��"));
					prn2(map);
					System.out.println("����������...........");
		//������� ���
					prn2(map);
		
		
		
	}
	public void prn2(Map<Integer,Student> map) { //prn2�޼ҵ� ����
		Set<Integer> set = map.keySet();
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			Integer key = iter.next();
			Student value = map.get(key);
			System.out.println(key + ">>>>" + value);
		}
		
	}
	
	public static void main(String[] args) {
		MapExam exam = new MapExam();
		exam.test1();
		exam.test2();
		exam.test3();
	}

}
