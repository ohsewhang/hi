/*������ 2�����迭�� 5�� 5���� ����� 100~200 ������ ������ �������� Math.random()�� ����Ͽ� ���� �� �� 
1) �迭 ��ü ���(5��5����)
2) ��ü ������ �հ�
3) ��ü �ּڰ�
4) ��ü �ִ�
5) ������ �ִ��� ����Ͻÿ�.
 */
package d_array;

public class Exam8 {
   Exam8() {
      int sum = 0;
      int max = 100;
      int min = 200;

      int[][] r = new int[5][5]; // 2���� �迭. 5��5�� ����.
      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5; j++) {
            r[i][j] = (int) (Math.random() * 100) + 100;
         } // ����2 ��
      } // ����1 ��
      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5; j++) {
            System.out.print(r[i][j] + " ");
            sum += r[i][j];

            if (max < r[i][j])
               max = r[i][j];// �ִ�
            if (min > r[i][j])
               min = r[i][j];// �ּڰ�

         } // ����2��
         System.out.println();

      } // ����1��
      System.out.println("�հ� :" + sum);
      System.out.println("�ִ� " + max);
      System.out.println("�ּڰ�" + min);

      for (int i = 0; i < 5; i++) {
         int maxi = 100;
         for (int j = 0; j < 5; j++) {
            if (maxi < r[i][j])
               maxi = r[i][j];
         } // ����2��
         System.out.println((i + 1) + "�� �ִ�" + maxi);
      } // ���� 1��

   }// �����ڳ�

   public static void main(String[] args) {
      new Exam8();
   }// main��
}// class��