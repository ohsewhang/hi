package j_collection;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProductVo {
	private String serial; // yyyy-MM-dd-serial형태로
	private String pCode;
	private String pName;
	private int ea; // 수량
	private Date nal;// 입고,출고 일자.
										// private타입은 게터세터를 만들어야 다른 클래스에서 사용가능.

	 //생성자 중복정의  ..매개변수가 없는 생성자를 만듬.
	public ProductVo() {}
	public ProductVo(String s, String pC, String pN, int ea, Date date) {
		this.serial =s;
		this.pCode = pC;
		this.pName = pN;
		this.ea = ea;
		this.nal = date;
		
	}
	@Override
	public int hashCode() {	//중복된 객체있는지 판단.
		return this.serial.hashCode(); //시리얼번호가 동일하면 똑같은 객체다.동일하면 데이터가 추가되지않을 것이다.\				
	}
	@Override
	public boolean equals(Object obj) { //검색을 편하게 하기 위해서 
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
		                                   //숫자d //문자 s
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
