/*
 * �����䱸����
 * AccountModify 
 * -�����ֳ� ���ݾ��� �� �����̸� ���� �޽��� ���
 * -���ݾ׿� ���ڳ� ������ �ִ� ��� ���� �޽��� ���
 * Deposit
 * ���������� ������ �޽��� ���
 * ���ݾ׿� ���ڳ� ������ �ִ� ��� ���� �޽��� ���	
 * withdraw
 * ���������� ������ �޽��� ���
 * ���ݾ׿� ���ڳ� ������ ������ ���� �޽��� ���
 * ��ݾ��� ���ݾ׺��� ������ ���� �޽��� ���
 */
package f_inheri;

public class Account { //value object������ �ϴ� Ŭ����/ ���� ����Ǿ�����.
	private String nName;//�̸�
	private String sNo;   //���¹�ȣ/ ĸ��ȭ 
	private long amount; //�ܾ�/ �ݵ�� �޼ҵ带 ���ؼ� ������ ��������.ĸ��ȭ
	
	public Account(String n, String no, long amt) {//�����ڸ� ����ؼ� �ʱ�ȭ 
		this.nName = n;
		this.sNo = no;
		this.amount = amt;
	}
	/////////////////////////
	public String getnName() {
		return nName; //get���� 
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
