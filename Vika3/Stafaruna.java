/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Prentar út ASCII kóðan fyrir 2 tölur
 *
 *
 *****************************************************************************/

public class Stafaruna {
    public static void main(String[] args) {

        int aTala = Integer.parseInt(args[0]);
        int bil = Integer.parseInt(args[1]);

        char d = (char)bil;

        char a = (char)aTala;
        char b = (char) ( a + d);
        char c = (char) (a + (2 * d));

            System.out.print("" + a + b + a + c + a + b + a);

    }
}
