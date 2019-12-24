package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class MapExam {
	
	//<String,Integer>
	public void test1() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		//데이터 추가
		map.put("hong", 90);
		map.put("lee", 80);
		map.put("park", 50);
		map.put("kim", 70);
		map.put("chio", 40);
		
		System.out.println("size:"+map.size());
	
		//키값으로 value 출력.
		System.out.println(map.get("lee"));//80
		
		Set<String> set = map.keySet(); //set구조는 순서상관없이.
				
		Iterator<String> iter = set.iterator();  //키값이 하나인.
		
		while(iter.hasNext()) {
			String key = iter.next();
			int value = map.get(key); //map에서 key에 해당하는 value값을 가져와라.
			System.out.println(key + " : " +value);
	
		}

		//Map.Entery
		Set<Map.Entry<String,Integer>> set2  = map.entrySet();//set2를 만듬.
		
		Iterator<Map.Entry<String, Integer>> iter2 = set2.iterator(); //엔트리구조를 가지고 있는 셋.
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
	
	//key 값의 유형이 Student type 인 경우
	
	public void test2() {
		Map<Student,String> map = new HashMap<Student, String>();//맵 생성.
		
		//풋으로 추가
		map.put(new Student(100,"hong"),"010-1111-1111" );
		map.put(new Student(200,"kim"),"010-2222-2222" );
		map.put(new Student(300,"gang"),"010-1234-1234" );
		
		prn(map);//map이란 파라미터값을 던져 prn호출
		//수정
		System.out.println("수정후---------------------");
		map.put(new Student(300,"gang"),"010-5353-3225");
		prn(map);
		//삭제
		System.out.println("삭제후--------------------");
		map.remove(new Student(300,"gang"));
		prn(map);
		
	}
	public void prn(Map<Student, String> map ) {//Map타입         prn메소드생성.
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
		//추가
		map.put(20190101, new Student(20190101,"홍씨"));//홍씨를 추가시켜라..
		map.put(20190102, new Student(20190102,"박씨"));
		map.put(20190103, new Student(20190103,"김씨"));
		map.put(20190104, new Student(20190104,"최씨"));
		prn2(map);
		System.out.println("-----------------------------");
		//박씨를 김씨로 수정
					map.put(20190102, new Student(20190102,"김씨"));
					prn2(map);
			
				
					System.out.println("------삭제----------------");
		//홍씨를 삭제
				
					map.remove(20190101, new Student(20190101,"홍씨"));
					prn2(map);
					System.out.println("수정삭제후...........");
		//최종결과 출력
					prn2(map);
		
		
		
	}
	public void prn2(Map<Integer,Student> map) { //prn2메소드 생성
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
