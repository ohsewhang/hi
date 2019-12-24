package j_collection;

import java.awt.EventQueue;
import java.util.Date;
import java.util.Set;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class ProductModify extends JInternalFrame {
	Set<ProductVo> piList; 
	Set<ProductVo> peList;
	private JLabel lblNewLabel;
	private JRadioButton imBtn;
	private JRadioButton exBtn;
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
	private JLabel status;
	Set<ProductVo> list; //검색 수정 삭제에서 사용해야함.
	ButtonGroup group = new ButtonGroup();
	ProductVo oldVo;//수정전
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
		getContentPane().add(getImBtn());
		getContentPane().add(getExBtn());
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
		getContentPane().add(getStatus());

	}
	public ProductModify(Set<ProductVo> pi, Set<ProductVo> pe) {
		this();          //중복정의해서 중복정의된 생성자에서 입고정보 출고정보를 매개변수로 만들어줘서 유아이에 뿌려준다.
		this.piList = pi;
		this.peList = pe;
			
	}
	//검색
	public void search() {
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
		if(imBtn.isSelected()) {
			list = piList;
			
		}else {
			list = peList;
		}
		String s = serial.getText();//실행창 텍스트필드의 값이 시리얼,
		oldVo = null;//초기값
		status.setText("자료를 검색중입니다.");//초기화 
		for(ProductVo vo : list) { //향상된 for문
			if(vo.getSerial().equals(s)) {
				oldVo = vo;
				pCode.setText(vo.getPcode());
				pName.setText(vo.getpName());
				ea.setText(String.valueOf(vo.getEa())); //vo.getEa()+""
				nal.setText(sdf.format(vo.getNal()));
				status.setText("자료를 찾았습니다.");
				break;
			}
		}
		if(oldVo ==null) {
			pCode.setText("");
			pName.setText("");
			ea.setText("");
			nal.setText("");
			status.setText("자료가없습니다");
		}
	}
	//수정
	public void update() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if(oldVo !=null) {
			try {
				String s = serial.getText();
				String pC = pCode.getText();
				String pN = pName.getText();
				int e = Integer.parseInt(ea.getText());				
				Date n = sdf.parse(nal.getText());
			
				list.remove(oldVo);
				ProductVo newVo = new ProductVo(s,pC,pN,e,n);
				list.add(newVo);
				
				status.setText("자료가 수정되었습ㄴ다:");
				serial.requestFocus();
				serial.selectAll();
			}catch(ParseException ex){
				status.setText("날짜형식을 yyyy-mm-dd로해주세여");
			}catch(NumberFormatException ex2) {
				status.setText("수량을 확인해줘요");
				ea.requestFocus();
				ea.selectAll();
			}
		}else {
			status.setText("먼저 검색후 수정하시요");
		}
	}
	
	
	
	//삭제
	public void delete(){
		if(oldVo !=null) {
			list.remove(oldVo);
			pCode.setText("");
			pName.setText("");
			ea.setText(""); //vo.getEa()+""
			nal.setText("");
			status.setText("자료를 삭제되었습니다.");
		}else {
			status.setText("먼저 검색후 삭제하시기 바랍니다");
		}
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uAD6C\uBD84");
			lblNewLabel.setBounds(12, 10, 57, 15);
		}
		return lblNewLabel;
	}
	private JRadioButton getImBtn() {
		if (imBtn == null) {
			imBtn = new JRadioButton("\uC785\uACE0");//입고라디오
			imBtn.setBounds(61, 6, 49, 23);
			
			group.add(imBtn);
			imBtn.setSelected(true);
		}
		return imBtn;
	}
	private JRadioButton getExBtn() {
		if (exBtn == null) {
			exBtn = new JRadioButton("\uCD9C\uACE0");//출고라디오
			exBtn.setBounds(128, 6, 49, 23);
			
			group.add(exBtn);
			exBtn.setSelected(true);
		
		}
		return exBtn;
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
			btnNewButton = new JButton("\uAC80\uC0C9");  //검색
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				search();
					
				}
			});
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
			btnNewButton_1 = new JButton("\uC218\uC815");//슈정
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					update();
				}
			});
			btnNewButton_1.setBounds(33, 189, 97, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uC0AD\uC81C");//삭제
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					delete();
				}
			});
			btnNewButton_2.setBounds(142, 189, 97, 23);
		}
		return btnNewButton_2;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setOpaque(true);
			status.setBackground(Color.GREEN);
			status.setBounds(32, 223, 227, 15);
		}
		return status;
	}
}
