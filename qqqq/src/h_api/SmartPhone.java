package h_api;

public class SmartPhone {
	public String com;
	public String os;
	
	public SmartPhone(String c, String os) {
		this.com = c;
		this.os = os;
		
	}
	@Override
	public String toString() {
		return super.toString();
		
		//return com + "," + os; //�̰�..
		
	}

	public static void main(String[] args) {
		SmartPhone sm = new SmartPhone("����","�ȵ���̵�");
		System.out.println(sm);
		System.out.println(sm.toString());
		

	}

}
