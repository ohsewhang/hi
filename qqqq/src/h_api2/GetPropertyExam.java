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
			public void run() {//run�߻� ������ �ؾߵȴ�.��Ƽ�����带 �����ϱ� ���ؼ�.				
				try {
					GetPropertyExam frame = new GetPropertyExam(); //�������� ���� �������� ȭ�鿡 ����ִ�.
					frame.setVisible(true);// 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void view() {          //2��view�޼ҵ带 �����.
		String msg = "";
		
		String osName = System.getProperty("os.name");
		
		msg += "�ü���̸�:"+ osName+ "\n";
		msg +="������̸�"+System.getProperty("user.name")+"\n";
		msg +="����� Ȩ"+System.getProperty("user.home")+"\n";
		msg +="=====================================\n";
		msg +=" [  key  ] value\n";
		msg +="=====================================\n";        
		Properties props = System.getProperties();	     //collection 4����.List(����o�ߺ�o), Set(�����ߺ�x) ,
		Set keys = props.keySet();                       //Map(key��value �ѽ�)key�����ߺ�x,vlaue�ߺ�o����x ,Property(���ڿ��α���)->����� �������� ����  
		for(Object objKey : keys) {                      //�迭[] ������ ���� int[]"�ڷ����� �������̴�"  
		String key =(String)objKey;				     	 //ũ�Ⱑ ����
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
		
				
		msg += "[Ŭ������]"+ cls.getName() + "\n";
		
		msg += "[������ ����]\n";
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
		contentPane.setBorder(new EmptyBorder(20, 20, 20, 20)); //����
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.NORTH);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
	}

	private JPanel getPanel() {
		if (panel == null) { //�г��̻��������ʾҴٸ�
			panel = new JPanel();
			panel.add(getBtnNewButton());//��ư�� �������� �гο� ���ض�
			panel.add(getBtnNewButton_1());
			panel.add(getBtnNewButton_2());
		}
		return panel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC18D\uC131\uBCF4\uAE30");//�Ӽ�����
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					view();//1�� �޼ҵ带 �����.����� �׸��� ���� �����̳� �ʵ峪 ������ ���� �� �������Ѵ�
					
					
				}
			});
		}
		return btnNewButton;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTextArea());//���ؽ�Ʈ������� ����� ����Ʈ�� �������
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
