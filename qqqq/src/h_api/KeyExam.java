package h_api;

import java.util.HashMap;
import java.util.Map;

public class KeyExam {

	public static void main(String[] args) {
		HashMap<Key,String > hashMap = new HashMap<Key,String>(); //key값,value값 뒤에 뉴<Key,String>써도대고안써도댄당
				//string =value
		
		hashMap.put(new Key(1), "오세왕"); //key클래스에 오버라이드하면 가능해진다.
		hashMap.put(new Key(2), "홍길동");
		hashMap.put(new Key(1), "일지매");//key값이 동일하면 기존 데이터 "오세왕"은 업데이트 된다.
			
		
		String value = hashMap.get(new Key(1));//여기서 객체생성하면 해쉬코드를 만들어내는//get 해시맵을 가져올때는 get 수정입력put
	//new로 생성하면 해쉬코드를 새로 만들어낸다. 그래서 내가 찾는 값이 아닌 새로운 메모리에 객체를 생성하기에 오세왕이 안나온다
		
		System.out.println(value);
	}

}
