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
		
		super("������ȸ",false,true,true,true);//âȭ�� ����. ��ǲ,�������,��ġ ���  �̰͵��� �־��ش�.		
		setVisible(true);//����� ȭ�� ���̰��ϴ� ��.
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
			lblNewLabel.setFont(new Font("����", Font.BOLD | Font.ITALIC, 17));
			lblNewLabel.setBounds(71, 10, 140, 30);
		}
		return lblNewLabel;
	}
	private JPanel getPanel() { //��ǲ�гη� �ٲ��ش�.
		if (panel == null) {
			panel = new InputPanel(); //�ٲ��ָ� ��ǲ�г��� ���� �����.
			panel.setBackground(new Color(255, 255, 255));
			panel.setBounds(12, 50, 253, 389);
		}
		return panel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC800\uC7A5"); //����
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					//���Ἲüũ
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
						exam = "�߰�";
					}else {
						exam = "�⸻";
					}
					
					grade = panel.cGrade.getSelectedIndex()+1;//�ε���������.
				
					ScoreVo vo = new ScoreVo(sno, mName, exam, grade, kor, eng, mat);
					
					panel.tTot.setText(vo.getTot()+ "");
					panel.tAvg.setText(String.format("%4.1f", vo.getAvg()));
					
					ScoreDao dao = new ScoreDao(map);
					boolean b = dao.insert(vo);//�����ư�������� �Ҹ����� ���̸� ����. �׷�ġ������ �����߻�
					if(b) {
						status.setText("�����Ͱ� ����Ǿ������ϴ�");
						
					}else {
						status.setText("���� �����߻�.");
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
