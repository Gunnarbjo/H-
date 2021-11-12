/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið tekur inn tveir heiltölur og athugar hversu oft hægt er að
 *  taka seinni töluna frá fyrri og prentar svo í main fallinu hversu oft það er hægt.
 *
 *
 *****************************************************************************/

public class Aha {
    /**
     * Fallið tekur inn tvær heiltölur og telur hversu oft er hægt að taka töluna b frá tölunni a og skilar
     * hversu oft það er hægt. Sem skilar heiltölu í deilingu a og b, fallið gildir ekki fyrir mínustölur.
     * @param a - heiltala sem byrjar sem talan frá main fallinu en lækkar svo um b fyrir hvert skipti sem fallið
     *          er keyrt í gegn.
     * @param b - heiltala sem kemur úr main fallinu
     * @return - Fallið returnar hversu oft það fer í gegnum sjálfan sig
     */
    public static int aha(int a, int b) {
        if (a < b) return 0;
        return 1 + aha(a - b, b);
    }

    public static void main(String[] args) {

        int fyrri = 8;
        int seinni = 2;

        int utkoma = aha(fyrri, seinni);

        System.out.println(utkoma);
        System.out.println(aha(9,3));
    }

}

