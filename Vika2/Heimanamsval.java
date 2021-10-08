
public class Heimanamsval {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        int number = (int)Math.pow(n - k, n);
        int summa =0;

        for(int i = 0; i < 10; i++){
            summa = (int)Math.pow(i, i);
        }
        System.out.println(summa);
        int i = n ;

        /*while (i >= 0) {
            number += (n * n);
            i--;
        }*/
        number = number + summa;
        number = (int) (number % (Math.pow(10, 9) + 7));
        System.out.print(number);
    }
}
