package j_collectionExam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import j_collection.MemberVo;
      												//반드시 리무브 하고 나서 add를 해준다.
public class HashSetExam {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		//다형화 시킨것임 해쉬가 변수 셋에. //다형화 할때 주의점 자식객체에 추가멤버는 (필드,메소드)는 사용할수없다
		set.add("Java");
		set.add("JDBC");
		set.add("Sevlet/JSP");
		set.add("Java"); //위의 자바와 중복돼서 객체저장안함.Set컬렉션은 집어넣는 순서랑 출력되는 순서가 같지않다. 
		set.add("JAVA");
		set.add("mYbaits");
		 
		System.out.println("size = "+ set.size());
		
		Iterator<String> iter = set.iterator(); //루핑하기위해 이터실행
		while(iter.hasNext()) {
			String temp =  iter.next();//넥스트에 스트링이고 그래서 스트링타입 템프
			System.out.println(temp);
		}
		System.out.println("=========향상된 for문============");
		for(String temp:set) {
			System.out.println(temp);
		}
		
		set.remove("JDBC");
		set.remove("mYbaits");
		System.out.println("=====================");
		System.out.println("삭제 후  :"+set.size());
		iter = set.iterator(); //셋이 가지고있는 iter재활용
		while(iter.hasNext()) {
			String temp = iter.next();
			System.out.println(temp);
		}
		
		set.clear();
		if(set.isEmpty())System.out.println("자료가 비어있습니다");
		System.out.println("=====================");
	//=====================================================================
		Set<MemberVo> memberSet = new HashSet<MemberVo>();
		memberSet.add(new MemberVo("a001", "1111 ", "hong", "010-1234"));
		memberSet.add(new MemberVo("a002", "1111 ", "hong", "010-1234"));
		memberSet.add(new MemberVo("a002", "1111 ", "hong", "010-0000"));
		
		memberSet.add(new MemberVo("a002", "2222 ", "kim", "010-1234")); //얘는 저장안댐. 아이디가같고 저나번호가 같아서
		System.out.println("MemberSet size:" + memberSet.size()); //총4개중 3건만 나옴. mebervo에서 해시코드랑 eqauals 가 없음4건.
		
		Iterator<MemberVo> iter2 = memberSet.iterator();
		while(iter2.hasNext()) {
		MemberVo vo = iter2.next();
		 System.out.println(vo);
	}
		MemberVo delvo = new MemberVo("a002", "1111 ", "hong", "010-0000"); //이데이터를 지운다.
		memberSet.remove(delvo);
		
		System.out.println("--------향상된 fOR문------------");
		for(MemberVo vo : memberSet) {
			System.out.println(vo);
		}
	}
	
}
