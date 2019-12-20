package j_collection;

import java.awt.EventQueue;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductInput extends JInternalFrame {
	
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel label;
	private JTextField pCode;
	private JTextField pName;
	private JTextField ea;
	private JTextField nal;
	private JButton btnNewButton;
	private JLabel lblNewLabel_3;
	private Set<ProductVo> piList;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductInput frame = new ProductInput();
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
	public ProductInput() {
		super("제품입고",false,true,true,true);
		setOpaque(true);
		setBackground(new Color(255, 153, 255));
		getContentPane().setBackground(new Color(204, 255, 255));
		setVisible(true);
		setBounds(100, 100, 242, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLabel());
		getContentPane().add(getPCode());
		getContentPane().add(getPName());
		getContentPane().add(getEa());
		getContentPane().add(getNal());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getLblNewLabel_3());

	}
	public ProductInput(Set<ProductVo>pi) { //생성자를 만들어메인프레임이 가지고 있는 셋 구조의 컬렉션인 pilist가 레퍼러싱된것이다~~~~~~~
		this();
		this.piList = pi;
		
	}
	public void input() {  //밑에 인풋창에 있는걸 생성자밑에 만들어준거다.밑에는 출력만.//인풋 메소드..만듬;;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
		String serial =  sdf.format(new Date())+"-" +MemberMain.iSerial;
		String pC = pCode.getText();
		String pN = pName.getText();
		int e = Integer.parseInt(ea.getText());
		Date n = sdf.parse(nal.getText()); //"yyyy이게 들어간다 nal로
		
		MemberMain.iSerial++;
		
		ProductVo vo = new ProductVo(serial, pC, pN, e, n);
		piList.add(vo);	
		MemberMain.iSerial++;
	
		}catch(Exception ex) {}	
		
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC81C\uD488\uCF54\uB4DC");
			lblNewLabel.setBounds(12, 45, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC81C\uD488\uBA85");
			lblNewLabel_1.setBounds(12, 83, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC218\uB7C9");
			lblNewLabel_2.setBounds(12, 123, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uC785\uACE0\uC77C\uC790");
			label.setBounds(12, 163, 57, 15);
		}
		return label;
	}
	private JTextField getPCode() {
		if (pCode == null) {
			pCode = new JTextField();
			pCode.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
				}
			});
			pCode.setBounds(72, 42, 144, 21);
			pCode.setColumns(10);
		}
		return pCode;
	}
	private JTextField getPName() {
		if (pName == null) {
			pName = new JTextField();
			pName.setBounds(72, 80, 144, 21);
			pName.setColumns(10);
		}
		return pName;
	}
	private JTextField getEa() {
		if (ea == null) {
			ea = new JTextField();
			ea.setBounds(72, 120, 103, 21);
			ea.setColumns(10);
		}
		return ea;
	}
	private JTextField getNal() {
		if (nal == null) {
			nal = new JTextField();
			nal.setBounds(71, 160, 124, 21);
			nal.setColumns(10);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");			
			nal.setText(sdf.format(new Date()));
					
		}
		return nal;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC785\uACE0");//입고
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					input();
					
					
				}
			});
			btnNewButton.setBounds(85, 201, 97, 23);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setBackground(new Color(153, 255, 102));
			lblNewLabel_3.setOpaque(true);
			lblNewLabel_3.setBounds(12, 233, 183, 15);
		}
		return lblNewLabel_3;
	}
}
