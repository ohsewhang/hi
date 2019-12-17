package h_api2;

import javax.swing.JPanel;

import java.util.Objects;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class SoftBysno extends JPanel {
	private JLabel label; //�й���
	public JLabel status;//�迭?
	private JScrollPane scrollPane;
	private JLabel lblNewLabel;
	private JTextArea textArea;
	/**
	 * Create the panel.
	 */
	public SoftBysno(JLabel status) {
		this();
		this.status = status;
		sortList();
	}
	public SoftBysno() {
		setLayout(null);
		add(getLabel());
		add(getScrollPane());

	}
	public void sortList() {
		Student temp = null; //���ǼҸ�������
		int result = 0;
		for(int i = 0; i<StudentApp.count-1 ; i++) {
			for(int j = i+1 ; j<StudentApp.count ; j++) { //studentapp.length�� �ȴ� 100������.���� ī��Ʈ�Ұ�5���� !ī��Ʈ������
				Student s1 = StudentApp.student[i];
				Student s2 = StudentApp.student[j];
				result = Objects.compare(s1, s2, new StudentComp('n'));
				if(result>0) {
				temp = StudentApp.student[i];
				StudentApp.student[i] = StudentApp.student[j];
				StudentApp.student[j] = temp;	
				}//if
			}//j
		}//i
		textArea.setText("");	
		for(int i =0; i<StudentApp.count ; i++) {
			textArea.append(StudentApp.student[i]+"\n");
			}
		status.setText("�����Ͱ� �й������� ���ĵǾ����ϴ�.");
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uD559\uBC88\uC21C \uC815\uB82C");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setBounds(12, 10, 365, 31);
		}
		return label;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(75, 67, 263, 176);
			scrollPane.setColumnHeaderView(getLblNewLabel());
			scrollPane.setViewportView(getTextArea_1());
		}
		return scrollPane;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uD559\uBC88 \uC774\uB984 \uC131\uC801");
		}
		return lblNewLabel;
	}
	private JTextArea getTextArea_1() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
}
