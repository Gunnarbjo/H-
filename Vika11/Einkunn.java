/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið athugar hvort að einkunn sé yfir lágmarkseinkunn og
 *  hvort að mætingarhlutfall nemandans sé innan marka til þess að fá einkunn.
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

    private boolean erLagmarkseinkunn() {
        if (lokaprof >= 5.0) {
            return true;
        }
        else {
            return false;
        }

    }
}
