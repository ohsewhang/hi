package h_api;

import java.util.Arrays;

public class MemberExam {

	public static void main(String[] args) {
		Member original = new Member("blue","hong","1234",25,true);
		
		Member Cloned = original.gerMember();//매개변수  오리지널,germenber
		
		System.out.println("복제된 객체의 필드값");
		System.out.println("id : "+ Cloned.id);
		System.out.println("name:"+ Cloned.name);
		System.out.println("password"+Cloned.password);
		System.out.println("age:"+Cloned.age);
		System.out.println("adult:"+Cloned.adult);
		//배열을 출력하려면 루핑이 있어야하지만 밑에처럼;;하믄 ;;
		Cloned.scores[0] = 100;//원본은 그대로 복사본만 변경
		System.out.println(Arrays.toString(original.scores)); //원본임.얇은복제..원본이 훼손 된다.
		System.out.println(Arrays.toString(Cloned.scores));	//복사본임.
			
		
		//System.out.println(Cloned.scores);		
		//System.out.println(original.scores);//이렇게 하면 주소가 나온다.
		Cloned.car.model = "소나타"; //이걸로 실행하면 원본도 바뀐다.
		
		System.out.println(original.car.model);//원ㅂ
		System.out.println(Cloned.car.model);//복사본
		
	}

}
