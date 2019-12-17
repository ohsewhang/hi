package f_inheri;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.DecimalFormat;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AccountList extends JPanel {
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel lblNewLabel_1;

	/**
	 * Create the panel.
	 */
	public AccountList() {//������
		setLayout(null);
		add(getLblNewLabel());
		add(getScrollPane()); 
		showList();  //�޼ҵ���� �׽�Ʈ���̸�� ����ϱ����� ������ ���� �Ʒ�.

	}
	public void showList() { //��ü����
		String str = "";
		DecimalFormat  df = new DecimalFormat("##,###,###,###.#"); //�Ҽ��� ���ڸ��� ���̰� ���ڸ����� ,�� ���޶�� ���ڿ�
		
		for(int i = 0 ; i<Bank.count ; i++) {//ī��Ʈ�� �ε������ƴϴ�.
		Account	a = Bank.ac[i];	//acountŸ��			//bank�� ��������
		str += a.getsNo();//���¹���
		str += "\t" + a.getnName(); //t�� ��.//������
		str += "\t" + df.format(a.getAmount()); //�ݾ� //�Ҽ������� ���� ����..
		str += "\n";//�ٹٲٱ�
		}								
		textArea.setText(str);//������ ������� ������ str�� ���� ����.set! 
	}
	
	
	
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uACC4\uC815  \uBAA9\uB85D");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setForeground(Color.BLUE);
			lblNewLabel.setFont(new Font("���� ���", Font.PLAIN, 16));
			lblNewLabel.setBounds(77, 10, 143, 22);
		}
		return lblNewLabel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 36, 289, 137);
			scrollPane.setViewportView(getTextArea());
			scrollPane.setColumnHeaderView(getLblNewLabel_1());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uACC4\uC88C\uBC88\uD638          \uC608\uAE08\uC8FC           \uC608\uAE08\uC794\uC561");
		}
		return lblNewLabel_1;
	}
}
