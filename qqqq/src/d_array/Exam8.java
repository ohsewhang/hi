/*정수형 2차원배열을 5행 5열을 만들어 100~200 사이의 임의의 정수값을 Math.random()을 사용하여 대입 한 후 
1) 배열 전체 출력(5행5열로)
2) 전체 값들의 합계
3) 전체 최솟값
4) 전체 최댓값
5) 각행의 최댓값을 출력하시오.
 */
package d_array;

public class Exam8 {
   Exam8() {
      int sum = 0;
      int max = 100;
      int min = 200;

      int[][] r = new int[5][5]; // 2차원 배열. 5행5열 생성.
      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5; j++) {
            r[i][j] = (int) (Math.random() * 100) + 100;
         } // 포문2 끝
      } // 포문1 끝
      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5; j++) {
            System.out.print(r[i][j] + " ");
            sum += r[i][j];

            if (max < r[i][j])
               max = r[i][j];// 최댓값
            if (min > r[i][j])
               min = r[i][j];// 최솟값

         } // 포문2끝
         System.out.println();

      } // 포문1끝
      System.out.println("합계 :" + sum);
      System.out.println("최댓값 " + max);
      System.out.println("최솟값" + min);

      for (int i = 0; i < 5; i++) {
         int maxi = 100;
         for (int j = 0; j < 5; j++) {
            if (maxi < r[i][j])
               maxi = r[i][j];
         } // 포문2끝
         System.out.println((i + 1) + "행 최댓값" + maxi);
      } // 포문 1끝

   }// 생성자끝

   public static void main(String[] args) {
      new Exam8();
   }// main끝
}// class끝