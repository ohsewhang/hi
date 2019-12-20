package j_collection;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProductVo {
	private String serial; // yyyy-MM-dd-serial���·�
	private String pCode;
	private String pName;
	private int ea; // ����
	private Date nal;// �԰�,��� ����.
										// privateŸ���� ���ͼ��͸� ������ �ٸ� Ŭ�������� ��밡��.

	 //������ �ߺ�����  ..�Ű������� ���� �����ڸ� ����.
	public ProductVo() {}
	public ProductVo(String s, String pC, String pN, int ea, Date date) {
		this.serial =s;
		this.pCode = pC;
		this.pName = pN;
		this.ea = ea;
		this.nal = date;
		
	}
	@Override
	public int hashCode() {	//�ߺ��� ��ü�ִ��� �Ǵ�.
		return this.serial.hashCode(); //�ø����ȣ�� �����ϸ� �Ȱ��� ��ü��.�����ϸ� �����Ͱ� �߰��������� ���̴�.\				
	}
	@Override
	public boolean equals(Object obj) { //�˻��� ���ϰ� �ϱ� ���ؼ� 
		boolean result = false;
		if(obj instanceof ProductVo) {
			ProductVo vo = (ProductVo)obj;
					 result = serial.indexOf(vo.getSerial()) > -1||
					  pCode.indexOf(vo.getPcode()) > -1||
					  pName.indexOf(vo.getpName())  > -1;
		}
		return result;
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###,###");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E)");
		
		String tempEa = df.format(this.ea);
		String tempDate = sdf.format(this.nal);
		                                   //����d //���� s
		String temp = String.format("%s\t%s\t%s\t%s\t%s\n",this.serial ,this.pCode,this.pName,tempEa,tempDate); 
	  return temp;
	}
	
	
	
	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getPcode() {
		return pCode;
	}

	public void setPcode(String pcode) {
		this.pCode = pcode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getEa() {
		return ea;
	}

	public void setEa(int ea) {
		this.ea = ea;
	}

	public Date getNal() {
		return nal;
	}

	public void setNal(Date nal) {
		this.nal = nal;
	}

}
