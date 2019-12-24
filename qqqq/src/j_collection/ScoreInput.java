package j_collection;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.util.List;
import java.util.Map;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScoreInput extends JInternalFrame {
	
	Map<String, List<ScoreVo>> map;
	
	private JLabel lblNewLabel;
	private InputPanel panel;
	private JButton btnNewButton;
	private JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScoreInput frame = new ScoreInput();
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
	public ScoreInput() {
		
		super("성적조회",false,true,true,true);//창화면 설정. 인풋,모디파이,서치 모두  이것들을 넣어준다.		
		setVisible(true);//실행시 화면 보이게하는 것.
		getContentPane().setBackground(new Color(255, 0, 102));
		setBounds(100, 100, 291, 557);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getPanel());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getStatus());

	}
	public ScoreInput(Map<String, List<ScoreVo>> map) {
		this();
		this.map = map;
				
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC131\uC801\uC785\uB825");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBackground(new Color(255, 255, 255));
			lblNewLabel.setFont(new Font("바탕", Font.BOLD | Font.ITALIC, 17));
			lblNewLabel.setBounds(71, 10, 140, 30);
		}
		return lblNewLabel;
	}
	private JPanel getPanel() { //인풋패널로 바꿔준다.
		if (panel == null) {
			panel = new InputPanel(); //바꿔주면 인풋패널의 값을 여기로.
			panel.setBackground(new Color(255, 255, 255));
			panel.setBounds(12, 50, 253, 389);
		}
		return panel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC800\uC7A5"); //저장
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					//무결성체크
					//TODO
					//
					
					String sno = panel.tSno.getText();
					String mName =panel.tmName.getText();
					int kor = Integer.parseInt(panel.tKor.getText());
					int eng = Integer.parseInt(panel.tEng.getText());
					int mat = Integer.parseInt(panel.tMat.getText());
					String exam = "";
					int grade = 0;
					if(panel.rExam1.isSelected()) {
						exam = "중간";
					}else {
						exam = "기말";
					}
					
					grade = panel.cGrade.getSelectedIndex()+1;//인덱스때문에.
				
					ScoreVo vo = new ScoreVo(sno, mName, exam, grade, kor, eng, mat);
					
					panel.tTot.setText(vo.getTot()+ "");
					panel.tAvg.setText(String.format("%4.1f", vo.getAvg()));
					
					ScoreDao dao = new ScoreDao(map);
					boolean b = dao.insert(vo);//저장버튼누렀을때 불린값이 참이면 저장. 그러치않으면 에러발생
					if(b) {
						status.setText("데이터가 저장되었습ㄴ니다");
						
					}else {
						status.setText("저장 오류발생.");
					}
				}
			});
			btnNewButton.setBounds(97, 449, 97, 23);	
		}
		return btnNewButton;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("@_@");
			status.setBackground(new Color(255, 204, 204));
			status.setOpaque(true);
			status.setBounds(22, 485, 243, 15);
		}
		return status;
	}
}
