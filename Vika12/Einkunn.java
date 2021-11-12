/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið tekur inn mætingarhlutfall og lokaprófs einkunn
 *  og skilar hvort nemandinn hafi náð eða ekki
 *
 *
 *****************************************************************************/

public class Einkunn {
    private double maetingHlutfall;
    private int lokaprof;

    public static void main(String[] args) {
        Einkunn e = new Einkunn(0.5, 6);
        e.setLokaprof(3);
        System.out.println(e.getLokaprof());
        e.setMaetingHlutfall(2.0);
        System.out.println(e.getMaetingHlutfall());
        System.out.println("einkunn er fyrir ofan lágmarkseinkunn? " + e.erLagmarkseinkunn());

        Einkunn e2 = new Einkunn(-0.3, 10);

        System.out.println(e2.getMaetingHlutfall());
    }


    public Einkunn(double maetingHlutfall, int lokaprof) {
        if (erLoglegt(maetingHlutfall)) {
            this.maetingHlutfall = maetingHlutfall;
        }
        else {
            this.maetingHlutfall = 0.0;
        }
        this.lokaprof = lokaprof;
    }

    /**
     * Athugar hvort að mætingarhlutfallið sé innan marka
     * @param maetingHlutfall hlutfall mætingu
     * @return hvort það sé innan marka eða ekki
     */
    private boolean erLoglegt(double maetingHlutfall) {
        if (maetingHlutfall >= 0.0 && maetingHlutfall <= 1.0) {
            return true;
        }
        else
            return false;

    }

    public int getLokaprof() {
        return lokaprof;
    }

    public void setLokaprof(int lokaprof) {
        this.lokaprof = lokaprof;
    }

    public void setMaetingHlutfall(double maetingHlutfall) {
        if (erLoglegt(maetingHlutfall)) {
            this.maetingHlutfall = maetingHlutfall;
        }

    }

    public double getMaetingHlutfall() {
        return maetingHlutfall;
    }

    /**
     * athugar hvort lokaprófið sé hærra en lágmarkseinkunn
     * @return hvort einkuninn sé innan marka eða ekki
     */
    private boolean erLagmarkseinkunn() {
        if (lokaprof >= 5.0) {
            return true;
        }
        else {
            return false;
        }

    }

    /**
     *
     * @return Skilar streng sem inniheldur mæringarhlutfall og lokapróf
     */
    public String toString() {
        return "Einkunn{" +
                "maetingHlutfall=" + maetingHlutfall +
                ", lokaprof=" + lokaprof +
                '}';
    }
}