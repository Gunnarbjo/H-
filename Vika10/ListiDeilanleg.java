/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : forritið tekur inn tvær int tölur þar sem fyrri er deilirinn og
 *  seinni er sá staður í fylkinu listi sem á ða byrja. Forritið athugar síðan
 *  hvort hægt sé að deila tölunum í listanum frá því staki sem það á að byrja
 *  með deilinum og prentar síðan út streng af þeim tölum úr listanum sem eru
 *  deilanlegar með deilinum. main fallið prufar síðan útkomuna úr deilanleg
 *  fallinu.
 *
 *
 *****************************************************************************/

public class ListiDeilanleg {

    public static void main(String[] args) {
        int[] listi = { 3, 4, 7, 14 };

        System.out.println(deilanleg(listi, 3, 2));
        System.out.println(deilanleg(listi, 2, 1));
        System.out.println(deilanleg(listi, 7, 2));
        System.out.println(deilanleg(listi, 1, 0));
        System.out.println(deilanleg(listi, 2, 4));

    }

    /**
     * Fallið deilanlegt tekur inn fylkið lista og tvær heiltölur þar sem sú fyrri er deilirinn
     * og sú seinni er byrjunarstaðsetningin í lista
     *
     * @param listi  - Gefið fylki í main fallinu, fylkið inniheldur þær tölur sem á að deila með
     *               deilinum
     * @param deilir - heiltala úr main fallinu, sú tala sem deilt er með tölunum í fylkinu
     * @param n      - Heiltala úr main fallinu, Sá staður sem við byrjum að athuga hvort að
     *               tala sé deilanleg eða ekki.
     * @return - Strengur með þeim tölum sem eru deilanlegar með deilinum úr fylkinu listi með
     * bili á milli.
     */
    public static String deilanleg(int[] listi, int deilir, int n) throws RuntimeException {

        if (n < 0 || n >= listi.length) {
            throw new RuntimeException("Utan marka " + n);
        }
        else if (n == listi.length - 1) {
            return "";
        }
        else if (listi[n] % deilir == 0) {
            return listi[n] + " " + deilanleg(listi, deilir, n + 1);
        }
        return deilanleg(listi, deilir, n + 1);
    }
}
