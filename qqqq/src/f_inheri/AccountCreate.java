/*305page
 * P a1 = new P();
 * int a1 = 10;//o
 * int a1 = 10.5;//x
 * P a1 = new C//o�θ� �ڽ� ������ ��찡�� p�� �θ� . c�� �ڽ�
 * P a2 = new D//o
 * C c1 = new P();//x�θ�ü�� �����Ͽ� �ڽ� Ŭ���������� �����Ҽ�����
 * Account Creat ac = new AccountCreat ();
 * Jpanel ac = newAccount(); �θ� �ǳ� �ڽ� ��ī��Ʈ
 * Deposit de = new Deposit();
 * Jpanel de = new Deposit();
 * 				������
 * public void method(AccountCreat ac){}//��ī��Ʈũ������Ʈ�� �޴´�
 * pulbic void method(Deposit de){}//�������� �޴���.
 * -->public void method(Jpanel p){}�������� �޼ҵ带 �������ʰ� �θ�Ÿ���� �޼ҵ��� ��������� �������ִ�. ���Ÿ�Կ� �������� �������ְ�,��ī��Ʈ�� �������ִ�
 *     Deposit de =(Deposit)p;�ڽ�Ŭ�������� �߰��� ����� ����ϰ��� �Ҷ��� �ݵ�� �ڽ�Ŭ����Ÿ������ ĳ������ �ؾ��Ѵ�.
 *     
 */

package f_inheri;


import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
                            //jpanel�� �θ� accountcreate�� �ڽ�
public class AccountCreate extends JPanel {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField sno;
	private JLabel label;
	private JTextField mName;
	private JLabel label_1;
	private JTextField amount;
	private JButton btnNewButton;
	private JLabel status;

	/**
	 * Create the panel.
	 */
	public AccountCreate() {
		setLayout(null);
		add(getLblNewLabel());
		add(getLblNewLabel_1());
		add(getSno());
		add(getLabel());
		add(getMName());
		add(getLabel_1());
		add(getAmount());
		add(getBtnNewButton());
		add(getStatus());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uACC4\uC815 \uC0DD\uC131");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setForeground(Color.BLUE);
			lblNewLabel.setFont(new Font("���� ���", Font.PLAIN, 16));
			lblNewLabel.setBounds(12, 10, 397, 28);
		}
		return lblNewLabel;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uACC4\uC88C\uBC88\uD638");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel_1.setBounds(46, 51, 57, 15);
		}
		return lblNewLabel_1;
	}

	private JTextField getSno() {
		if (sno == null) {
			sno = new JTextField();
			sno.setBounds(115, 48, 272, 21);
			sno.setColumns(10);
		}
		return sno;
	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uC608\uAE08\uC8FC");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setBounds(46, 82, 57, 15);
		}
		return label;
	}

	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setBounds(115, 79, 272, 21);
			mName.setColumns(10);
		}
		return mName;
	}

	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("\uC608\uAE08\uC561");
			label_1.setHorizontalAlignment(SwingConstants.CENTER);
			label_1.setBounds(46, 113, 57, 15);
		}
		return label_1;
	}

	private JTextField getAmount() {
		if (amount == null) {
			amount = new JTextField();
			amount.setBounds(115, 110, 272, 21);
			amount.setColumns(10);
		}
		return amount;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uCD94\uAC00"); //���»���
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// ��� �׸��� �ԷµǾ��°� üũ
					if (!sno.getText().equals("") && !mName.getText().equals("") && !amount.getText().equals("")) {
						try {
							//���¹�ȣ�� �ߺ�����üũ
							for(int i =  0 ; i <Bank.count ; i++) { //Bank.count ȣ��.
								Account a = Bank.ac[i];//��ī��Ʈ�� �����´� //Bank.ac[i]=��ũŬ������ ac[i]�� ȣ��
								if(a.getsNo().equals(sno.getText())){//���¿� ���� �Է��ϴ°� ������ ���¹�ȣ�� �ߺ��Ǿ����ϴ�
									throw new IOException("���¹�ȣ�� �ߺ��Ǿ����ϴ�.");
								}
							}
							// ���ݾ��� ���ڷθ� �̷�����ִ� üũ
							Long amt = Long.parseLong(amount.getText());// ���ڿ��� ���� ������ ���ڷ� �ٲ���.
							Account ac = new Account(mName.getText(), sno.getText(), amt);// �Ű������� ���������ʾƼ� ������ �����Ŵ�.
							Bank.ac[Bank.count] = ac;
							Bank.count++;

							status.setText(Bank.count + "��° ���� ��ϵǾ����ϴ�.");
							mName.setText("");
							amount.setText("");
							sno.requestFocus();// Ŀ���̵�
							sno.selectAll();
						}catch(IOException ex2) {
							status.setText(ex2.getMessage());
							sno.requestFocus();
							sno.selectAll();						
						} catch (Exception ex) {// ������ ���� ĳġ�ϰ�,������� ������ �װ��� �̰����� ó���ϰڴ�.
							status.setText("���ݾ׿� ���ڳ� ������ �ִ�!!!!!");// ���ڸ� �ȹٷ� �Է��ض�
							amount.requestFocus();// Ŀ���� �̵�
							amount.selectAll(); // �巡������.
						}
					} else {
						status.setText("�Է��׸��� Ȯ���ϼ���");
						sno.requestFocus();
					}
				}
			});
			btnNewButton.setBounds(181, 141, 97, 23);
		}
		return btnNewButton;
	}

	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("New label");
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setOpaque(true);
			status.setBackground(Color.WHITE);
			status.setBounds(36, 174, 351, 28);
		}
		return status;
	}
}
