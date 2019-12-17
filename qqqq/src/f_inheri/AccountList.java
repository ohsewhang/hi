package f_inheri;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.DecimalFormat;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AccountList extends JPanel {
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel lblNewLabel_1;

	/**
	 * Create the panel.
	 */
	public AccountList() {//생성자
		setLayout(null);
		add(getLblNewLabel());
		add(getScrollPane()); 
		showList();  //메소드생성 테스트에이리어를 사용하기위해 순서는 제일 아래.

	}
	public void showList() { //객체생성
		String str = "";
		DecimalFormat  df = new DecimalFormat("##,###,###,###.#"); //소수점 한자리만 보이고 세자리마다 ,를 찍어달라는 문자열
		
		for(int i = 0 ; i<Bank.count ; i++) {//카운트는 인덱스값아니다.
		Account	a = Bank.ac[i];	//acount타입			//bank를 보기위해
		str += a.getsNo();//계좌버너
		str += "\t" + a.getnName(); //t는 탭.//예금주
		str += "\t" + df.format(a.getAmount()); //금액 //소수점까지 같이 보임..
		str += "\n";//줄바꾸기
		}								
		textArea.setText(str);//위에서 만들어진 내용을 str로 새로 만듬.set! 
	}
	
	
	
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uACC4\uC815  \uBAA9\uB85D");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setForeground(Color.BLUE);
			lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
			lblNewLabel.setBounds(77, 10, 143, 22);
		}
		return lblNewLabel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 36, 289, 137);
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
			lblNewLabel_1 = new JLabel("\uACC4\uC88C\uBC88\uD638          \uC608\uAE08\uC8FC           \uC608\uAE08\uC794\uC561");
		}
		return lblNewLabel_1;
	}
}
