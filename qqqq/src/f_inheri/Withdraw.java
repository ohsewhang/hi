package f_inheri;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Withdraw extends JPanel {
	private JLabel lblNewLabel;
	private JTextField sno;
	private JButton btnNewButton;
	private JLabel label;
	private JLabel lblNewLabel_1;
	private JTextField mName;
	private JLabel label_1;
	private JTextField amount;
	private JLabel lblNewLabel_2;
	private JTextField wamt;
	private JButton btnNewButton_1;
	private int pos;
	private JLabel status;

	/**
	 * Create the panel.
	 */
	public Withdraw() {
		setLayout(null);
		add(getLblNewLabel());
		add(getSno());
		add(getBtnNewButton());
		add(getLabel());
		add(getLblNewLabel_1());
		add(getMName());
		add(getLabel_1());
		add(getAmount());
		add(getLblNewLabel_2());
		add(getWamt());
		add(getBtnNewButton_1());
		add(getStatus());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uCD9C\uAE08");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
			lblNewLabel.setForeground(Color.BLUE);
			lblNewLabel.setBounds(45, 10, 252, 34);
		}
		return lblNewLabel;
	}

	private JTextField getSno() {
		if (sno == null) {
			sno = new JTextField();
			sno.setBounds(94, 66, 172, 21);
			sno.setColumns(10);
		}
		return sno;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					DecimalFormat df = new DecimalFormat("##,###,###,###.#");
					String find = sno.getText();
					pos = -1;
					for (int i = 0; i < Bank.count; i++) {
						Account a = Bank.ac[i];
						if (a.getsNo().equals(find)) {
							status.setText("오류");
							mName.setText(a.getnName());
							amount.setText(df.format(a.getAmount()));
							pos = i;
							break;
							
						}
						if (pos == -1) {
							status.setText("ㄱㅖ좌정보 ㄴㄴ");
						}
					}

				}
			});
			btnNewButton.setBounds(278, 65, 69, 23);
		}
		return btnNewButton;
	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uACC4\uC88C\uBC88\uD638");
			label.setBounds(31, 69, 57, 15);
		}
		return label;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC608\uAE08\uC8FC");
			lblNewLabel_1.setBounds(31, 100, 57, 15);
		}
		return lblNewLabel_1;
	}

	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setEditable(false);
			mName.setBounds(104, 97, 116, 21);
			mName.setColumns(10);
		}
		return mName;
	}

	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("\uC794\uC561");
			label_1.setBounds(31, 137, 57, 15);
		}
		return label_1;
	}

	private JTextField getAmount() {
		if (amount == null) {
			amount = new JTextField();
			amount.setEditable(false);
			amount.setBounds(91, 134, 206, 21);
			amount.setColumns(10);
		}
		return amount;
	}

	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uCD9C\uAE08\uC561");
			lblNewLabel_2.setBounds(31, 168, 57, 15);
		}
		return lblNewLabel_2;
	}

	private JTextField getWamt() {
		if (wamt == null) {
			wamt = new JTextField();
			wamt.setBounds(94, 165, 187, 21);
			wamt.setColumns(10);
		}
		return wamt;
	}

	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uCD9C\uAE08\uCC98\uB9AC");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (!sno.getText().equals("") && !mName.getText().equals("") && !amount.getText().equals("")) {
						try {
							long amt = Long.parseLong(wamt.getText());
							if (pos >= 0) {
								Account a = Bank.ac[pos];								
								if(amt>a.getAmount()) {
									status.setText("금액이부족합니다");
								}else {long temp = a.getAmount()-amt;
								status.setText("");
								a.setAmount(temp);
								}
								
								
							}
						} catch (Exception ex2) {
							status.setText("공백이나 문자가 있습니다.");
						}
					} else {
						status.setText("공백이나 문자가 있습니다.");

					}
				}
			});
			btnNewButton_1.setBounds(134, 196, 111, 23);
		}
		return btnNewButton_1;
	}

	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("\uC624\uB958");
			status.setOpaque(true);
			status.setBackground(Color.YELLOW);
			status.setBounds(31, 220, 266, 15);
		}
		return status;
	}
}
