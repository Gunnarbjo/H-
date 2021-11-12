/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið loopar tölur frá -6.0 til 6.0 og setur þær í sigmoid
 *  fall og prentar svo út niðurstöðuna fyrir hverja ítrun með millibili upp
 *  á 0.5. sigmund fallið reyknar út simoid fall út frá gefini tölu frá main fallinu.
 *
 *
 *****************************************************************************/

public class YmisMath {

    public static double sigmoid(double x) {
        double undir = 1 + Math.pow(Math.E, -x);

        double S = 1 / undir;
        return S;
    }

    public static void main(String[] args) {

        double millibil = 0.5;

        for (double x = -6.0; x <= 6.0; x = x + millibil) {
            double utkoma = sigmoid(x);
            System.out.println(x + " gefur okkur útkomuna " + utkoma);
        }

    }
}
