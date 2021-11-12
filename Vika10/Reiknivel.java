/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Fallið tekur inn tvær heiltölur og fallið margföldun margfaldar
 *  þær saman og skilar útkomuninni til main fallsins sem prufar það.
 *
 *
 *****************************************************************************/

public class Reiknivel {
    public static void main(String[] args) {

        System.out.println(margfoldun(2, -3));
        System.out.println(margfoldun(-2, 3));
        System.out.println(margfoldun(-2, -2));
        System.out.println(margfoldun(0, -2));
        System.out.println(margfoldun(5, 4));

    }

    /**
     * Fallið tekur inn tvær heiltölur og byrjar á að athuga hvort önnur hvor sé 0
     * ef það er satt þá skilar það 0, ef það er false athugar það hvort að báðar tölurnar
     * séu mínus, ef það er true þá skilar það jákvæðri tölu eftir margfeldið. Ef það er
     * false athugar það hvort að bara b sé neikvæð og skilar af sér neikvæðri tölu
     * eftir margfeldið ef það er true, annars margfarldar það a, b sinnum.
     *
     * margföldunin virkar sem a + a + a þar til fjöldi staka a er komið b oft
     *
     * @param a - Heiltala sem kemur úr main falli
     * @param b - Heiltala sem kemur úr main falli
     * @return - skilar af sér margfeldi talnana a og b
     */
    public static int margfoldun(int a, int b) {

        if (a == 0 || b == 0) {
            return 0;
        }
        else if (a < 0 && b < 0) {
            return -1 * a + margfoldun(a, b + 1);
        }
        else if (b < 0) {
            return -margfoldun(a, -b );
        }
        else {
            return a + margfoldun(a, b - 1);
        }

    }
}
