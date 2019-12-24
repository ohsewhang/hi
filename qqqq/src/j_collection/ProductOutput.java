package j_collection;

import java.awt.EventQueue;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductOutput extends JInternalFrame {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField pCode;
	private JTextField pName;
	private JTextField ea;
	private JTextField nal;
	private JButton btnNewButton;
	private JLabel status;
	private Set<ProductVo> piListpe;
	private Set<ProductVo> peList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductOutput frame = new ProductOutput();
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
	public ProductOutput() {
		super("��ǰ���", false, true, true, true);
		getContentPane().setBackground(new Color(204, 255, 255));
		setVisible(true);
		setBounds(100, 100, 264, 261);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLblNewLabel_3());
		getContentPane().add(getPCode());
		getContentPane().add(getPName());
		getContentPane().add(getEa());
		getContentPane().add(getNal());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getStatus());

	}

	public ProductOutput(Set<ProductVo> pe) { // �����ڸ� ���������������� ������ �ִ� �� ������ �÷����� pilist�� ���۷��̵Ȱ��̴�~~~~~~~
		this();
		this.peList = pe;
	}

	public void output() { // �ƿ�ǲ ������ ����.
		// ���� ���� ������ productvo��ü ������ �켱.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			String serial = sdf.format(new Date()) + "-" + MemberMain.eSerial;
			String pC = pCode.getText();
			String pN = pName.getText();
			int e = Integer.parseInt(ea.getText());
			Date n = sdf.parse(nal.getText()); // ����ó��
			ProductVo vo = new ProductVo(serial, pC, pN, e, n);
			
			// peList�� �߰��ϴ� �۾��� �ؾ���.
			peList.add(vo);
			
			MemberMain.eSerial++;
			
			status.setText("��� �ڷᰡ ���������� �ԷµǾ����ϴ�.");
			pName.setText("");
			pCode.requestFocus();
			pCode.selectAll();
		} catch (ParseException e1) {
			status.setText("��¥������ yyyy-MM-dd�� �Է����ּ���");
			e1.printStackTrace();
			nal.requestFocus();
			nal.selectAll();
		}catch(NumberFormatException e2) {
			status.setText("���ڸ� �Է����ּ���");
			ea.requestFocus();
			ea.selectAll();
		};

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC81C\uD488\uCF54\uB4DC");
			lblNewLabel.setBounds(34, 34, 57, 15);
		}
		return lblNewLabel;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC81C\uD488\uBA85");
			lblNewLabel_1.setBounds(34, 70, 57, 15);
		}
		return lblNewLabel_1;
	}

	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uCD9C\uACE0 \uC218\uB7C9");
			lblNewLabel_2.setBounds(34, 106, 57, 15);
		}
		return lblNewLabel_2;
	}

	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uCD9C\uACE0 \uC77C\uC790");
			lblNewLabel_3.setBounds(34, 137, 57, 15);
		}
		return lblNewLabel_3;
	}

	private JTextField getPCode() {
		if (pCode == null) {
			pCode = new JTextField();
			pCode.setBounds(104, 31, 133, 21);
			pCode.setColumns(10);
		}
		return pCode;
	}

	private JTextField getPName() {
		if (pName == null) {
			pName = new JTextField();
			pName.setBounds(104, 67, 116, 21);
			pName.setColumns(10);
		}
		return pName;
	}

	private JTextField getEa() {
		if (ea == null) {
			ea = new JTextField();
			ea.setBounds(104, 103, 116, 21);
			ea.setColumns(10);
		}
		return ea;
	}

	private JTextField getNal() {
		if (nal == null) {
			nal = new JTextField();
			nal.setBounds(104, 134, 133, 21);
			nal.setColumns(10);

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // ���¥����.
			nal.setText(sdf.format(new Date()));
		}
		return nal;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uCD9C\uACE0");// ���
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					output(); // �޼ҵ����

				}
			});
			btnNewButton.setBounds(114, 164, 97, 23);
		}
		return btnNewButton;
	}

	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setOpaque(true);
			status.setBackground(new Color(204, 255, 0));
			status.setBounds(34, 198, 186, 15);
		}
		return status;
	}
}
