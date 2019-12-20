package j_collection;

import java.awt.EventQueue;
import java.util.List;
import java.util.regex.Pattern;

import javax.swing.JInternalFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import f_inheri.Account;
import f_inheri.Bank;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberModify extends JInternalFrame {
	
	List<MemberVo> list;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField mId;
	private JTextField pwd;
	private JTextField mName;
	private JTextField phone;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel status;
	int index ;
	
	public MemberModify(List<MemberVo> list) { //메인 상단에 있는 리스트를 생성자를 통해 호출
		this();//자기자신호출	
		this.list = list;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberModify frame = new MemberModify();
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
	public MemberModify() {       //생성자
		super("회원정보수정",false,true,true,true);//창화면 설정.
		getContentPane().setBackground(new Color(255, 153, 255));
		setVisible(true);//실행시 화면 보이게하는 것.
		
		setBounds(300, 100, 310, 300);
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
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getBtnNewButton_2());
		getContentPane().add(getStatus());

	}
	public void search() {//검색버튼//찾은경우와 안찾은경우를 이프문으로
		index = -1;//초기값.. -1 못찾음 
		pwd.setText(""); //아무것도 없게 화면을 지워줌 리셋해주는 
		mName.setText("");
		phone.setText("");
		
		String find = mId.getText();//사용자가 입력한 검색어.파인드에 담다.
		for(int i = 0 ; i<list.size() ; i++) {//리스트 = <멤버vo>타입만 저장하겠다 . list = new Array List() 를 만들었었음
			MemberVo vo = list.get(i); //멤버브이오 타입의 브오에 저장함.
			if(vo.getmId().equals(find)) { //equals를 쓰는 이유는 완벽하게 일치.  indexof는 비슷한단어의 첫번째만;;부품만 같아도 찾았다고 생각.
			 index = i;//찾았으면//찾은 값을 index에 집어넣고 -1은 바뀐다 그리고 밑에 이프문으로 간다.
			 break;
			}//if
		}//for
				
		if(index >=0  ) {	//인덱스가 0보다 크거나 같으면 참(찾은경우)    못찾으면 -1 최종결과가 -1이면 못찾음.							
			MemberVo vo = list.get(index);
			pwd.setText(vo.getPwd());//각각 ui단에 값을 뿌림.
			mName.setText(vo.getmName());
			phone.setText(vo.getPhone());
			
			status.setBackground(Color.BLUE);
			status.setText("자료가 검색되었습니다");
		}else { //못찾으면
			status.setText("찾는 자료가 없습니다.");
			status.setBackground(Color.RED);
			
			mId.requestFocus();
			mId.selectAll();
		}
		
		
	}
	
	
	public void modify() {//수정버튼
			
			if(index >= 0) {
			String id = mId.getText();
			String p = pwd.getText();
			String n = mName.getText();	 //텍스트창에 내가 입력한 값을 변수로 만들어줌				
			String ph = phone.getText();
			MemberVo vo = new MemberVo(id,p,n,ph);
			list.set(index, vo);//list는 콜렉션 (배열) 데이터추가add,수정기타set,삭제remove,가져올때get
			
			status.setBackground(Color.BLUE);
			status.setText("수정되었습니다.");
	}else {									
			status.setBackground(Color.RED);
			status.setText("먼저검색해주세요.");
		}
	
		//다른 버전
	/*	if(index >= 0) {
			String id = mId.getText();
			String p = pwd.getText();
			String n = mName.getText();	 //텍스트창에 내가 입력한 값을 변수로 만들어줌				
			String ph = phone.getText();
			
			boolean flag=
				Pattern.matches(MemberMain, idCheck,id)&&
				Pattern.matches(MemberMain, pwdCheck,p)&&
				Pattern.matches(MemberMain, nameCheck,n)&&
				Pattern.matches(MemberMain, phoneCheck,ph);;
		}*/
		
	}
	
	
	public void delete() {//삭제버튼
		list.remove(index);
		index = -1;
		status.setText("삭제되었습니다.");
			mId.setText("");
			pwd.setText("");
			mName.setText("");
			phone.setText("");
									
		
		}
		
		
		
		
		
	
	
	
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC544\uC774\uB514");
			lblNewLabel.setBounds(30, 37, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC554\uD638");
			lblNewLabel_1.setBounds(30, 71, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC131\uBA85");
			lblNewLabel_2.setBounds(30, 111, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC5F0\uB77D\uCC98");
			lblNewLabel_3.setBounds(30, 147, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getMId() {
		if (mId == null) {
			mId = new JTextField();
			mId.setHorizontalAlignment(SwingConstants.LEFT);
			mId.setBounds(99, 34, 116, 21);
			mId.setColumns(10);
		}
		return mId;
	}
	private JTextField getPwd() {
		if (pwd == null) {
			pwd = new JTextField();
			pwd.setBounds(101, 68, 116, 21);
			pwd.setColumns(10);
		}
		return pwd;
	}
	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setBounds(101, 108, 116, 21);
			mName.setColumns(10);
		}
		return mName;
	}
	private JTextField getPhone() {
		if (phone == null) {
			phone = new JTextField();
			phone.setBounds(101, 144, 116, 21);
			phone.setColumns(10);
		}
		return phone;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC218\uC815");//수정
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					modify();
					
					
				}
			});
			btnNewButton.setBounds(82, 185, 76, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC0AD\uC81C");//삭제
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					delete();
					
				}
			});
			btnNewButton_1.setBounds(164, 185, 76, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uAC80\uC0C9"); //검색
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					search();//위에 메소드를 만들고 여기서는 출력담당.
					
				}
			});
			btnNewButton_2.setBounds(219, 33, 67, 23);
		}
		return btnNewButton_2;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("\uB370\uC774\uD130\uB97C \uAC80\uC0C9\uD558\uC138\uC694");
			status.setForeground(new Color(255, 0, 0));
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setOpaque(true);
			status.setBackground(new Color(102, 153, 255));
			status.setBounds(23, 218, 263, 23);
		}
		return status;
	}
}
