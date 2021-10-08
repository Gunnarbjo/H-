import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.Locale;

/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak 
 *
 *
 *****************************************************************************/

public class FilterOut {
    public static void main(String[] args) {

        double nedriMork = Double.parseDouble(args[0]);
        double efriMork = Double.parseDouble(args[1]);

        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        inntak.useLocale(Locale.US);


        while (inntak.hasNext()) {

            double a = inntak.nextDouble();

            if (a < nedriMork) {
                System.out.print(a + " ");
            }
            if (a > efriMork) {
                System.out.print(a + " ");
            }

        }
        System.out.println();

    }
}


