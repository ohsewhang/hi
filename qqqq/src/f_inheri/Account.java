/*
 * 개선요구사항
 * AccountModify 
 * -예금주나 예금액이 반 공백이면 오류 메시지 출력
 * -예금액에 문자나 공백이 있는 경우 오류 메시지 출력
 * Deposit
 * 계좌정보가 없으면 메시지 출력
 * 예금액에 문자나 공백이 있는 경우 오류 메시지 출력	
 * withdraw
 * 계좌정보가 없으면 메시지 출력
 * 예금액에 문자나 공백이 있으면 오류 메시지 출력
 * 출금액이 예금액보다 많으면 오류 메시지 출력
 */
package f_inheri;

public class Account { //value object역할을 하는 클래스/ 값만 저장되어있음.
	private String nName;//이름
	private String sNo;   //계좌번호/ 캡슐화 
	private long amount; //잔액/ 반드시 메소드를 통해서 밖으로 가져간다.캡슐화
	
	public Account(String n, String no, long amt) {//생성자를 사용해서 초기화 
		this.nName = n;
		this.sNo = no;
		this.amount = amt;
	}
	/////////////////////////
	public String getnName() {
		return nName; //get에서 
	}
	public void setnName(String nName) {
		this.nName = nName;
	}
	public String getsNo() {
		return sNo;
	}
	public void setsNo(String sNo) {
		this.sNo = sNo;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}

		
}
