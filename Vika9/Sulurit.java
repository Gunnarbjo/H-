import java.util.Arrays;

/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið inniheldur tvö föll, birta og tíðni sem reikna
 *  og svo main fallið sem prufar föllin.
 *
 *
 *****************************************************************************/

public class Sulurit {
    public static void main(String[] args) {
        int fjoldi = 10;
        int[] inntak1 = new int[fjoldi];
        for (int i = 0; i < fjoldi; i++) {
            inntak1[i] = StdRandom.uniform(1, 7);
        }
        System.out.println(Arrays.toString(tidni(inntak1)));
        birta(tidni(inntak1));

    }

    /**
     * Fallið tekur inn heiltölu fylki og reiknar út tíðni hvers stak fylkisins og
     * skilar af sér fylki með double.
     * @param fylki- heiltölufylki
     * @return - fylkiUt double fylki
     */
    public static double[] tidni(int[] fylki) {
        int n = fylki.length;
        int max = fylki[0];

        for (int i = 0; i < n; i++) {
            if (fylki[i] > max) {
                max = fylki[i];
            }
        }
        double[] fylkiUt = new double[max];

        for (int j = 0; j < n; j++) {
            int temp = fylki[j];
            fylkiUt[temp - 1]++;
        }
        return fylkiUt;
    }

    /**
     * Tekur inn double fylki frá tidni og notar Stdstats til þess að teikna
     * upp súlurit úr fylkinu, StdDraw setur skalan með tilliti til hæsta
     * staks tíðnifylkisinis
     * @param fylki - double fylki
     */
    public static void birta(double[] fylki) {
        int n = fylki.length;
        StdDraw.setYscale(0, n);
        StdStats.plotBars(fylki);
    }
}
