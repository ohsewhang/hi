package h_api2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.awt.event.ActionEvent;

public class StudentApp extends JFrame {
	
	static Student[] student = new Student[100];//100명의 학생을 저장할수있는는 공간을 만든다.
	static int count;
	static {
		
	student[0] =new Student(10,"hong",60);
	student[1] =new Student(1,"kim",90);  
	student[2] =new Student(3,"park",40);
	student[3] =new Student(8,"lee",90);
	student[4] =new Student(2,"hong",66);
	count = 5;
	}
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem menuItem;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JLabel status;
	private JMenuItem menuItem_1;
	
	JPanel panel; //필드로 추가
	
	private JMenuItem mntmNewMenuItem_3;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentApp frame = new StudentApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentApp() {
		setTitle("\uC131\uC801\uAD00\uB9AC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 429, 366);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getStatus(), BorderLayout.SOUTH);
		
		panel =new Main(); //생성자에 메인을 만들어준다. //실행시 사진을 보이게 하는ㄱ 것.
		contentPane.add(panel, BorderLayout.CENTER);
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnNewMenu());
		}
		return menuBar;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("\uC131\uC801\uAD00\uB9AC");
			mnNewMenu.add(getMenuItem_1());
			mnNewMenu.add(getMenuItem());
			mnNewMenu.add(getMntmNewMenuItem());
			mnNewMenu.add(getMntmNewMenuItem_1());
		}
		return mnNewMenu;
	}
	private JMenuItem getMenuItem() {
		if (menuItem == null) {
			menuItem = new JMenuItem("\uC131\uC801\uC785\uB825");
			menuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				if(panel != null) {
					contentPane.remove(panel);
					
				}
				panel  = new ScoreInput(status);
				contentPane.add(panel);
				contentPane.updateUI();
				status.setText("성적을 입력하세요");
				}
			});
		}
		return menuItem;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("\uD559\uBC88\uC21C \uC815\uB82C");
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(panel != null) {
						contentPane.remove(panel);
						
					}
					panel = new SoftBysno(status);
					contentPane.add(panel);
					contentPane.updateUI();
					status.setText("학번순으로 !!!!!!!!");
				}
			});
		}
		return mntmNewMenuItem;
	}
			
	private JMenuItem getMntmNewMenuItem_1() {
		
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("\uC131\uC801\uC21C \uC815\uB82C");//성적순정렬
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				if(panel != null) {
					contentPane.remove(panel);
					
				}
				panel =  new SoftByScore(status);
				contentPane.add(panel);
				contentPane.updateUI();
				status.setText("성적순으로 정렬");
				
				}
			});
		}
		return mntmNewMenuItem_1;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("\uBA54\uB274\uB97C \uC120\uD0DD\uD558\uC0BC!");
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setForeground(Color.MAGENTA);
			status.setPreferredSize(new Dimension(92, 30));
			status.setOpaque(true);
			status.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
			status.setBackground(Color.ORANGE);
		}
		return status;
	}
	private JMenuItem getMenuItem_1() {
		if (menuItem_1 == null) {
			menuItem_1 = new JMenuItem("\uD648"); //홈!
			menuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {  //removev all안씀.
					if(panel != null) {
						contentPane.remove(panel);
					}
					panel = new Main();       //main생성.
					contentPane.add(panel);
					contentPane.updateUI();
					status.setText("홈이예요~메뉴를 선택하세요");
					
					
				}
			});
		}
		return menuItem_1;
	}
}
