package h_api3;

public class Score implements Comparable<Score>{//�ܺο��������� �ΰ��� ��
	int kor;
	Score(String kor){
		this.kor = Integer.parseInt(kor);
		
	}
	@Override
	public int compareTo(Score o ) {
		
		//return this.kor - o.kor; //1��
		
		int r = 0;									//2��
		if(this.kor>o.kor) r=1;
		else if(this.kor<o.kor) r=-1;
		else                     r=0;
		return r;
	}
	
	@Override
	public String toString() { //�ֵ縻����.
		return this.kor+"\n";
	}
	
}
