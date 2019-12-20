package h_api3;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class SimpleDateExam extends JInternalFrame {
	private JButton btnNewButton;
	private JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleDateExam frame = new SimpleDateExam();
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
	public SimpleDateExam() {
		super("Simple Date Format",false,true,true,true);//�θ� �θ���
		setVisible(true);//ȭ�鿡 ���̰� �۾��� �ϴ� ��.
		setBounds(100, 100, 629, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getStatus());

	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC624\uB298\uB0A0\uC9DC");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Date now = new Date();//���ó�¥��������
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM--dd (E)����  hh : mm : ss");
					
					status.setText(sdf.format(now));
					
				}
			});
			btnNewButton.setBounds(215, 57, 97, 23);
		}
		return btnNewButton;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("New label");
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setFont(new Font("����ü", Font.PLAIN, 27));
			status.setBounds(35, 90, 467, 72);
		}
		return status;
	}
}
