package h_api4;

public class BoardVo {
	
	public int no;//게시물번호
	public String subject; //제목
	public String content; //내용
	public String mId;     //아이디
	public String mDate;   //작성일
	public int cnt; 	   //조회수
	
	

	
	public BoardVo(int sno, String sub, String con, String mI, String mDa, int cn) {
		this.no = sno;
		this.subject = sub;
		this.content = con;
		this.mId = mI;
		this.mDate = mDa;
		this.cnt = cn;
	}


	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getmDate() {
		return mDate;
	}
	public void setmDate(String mDate) {
		this.mDate = mDate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	@Override
	public String toString() {
		return no + subject + content + mId + mDate + cnt;
	}
	
	
}
