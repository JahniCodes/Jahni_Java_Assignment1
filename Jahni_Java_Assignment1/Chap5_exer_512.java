public class Chap5_exer_512 {
    /*Write an application that calculates the product of the odd integers from 1 to 15. */
   public static void main(String[] args) {
      int product = 1;
      for (int i = 1; i <= 15; i++) {
          if (i % 2 != 0) {
              product *= i;
          }
      }
    System.out.printf("Total product of the odd numbers from 1 to 15: %d",product);
   }
}
