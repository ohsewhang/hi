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
	
	public MemberModify(List<MemberVo> list) { //���� ��ܿ� �ִ� ����Ʈ�� �����ڸ� ���� ȣ��
		this();//�ڱ��ڽ�ȣ��	
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
	public MemberModify() {       //������
		super("ȸ����������",false,true,true,true);//âȭ�� ����.
		getContentPane().setBackground(new Color(255, 153, 255));
		setVisible(true);//����� ȭ�� ���̰��ϴ� ��.
		
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
	public void search() {//�˻���ư//ã������ ��ã����츦 ����������
		index = -1;//�ʱⰪ.. -1 ��ã�� 
		pwd.setText(""); //�ƹ��͵� ���� ȭ���� ������ �������ִ� 
		mName.setText("");
		phone.setText("");
		
		String find = mId.getText();//����ڰ� �Է��� �˻���.���ε忡 ���.
		for(int i = 0 ; i<list.size() ; i++) {//����Ʈ = <���vo>Ÿ�Ը� �����ϰڴ� . list = new Array List() �� ���������
			MemberVo vo = list.get(i); //������̿� Ÿ���� ����� ������.
			if(vo.getmId().equals(find)) { //equals�� ���� ������ �Ϻ��ϰ� ��ġ.  indexof�� ����Ѵܾ��� ù��°��;;��ǰ�� ���Ƶ� ã�Ҵٰ� ����.
			 index = i;//ã������//ã�� ���� index�� ����ְ� -1�� �ٲ�� �׸��� �ؿ� ���������� ����.
			 break;
			}//if
		}//for
				
		if(index >=0  ) {	//�ε����� 0���� ũ�ų� ������ ��(ã�����)    ��ã���� -1 ��������� -1�̸� ��ã��.							
			MemberVo vo = list.get(index);
			pwd.setText(vo.getPwd());//���� ui�ܿ� ���� �Ѹ�.
			mName.setText(vo.getmName());
			phone.setText(vo.getPhone());
			
			status.setBackground(Color.BLUE);
			status.setText("�ڷᰡ �˻��Ǿ����ϴ�");
		}else { //��ã����
			status.setText("ã�� �ڷᰡ �����ϴ�.");
			status.setBackground(Color.RED);
			
			mId.requestFocus();
			mId.selectAll();
		}
		
		
	}
	
	
	public void modify() {//������ư
			
			if(index >= 0) {
			String id = mId.getText();
			String p = pwd.getText();
			String n = mName.getText();	 //�ؽ�Ʈâ�� ���� �Է��� ���� ������ �������				
			String ph = phone.getText();
			MemberVo vo = new MemberVo(id,p,n,ph);
			list.set(index, vo);//list�� �ݷ��� (�迭) �������߰�add,������Ÿset,����remove,�����ö�get
			
			status.setBackground(Color.BLUE);
			status.setText("�����Ǿ����ϴ�.");
	}else {									
			status.setBackground(Color.RED);
			status.setText("�����˻����ּ���.");
		}
	
		//�ٸ� ����
	/*	if(index >= 0) {
			String id = mId.getText();
			String p = pwd.getText();
			String n = mName.getText();	 //�ؽ�Ʈâ�� ���� �Է��� ���� ������ �������				
			String ph = phone.getText();
			
			boolean flag=
				Pattern.matches(MemberMain, idCheck,id)&&
				Pattern.matches(MemberMain, pwdCheck,p)&&
				Pattern.matches(MemberMain, nameCheck,n)&&
				Pattern.matches(MemberMain, phoneCheck,ph);;
		}*/
		
	}
	
	
	public void delete() {//������ư
		list.remove(index);
		index = -1;
		status.setText("�����Ǿ����ϴ�.");
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
			btnNewButton = new JButton("\uC218\uC815");//����
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
			btnNewButton_1 = new JButton("\uC0AD\uC81C");//����
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
			btnNewButton_2 = new JButton("\uAC80\uC0C9"); //�˻�
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					search();//���� �޼ҵ带 ����� ���⼭�� ��´��.
					
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
