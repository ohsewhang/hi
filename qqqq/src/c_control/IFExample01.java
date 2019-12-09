package c_control;

public class IFExample01 {
	int type1(){ 
	int r =0; 
	int s =91;
	  if( s>=90 ){
		 System.out.println("점수가90이상.");
	     System.out.println("A");   
}
	  if( s<90 ) {
		 System.out.println("점수90미만.");
		 System.out.println("B");
}
	    return r;                	                          	                  
}                                 
	  String type2() {  
	   String r = null;  
		  return r;         
}
	  byte type3() {      
		  byte r = ' ';
		  return r;
}
	   void type4(){   		   
}
	 public static void main(String[] args) {
	 IFExample obj =new IFExample();
	 obj.type1();     
 }                
}

