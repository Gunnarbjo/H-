/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : reiknar út flatarmál og rúmmál sívalings.
 *
 *
 *****************************************************************************/

public class Sivalningur {
    public static void main(String[] args) {

        double r = Double.parseDouble(args[0]);
        double h = Double.parseDouble(args[1]);
        double pi = Math.PI;

        double flatarmal = 2 * pi * r * (r + h);
        double rummal = pi * (r * r) * h;

        System.out.println("Flatarmál sívalnings með radíus " + r + " og hæð " + h + " er:" + flatarmal);
        System.out.println("Rúmmál sívalnings með radíus " + r + " og hæð " + h + " er:" + rummal);

    }

}