/*
 * 1. 아이디 영숫자와 기호포함($,!_)4~10자
 * 2.암호 영숫자와 기호 포함 4~10자
 * 3. 성명 한글 2~10자까지 허용
 * 4. 연락처 사업자(2~3)-국번호(3~4)-전화번호(4)
 * 5. 이메일:
 * 6. 우편번호 (2)-(3)
 */
package h_api3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class PattenExam2 extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField id;
	private JTextField pwd;
	private JTextField mName;
	private JTextField phone;
	private JTextField email;
	private JTextField zip;
	private JButton btnNewButton;
	private JLabel lblNewLabel_7;
	private JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PattenExam2 frame = new PattenExam2();
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
	public PattenExam2() {
		setTitle("\uD68C\uC6D0\uAC00\uC785");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getId());
		contentPane.add(getPwd());
		contentPane.add(getMName());
		contentPane.add(getPhone());
		contentPane.add(getEmail());
		contentPane.add(getZip());
		contentPane.add(getBtnNewButton());
		contentPane.add(getLblNewLabel_7());
		contentPane.add(getStatus());
		
	
	}
	public void check() {
		String regexp = "";
		String value = "";
		status.setText("");
		//아이디
		regexp = "[\\w+!$]{4,10}";//영문자한자리(0-9,A-Z,a-z)와 !$기호포함 특수문자가 있든없든.
		//regexp = "([\\w+])(?=.*[!$_]).{3,9}";//옵션//기호를 반드시입력하여야한다면.[]는 그중 하나라는 뜻,
		value = id.getText();
		if(!Pattern.matches(regexp, value)){
			status.setText("아이디에 오류가 있다");
			id.requestFocus();
			id.selectAll();
		}
		//비밀번호
		regexp = "[\\w+!$]{4,10}";		
		value = pwd.getText();
		if(!Pattern.matches(regexp, value)){
			status.setText("비밀번호에 오류가 있따.");
			pwd.requestFocus();
			pwd.selectAll();	
		}
		//성명				
			regexp = "[가-휗]{2,20}"; //휗이 제일 마지막;;
			value = mName.getText();
			if(!Pattern.matches(regexp, value)){
				status.setText("성명에오류가있다");
				mName.requestFocus();
				mName.selectAll();
		}
		//연락처	"(02|010)-\\d{3,4}-\d{4}";			
				regexp = "\\d{2,3}-\\d{3,4}-\\d{4}";
				value = phone.getText();
				if(!Pattern.matches(regexp, value)){
					status.setText("연락처에 오류가 있다");
					phone.requestFocus();
					phone.selectAll();
		}
		//우편번호	"\\d{2}-\\{3}";					
					regexp = "\\d{2}-\\d{3}";
					value = zip.getText();
					if(!Pattern.matches(regexp, value)){
						status.setText("우편번호에 오류가 있다");
						zip.requestFocus();
						zip.selectAll();
		}
					
		//이메일 체크
		regexp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		value = email.getText();
		if(!Pattern.matches(regexp, value)) {
			status.setText("이메일이 오류입니다.");
			email.requestFocus();//커서를 이메일쪽으로 깜빡거리게 해주는.
			email.selectAll();
		}//이프문
	}//check메소드

				
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC544\uC774\uB514");
			lblNewLabel.setBounds(12, 20, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC554\uD638");
			lblNewLabel_1.setBounds(17, 53, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC131\uBA85");
			lblNewLabel_2.setBounds(19, 94, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC5F0\uB77D\uCC98");
			lblNewLabel_3.setBounds(15, 132, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uC774\uBA54\uC77C");
			lblNewLabel_4.setBounds(10, 171, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uC6B0\uD3B8\uBC88\uD638");
			lblNewLabel_5.setBounds(8, 207, 57, 15);
		}
		return lblNewLabel_5;
	}
	private JTextField getId() {
		if (id == null) {
			id = new JTextField();
			id.setText("aaaa");
			id.setBounds(61, 16, 130, 21);
			id.setColumns(10);
		}
		return id;
	}
	private JTextField getPwd() {
		if (pwd == null) {
			pwd = new JTextField();
			pwd.setText("sssss");
			pwd.setBounds(62, 51, 127, 21);
			pwd.setColumns(10);
		}
		return pwd;
	}
	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setText("\uC624\uC138\uC655");
			mName.setBounds(63, 92, 128, 21);
			mName.setColumns(10);
		}
		return mName;
	}
	private JTextField getPhone() {
		if (phone == null) {
			phone = new JTextField();
			phone.setText("010-4742-3124");
			phone.setBounds(62, 128, 137, 21);
			phone.setColumns(10);
		}
		return phone;
	}
	private JTextField getEmail() {
		if (email == null) {
			email = new JTextField();
			email.setText("o@naver.com");
			email.setBounds(63, 166, 193, 21);
			email.setColumns(10);
		}
		return email;
	}
	private JTextField getZip() {
		if (zip == null) {
			zip = new JTextField();
			zip.setHorizontalAlignment(SwingConstants.LEFT);
			zip.setText("22-112");
			zip.setBounds(65, 205, 135, 21);
			zip.setColumns(10);
		}
		return zip;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uCCB4\uD06C");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				check();//체크라는 메소드를 위에 생성한다.
				
				
				
				
				
				}
			});
			btnNewButton.setBounds(122, 264, 97, 23);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("");
			lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\JHTA\\Desktop\\20191213_092626.png"));
			lblNewLabel_7.setBounds(197, -2, 119, 139);
		}
		return lblNewLabel_7;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setBackground(Color.YELLOW);
			status.setOpaque(true);
			status.setBounds(34, 297, 206, 44);
		}
		return status;
	}
}
