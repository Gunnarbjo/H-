import java.util.Arrays;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;

/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið inniheldur 3 föll sem vinna saman með forritinu Nemendur
 *  og býr til nemendaskrá af nemendum.
 *
 *
 *****************************************************************************/

public class Nemendaskra {
    public static void main(String[] args) {

        int N = Integer.parseInt(args[0]);
        Nemandi[] nemendaSkra = new Nemandi[N];
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        while (s.hasNextLine()) {
            String inntak = s.nextLine();
            String[] gogn = inntak.split(",");
            Nemandi nemandi = finna(nemendaSkra, gogn);
            try {
                if (nemandi == null) {
                    nemandi = new Nemandi(gogn[0], gogn[1]);
                    baetaVid(nemendaSkra, nemandi);
                }
            }
            catch (RuntimeException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
        System.out.println((Arrays.toString(nemendaSkra)));
    }

    /**
     *Bætir við nemanda í nýja fylkið
     * @param nemendaSkra - fylki af nemendum
     * @param nemandi - stak í fylki af nemendaskrá
     * @throws RuntimeException - ef það er ekki pláss fyrir nemanda
     */
    public static void baetaVid(Nemandi[] nemendaSkra, Nemandi nemandi) throws RuntimeException {
        int i = 0;
        if (!erFull(nemendaSkra)) {
            while (nemendaSkra[i] != null) {
                i++;
            }
            nemendaSkra[i] = nemandi;
        }
    }

    /**
     * Leitar að nemanda í nemendaSkrá
     * @param nemendaSkra - fylki af nemendum
     * @param gogn - nýtt fylki af nemendum
     * @return - skilar nemendur
     */
    public static Nemandi finna(Nemandi[] nemendaSkra, String[] gogn) {
        Nemandi tempNemandi = new Nemandi(gogn[0], gogn[1]);
        for (Nemandi nemendur : nemendaSkra) {
            if (tempNemandi.equals(nemendur)) {
                System.out.println("Nemandi er í skrá: " + nemendur);
                System.out.println("Nemandi úr gögnum: " + tempNemandi);
                return nemendur;
            }
        }
        return null;
    }

    /**
     * Athugar hvort að það sé pláss fyrir nemandan í nýja fylkinu eða ekki
     * @param nemendaSkra - fylki af nemendum
     * @return - True eða False hvort það sé pláss eða ekki.
     */
    private static boolean erFull(Nemandi[] nemendaSkra) {
        if(nemendaSkra[nemendaSkra.length-1] == null){
            return false;
        }
        else{
            return true;
        }

    }

}
