package h_api3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import java.util.StringTokenizer;//���� �����Ϸ��� ����Ʈ��...�ҷ������� ��Ʈ��+ ����Ʈ +o �ϸ� �ڵ� ����Ʈ

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TokenAndSplit extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField str;
	private JLabel lblNewLabel_1;
	private JTextField deli;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TokenAndSplit frame = new TokenAndSplit();
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
	public TokenAndSplit() {
		setTitle("Token And Split");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getStr());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getDeli());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getScrollPane());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uBB38\uC790\uC5F4");
			lblNewLabel.setBounds(12, 10, 57, 15);
		}
		return lblNewLabel;
	}

	private JTextField getStr() {
		if (str == null) {
			str = new JTextField();
			str.setText(
					"\uC790\uBC14,\uAE40\uC790\uBC14,,,,,,,\uAC10\uC790,,,\uACE0\uAD6C\uB9C8,,mamam,,111,23,,,,sd,2");
			str.setBounds(63, 7, 325, 21);
			str.setColumns(10);
		}
		return str;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uAD6C\uBD84\uC790");
			lblNewLabel_1.setBounds(12, 50, 57, 15);
		}
		return lblNewLabel_1;
	}

	private JTextField getDeli() {
		if (deli == null) {
			deli = new JTextField();
			deli.setText(",");
			deli.setBounds(64, 47, 57, 21);
			deli.setColumns(10);
		}
		return deli;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Token");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String value = str.getText(); // ���ڿ���
					String d = deli.getText(); // ��������
					StringTokenizer st = new StringTokenizer(value, d);// ���� �����Ϸ��� ����Ʈ��...�ҷ������� ��Ʈ��+ ����Ʈ +o �ϸ� �ڵ� ����Ʈ
					textArea.setText("");// ���ؽ�Ʈ �ʱ�ȭ
					// HOW1 for
					int cnt = st.countTokens();// ī��Ʈ ��ū�� ��ū�� ����.
					for (int i = 0; i < cnt; i++) {
						textArea.append(st.nextToken() + "\n");// nextToken��ū�� �ϳ��� ������.
					}
					// ho2 (while)
					textArea.append("-------------------------------\n");
					st = new StringTokenizer(value, d);
					while (st.hasMoreTokens()) { // ��ū�� �� �����ִ��� ���� ���.
						textArea.append(st.nextToken() + "\n");
					}
				}
			});
			btnNewButton.setBounds(133, 46, 97, 23);
		}
		return btnNewButton;
	}

	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Split");// ��ȿ�ǰ��� �迭�� ��Ÿ���ش�.
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String[] values = str.getText().split(deli.getText());// &|,|-�̷� ��ȣ�� �ִ���~
					String r = "Split--------\n";
					for (int i = 0; i < values.length; i++) {
						r += String.format("values[%d]=%s\n", i, values[i]); // ??[%d] �� i , %s values[i]
					}
					r += "-------------------\n";
					r += Arrays.toString(values);
					r += "======================\n";

					textArea.setText(r);
				}
			});
			btnNewButton_1.setBounds(242, 46, 97, 23);
		}
		return btnNewButton_1;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(26, 91, 334, 161);
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
