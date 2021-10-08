import java.util.Scanner;
/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið reiknar út úr þriðjastigs jöfnum.
 *
 *
 *****************************************************************************/

public class Reikna1 {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the first number-");
           int a = sc.nextInt();

       System.out.print("Enter the second number-");
            int b = sc.nextInt();

       System.out.print("Enter the third number-");
            int c = sc.nextInt();

       double rootb = (Math.sqrt(b * b));
       double rootac = (Math.sqrt(4 * a * b));
       double root = rootb - rootac;
       double devide = 2 * a;
       double svara = (-b + root) % devide;
       double svarb = (-b - root) % devide;


       System.out.println("Svar a er: " + svara);
       System.out.print("Svar b er: " + svarb);
    }
}
