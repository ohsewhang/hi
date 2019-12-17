package h_api2;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScoreInput extends JPanel {
	private JLabel lblNewLabel;
	private JLabel label;
	private JTextField score;
	private JTextField sno;
	private JLabel lblNewLabel_1;
	private JTextField mName;
	private JButton btnNewButton;
	private JLabel asd;
	public JLabel status;

	/**
	 * Create the panel.
	 */
	public ScoreInput(JLabel status) {
		this();		//�ؿ� ���ھ���ǲ �����ڸ� ȣ���Ϸ���!�����ڸ� ȣ���ϴ� �� ���� ù�ٿ� �𽺸� ����.
		this.status = status;
		
		
	}
	public ScoreInput() {
		setLayout(null);
		add(getLblNewLabel());
		add(getLabel());
		add(getScore());
		add(getSno());
		add(getLblNewLabel_1());
		add(getMName());
		add(getBtnNewButton());
		add(getAsd());

	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC131\uC801 \uC785\uB825");
			lblNewLabel.setBounds(12, 162, 57, 18);
		}
		return lblNewLabel;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uD559\uBC88 \uC785\uB825");
			label.setBounds(12, 92, 57, 15);
		}
		return label;
	}
	private JTextField getScore() {
		if (score == null) {
			score = new JTextField();
			score.setBounds(75, 161, 82, 21);
			score.setColumns(10);
		}
		return score;
	}
	private JTextField getSno() {
		if (sno == null) {
			sno = new JTextField();
			sno.setBounds(81, 89, 82, 21);
			sno.setColumns(10);
		}
		return sno;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC131\uC801\uC785\uB825");
			lblNewLabel_1.setOpaque(true);
			lblNewLabel_1.setBackground(Color.CYAN);
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 16));
			lblNewLabel_1.setBounds(22, 10, 416, 43);
		}
		return lblNewLabel_1;
	}
	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setBounds(75, 126, 82, 21);
			mName.setColumns(10);
		}
		return mName;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC785\uB825");//�����Է�
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int no = Integer.parseInt(sno.getText()); //no�й� ���� ���ڿ��̶� ������ �޾ƾ���.��Ƽ�� �޽���Ʈ�� ���� ���ڿ��� �־��� 
					String irum = mName.getText();//�̸��̶� ������ �����ο� �������� �־���
					int s = Integer.parseInt(score.getText());//���� 
														//std�� ���������� ���� ��� Ŭ������ �����ڿ����� �����ִ�.
					Student std = new Student(no,irum,s);//studentŬ������ ������ �ΰ��� ������(Student())<�Ű����� ��� �ȸ���.
					StudentApp.student[StudentApp.count] = std;//no�� �̸��� s�� ��Ʃ��Ʈ Ŭ���� student(asd,asd,asd)�� ����.
					StudentApp.count++; 
					
					
					status.setText(StudentApp.count + "��° ������ �߰��Ǿ����ϴ�");
				}
			});
			btnNewButton.setBounds(169, 81, 97, 111);
		}
		return btnNewButton;
	}
	private JLabel getAsd() {
		if (asd == null) {
			asd = new JLabel("\uC774\uB984 \uC785\uB825");
			asd.setBounds(12, 129, 57, 15);
		}
		return asd;
	}
}
