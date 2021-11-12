/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið inniheldur klasann Summasem inniheldur fallið summaTveir
 *  sem tekur inn þrjár heiltölur og skilar true ef einhver ein af tölunum þremur
 *  er summa hinna tveggja, en skilar false annars.
 *
 *
 *****************************************************************************/

public class Summa {
    public static boolean summaTveir(int a, int b, int c) {
        if (a + b == c) {
            return true;
        }
        else if (a + c == b) {
            return true;
        }
        else if (c + b == a) {
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean sattEkkiSatt = summaTveir(a, b, c);
        String utkoma;

        if(sattEkkiSatt){
            utkoma = "Sönn";
        }else {
            utkoma = "Ósönn";
        }

        System.out.print("Útkoman er " + utkoma);
    }
}
