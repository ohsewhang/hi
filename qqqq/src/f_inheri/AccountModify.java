package f_inheri;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AccountModify extends JPanel {
	private JLabel label;
	private JTextField sno;
	private JButton btnNewButton;
	private JLabel label_1;
	private JTextField mName;
	private JLabel label_2;
	private JTextField amount;
	private JButton btnNewButton_1;
	
	private int pos; //검색된 고객의 위치번호
	private JLabel status;

	/**
	 * Create the panel.
	 */
	public AccountModify() {
		setLayout(null);
		add(getLabel());
		add(getSno());
		add(getBtnNewButton());
		add(getLabel_1());
		add(getnName());
		add(getLabel_2());
		add(getAmount());
		add(getBtnNewButton_1());
		add(getStatus());

	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uACC4\uC815 \uC815\uBCF4 \uC218\uC815");
			label.setFont(new Font("굴림", Font.PLAIN, 16));
			label.setForeground(Color.BLUE);
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setBounds(72, 10, 299, 25);
		}
		return label;
	}
	private JTextField getSno() {
		if (sno == null) {
			sno = new JTextField();
			sno.setBounds(159, 46, 162, 21);
			sno.setColumns(10);
		}
		return sno;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");//검색
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
		
					
				String find = sno.getText();				
				pos = -1; //발견하지못했다. 
				for(int i = 0 ; i <Bank.count ; i++) {
					Account a = Bank.ac[i];
					
					if(a.getsNo().equals(find)){//찾은 경우
						mName.setText(a.getnName());
						amount.setText(a.getAmount() + "");
						pos = i;
						break;
					}
				}
					//if
		
			
		
				}
			});
			btnNewButton.setBounds(333, 45, 70, 23);
		}
		return btnNewButton;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("\uC608\uAE08\uC8FC");
			label_1.setBounds(29, 89, 57, 15);
		}
		return label_1;
	}
	private JTextField getnName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setBounds(105, 86, 116, 21);
			mName.setColumns(10);
		}
		return mName;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("\uC608\uAE08\uC561");
			label_2.setBounds(29, 140, 57, 15);
		}
		return label_2;
	}
	private JTextField getAmount() {
		if (amount == null) {
			amount = new JTextField();
			amount.setBounds(105, 137, 209, 21);
			amount.setColumns(10);
		}
		return amount;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC218\uC815 \uD655\uC778");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (!sno.getText().equals("") && !mName.getText().equals("") ) {
					try {
					if(pos>-1) { //데이터를 찾았을때만 실행;
					Account a = Bank.ac[pos];
					long amt = Long.parseLong(amount.getText());//문자열을 숫자로 바꾸는..
					a.setnName(mName.getText());
					a.setAmount(amt);
					}
					}catch(Exception ex2) {
						status.setText("입력항목을 확인해주세요");
					}
										
				}else {status.setText("입력항목을 확인해주세요");
				}
				}
			});
			btnNewButton_1.setBounds(115, 168, 97, 23);
		}
		return btnNewButton_1;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("\uC624\uB958");
			status.setBackground(Color.MAGENTA);
			status.setForeground(Color.BLACK);
			status.setOpaque(true);
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBounds(29, 205, 374, 15);
		}
		return status;
	}
}
