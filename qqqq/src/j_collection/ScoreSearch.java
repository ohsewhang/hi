package j_collection;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ScoreSearch extends JInternalFrame {
	Map<String,List<ScoreVo>> map;

	DefaultListModel<String> modelSno = new DefaultListModel<String>();
	DefaultListModel<String> modelExam = new DefaultListModel<String>();
	List<ScoreVo> list;
	
	
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JList listSno;
	private JScrollPane scrollPane_1;
	private JTextField textField;
	private JButton btnNewButton;
	private JList listExam;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	
	
	private JLabel status;
	private InputPanel panel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScoreSearch frame = new ScoreSearch();
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
	public ScoreSearch() {
		super("성적조회",false,true,true,true);//창화면 설정. 인풋,모디파이,서치 모두  이것들을 넣어준다.	
		setVisible(true);//실행시 화면 보이게하는 것.
		setBounds(100, 100, 613, 578);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getScrollPane());
		getContentPane().add(getScrollPane_1());
		getContentPane().add(getTextField());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getBtnNewButton_2());
	
		
		getContentPane().add(getStatus());
		getContentPane().add(getPanel());

	}

	public ScoreSearch(Map<String, List<ScoreVo>> map) {      //생성자
		this();
		this.map = map; //맵구조의 key가 학번
		
		//학번을 추출하여 JList (스윙의jlist)import주의) 에 표시해줌.
		Set<String> set = map.keySet();//key값들이 튀어나온다.(학번)
		
		//JList에 추가
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			modelSno.addElement(iter.next());
		}
		
		listSno.setModel(modelSno);
		
	}
	
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC131\uC801 \uC218\uC815 \uC0AD\uC81C");
			lblNewLabel.setFont(new Font("돋움", Font.PLAIN, 28));
			lblNewLabel.setBounds(42, 10, 222, 70);
		}
		return lblNewLabel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 135, 126, 251);
			scrollPane.setViewportView(getListSno());
		}
		return scrollPane;
	}
	private JList getListSno() {
		if (listSno == null) {
			listSno = new JList();
			listSno.addListSelectionListener(new ListSelectionListener() {
				public void valueChanged(ListSelectionEvent ev) { //리스트셀렉션~
					String sno = (String)listSno.getSelectedValue();
					if(sno == null) return;
					
					list = map.get(sno);
					modelExam = new DefaultListModel<>();
					
					for(int i = 0 ; i<list.size() ; i++) {
						ScoreVo vo = list.get(i);
						String temp = String.format("%s : %d (%s)", vo.getmName(),vo.getGrade(),vo.getExam());
						modelExam.addElement(temp);
						
					}
						listExam.setModel(modelExam);
					
				}
			});
		}
		return listSno;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(143, 135, 176, 251);
			scrollPane_1.setViewportView(getList_1_1());
		}
		return scrollPane_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(12, 104, 168, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("학번만! 검색");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				String findStr =  textField.getText();
				ScoreDao dao  = new ScoreDao(map);
				Map<String , List<ScoreVo>>newmap = dao.list(findStr);
				
				Set<String> set = newmap.keySet();
				modelSno = new DefaultListModel<String>(); //modelSno.clear();
				
				Iterator<String> iter = set.iterator();
				while(iter.hasNext()) {
					modelSno.addElement(iter.next());
				}
				
				listSno.setModel(modelSno);
				modelExam.clear();
				
				
				//상세정보삭제
				panel.tSno.setText("");
				panel.tmName.setText("");
				panel.tKor.setText("");
				panel.tEng.setText("");
				panel.tMat.setText("");
				panel.tTot.setText("");
				panel.tAvg.setText("");
				
				}
			});
			btnNewButton.setBounds(192, 103, 126, 23);
		}
		return btnNewButton;
	}
	private JList getList_1_1() {
		if (listExam == null) {
			listExam = new JList();
			listExam.addListSelectionListener(new ListSelectionListener() {
				public void valueChanged(ListSelectionEvent e) {
				
					int index = listExam.getSelectedIndex();
					int grade = -1;
					
					if(index < 0 ) {return;//선택되지않았을때 0번이다.
							
					}
					
					ScoreVo vo = list.get(index);					
					panel.tSno.setText(vo.getSno());
					panel.tmName.setText(vo.getmName());
					panel.tKor.setText(vo.getKor() + "");
					panel.tEng.setText(vo.getEng() + "");
					panel.tMat.setText(vo.getMat() + "");
					panel.tTot.setText(vo.getTot() + "");
					panel.tAvg.setText(String.format("%4.1f",vo.getAvg()));
					
					//시험종류선택
					if(vo.getExam().equals("중간")){
						 panel.rExam1.setSelected(true);
					}else {
						panel.rExam2.setSelected(true);
					
					}		
					//학년선택
					grade = vo.getGrade()-1;//1학년의 인덱스가0번이기 떄문에.
					panel.cGrade.setSelectedIndex(grade);
				
				}
			});
		}
		return listExam;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC218\uC815");
			btnNewButton_1.addActionListener(new ActionListener() {//수정
				public void actionPerformed(ActionEvent e) {
				
					String key = panel.tSno.getText();
					int index = listExam.getSelectedIndex();
					
					String mName =  panel.tmName.getText();
					String sno = panel.tSno.getText();				
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
					
					ScoreDao dao = new ScoreDao(map);					
					boolean b =dao.update(key, index, vo);
					if(b) {
					 status.setText("자료가 수정되어쑤메");
					}else {
						status.setText("수정 안됐다~");
					}											
				}
			});
			btnNewButton_1.setBounds(341, 449, 97, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {                     //삭제
			btnNewButton_2 = new JButton("\uC0AD\uC81C");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String key  = panel.tSno.getText();//키값 만들기
					int index = listExam.getSelectedIndex(); //인덱스만들기
					
					ScoreDao dao = new ScoreDao(map);
					boolean b = dao.delete(key, index);
					if(b) {
						status.setText("자료가 삭제되었습니다.");
						//상세정보삭제
						panel.tSno.setText("");
						panel.tmName.setText("");
						panel.tKor.setText("");
						panel.tEng.setText("");
						panel.tMat.setText("");
						panel.tTot.setText("");
						panel.tAvg.setText("");
						if(modelExam.size()>0) {
							modelExam.remove(index);
						
						}
						
					}else {
						status.setText("자료중 오류발생");
					}
					
					
				}
			});
			btnNewButton_2.setBounds(465, 449, 97, 23);
		}
		return btnNewButton_2;
	}
	
	
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("@_@@_@");
			status.setBounds(11, 453, 293, 15);
		}
		return status;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new InputPanel();
			panel.setBounds(331, 48, 254, 391);
		}
		return panel;
	}
}
	
