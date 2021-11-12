import java.util.Arrays;

/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  :Forritið inniheldur klasann Fylki.java sem inniheldur fallið samtalaFylki
 *  sem tekur inn tvö heiltölufylki, a og b og býr til nýtt heiltölufylki c þar
 *  sem hvert stak í c er samtala stakana a og b.
 *  Fallið samtalaFylki skilar fylkinu c.
 *
 *
 *****************************************************************************/

public class Fylki {

    public static int[] samtalaFylki(int[] a, int[] b) {
        int N = a.length;
        int[] c = new int[N];

        for (int i = 0; i < N; i++) {
            c[i] = a[i] + b[i];
        }
        return c;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4};
        int[] c = samtalaFylki(a , b );

        System.out.print(Arrays.toString(c));
    }
}
