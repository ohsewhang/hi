package j_home;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TimeWatch extends JFrame {

	private JPanel contentPane;  //필드명은 디자인모드에서 바꿔야함.
	private JLabel lblNewLabel;
	private JTextField txtSadasd;
	private JLabel label;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton button;
	private JPanel panel_1;
	private JLabel labelTime;

	/**
	 * Launch the application.
	 */ 
	public static void main(String[] args) { //메인
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimeWatch frame = new TimeWatch();
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
	public TimeWatch() {        //생성자
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTxtSadasd());
		contentPane.add(getLabel());
		contentPane.add(getBtnNewButton());
		contentPane.add(getButton());
		contentPane.add(getPanel_1()); //패널을 만들어서 붙이는. //컨트롤 마우스 왼쪽 클릭하면 그리 이동.
		DateTimeThread dtt = new DateTimeThread(txtSadasd);//datetimethread의 lable이며 watch옆에 있다.
		dtt.setDaemon(true); //
		dtt.start();
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC2DC\uACC4");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(48, 10, 325, 15);
		}
		return lblNewLabel;
	}
	private JTextField getTxtSadasd() {
		if (txtSadasd == null) {
			txtSadasd = new JTextField();
			txtSadasd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					
				}
			});
			txtSadasd.setBackground(Color.RED);
			txtSadasd.setHorizontalAlignment(SwingConstants.CENTER);
			txtSadasd.setText("2019-12-18(\uC218)17:08:01");
			txtSadasd.setFont(new Font("돋움", Font.BOLD | Font.ITALIC, 22));
			txtSadasd.setBounds(48, 35, 325, 68);
			txtSadasd.setColumns(10);
		}
		return txtSadasd;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uC2A4\uD1B1\uC6CC\uCE58");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setBounds(48, 151, 325, 15);
		}
		return label;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new StopWatchThread();
			panel.setBounds(48, 176, 330, 59);
		}
		return panel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC2DC\uC7C9");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				
					StopWatchThread st = (StopWatchThread)panel_1;  //패널을 강제캐스팅ㅍ
					st.stop = false;
					Thread t = new Thread(st);
					t.setDaemon(true);
					t.start();
				
				
				
				}
			});
			btnNewButton.setBounds(86, 253, 97, 23);
		}
		return btnNewButton;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("\uC8F5\uB8CC");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					StopWatchThread st = (StopWatchThread)panel_1;  //패널을 강제캐스팅ㅍ
					st.stop = true;
				
				}
			});
			button.setBounds(236, 253, 97, 23);
		}
		return button;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new StopWatchThread(); //StopWatchThread를 여기 패널에 고정시킴.
			panel_1.setBounds(48, 176, 335, 60);
		}
		return panel_1;
	}
}
