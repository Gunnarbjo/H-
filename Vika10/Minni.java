/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið inniheldur tvö föll þar sem fallið minnien leitar að
 *  tölunni í fylki og skilar af sér hversu mörg stök í fylkinu eru minni.
 *
 *
 *
 *****************************************************************************/

public class Minni {
    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int i = a[0];
        int j = a.length;
        int tala = 4;

        System.out.println(minniEn(a, i, j, tala));


    }

    /**
     * Fallið tekur inn fylki og 3 heiltölur og leitar að staki í fylkinu
     * og skilar síðan til main fallsins hversu mörg stök eru minni en talan
     * sem leitað er að.
     *
     * @param a    - Fylki af tölum sem á að leita í
     * @param i    - upphafspunktur leitarinnar
     * @param j    - endapunktur leitarinnar
     * @param tala - talan sem þarf að finna í fylkinu
     * @return - skilar til main fallsins hvesru mörg stök í fylkinu eru minni
     * en talan sem leitað er að.
     */
    public static int minniEn(int[] a, int i, int j, int tala) {

        int k = i + (j - i) / 2;

        if (j < i) {

            return 0;

        }

        else if (a[k] < tala) {

            i = k + 1;

            return minniEn(a, i, j, tala);

        }

        else if (a[k] > tala) {

            j = k - 1;

            return minniEn(a, i, j, tala);

        }

        if (a[k] == tala) {

            return k;

        }


        return k;


    }


}

