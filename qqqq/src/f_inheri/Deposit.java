package f_inheri;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Deposit extends JPanel {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField sno;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2;
	private JTextField mName;
	private JLabel label;
	private JTextField amount;
	private JButton btnNewButton_1;
	private int pos = -1;
	private JLabel status;

	/**
	 * Create the panel.
	 */
	public Deposit() {
		setLayout(null);
		add(getLblNewLabel());
		add(getLblNewLabel_1());
		add(getSno());
		add(getBtnNewButton());
		add(getLblNewLabel_2());
		add(getMName());
		add(getLabel());
		add(getAmount());
		add(getBtnNewButton_1());
		add(getStatus());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC608\uAE08");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setForeground(Color.RED);
			lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
			lblNewLabel.setBounds(12, 10, 406, 36);
		}
		return lblNewLabel;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uACC4\uC88C\uBC88\uD638");
			lblNewLabel_1.setBounds(12, 72, 73, 15);
		}
		return lblNewLabel_1;
	}

	private JTextField getSno() {
		if (sno == null) {
			sno = new JTextField();
			sno.setBounds(66, 69, 236, 21);
			sno.setColumns(10);
		}
		return sno;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");// 검색
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					String find = sno.getText();// sno가 가지고 있는 디자인의 텍스트
					pos = -1;
					for (int i = 0; i < Bank.count; i++) {
					
						Account a = Bank.ac[i];// 뱅크가 가지고있는 배열을 임의의 변수a에 넣자~
						if (a.getsNo().equals(find)) {
							mName.setText(a.getnName());
							pos = i;
							status.setText("오류");
						}
						
					}if(pos == -1) {
						status.setText("계좌정보가없습니다");
					}

					
				

					// if
				}// void

			});// void
			btnNewButton.setBounds(314, 68, 97, 23);
		} // new
		return btnNewButton;
	}// if

	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC608\uAE08\uC8FC");
			lblNewLabel_2.setBounds(12, 100, 57, 15);
		}
		return lblNewLabel_2;
	}

	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setEditable(false);
			mName.setBounds(66, 97, 97, 21);
			mName.setColumns(10);
		}
		return mName;
	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uC608\uAE08\uC561");
			label.setBounds(12, 125, 57, 15);
		}
		return label;
	}

	private JTextField getAmount() {
		if (amount == null) {
			amount = new JTextField();
			amount.setBounds(66, 128, 236, 21);
			amount.setColumns(10);
		}
		return amount;
	}

	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC785\uAE08\uCC98\uB9AC");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (!sno.getText().equals("") && !mName.getText().equals("") && !amount.getText().equals("")) {
						try {
						Long amt = Long.parseLong(amount.getText());
						if (pos >= 0) {
							Account a = Bank.ac[pos];
							long temp = a.getAmount() + amt;
							a.setAmount(temp);
						}
						
						}catch(Exception ex2) {	
						status.setText("공백이나 문자가 있습니다.");
						}
					}else {status.setText("예금액에 문자가 입력되었씁니다");
				}
				}
			});
			btnNewButton_1.setBounds(153, 159, 97, 23);
		}
		return btnNewButton_1;
	}

	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("\uC624\uB958");
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBounds(30, 192, 285, 15);
		}
		return status;
	}
}
