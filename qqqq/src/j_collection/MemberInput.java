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
	List<MemberVo> list;   //��������Ʈ�� �����.�����ڿ��� �̰� ȣ���Ѵ� ��ǲ ������� ��ġ �� ����� ���޵ȴ�.�����ڿ� ���� ������ �̰��� ����.
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
	public MemberInput() {     //������.
		super("ȸ�������Է�",false,true,true,true);//âȭ�� ����. ��ǲ,�������,��ġ ���  �̰͵��� �־��ش�.
		getContentPane().setBackground(new Color(255, 153, 255));
		setVisible(true);//����� ȭ�� ���̰��ϴ� ��.
		setBounds(50, 50, 306, 300); //ȭ�������
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
		public MemberInput(List<MemberVo> list) { //���� ��ܿ� �ִ� ����Ʈ�� �����ڸ� ���� ȣ��
		this();//�ڱ��ڽ�ȣ��	
		this.list = list;
	}
		public void input() {  //�ؿ� ��ǲâ�� �ִ°� �����ڹؿ� ������ذŴ�.�ؿ��� ��¸�.//��ǲ �޼ҵ�..����;;
			String id = mId.getText();
			String p = pwd.getText();
			String n = mName.getText();					
			String ph = phone.getText();
					
			MemberVo vo = new MemberVo(id,p,n,ph);
			this.list.add(vo); //list�� �ݷ��� (�迭) �������߰�add,������Ÿset,����remove,�����ö�get
			
			     //���� �Է��ϰ� ���崩���� �ٽ� �ۼ��Ҽ��ְ� ���� �����ִ� ���
			pwd.setText("");
			mName.setText("");
			phone.setText("");
			
			mId.requestFocus();//���̵� Ŀ���� ������.
			mId.selectAll(); //������ �巡�׵Ǿ��ֵ�
			
			status.setText("ȸ�� ������ �߰� �ԷµǾ����ϴ�("+list.size()+"��)"); //�Ǽ��� ��������.
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
			btnNewButton = new JButton("\uC800\uC7A5"); //����
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					input();  //��ǲ�̶��޼ҵ�� ���� ��������.�׸��� �̰� ���.
				                       
				
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
