package j_collection;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.awt.event.ActionEvent;

public class MemberMain extends JFrame {     //멀티작업으로 진행.
	static String idCheck = "\\w{4,10}";            //모디파이 수정부분에서의 플래그를 사용한 무결점체크
	static	String pwdCheck = "[\\w!$] {4,10}";
	static	String nameCheck = "[가-휗] {2,20}";
	static	String phoneChck = "\\d{2,3}-\\d{3,4}-\\d{4}";
	List<MemberVo> list = new ArrayList<MemberVo>();//공유자원 멤버vo!!! //List는 자바.유틸을 써준다. 	
	//멤버인풋이라는 프레임이 만들어질때  vo의 리스트를 전달하겠다.생성자를통해서
	
	                                                   
	Set<ProductVo> piList = new HashSet<ProductVo>();//자재관리 공유자원
	Set<ProductVo> peList = new HashSet<ProductVo>();
 	static int iSerial = 1;//입고의 시리얼.순번
	static int eSerial = 1;//출고의 시리얼\.
	
	Map<String, List<ScoreVo>> map = new HashMap<String, List<ScoreVo>>(); //성적관리
	
	private JDesktopPane contentPane;    //제이패널을 데스크탑패인으로 바꿔야한다.멀티작업을하기위해서 임포트해줘야함.6행.
	private JMenuBar menuBar;			//필드명을 바꿀때는 디자인모드에서 바꿔야 밑에 알아서 바꿔준다.
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenu mnNewMenu_1;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JMenuItem mntmNewMenuItem_5;
	private JMenuItem mntmNewMenuItem_6;
	private JMenu mnNewMenu_2;
	private JMenuItem mntmNewMenuItem_7;
	private JMenuItem mntmNewMenuItem_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { //쓰레드를 만든걸 알수있는게 new Runnable
			public void run() {    //스타트를 해야 런 메소드가 실행되는데 밑에 스타트가 없다.invokeLater이넘이 했을것이다.
				try {
					MemberMain frame = new MemberMain();
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
	public MemberMain() {								//생성자
		setBackground(new Color(255, 51, 204));			
		setTitle("\uD68C\uC6D0\uAD00\uB9AC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setJMenuBar(getMenuBar_1());
		contentPane = new JDesktopPane();
		contentPane.setBackground(new Color(255, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//샘플데이터를만들어준다
		for(int i = 0 ; i<500 ; i++) {
			MemberVo vo = new MemberVo("no"+i, "pwd"+i, "name"+ i, "010-1111"+i);
			list.add(vo); //검색이나 입력할때 샘플데이터 500개가 만들어짐. 
		}
		//입고 ,출고 샘플 데이터
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for(int i = 0 ; i <100 ; i++) {
			String tempSerial = sdf.format(new Date()) + " - " + MemberMain.iSerial;
			ProductVo vo = new ProductVo(tempSerial, "pCode" +i , "pName" + i , 3000, new Date());			
			
			piList.add(vo);
			peList.add(vo);
			MemberMain.iSerial++;
			MemberMain.eSerial++;
		}
		//성적관리 샘플 데이터
		ScoreVo sVo = new ScoreVo("1" , "kim" , "중간" ,1 , 90 , 90 , 90);//학번,이름, 시험날,학년 점수
		List<ScoreVo> list1 = new ArrayList<ScoreVo>(); //list를 map의 value값으로.
		list1.add(sVo);
		list1.add(new ScoreVo("1","kim","기말",1,80,70,60));
		list1.add(new ScoreVo("1","kim","기말",2,50,60,70)); //한명의 학생꺼
		
		
		map.put("1", list1);
		
		//두번째 학생꺼
		list1 = new ArrayList<ScoreVo>(); //컬렉션을만듬
		list1.add(new ScoreVo("2","lee","중간",3,50,60,50));
		list1.add(new ScoreVo("2","lee","기말",3,40,30,35));
		
		map.put("2", list1);
		
		list1 = new ArrayList<ScoreVo>();//부모객체타입의..
		list1.add(new ScoreVo("3", "hong", "중간", 2, 10, 10, 10));
		list1.add(new ScoreVo("3","hong","기말",2,20,30,35));
		list1.add(new ScoreVo("3","hong","기말",3,80,90,10));
		
		map.put("3",list1);
		
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setBackground(new Color(204, 255, 255));
			menuBar.add(getMnNewMenu());
			menuBar.add(getMnNewMenu_1());
			menuBar.add(getMnNewMenu_2());
		}
		return menuBar;
		
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("\uD68C\uC6D0\uAD00\uB9AC");
			mnNewMenu.setBackground(new Color(255, 153, 204));
			mnNewMenu.setOpaque(true);
			mnNewMenu.add(getMntmNewMenuItem());
			mnNewMenu.add(getMntmNewMenuItem_1());
			mnNewMenu.add(getMntmNewMenuItem_2());
		}
		return mnNewMenu;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("\uC785\uB825");//입력
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
				MemberInput m = new MemberInput(list);//일단 인풋을 불러옴									
				contentPane.add(m);			//인풋실행창을  메인실행창에 띄어줌List<Membervo>를 인풋()에 넣어준다.
				
				}
				
			});
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("\uC870\uD68C"); //조회
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					MemberSearch m = new MemberSearch(list); //조회 객체를 생성.MemberSearch m = new MemberSearch(없음);기존생성자인데 list값을 넣어줘야함.
							contentPane.add(m);	//	  list가 서치의 list로 넘어감.
							
				}
			});
		}
		return mntmNewMenuItem_1;
	}
	private JMenuItem getMntmNewMenuItem_2() {//삭제수정
		if (mntmNewMenuItem_2 == null) {
			mntmNewMenuItem_2 = new JMenuItem("\uC218\uC815 \uC0AD\uC81C");
			mntmNewMenuItem_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					MemberModify m = new MemberModify(list);//일단 모디파이를 불러옴										
					contentPane.add(m);
					
				}
			});
		}
		return mntmNewMenuItem_2;
	}
	private JMenu getMnNewMenu_1() {
		if (mnNewMenu_1 == null) {
			mnNewMenu_1 = new JMenu("자재관리");
			mnNewMenu_1.setOpaque(true);
			mnNewMenu_1.setBackground(new Color(204, 255, 255));
			mnNewMenu_1.add(getMntmNewMenuItem_3());
			mnNewMenu_1.add(getMntmNewMenuItem_4());
			mnNewMenu_1.add(getMntmNewMenuItem_5());
			mnNewMenu_1.add(getMntmNewMenuItem_6());
		}
		return mnNewMenu_1;
	}
	private JMenuItem getMntmNewMenuItem_3() {
		if (mntmNewMenuItem_3 == null) {
			mntmNewMenuItem_3 = new JMenuItem("입고");
			mntmNewMenuItem_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					ProductInput panel = new ProductInput(piList);
					contentPane.add(panel);
					panel.toFront();//실행시켰을때 항상 앞에 먼저 나오게 함.
				}
			});
		}
		return mntmNewMenuItem_3;
	}
	private JMenuItem getMntmNewMenuItem_4() {
		if (mntmNewMenuItem_4 == null) {
			mntmNewMenuItem_4 = new JMenuItem("출고");
			mntmNewMenuItem_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					ProductOutput panel = new ProductOutput(peList);
					contentPane.add(panel);
					panel.toFront();//실행시켰을때 항상 앞에 먼저 나오게 함.
				}
			});
		}
		return mntmNewMenuItem_4;
	}
	private JMenuItem getMntmNewMenuItem_5() {
		if (mntmNewMenuItem_5 == null) {
			mntmNewMenuItem_5 = new JMenuItem("조회");
			mntmNewMenuItem_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					ProductSearch panel = new ProductSearch(piList , peList); //모디파이에서 가져온다
					contentPane.add(panel);
					panel.toFront();//실행시켰을때 항상 앞에 먼저 나오게 함.
				
				}
			});
		}
		return mntmNewMenuItem_5;
	}
	private JMenuItem getMntmNewMenuItem_6() {
		if (mntmNewMenuItem_6 == null) {
			mntmNewMenuItem_6 = new JMenuItem("수정 삭제");
			mntmNewMenuItem_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					ProductModify panel = new ProductModify(piList , peList); //모디파이에서 가져온다
					contentPane.add(panel);
					panel.toFront();//실행시켰을때 항상 앞에 먼저 나오게 함.
				}
			});
		}
		return mntmNewMenuItem_6;
	}
	private JMenu getMnNewMenu_2() {
		if (mnNewMenu_2 == null) {
			mnNewMenu_2 = new JMenu("성적 관리");
			mnNewMenu_2.add(getMntmNewMenuItem_7());
			mnNewMenu_2.add(getMntmNewMenuItem_8());
		}
		return mnNewMenu_2;
	}
	private JMenuItem getMntmNewMenuItem_7() {
		if (mntmNewMenuItem_7 == null) {
			mntmNewMenuItem_7 = new JMenuItem("입력");//성적입력
			mntmNewMenuItem_7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					ScoreInput panel = new ScoreInput(map);
					contentPane.add(panel);
					panel.toFront();
					
					
				}
			});
		}
		return mntmNewMenuItem_7;
	}
	private JMenuItem getMntmNewMenuItem_8() {
		if (mntmNewMenuItem_8 == null) {
			mntmNewMenuItem_8 = new JMenuItem("조회");  //성적조회
			mntmNewMenuItem_8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					ScoreSearch panel = new ScoreSearch(map);
					contentPane.add(panel);
					
					
				}
			});
		}
		return mntmNewMenuItem_8;
	}
}
