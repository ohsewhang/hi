package g_exception;

public class ProductExam {
		
	public static void main(String[] args) {
		Radio r1 = new Radio();
		Video v1 = new Video();
		Tv tv1 = new Tv();
		
		System.out.println(r1.getProductName());
		System.out.println(v1.getProductName());
		System.out.println(tv1.getProductName());
		
		      //����ȯ����
		//Radio r2 = new Radio(); 
		//Video v2 = (Video)r1; 
		
			 //����ȯ����
		Radio r3 = new Radio();
		Video v3 = new Video();
		Tv tv3 = new Tv();
	
		try {
		Product p1 = (Product) r3;
		System.out.println(p1.getProductName());
		Product p2 = (Product) v3;
		System.out.println(p2);
		Product p3 = (Product) tv3;
		System.out.println(p3);
		System.out.println("����ȯ����");
		}catch(Exception ex) {
		System.out.println("����ȯ����");
	}
		}//main

}
