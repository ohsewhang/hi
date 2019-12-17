package c_control;

public class Switch2 {
	Switch2(){
		String p = "사장";
			switch(p) {
			case "사장":
				System.out.println("1000만원");
				break;
			case "부장":
				System.out.println("700만원");
			break;
			case "과장":
				System.out.println("500만원");
			break;
			case "대리":
				System.out.println("300만원");
			break;
			default: 
				System.out.println("200만원");
			}
	}
}
