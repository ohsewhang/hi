package e_class;

public class Car2 {
	int gas; //�ʵ�
	        
	public void setGas(int gas) { //setŸ��!! �������� �Ű������� �ϳ��� �־����. �ʵ�� ���� ��ҹ��ڰ� �ٲ��.
	this.gas = gas; //�ʵ忡 �ִ� ������ �ϱ����ؼ� this���./�Ű�������gas�� g�� �ٲٰ� gas = g;�� �ص� ��.
					//���������� ��������� �ٸ��⶧����.
	}
	public boolean isLeftGas() {
		if(gas==0) {
			System.out.println("������ ����");
			return false;
		}else {
			System.out.println("������ ����");
			return true;
		}
	}
	
	public void run() {
		while(true) {
			if(gas>0) {
				gas--;
				System.out.println("������: "+gas);
			}else {
				System.out.println("���� ����");
				return;
			}
		}
	}
	
	
}
