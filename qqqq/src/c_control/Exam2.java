/*  택시요금
 * 주행거리에 따른 택시요금을 계산하여 출력.
 * 기본 2000m 까지는 기본요금이 3000원.  1999미터3처넌,2000미터는 삼처넌,2001미터 3500원
 * 200m당 추가요금이 500원씩 증가.      ,2199미터3500,2200미터3500원,2201미터40000원
 * 현재 손님의 주행거리가 4530m인 경우 택시요금은?
 * 2000-3000 .2530/200 나머지가생기면 500원 증가.
 * 기본거리 : base 기본요금:basePrice :추가거리 m 
 * 추가요금 :mPrice 총금액: totPrice :주행거리 totM
 */
package c_control;

public class Exam2 {
    Exam2(){
    int totM= 4530; //주행거리 4530->2201  4530-2000=2530
    int base = 2000;//기본거리
    int basePrice = 3000;//기본요금
    int mPrice = 500;//추가요금
    int m = 0;//추가거리 
    int totPrice = 0; //총금액
    m = totM-base;   //->추가거리 = 2530
    if(totM-base > - 0) {//요금계산 2350원>0ㄸ
        int v = m/200;  //12는 목 나머지는130정도      //m%200>0 하면 500원추가.나머지가 나오면.!!
        if(m%200>0) {
         v++;           //13	
        }
        totPrice = basePrice + (500*v);
        
    }else {
    	totPrice = 3000;           
    }
    System.out.println(totPrice); //클래스 메인에서 실행.
    
    	
    }
	

}
