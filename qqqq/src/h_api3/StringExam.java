package h_api3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class StringExam extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField jumin;
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
					StringExam frame = new StringExam();
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
	public StringExam() {
		setTitle("\uBB38\uC790\uC5F4 Exam");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 365, 273);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getJumin());
		contentPane.add(getBtnNewButton());
		contentPane.add(getScrollPane());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC8FC\uBBFC\uBC88\uD638");
			lblNewLabel.setBounds(12, 10, 57, 15);
		}
		return lblNewLabel;
	}
	private JTextField getJumin() {
		if (jumin == null) {
			jumin = new JTextField();
			jumin.setText("905028-1848247");
			jumin.setBounds(73, 7, 176, 21);
			jumin.setColumns(10);
		}
		return jumin;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uD655\uC778");//Ȯ��
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				String str = "";
				String  j = jumin.getText();
				char c = j.charAt(7);
				str += "���ڿ��Ǳ���:"+ jumin.getText().length(); //���ڿ��� �� �ؽ�Ʈ�ʵ��ϻ� �ֹ���
				str += "\n���� :"+ j.substring(0,2);
				str += "\n���� :"+ j.substring(2,4);
				str += "\n���� :"+ j.substring(4,6);				
				str += "\n���� : "+ ((c%2==0)? "����" : "����");		
				str += "\n--------------------\n";
				textArea.append(str); //append�� ���ڿ��� ����ϴ°�?
					
				}
			});
			btnNewButton.setBounds(261, 6, 71, 23);
		}
		return btnNewButton;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(46, 88, 237, 137);
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
}
