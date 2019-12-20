package j_collection;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberInput extends JInternalFrame {
	List<MemberVo> list;   //변수리스트를 만든다.생성자에서 이걸 호출한다 인풋 모디파이 서치 다 해줘야 전달된다.생성자에 값이 들어오면 이곳에 저장.
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField mId;
	private JTextField pwd;
	private JTextField mName;
	private JTextField phone;
	private JButton btnNewButton;
	private JLabel status;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberInput frame = new MemberInput();
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
	public MemberInput() {     //생성자.
		super("회원정보입력",false,true,true,true);//창화면 설정. 인풋,모디파이,서치 모두  이것들을 넣어준다.
		getContentPane().setBackground(new Color(255, 153, 255));
		setVisible(true);//실행시 화면 보이게하는 것.
		setBounds(50, 50, 306, 300); //화면사이즈
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLblNewLabel_3());
		getContentPane().add(getMId());
		getContentPane().add(getPwd());
		getContentPane().add(getMName());
		getContentPane().add(getPhone());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getStatus());

	}
		public MemberInput(List<MemberVo> list) { //메인 상단에 있는 리스트를 생성자를 통해 호출
		this();//자기자신호출	
		this.list = list;
	}
		public void input() {  //밑에 인풋창에 있는걸 생성자밑에 만들어준거다.밑에는 출력만.//인풋 메소드..만듬;;
			String id = mId.getText();
			String p = pwd.getText();
			String n = mName.getText();					
			String ph = phone.getText();
					
			MemberVo vo = new MemberVo(id,p,n,ph);
			this.list.add(vo); //list는 콜렉션 (배열) 데이터추가add,수정기타set,삭제remove,가져올때get
			
			     //전부 입력하고 저장누르면 다시 작성할수있게 전부 지워주는 기능
			pwd.setText("");
			mName.setText("");
			phone.setText("");
			
			mId.requestFocus();//아이디에 커서가 찍히게.
			mId.selectAll(); //문장이 드래그되어있따
			
			status.setText("회원 정보가 추가 입력되었습니다("+list.size()+"건)"); //건수를 오르게함.
		}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC544\uC774\uB514");
			lblNewLabel.setBounds(12, 48, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC554\uD638");
			lblNewLabel_1.setBounds(12, 73, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC131\uBA85");
			lblNewLabel_2.setBounds(12, 98, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC5F0\uB77D\uCC98");
			lblNewLabel_3.setBounds(12, 126, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getMId() {
		if (mId == null) {
			mId = new JTextField();
			mId.setBounds(74, 45, 116, 21);
			mId.setColumns(10);
		}
		return mId;
	}
	private JTextField getPwd() {
		if (pwd == null) {
			pwd = new JTextField();
			pwd.setBounds(74, 70, 116, 21);
			pwd.setColumns(10);
		}
		return pwd;
	}
	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setBounds(74, 95, 116, 21);
			mName.setColumns(10);
		}
		return mName;
	}
	private JTextField getPhone() {
		if (phone == null) {
			phone = new JTextField();
			phone.setBounds(74, 123, 116, 21);
			phone.setColumns(10);
		}
		return phone;
	}
	
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC800\uC7A5"); //저장
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					input();  //인풋이란메소드로 위에 만들어줬다.그리고 이건 출력.
				                       
				
				}
			});
			btnNewButton.setBounds(97, 154, 68, 31);
		}
		return btnNewButton;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setOpaque(true);
			status.setBackground(new Color(153, 204, 255));
			status.setForeground(Color.RED);
			status.setBounds(12, 195, 244, 31);
		}
		return status;
	}
}
