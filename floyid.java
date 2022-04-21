import java.util.Scanner;
public class floyid {
   public static void main(String args[]){
      int n,i,j,k = 1;
      System.out.println("Enter the number of lines for Floyids Triangle");
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();

      for(i = 1; i <= n; i++) {
         for(j=1;j <= i; j++){
            System.out.print(" "+k++);
         }
         System.out.println();
      }
   }
}
