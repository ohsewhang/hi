package h_api3;

public class Score implements Comparable<Score>{//외부에서받은거 두개를 비교
	int kor;
	Score(String kor){
		this.kor = Integer.parseInt(kor);
		
	}
	@Override
	public int compareTo(Score o ) {
		
		//return this.kor - o.kor; //1번
		
		int r = 0;									//2번
		if(this.kor>o.kor) r=1;
		else if(this.kor<o.kor) r=-1;
		else                     r=0;
		return r;
	}
	
	@Override
	public String toString() { //있든말든함.
		return this.kor+"\n";
	}
	
}
