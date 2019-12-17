package h_api2;

import javax.swing.JPanel;

import java.util.Objects;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class SoftByScore extends JPanel {
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel lblNewLabel_1;
	public JLabel status;
	/**
	 * Create the panel.
	 */
	
	public SoftByScore(JLabel status) {
		this();
		this.status = status;
		sortList();
	}
	public SoftByScore() {
		setLayout(null);
		add(getLblNewLabel());
		add(getScrollPane());
	}
		public void sortList() {
			Student temp = null; //대피소만드으음
			int result = 0;
			for(int i = 0; i<StudentApp.count-1 ; i++) {
				for(int j = i+1 ; j<StudentApp.count ; j++) { //studentapp.length는 안댐 100까지라서.지금 카운트할게5개라서 !카운트까지로
					Student s1 = StudentApp.student[i];
					Student s2 = StudentApp.student[j];
					result = Objects.compare(s1, s2, new StudentComp('s'));
					if(result>0) { //오름차순
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
			status.setText("데이터가 성적순으로 정렬되었습니다.");
		}
		

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC131\uC801\uC21C");
			lblNewLabel.setBounds(12, 10, 57, 15);
		}
		return lblNewLabel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(71, 75, 267, 182);
			scrollPane.setViewportView(getTextArea());
			scrollPane.setColumnHeaderView(getLblNewLabel_1());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uD559\uBC88 \uC774\uB984 \uC131\uC801");
		}
		return lblNewLabel_1;
	}
}

