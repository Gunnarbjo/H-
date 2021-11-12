import java.util.Arrays;

/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Fallið tré reiknar jólatré með mismunandi ljósum, grænum og gulum.
 *  sem main fallið prentar síðan út með gul ljós með 1 og græn ljós með 5.
 *
 *
 *
 *****************************************************************************/

public class Tre {
    public static void main(String[] args) {

        System.out.println("Tré 1");
        int[][] jolatreFylki1 = tre(5, 0.1);
        for (int i = 0; i < jolatreFylki1.length; i++) {
            System.out.println(Arrays.toString(jolatreFylki1[i]));
        }
        System.out.println();

        System.out.println("Tré 2");
        int[][] jolatreFylki2 = tre(10, 0.3);
        for (int i = 0; i < jolatreFylki2.length; i++) {
            System.out.println(Arrays.toString(jolatreFylki2[i]));
        }
        System.out.println();

        System.out.println("Tré 3");
        int[][] jolatreFylki3 = tre(15, 0.6);
        for (int i = 0; i < jolatreFylki3.length; i++) {
            System.out.println(Arrays.toString(jolatreFylki3[i]));
        }
        System.out.println();

        System.out.println("Tré 4");
        int[][] jolatreFylki4 = tre(20, 0.8);
        for (int i = 0; i < jolatreFylki4.length; i++) {
            System.out.println(Arrays.toString(jolatreFylki4[i]));
        }
        System.out.println();

    }

    /**
     *
     *Fallið tekur inn heiltölu og kommutölu og teiknar fylki af stærðinni [n][n]
     * með p líkum á að ljósin séu græn eða gul.
     * @param n - Heiltala sem ákvarðar stærð fylkisins
     * @param p - kommutala sem ákvarðar líkurnar á því hvort ljósin
     *          á tréinu eru græn eða gul
     * @return - returnar tréi sem er teiknað af 5-um 1-um til main fallsins
     */
    public static int[][] tre(int n, double p) {

        int[][] jolatre = new int[n][n * 2 - 1];
        final int GRAENN = 5;
        final int GULUR = 1;

        for (int i = 0; i < jolatre.length; i++) {
            for (int j = n - 1 - i; j <= n - 1 + i; j++) {
                if (StdRandom.bernoulli(p)) {
                    jolatre[i][j] = GULUR;
                }
                else {
                    jolatre[i][j] = GRAENN;
                }
            }
        }
        return jolatre;
    }
}
