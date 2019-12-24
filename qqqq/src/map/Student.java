package map;

import java.text.MessageFormat;

public class Student {
	int sno;
	String name;
	
	public Student(int sno, String name) {//������
		this.sno = sno;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		boolean r = false;
		if (obj instanceof Student) { //obj�� ��Ʃ��ƮŸ������ Ȯ���ϴ°� instanceof

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
	public int hashCode() { // ��ü�� ������ Ȯ��
		int code = sno + name.hashCode(); //
		return code;
	}

	@Override
	public String toString() { //�޼��������� ����ƽ��.���ʿ����
		String mf = MessageFormat.format("{0} -- {1}", sno,name);
		return mf;
	}

}
