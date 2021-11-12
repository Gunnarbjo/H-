import java.util.Objects;

/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Tekur inn tvo nemendur og ber saman hvort nemandinn sé
 *  með betri einkunn og skilar þeim nemanda út sem er hærri með nafni,
 *  tölvupósti og einkunn.
 *
 *
 *****************************************************************************/

public class Nemandi {

    private String nafn;    // nafn nemanda
    private String tPostur; // tölvupóstur nemanda
    private Einkunn einkunn; //einkunn nemanda

    public static void main(String[] args) {

        Nemandi n1 = new Nemandi("Helga", "helga@hi.is");
        Einkunn e1 = new Einkunn(0.6, 6);
        n1.setEinkunn(e1);

        Nemandi n2 = new Nemandi("Þröstur", "th@siminn.is");
        Einkunn e2 = new Einkunn(0.3, 8);
        n2.setEinkunn(e2);

        System.out.println(n1.haerriEinkunn(n2) + " er með hærri einkunn");

    }

    /**
     * Smiður sem tekur inn nafn og tölvupóst nemanda
     *
     * @param n nafn
     * @param t tölvupóstfang
     */
    public Nemandi(String n, String t) {
        nafn = n;
        tPostur = t;
        einkunn = null;

    }

    public Nemandi(Einkunn e, String n, String t) {
        this.nafn = n;
        this.tPostur = t;
        this.einkunn = e;

    }

    /**
     * tekur inn tvo nemendur og ber þá saman
     *
     * @param n nafn nemanda
     * @return nemanda með hærri einkun
     */
    public Nemandi haerriEinkunn(Nemandi n) {
        if (n.getEinkunn().getLokaprof() > this.einkunn.getLokaprof()) {
            return n;
        }
        return this;
    }

    public Einkunn getEinkunn() {
        return einkunn;
    }

    public void setEinkunn(Einkunn einkunn) {
        this.einkunn = einkunn;
    }
    // gettera og settera þarf ekki að skjala

    public String gettPostur() {
        return tPostur;
    }

    public String getNafn() {
        return nafn;
    }

    public void setNafn(String nafn) {
        this.nafn = nafn;
    }

    /**
     * tekur inn nafn, tpost og einkunn
     *
     * @return skilar streng með nafni, tölvupóst of einkunn nemanda
     */
    public String toString() {
        return "Nemandi{" +
                "nafn='" + nafn + '\'' +
                ", tPostur='" + tPostur + '\'' +
                ", einkunn=" + einkunn +
                '}';
    }

    /**
     * Skilar true ef nafn er sama og fyrra stak gogn og tölvupóstur er sama og seinna stak gogn
     *
     * @param gogn gögn nemandans, nafn og tölvupóstur
     * @return satt ef gogn innihalda sama nafn og tölvupóst og eiginleikar hlutarins
     */
    public boolean equalsString(String[] gogn) {
        Nemandi n = new Nemandi(gogn[0], gogn[1]);
        return this.equals(n);
    }


    /**
     * Ber saman eiginleika o við eiginleika hlutarins
     *
     * @param o hlutur sem á að bera saman við
     * @return true ef hluturinn o er eins og hluturinn
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nemandi nemandi = (Nemandi) o;
        return Objects.equals(nafn, nemandi.nafn) && Objects
                .equals(tPostur, nemandi.tPostur);
    }

    public int hashCode() {
        return Objects.hash(nafn, tPostur);
    }

}
