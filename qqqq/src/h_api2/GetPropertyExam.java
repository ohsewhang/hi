package h_api2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.util.Properties;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class GetPropertyExam extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {//run추상 재정의 해야된다.멀티스레드를 실행하기 위해서.				
				try {
					GetPropertyExam frame = new GetPropertyExam(); //프레임을 만들어서 프레임을 화면에 띄어주는.
					frame.setVisible(true);// 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void view() {          //2번view메소드를 만든다.
		String msg = "";
		
		String osName = System.getProperty("os.name");
		
		msg += "운영체제이름:"+ osName+ "\n";
		msg +="사용자이름"+System.getProperty("user.name")+"\n";
		msg +="사용자 홈"+System.getProperty("user.home")+"\n";
		msg +="=====================================\n";
		msg +=" [  key  ] value\n";
		msg +="=====================================\n";        
		Properties props = System.getProperties();	     //collection 4가지.List(순서o중복o), Set(순서중복x) ,
		Set keys = props.keySet();                       //Map(key와value 한쌍)key순서중복x,vlaue중복o순서x ,Property(문자열로구성)->빈번히 쓰여지는 구조  
		for(Object objKey : keys) {                      //배열[] 동일한 유형 int[]"자료형의 종속적이다"  
		String key =(String)objKey;				     	 //크기가 고정
		String value = System.getProperty(key);
		msg += "["+ key + "]"+ value + "\n";
		msg += String.format("[%s] %s \n",key,value);
		}
		
			textArea.setText(msg);							 
		}				
	public void viewClass() {
		String msg ="";
		Student st = new Student(0);
		Class cls = st.getClass();
		msg += "class full name : " + cls.getName()+"\n";
		msg += "class name : " +  cls.getSimpleName()+ "\n";
		msg += "package name " + cls.getPackage().getName() + "\n";
		msg += "-------------------------\n";
		try {
			msg += "class full name : " + cls.getName()+"\n";
			msg += "class name : " +  cls.getSimpleName()+ "\n";
			msg += "package name " + cls.getPackage().getName() + "\n";
			msg += "-------------------------\n";
			
		}catch(Exception ex) {}
		
				
		msg += "[클래스명]"+ cls.getName() + "\n";
		
		msg += "[생성자 정보]\n";
		Constructor[] sonstructors = cls.getDeclaredConstructors();
		for(Constructor c : constructors) {
			msg += c.getName() + "(";
			Class[] param = c.getParameterTypes();
			msg += printParam(param)+ ")";
			msg += "\n";
		}
		
		textArea.setText(msg);
		
	}//view
	public String printParam(Class[] p) {
		String r = "";
		for(int i=0 ; i<p.length ; i++) {
			r += p[i].getName();
			if(i<p.length-1) r += ",";
			
		}
		return r;
	}
	

	public void	viewReflect() {
		
	}


	/**										  
	 ** Create the frame.. 
	 */
	public GetPropertyExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel(); 
		contentPane.setBorder(new EmptyBorder(20, 20, 20, 20)); //보더
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.NORTH);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
	}

	private JPanel getPanel() {
		if (panel == null) { //패널이생성되지않았다면
			panel = new JPanel();
			panel.add(getBtnNewButton());//버튼의 실행결과를 패널에 더해라
			panel.add(getBtnNewButton_1());
			panel.add(getBtnNewButton_2());
		}
		return panel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC18D\uC131\uBCF4\uAE30");//속성보기
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					view();//1번 메소드를 만든다.맘대로 그리고 위에 메인이나 필드나 생성자 밑위 쯤 만들어야한다
					
					
				}
			});
		}
		return btnNewButton;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTextArea());//겟텍스트에어리어의 결과를 뷰포트에 보여줘라
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("CLASS");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				viewClass();
				
				
				
				}
			});
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uB9AC\uD50C\uB809\uC158");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				viewReflect();
				
				
				
				
				}
				
				
			});
		}
		return btnNewButton_2;
	}
}
