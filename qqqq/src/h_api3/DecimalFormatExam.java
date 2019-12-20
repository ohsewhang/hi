package h_api3;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.Component;
import javax.swing.JTextArea;

public class DecimalFormatExam extends JInternalFrame {
	private JLabel lblNewLabel;      //위의 생성자를 콜하려면 생성자 맨첫줄에서 작업한다.super()라고~부른다,
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton button;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DecimalFormatExam frame = new DecimalFormatExam();
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
	public DecimalFormatExam() {
		super("Decimal Format", true,true,true,true);//super()소괄호안에서 레퍼런스보면 맨밑에  , , , , 젤긴거
		getContentPane().setBackground(Color.MAGENTA);
		getContentPane().setForeground(Color.MAGENTA);
		setTitle("DecimalFormat");
		setBounds(100, 100, 370, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getTextField());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getButton());
		getContentPane().add(getScrollPane());
		setVisible(true);

	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC785\uAE08\uC561");
			lblNewLabel.setBounds(12, 10, 57, 15);
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setAlignmentY(Component.TOP_ALIGNMENT);
			textField.setBounds(88, 7, 210, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uCC9C\uB2E8\uC704");//천단위
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				 long v = Long.parseLong(textField.getText());
				 DecimalFormat df = new DecimalFormat("00,000,000,000.00");
				 String r = df.format(v);
				 
				 
				 textArea.append(r+ "\n");
					
				}
			});
			btnNewButton.setBounds(12, 35, 97, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC18C\uC22B\uC810 \uD45C\uC2DC");//소숫점
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double v = Double.parseDouble(textField.getText());
					DecimalFormat df = new DecimalFormat("#,###,###,###.##");
					
					textArea.append(df.format(v) + "\n");
					
					
				}
			});
			btnNewButton_1.setBounds(121, 35, 97, 23);
		}
		return btnNewButton_1;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("\uC6D0\uD654 \uD45C\uC2DC");//원화표시
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double v = Double.parseDouble(textField.getText());
					DecimalFormat df = new DecimalFormat("\u00a4 #,###.##");
					
					textArea.append(df.format(v)+ "\n");
												
				}
			});
			button.setBounds(236, 35, 97, 23);
		}
		return button;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(30, 81, 292, 168);
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
