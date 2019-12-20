package j_home;



import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JTextField;


public class DateTimeThread extends Thread {
	JTextField watch;
	
	public DateTimeThread(JTextField watch) {        //DateTimeThread dtt = new DateTimeThread(label); 프레임이가지고있는 라벨값이 와치로 들어옴.
		this.watch = watch;
		
	}                                             //시간을 표시해주는 기능을 독립적으로 함.(객체)
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
