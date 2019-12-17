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
		this();		//밑에 스코어인풋 생성자를 호출하려면!생성자를 호출하는 건 제일 첫줄에 디스를 쓴다.
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
			lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 16));
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
			btnNewButton = new JButton("\uC785\uB825");//성적입력
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int no = Integer.parseInt(sno.getText()); //no학번 겟텍 문자열이라 정수로 받아야함.인티저 펄스인트에 기존 문자열을 넣어줌 
					String irum = mName.getText();//이름이란 변수에 디자인에 엠네임을 넣어줌
					int s = Integer.parseInt(score.getText());//성적 
														//std는 정적형으로 만들어서 모든 클래스가 공유자원으로 쓸수있다.
					Student std = new Student(no,irum,s);//student클래스에 생성자 두개만 만들었어서(Student())<매개변수 빈걸 안만듬.
					StudentApp.student[StudentApp.count] = std;//no와 이름과 s는 스튜던트 클래스 student(asd,asd,asd)에 들어간다.
					StudentApp.count++; 
					
					
					status.setText(StudentApp.count + "번째 성적이 추가되었숩니다");
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
