package j_collection;

public class MemberVo { // vo�� ��ǲ, �������,��ġ�� â�� ������ �ѷ��ִ� ������ ����
	private String mId;
	private String pwd; // member v = new memvervo();
	private String mName; // v.mid(); < �̷��� �Ҽ����� private��>�׷��� ���Ͱ��� �Ѵ�
	private String Phone;
	// �����ڸ� ���ؼ� //Ȥ�� ���͸� ���ؼ�//�ٸ� �޼ҵ带 ���ؼ�// ��/ �׸��� �������� �װԱװŴ� ���⼭ �����ڸ� ������.

	public MemberVo(String mId, String pwd, String mName, String phone) {// �����ڻ���.
		this.mId = mId;
		this.pwd = pwd;
		this.mName = mName;
		this.phone = phone;

	}

	public int hashCode() { // �ؽð� ������ ������ü �ٸ��� �ٸ���ü,������ü���� �˱�����
		return mId.hashCode() + phone.hashCode(); // ���� ���ؼ� ����.

	}

	@Override
	public boolean equals(Object obj) { // �ؽö� �̲��� ������ ���ü,���ü�����˱�����
		boolean result = false;
		if (obj instanceof MemberVo) {// object�� � Ÿ������ �𸥴�.
			MemberVo vo = (MemberVo) obj;
			if(vo.getmId().equals(mId) && vo.getPhone().equals(phone)) //�϶��ϸ� Ʈ��. �������ϸ� �޽�.
				result =true;
		} else {
			
		}
			return result;

	}
	@Override
	public String toString() { // �� ��ü�� ������� � ��ü�� �������� �˱�����

		return mId + "\t" + pwd + "\t" + mName + "\t" + phone + "\t"; // ���ĺ���"" ����Ʈ��..

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
