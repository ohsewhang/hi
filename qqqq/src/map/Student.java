package map;

import java.text.MessageFormat;

public class Student {
	int sno;
	String name;
	
	public Student(int sno, String name) {//생성자
		this.sno = sno;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		boolean r = false;
		if (obj instanceof Student) { //obj가 스튜던트타입인지 확인하는게 instanceof

			Student std = (Student) obj;
			if (sno == std.sno && name.equals(std.name)) {
				r = true;

			} else {
				r = false;
			}
		}
		return r;
	}

	@Override
	public int hashCode() { // 객체가 같은지 확인
		int code = sno + name.hashCode(); //
		return code;
	}

	@Override
	public String toString() { //메세지포맷은 스테틱형.뉴필요없음
		String mf = MessageFormat.format("{0} -- {1}", sno,name);
		return mf;
	}

}
