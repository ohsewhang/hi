//1~1000������ �հ谡 5000�� �Ѵ� ������ ����Ͻÿ�.
package c_control;                //1.1~1000���� ����
 								  //���ΰ��� ���� �հ� /���� ���� �����
public class ForExam3 {		      //
	  ForExam3(){
		  
		      int sum = 0;      //sum���� .�հ�.
		      for(int i=1 ; i<=1000 ;i++) { //1~1000���� ����.
		    	  sum += i;        //sum�� �����Ϸ��� ���� ����. �׷��������� ��� ������� ���� �ݺ�
		    	  //   System.out.println(i+","+sum); //1���� ���� ���                  
			  if(sum>=5000) {
				  System.out.println(i+","+sum); 
				  break;
			  }
			   //type2
		  }   //for( i=1 ; sum<5000 ; i++)  //�������� 
	    	  //sum += i;         
		     // System.out.println((i-1)+","+sum); 
	  }
}
	

