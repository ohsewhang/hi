package c_control;

public class IFExample {
 int type1(){ //�޼�����ۼ�,(����)��ȯ���ۼ�,��ȯ��int��..,�����ϸ� �ȴ�
    int r =0; //�����ڴ�(��ü����),�������(�ʵ�)���� �ʱ�ȭ ����.
    int s =90;//���ھ�93��.
  if( s>=90 ){
	  //TODO
	 System.out.println("������90�̻�.");
     System.out.println("A");   
  }
  if( s<90 ) { 
	 System.out.println("����90�̸�.");
	 System.out.println("B");}
  
    return r;                //return�ۼ�,intŸ���� ���� �ۼ�.(���������� ��ȯ�Ȱ��)
                             //�ڹٴ� �׻� 4byte(r)
                   //!!!!!!type������ ���� ����r�� �߰�ȣ�� �־ ��밡��!!!!!!!!!
 }                 //������ �ٸ��⶧����, ������ ������ ������ �ߺ�x                   
 
  String type2() {   //�����̸�x,���ڿ��� �˰� �ʹٸ�.
   String r = null;  //r=string��   
	int s = 89;
	if(s>=90) {
		r = "90�̻��̴�";  // �̰� �������� �ϴ� ��
		r += r+"\nA";		//r=r+"\nA"(����) �̰� �������� �ϴ� ��
	//	System.out.println("90�̻��̴�");  //�̰� ���� �ϴ� ��
	//	System.out.println("A");      //�̰� ���� �ϴ� ��
} else {
	   r = "90�̸���"; //�̰� �ȶ�!!
	   r = "\nB";
	   //System.out.println("90���ϴ�");
	   //System.out.println("B");
}
   return r;         //���ڿ��� ��ȯ�� ��� 
  
  
  
  }
 char type3() {   // ������ if~else if�� ����Ͽ� ������ ���Ͽ� r�� �����Ͻÿ�.
	               //60�̸� f.90�̻� A,80�̻�B,70�̻�C,60D�̻�D,
	  char r = ' '; //''<-2byte�� '_'���鹮���ϳ��� �ʿ�.
	  int s= 70;
	  if(s>=90)r='a';            //if (s>=90) r='a'
	  else if( s>=80 )r='b';    //else if( s>=80 ) r='b'
	  else if( s>=70 )r='c';    //else if( s>=70 ) r='c'
	  else if( s>=60 )r='d';   //else if( s>=60 ) r='d'
	                       //�ᵵ �ǰ� ����( s<60 )   else
	return r; 
  }
        /*
           *  ������ 0~100���� �� 60�̻��̸� '�հ�',60�̸��̸� '���հ�'
           *  ��� �ϰ�, ������ ���� ���̸� '��������'�� ����Ͻÿ�.  
         */
   void type4(){    //ó���� ����� ��ȯ�Ұ� ���ٸ� void�� ���ش�.return�����Ҽ��ִ�.
   int score = 100;
   String result = "";
   
   if( score>=0 && score<=100) {                            //��ø ������  if���ȿ� if�� �ߺ����
   if( score>=60 ){result = "�հ�";}                          //��3�� ����Ŭ��.
   else{result = "���հ�";} //else if �� 2�� ,if�� 3��.//(score<60)�� ������ ��
   }            //<-------�������� �����ºκб����� �н��Ѵ�.
   else{
	    result = "��������";   
   }
   System.out.println(result);
 }
 
 public static void main(String[] args) {
 IFExample obj =new IFExample();// �����ڻ������ؼ� JVM(����ӽ�)�Ű������� ���� �����ڸ� �Ӵ����ش�.
   obj.type1(); //�� �༮��  �͸�ü��� �Ѵ�. ������ �ȴ��
   //int k = obj.type1();   
   //String m = obj.type2();
  // System.out.println(m);
  
  //System.out.println(obj.type3());  
  char r = obj.type3(); 
  System.out.println(r);
  obj.type4();
  
 
 }                 //obj��� ���� �����ڸ� �����ؼ� obj�� ��ƶ�.obj�� ������ IFExample���̴�.
}                  //obj.type1(); �޼ҵ带 ȣ��. �׷� ��� /class�ۿ����� ���.
                   //int k = obj.type1(); 
                  //String str = new String(); ����.
                  //str = new Strting();����. ������ �����ִ� ��Ʈ���� ��������.