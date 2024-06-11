import java.util.Scanner;

public class Divisors {

    public static void main(String args[]) {

         Scanner console = new Scanner(System.in);
         
        System.out.print("Enter the number :  ");
        int num = console.nextInt();
         
        System.out.print("Divisors of " + num+" "+ "="+" " );
// loop for
        for (int i = 1; i < num; i++) {
            if (num % i != 0) {
                continue;
            }//fim do if
            System.out.print(i + " , ");
        }//fim do for
    }//fim da classe main
}//fim da classe divisors
