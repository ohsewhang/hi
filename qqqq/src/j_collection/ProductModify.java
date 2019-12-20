package j_collection;

import java.awt.EventQueue;
import java.util.Set;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Color;

public class ProductModify extends JInternalFrame {
	Set<ProductVo> piList; 
	Set<ProductVo> peList;
	private JLabel lblNewLabel;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JLabel lblNewLabel_1;
	private JTextField serial;
	private JButton btnNewButton;
	private JSeparator separator;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField pCode;
	private JTextField pName;
	private JTextField ea;
	private JTextField nal;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel_6;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductModify frame = new ProductModify();
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
	public ProductModify() {
		super("제품수정삭제",false,true,true,true);
		getContentPane().setBackground(new Color(204, 255, 255));
		setVisible(true);
		setBounds(100, 100, 322, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getRdbtnNewRadioButton());
		getContentPane().add(getRdbtnNewRadioButton_1());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getSerial());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getSeparator());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLblNewLabel_3());
		getContentPane().add(getLblNewLabel_4());
		getContentPane().add(getLblNewLabel_5());
		getContentPane().add(getPCode());
		getContentPane().add(getPName());
		getContentPane().add(getEa());
		getContentPane().add(getNal());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getBtnNewButton_2());
		getContentPane().add(getLblNewLabel_6());

	}
	public ProductModify(Set<ProductVo> pi, Set<ProductVo> pe) {
		this();          //중복정의해서 중복정의된 생성자에서 입고정보 출고정보를 매개변수로 만들어줘서 유아이에 뿌려준다.
		this.piList = pi;
		this.peList = pe;
			
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uAD6C\uBD84");
			lblNewLabel.setBounds(12, 10, 57, 15);
		}
		return lblNewLabel;
	}
	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("\uC785\uACE0");
			rdbtnNewRadioButton.setBounds(61, 6, 49, 23);
		}
		return rdbtnNewRadioButton;
	}
	private JRadioButton getRdbtnNewRadioButton_1() {
		if (rdbtnNewRadioButton_1 == null) {
			rdbtnNewRadioButton_1 = new JRadioButton("\uCD9C\uACE0");
			rdbtnNewRadioButton_1.setBounds(128, 6, 49, 23);
		}
		return rdbtnNewRadioButton_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC2DC\uB9AC\uC5BC");
			lblNewLabel_1.setBounds(12, 42, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getSerial() {
		if (serial == null) {
			serial = new JTextField();
			serial.setBounds(73, 39, 116, 21);
			serial.setColumns(10);
		}
		return serial;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");
			btnNewButton.setBounds(205, 38, 97, 23);
		}
		return btnNewButton;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(22, 67, 275, 9);
		}
		return separator;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC81C\uD488\uCF54\uB4DC");
			lblNewLabel_2.setBounds(32, 86, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC81C\uD488\uBA85");
			lblNewLabel_3.setBounds(32, 111, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uC218\uB7C9");
			lblNewLabel_4.setBounds(32, 136, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uB0A0\uC9DC");
			lblNewLabel_5.setBounds(32, 161, 57, 15);
		}
		return lblNewLabel_5;
	}
	private JTextField getPCode() {
		if (pCode == null) {
			pCode = new JTextField();
			pCode.setBounds(85, 83, 116, 21);
			pCode.setColumns(10);
		}
		return pCode;
	}
	private JTextField getPName() {
		if (pName == null) {
			pName = new JTextField();
			pName.setBounds(85, 108, 116, 21);
			pName.setColumns(10);
		}
		return pName;
	}
	private JTextField getEa() {
		if (ea == null) {
			ea = new JTextField();
			ea.setBounds(85, 133, 116, 21);
			ea.setColumns(10);
		}
		return ea;
	}
	private JTextField getNal() {
		if (nal == null) {
			nal = new JTextField();
			nal.setBounds(85, 158, 116, 21);
			nal.setColumns(10);
		}
		return nal;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC218\uC815");
			btnNewButton_1.setBounds(33, 189, 97, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uC0AD\uC81C");
			btnNewButton_2.setBounds(142, 189, 97, 23);
		}
		return btnNewButton_2;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("");
			lblNewLabel_6.setOpaque(true);
			lblNewLabel_6.setBackground(Color.GREEN);
			lblNewLabel_6.setBounds(32, 223, 227, 15);
		}
		return lblNewLabel_6;
	}
}
