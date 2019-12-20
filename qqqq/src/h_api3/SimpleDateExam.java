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
		super("Simple Date Format",false,true,true,true);//부모 부르기
		setVisible(true);//화면에 보이게 작업을 하는 것.
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
					Date now = new Date();//오늘날짜가져오기
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM--dd (E)요일  hh : mm : ss");
					
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
			status.setFont(new Font("바탕체", Font.PLAIN, 27));
			status.setBounds(35, 90, 467, 72);
		}
		return status;
	}
}
