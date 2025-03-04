package h_api3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MessageExam extends JInternalFrame {
	private JPanel panel;
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
					MessageExam frame = new MessageExam();
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
	public MessageExam() {
		super("MessageExamFormat", false,true,true,true);
		setVisible(true);//�������â
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().add(getPanel(), BorderLayout.NORTH);
		getContentPane().add(getScrollPane(), BorderLayout.CENTER);

	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(10, 25));
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getBtnNewButton(), BorderLayout.EAST);
		}
		return panel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("DM \uBC1C\uC1A1");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
				String[][] data = null;
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
				String now = sdf.format(new Date() );
				data = new String[][]{
					{"11-111","�����","���̿�!","����������",now},
					{"22-222","��ġ","����!","����",now},
					{"33-333","�ؾ�","��������!","ȫ����",now},
					{"44-444","������","^_^ !","������",now}
				};
				String dm = "������ȣ : {0} \n������ : {1} \n\n {2}\n\n �߼�ó : {3} \n\n{4}";
				dm+= "\n------------------------------------------------------\n";
				
				StringBuilder sb = new StringBuilder();//�� �迭���� ��Ʈ�������ȿ� ����ִ´�.
					
				for(int i =0; i<data.length; i++) {
					String temp = MessageFormat.format(dm,
							data[i][0],data[i][1],data[i][2],data[i][3],data[i][4]);
					sb.append(temp);
				}
				textArea.setText(sb.toString());
				}
			});
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
		}
		return textArea;
	}
}
