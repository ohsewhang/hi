package e_class;

public class Car2 {
	int gas; //필드
	        
	public void setGas(int gas) { //set타입!! 설정값은 매개변수가 하나는 있어야함. 필드명에 따라 대소문자가 바뀐다.
	this.gas = gas; //필드에 있는 가스로 하기위해서 this사용./매개변수의gas를 g로 바꾸고 gas = g;로 해도 됌.
					//지역변수와 멤버변수가 다르기때문에.
	}
	public boolean isLeftGas() {
		if(gas==0) {
			System.out.println("가스가 없음");
			return false;
		}else {
			System.out.println("가스가 있음");
			return true;
		}
	}
	
	public void run() {
		while(true) {
			if(gas>0) {
				gas--;
				System.out.println("가스량: "+gas);
			}else {
				System.out.println("가스 없음");
				return;
			}
		}
	}
	
	
}
