package h_api3;

/*
 * 1숫자정렬
 * 1-1 숫자정렬 (입력된 문자열을 정수형 배열로 split
 * 1-2 오름차 정렬한 값을 textArea에 출력
 * 2.문자정렬
 * 2-1 입력된 문자열을 split
 * 2-1 내림차 정렬한 값을 textArea에 출력
 * 3. 객체정렬
 * 3-1 입력된 문자열을 숫자로 split하여  Score클래스의 kor 필드에 대입하시오.
 * 3-2 Score 클래스는 Comparable 을 구현함.
 *버블sort 방법 컴페어러블소스릉 활용한 방법 자바 api(Collections)사용한방법 3가지
 *버블  sort = 배열의 두개씩 비교 원하는게 아니면 바꾸고 두개를 비교 1회전 후 교환되면 또 비교.
 *  while(실행조건){ 버블솔트 하기좋은 문
 *  for(){
 *    }
 *  }
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ComparableExam extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnNewButton_1;
	private JButton button;
	private JScrollPane scrollPane;
	private static JTextArea textArea;
	private JButton btnNewButton;
	private static JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComparableExam frame = new ComparableExam();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void sortNum() {//숫자정렬
		String[] temp =  textField.getText().split(",");
		Integer[] intArray = new Integer[temp.length];
		for(int i = 0 ; i<temp.length ; i++) {
			intArray[i] = Integer.parseInt(temp[i]);
		}
		
		Arrays.sort(intArray);//기본자체가 오름차
		
		StringBuilder sb  = new StringBuilder(1024);
		
		for(int i = 0; i<temp.length ; i ++) {
			String str = String.format("[%d] = %s\n", i, intArray[i]);
			sb.append(str);
		}
		//how1 (bubble sort 방법으로 내림차 정렬.
		boolean sort = true;
		int lastIndex = intArray.length-1;
		while(sort) {
			sort = false;
			for(int i =0 ; i <lastIndex ; i++) {//내림차
 				if(intArray[i] < intArray[i+1]) {
					int t = intArray[i];
					intArray[i] = intArray[i+1];
					intArray [i+1] = t;
					sort = true;
				}
			}
			lastIndex--;
		}
	sb.append("\n\n 버블내림차 정렬결과-------\n");
	for(int i = 0; i<temp.length ; i ++) {
		String str = String.format("[%d] = %s\n", i, intArray[i]);
		sb.append(str);

		}
		//how2 java api
	    //원본이 내림차순 정렬되었기 떄문에 reverse하면 다시 오름차순
		Collections.reverse(Arrays.asList(intArray));//asList매개변수로 전달받은 변수를 리스트로 바꿔주는.
		sb.append("\n\nJAVA API를 사용한 reverse\n\n");
		for(int i = 0; i<temp.length ; i ++) {
			String str = String.format("[%d] = %s\n", i, intArray[i]);
			sb.append(str);
		}
		textArea.setText(sb.toString());
	}

	public void sortStr() {
		String[] temp = textField.getText().split(",");
		Arrays.sort(temp);
		
		
		textArea.setText("");
		for(int i = 0; i<temp.length ; i++) {
			textArea.append(i + " = " + temp[i] + "\n");
		}
		
		textArea.append("\n\n java API를 사용한 내림차순\n\n");
		Arrays.sort(temp, Collections.reverseOrder());
		for(int i=0 ; i<temp.length ; i++) {
			textArea.append(i + " = " + temp[i] + "\n");
		}
	
		
	}
	public void sortObj() {//객체생성차순
		String[] temp = textField.getText().split(",");
		Score[] sArray = new Score[temp.length];//배열개수
		
		for(int i = 0 ; i<temp.length ; i++) {
			sArray[i] = new Score(temp[i]);
		}
		Collections.sort(Arrays.asList(sArray));
		Collections.reverse(Arrays.asList(sArray));
		textArea.setText("");
		for(int i = 0 ; i<sArray.length ; i++) {
			textArea.append(sArray[i].toString());
		}
		
	}
	
	
	/**
	 * Create the frame.
	 */
	public ComparableExam() {
		setTitle("ComparableExam");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.NORTH);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(10, 80));
			panel.setLayout(null);
			panel.add(getBtnNewButton_1());
			panel.add(getButton());
			panel.add(getBtnNewButton());
			panel.add(getTextField());
		}
		return panel;
	}

	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uBB38\uC790 \uC815\uB82C");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				sortStr();
				}
			});
			btnNewButton_1.setBounds(154, 41, 97, 23);
		}
		return btnNewButton_1;
	}

	private JButton getButton() {
		if (button == null) {
			button = new JButton("\uAC1D\uCCB4 \uC815\uB82C");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sortObj();
				}
			});
			button.setBounds(293, 41, 97, 23);
		}
		return button;
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

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC22B\uC790 \uC815\uB82C");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sortNum(); // 호출
				}

			});
			btnNewButton.setBounds(27, 41, 97, 23);
		}
		return btnNewButton;
	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setText("1231,123,214,12,412,421,3,");
			textField.setBounds(37, 10, 327, 21);
			textField.setColumns(10);
		}
		return textField;
	}
}
