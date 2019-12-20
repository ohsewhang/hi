package i_thread;

public class DataBox { //공유객체
	private String data;
			//상호배타적동기화가 있는 
	public synchronized  String getData() {//겟
		if(this.data ==null) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}//if
		String returnValue =data; //데이터 값을 리턴벨류에 넣어줌.
		System.out.println("ConsumerThread가 읽은 데이터 :"+returnValue); //데이터가 널이 아니면 이거 출력.
		data = null;
		notify();//일시정지상태로 대기.
		return returnValue;
	}
	public synchronized void setData(String data) {//셋
		if(this.data != null) {
			try {
				wait();				
			}catch(InterruptedException e) {};
		}//if
		this.data = data;
		System.out.println("ConsumerThread가 생성한 데이터:"+data );
		notify();  //일시정지상태로 대기.
	}
	

}
