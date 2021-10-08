/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Finnur hæsta punkt falls með Newton-Raphson aðferðinni.
 *
 *
 *****************************************************************************/

public class Max {
    public static void main(String[] args) {

        double m = Double.parseDouble(args[0]);
        double a = 0.0;
        double x0 = 0.0;
        double x = x0;

        while (Math.abs(x-a) > m){
            double b = (9 * Math.pow(x, 2)) - (20 * x) - 56;
            double c = (18 * x) - 20;
            a = x;
            x = x - (b / c);
        }
        System.out.print(a);


    }
}
