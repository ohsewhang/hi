package e_class;

import d_array.A; //임폴트를 하면 패키지를 불러온다; 

public class C {
	C(){
		A a = new A(); //A . 컨트롤 스페이스바로 소환할 d_array.A를 임폴트한다.
		a.f1 = 1;//퍼블릭이라 가능하다
		//a.f2 = 1;//패키지타입인 default이기에 같은 패키지가 아니면 안된다.
		//a.f3 = 1;//private 타입
		
	} //접근제한자 테스트ABC
}
