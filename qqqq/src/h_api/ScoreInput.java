package h_api;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

import h_api2.Student;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScoreInput extends JPanel {
	private JLabel lblNewLabel;
	private JLabel label;
	private JTextField sj;
	private JTextField sno;
	private JButton btnNewButton_1;
	private JButton button;
	private JLabel lblNewLabel_1;

	/**
	 * Create the panel.
	 */
	public ScoreInput() {
		setLayout(null);
		add(getLblNewLabel());
		add(getLabel());
		add(getSj());
		add(getSno());
		add(getBtnNewButton_1());
		add(getButton());
		add(getLblNewLabel_1());

	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC131\uC801 \uC785\uB825");
			lblNewLabel.setBounds(22, 87, 57, 18);
		}
		return lblNewLabel;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uD559\uBC88 \uC785\uB825");
			label.setBounds(22, 129, 57, 15);
		}
		return label;
	}
	private JTextField getSj() {
		if (sj == null) {
			sj = new JTextField();
			sj.setBounds(75, 86, 116, 21);
			sj.setColumns(10);
		}
		return sj;
	}
	private JTextField getSno() {
		if (sno == null) {
			sno = new JTextField();
			sno.setBounds(75, 126, 116, 21);
			sno.setColumns(10);
		}
		return sno;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uD655\uC778");//세번째 확인
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) { 
				}
			});
			btnNewButton_1.setBounds(203, 125, 57, 23);
		}
		return btnNewButton_1;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("\uD655\uC778"); //첫번째 확인
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Student[]n = new Student[] { //student배열에 다섯개가 들어가있음.
							new Student(10,"hong",60),//학번 순으로 정렬해서 찍었다면 김홍박이홍
							new Student(1,"kim",90),  //2번째 성적순
							new Student(3,"park",40),
							new Student(8,"lee",90),
							new Student(2,"hong",66)
					};	
				
				
				
				
				
				
				
				}
			});
			button.setBounds(203, 85, 57, 23);
		}
		return button;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC131\uC801\uC785\uB825");
			lblNewLabel_1.setOpaque(true);
			lblNewLabel_1.setBackground(Color.CYAN);
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 16));
			lblNewLabel_1.setBounds(22, 10, 416, 43);
		}
		return lblNewLabel_1;
	}
}
