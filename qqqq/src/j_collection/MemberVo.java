package j_collection;

public class MemberVo { // vo를 인풋, 모디파이,서치가 창에 떴을때 뿌려주는 내용을 만듬
	private String mId;
	private String pwd; // member v = new memvervo();
	private String mName; // v.mid(); < 이렇게 할수없다 private라서>그래서 세터게터 한다
	private String Phone;
	// 생성자를 통해서 //혹은 세터를 통해서//다른 메소드를 통해서// 등/ 항목이 적을때는 그게그거다 여기서 생성자를 통해함.

	public MemberVo(String mId, String pwd, String mName, String phone) {// 생성자생성.
		this.mId = mId;
		this.pwd = pwd;
		this.mName = mName;
		this.phone = phone;

	}

	public int hashCode() { // 해시가 같으면 같은객체 다르면 다른객체,같은객체인지 알기위해
		return mId.hashCode() + phone.hashCode(); // 둘을 더해서 리턴.

	}

	@Override
	public boolean equals(Object obj) { // 해시랑 이꼴이 같으면 동등객체,동등객체인지알기위해
		boolean result = false;
		if (obj instanceof MemberVo) {// object가 어떤 타입인지 모른다.
			MemberVo vo = (MemberVo) obj;
			if(vo.getmId().equals(mId) && vo.getPhone().equals(phone)) //완똑하면 트루. 만족못하면 펄스.
				result =true;
		} else {
			
		}
			return result;

	}
	@Override
	public String toString() { // 이 객체를 찍었을때 어떤 객체가 나오는지 알기위해

		return mId + "\t" + pwd + "\t" + mName + "\t" + phone + "\t"; // 추후변경"" 투스트링..

	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	private String phone;

}
