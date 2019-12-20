package j_collection;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Set;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ProductSearch extends JInternalFrame {
	private JPanel panel;
	private JTextField textField;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JPanel panel_1;
	private JRadioButton imBtn;
	private JRadioButton exBtn;
	private Set<ProductVo> peList;
	private Set<ProductVo> piList;
	
	ButtonGroup group = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductSearch frame = new ProductSearch();
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
	public ProductSearch() {
		super("제품조회",false,true,true,true);
		setVisible(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().add(getPanel(), BorderLayout.NORTH);
		getContentPane().add(getScrollPane(), BorderLayout.CENTER);

	}
	public ProductSearch(Set<ProductVo>pi,Set<ProductVo>pe) { //생성자를 만들어메인프레임이 가지고 있는 셋 구조의 컬렉션인 pilist가 레퍼러싱된것이다~~~~~~~
		this();
		this.piList = pi;
		this.peList = pe;
	}
	public void search() {//search 메소드생성
		Set<ProductVo> list = null;
		
		 //검색어(시리얼,제품코드,제품명 3개 중 1개만 되면 검색됌)
		ProductVo find = new ProductVo();
		find.setSerial(textField.getText());
		find.setPcode(textField.getText());
		find.setpName(textField.getText());
		
		textArea.setText("");//화면을 켰을때 꺠끗하게 비워놓고 시작.
		if(imBtn.isSelected()) {
			list = piList;
		}else {
			list = peList;
		}
		Iterator<ProductVo> iter = list.iterator();//Set 구조는 인덱스가 없다.이터레이터나 포문 사용하여 검색
		while(iter.hasNext()) {
			ProductVo vo = iter.next();
			if(vo.equals(find)) {
				textArea.append(vo.toString());
			}
		}
		
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(10, 30));
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getTextField_1(), BorderLayout.CENTER);
			panel.add(getBtnNewButton(), BorderLayout.EAST);
			panel.add(getPanel_1(), BorderLayout.WEST);
		}
		return panel;
	}
	private JTextField getTextField_1() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9"); //조회검색
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					search();//서치라는 메소드 위에있는걸 호출
				
				
				}
			});
			btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		}
		return btnNewButton;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setBackground(new Color(204, 255, 255));
		}
		return textArea;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setPreferredSize(new Dimension(120, 10));
			panel_1.add(getImBtn());
			panel_1.add(getExBtn());
		}
		return panel_1;
	}
	private JRadioButton getImBtn() {
		if (imBtn == null) {
			imBtn = new JRadioButton("\uC785\uACE0");//입고
			group.add(imBtn);			//라디오 버튼!!!!!!!!맨위 필드에 그룹 만들어준다.
			imBtn.setSelected(true); //라디오 버튼 하나씩 클릭하게 만들어줌
		}
		return imBtn;
	}
	private JRadioButton getExBtn() {
		if (exBtn == null) {
			exBtn = new JRadioButton("\uCD9C\uACE0");//출고
			group.add(exBtn);
			exBtn.setSelected(true);
		}
		return exBtn;
	}
}
