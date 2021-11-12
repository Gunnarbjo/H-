import java.io.File;
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

public class Minnsta {

    public static double minnstaStak(double fylki []){

        double minnstala = fylki[0];

        for(int i = 1; i < fylki.length; i++){
            if (fylki[i] < minnstala){
                minnstala = fylki[i];
            }
        }
            return minnstala;

    }
    public static void main(String[] args) {
        try {
            Scanner inntak = new Scanner(new File("fylki.txt"));
            inntak.useLocale(Locale.US);
            int length = inntak.nextInt();
            double[] fylki = new double[length];
            int i = 0;

            while (inntak.hasNextDouble()) {
                fylki[i] = inntak.nextDouble();
            }
            double minnstatala = minnstaStak(fylki);

            System.out.print("Minnsta talan er " + minnstatala);


        }
        catch (java.io.FileNotFoundException e) {
            System.out.println("Virkar ekki!");
        }

    }
}
