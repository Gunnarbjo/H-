import java.util.Arrays;

/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið kastar teningi ákveðið oft með upgefnum líkum á hvaða tala kemur út,
 *  setur síðan útkomuna í fylki og prentar fylkið út.
 *
 *
 *
 *****************************************************************************/

public class DiscreteProfun {
    public static void main(String[] args) {

        int itrun1 = 5;
        int itrun2 = 10;
        int itrun3 = 15;
        double[] likur = { 0.3, 0.05, 0.05, 0.05, 0.05, 0.5 };
        int[] utkoma1 = discreteLikur(likur, itrun1);
        int[] utkoma2 = discreteLikur(likur, itrun2);
        int[] utkoma3 = discreteLikur(likur, itrun3);
        System.out.println(Arrays.toString(utkoma1));
        System.out.println(Arrays.toString(utkoma2));
        System.out.println(Arrays.toString(utkoma3));
    }

    /**
     * Fallið gefur random tölu eftir líkum sem gefnar eru í main fallinu
     * og setur þær tölur sem koma út í nýtt fylki og skilar svo af sér fylkinu
     * yfir í main fallið.
     *
     * @param likur-ákvarðar líkurnar á hvaða tala kemur
     * @param n-hverus oft teningum er kastað í hverju fylki
     * @return -returnar útkomunni úr teningaköstunum sem fylki
     *
     */
    public static int[] discreteLikur(double[] likur, int n) {

        int[] flopp = new int[n];
        for (int i = 0; i < n; i++) {
            flopp[i] = StdRandom.discrete(likur) + 1;
        }
        return flopp;
    }
}
