package j_home;



import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JTextField;


public class DateTimeThread extends Thread {
	JTextField watch;
	
	public DateTimeThread(JTextField watch) {        //DateTimeThread dtt = new DateTimeThread(label); �������̰������ִ� �󺧰��� ��ġ�� ����.
		this.watch = watch;
		
	}                                             //�ð��� ǥ�����ִ� ����� ���������� ��.(��ü)
	public void run() {
		SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd(E) hh: mm :ss");
		while(true) {
			watch.setText(sdf.format(new Date()));
			try {
				Thread.sleep(1000);				
			}catch(Exception ec) {}
		}
	}
}
