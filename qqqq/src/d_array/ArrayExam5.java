package d_array;

public class ArrayExam5 {
	ArrayExam5(){
		//향상된 fOR문을 사용하여 합과 평균을 구하라.
		int[] s = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		double avg = 0;
		
		for(int k:s) { //s를 k에 순차적으로 하나씩 대입
			
			sum += k;
			
			
		}//포문 끝
			avg = (double)sum/s.length;
			
			System.out.println("합계:"+sum);
			System.out.println("평균:"+avg);
	
		
	
	
	
	}//생성자끝
	
	
	public static void main(String[] args) {
		new ArrayExam5();
		
	}//메인끝
}//클래스끝
