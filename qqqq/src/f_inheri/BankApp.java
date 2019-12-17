package f_inheri;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BankApp extends JFrame { //프레임생성. extends= 부모자식 유형이 같을때.단일상속

	private JPanel contentPane; 
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem menuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem menuItem_1;
	private JMenuItem mntmNewMenuItem_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BankApp frame = new BankApp();
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
	public BankApp() {
		setTitle("\uC740\uD589\uAD00\uB9AC(Ver 0.9)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnNewMenu());
			menuBar.add(getMnNewMenu_1());
		}
		return menuBar;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("\uACC4\uC88C");
			mnNewMenu.add(getMntmNewMenuItem());
			mnNewMenu.add(getMenuItem());
			mnNewMenu.add(getMntmNewMenuItem_1());
		}
		return mnNewMenu;
	}
	private JMenu getMnNewMenu_1() {
		if (mnNewMenu_1 == null) {
			mnNewMenu_1 = new JMenu("\uC785\uCD9C\uAE08");
			mnNewMenu_1.add(getMenuItem_1());
			mnNewMenu_1.add(getMntmNewMenuItem_2());
		}
		return mnNewMenu_1;
	}
	private JMenuItem getMntmNewMenuItem() {  
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("\uACC4\uC815\uC0DD\uC131");
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) { 
				contentPane.removeAll();//contentpane에 추가된 것들이 삭제됌	//계좌생성에 액션.이 자리에 전에 만든 패널을 합친다.
				AccountCreate ac = new AccountCreate();
				contentPane.add(ac);
				contentPane.updateUI();//현재 UI를 갱신
				}
			});
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMenuItem() {
		if (menuItem == null) {
			menuItem = new JMenuItem("\uACC4\uC815\uBAA9\uB85D");
			menuItem.addActionListener(new ActionListener() {//리스너는 개념도 (인터페이스)안에 있는 메소드를 재정의해줘야한다.
				public void actionPerformed(ActionEvent e) {
					contentPane.removeAll();
					AccountList a1 =new AccountList();
					contentPane.add(a1);
					contentPane.updateUI();
					
				}
			});
		}
		return menuItem;
	}
	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("\uACC4\uC815\uC218\uC815");
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					contentPane.removeAll();
					AccountModify am = new AccountModify();
					contentPane.add(am);
					contentPane.updateUI();
					
				}
			});
		}
		return mntmNewMenuItem_1;
	}
	private JMenuItem getMenuItem_1() {
		if (menuItem_1 == null) {
			menuItem_1 = new JMenuItem("\uC785\uAE08");
			menuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					contentPane.removeAll();
					Deposit dep = new Deposit();
					contentPane.add(dep);
					contentPane.updateUI();
				}
			});
		}
		return menuItem_1;
	}
	private JMenuItem getMntmNewMenuItem_2() {
		if (mntmNewMenuItem_2 == null) {
			mntmNewMenuItem_2 = new JMenuItem("\uCD9C\uAE08");
			mntmNewMenuItem_2.addActionListener(new ActionListener() {  //액션
				public void actionPerformed(ActionEvent e) {            //액션
					contentPane.removeAll();
					Withdraw wd = new Withdraw();
					contentPane.add(wd);
					contentPane.updateUI();
					
				}
			});
		}
		return mntmNewMenuItem_2;
	}
}
