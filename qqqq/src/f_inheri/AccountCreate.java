/*305page
 * P a1 = new P();
 * int a1 = 10;//o
 * int a1 = 10.5;//x
 * P a1 = new C//o부모 자식 관계인 경우가능 p가 부모 . c가 자식
 * P a2 = new D//o
 * C c1 = new P();//x부모객체를 생성하여 자식 클래스변수에 대입할수없다
 * Account Creat ac = new AccountCreat ();
 * Jpanel ac = newAccount(); 부모 판넬 자식 어카운트
 * Deposit de = new Deposit();
 * Jpanel de = new Deposit();
 * 				다형성
 * public void method(AccountCreat ac){}//어카운트크리에이트를 받는다
 * pulbic void method(Deposit de){}//디포짓을 받느다.
 * -->public void method(Jpanel p){}여러개의 메소드를 만들지않고 부모타입의 메소드인 제이페널을 받을수있다. 페널타입에 디포짓을 받을수있고,어카운트도 받을수있다
 *     Deposit de =(Deposit)p;자식클래스에서 추가된 멤버를 사용하고자 할때는 반드시 자식클래스타입으로 캐스팅을 해야한다.
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
                            //jpanel이 부모 accountcreate가 자식
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
			lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
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
			btnNewButton = new JButton("\uCD94\uAC00"); //계좌생성
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// 모든 항목이 입력되었는가 체크
					if (!sno.getText().equals("") && !mName.getText().equals("") && !amount.getText().equals("")) {
						try {
							//계좌번호의 중복여부체크
							for(int i =  0 ; i <Bank.count ; i++) { //Bank.count 호출.
								Account a = Bank.ac[i];//어카운트를 가져온다 //Bank.ac[i]=뱅크클래스의 ac[i]를 호출
								if(a.getsNo().equals(sno.getText())){//계좌와 내가 입력하는게 같으면 계좌번호가 중복되었습니당
									throw new IOException("계좌번호가 중복되었습니다.");
								}
							}
							// 예금액이 숫자로만 이루어져있는 체크
							Long amt = Long.parseLong(amount.getText());// 문자열로 들어온 정보를 숫자로 바꿔줌.
							Account ac = new Account(mName.getText(), sno.getText(), amt);// 매개변수가 존재하지않아서 세개를 넣을거다.
							Bank.ac[Bank.count] = ac;
							Bank.count++;

							status.setText(Bank.count + "번째 고객이 등록되었습니다.");
							mName.setText("");
							amount.setText("");
							sno.requestFocus();// 커서이동
							sno.selectAll();
						}catch(IOException ex2) {
							status.setText(ex2.getMessage());
							sno.requestFocus();
							sno.selectAll();						
						} catch (Exception ex) {// 에러가 나면 캐치하고,어떤오류라도 만나면 그것을 이곳에서 처리하겠다.
							status.setText("예금액에 문자나 공백이 있다!!!!!");// 숫자를 똑바로 입력해라
							amount.requestFocus();// 커서가 이동
							amount.selectAll(); // 드래그해줌.
						}
					} else {
						status.setText("입력항목을 확인하세요");
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
