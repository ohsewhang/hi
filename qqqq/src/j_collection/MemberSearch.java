package j_collection;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberSearch extends JInternalFrame {
	List<MemberVo> list; //리스트컬렉션에 멤버브이오 리스트를 전달해준다.생성자에 값이 들어오면 이곳에 저장.
	private JPanel panel;
	private JTextField findstr;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberSearch frame = new MemberSearch();
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
	public MemberSearch() {           //생성자
		super("회원정보조회",false,true,true,true);//창화면 설정.
		getContentPane().setBackground(new Color(204, 204, 255));
		getContentPane().add(getPanel(), BorderLayout.NORTH);
		getContentPane().add(getScrollPane(), BorderLayout.CENTER);
		setVisible(true);//실행시 화면 보이게하는 것.
		setBounds(500, 300, 450, 300);

	}											
	public MemberSearch(List<MemberVo>list) { //생성자 중복선언 파라미터를 달리 선언했음 .여기 매개변수list는 57행 list로 들어간다.
		this();								 //여길 해줘야 실행시켰을때 리스트를 가지고 옴.
		this.list = list;
		
	}
		public void search() { //서치 메소드 생성.
			
			textArea.setText("");//텍스트에이리어에 검색전에 아무것도없게 지워준다.
			String find = findstr.getText(); //검색조건
			for(int i = 0; i<list.size() ; i++) {//list가 얼마나 가진지 모르기에 (500)
				MemberVo vo = list.get(i);         //멤버vo타입의 변수vo에 담는다.list는 콜렉션 (배열) 데이터추가add,수정기타set,삭제remove,가져올때get
				
				if(vo.getmId().indexOf(find)>=0  ||//검색조건 3개중 하나라도찾음 됌. 스트링의 인덱스오프사용.0보다크거나 같으면 찾은거 작으면 -1
				   vo.getmName().indexOf(find)>=0 ||
				   vo.getPhone().indexOf(find)>=0) {
					 
					textArea.append(vo.toString()+ "\n"); //네임만 출력됌 .. (vo.getName()+ "\n")에서 멤버vo가서 투스티링 ㅅ사용;출력
				}//if
			}//for
		}//method
	
	
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(51, 204, 255));
			panel.setPreferredSize(new Dimension(10, 25));
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getFindstr(), BorderLayout.CENTER);
			panel.add(getBtnNewButton(), BorderLayout.EAST);
		}
		return panel;
	}
	private JTextField getFindstr() {
		if (findstr == null) {
			findstr = new JTextField();
			findstr.setBackground(new Color(204, 255, 255));
			findstr.setColumns(10);
		}
		return findstr;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//복잡해지니까 서치의 메소드를 만들어서 위의 생성자밑에서 작업해준다. 
					search();
					
				}
			});
			btnNewButton.setForeground(new Color(0, 0, 0));
			btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
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
			textArea.setBackground(new Color(255, 153, 255));
		}
		return textArea;
	}
}
