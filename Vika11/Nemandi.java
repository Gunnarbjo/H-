import java.util.Objects;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Inniheldur upplýsingar um nemanda, nafn og tölvupóst
 *
 *
 *****************************************************************************/

public class Nemandi {
    private String nafn;    // nafn nemanda
    private String tPostur; // tölvupóstur nemanda
    public Nemandi(String n, String t) {
        nafn = n;
        tPostur = t;
    }
    public String gettPostur() {
        return tPostur;
    }
    public String getNafn() {
        return nafn;
    }
    public void setNafn(String nafn) {
        this.nafn = nafn;
    }
    public String toString() {
        return "Nemandi{" +
                "nafn='" + nafn + '\'' +
                ", tPostur='" + tPostur + '\'' +
                '}';
    }
    public boolean equalsString(String[] gogn) {
        Nemandi n = new Nemandi(gogn[0], gogn[1]);
        return this.equals(n);
    }
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
    public static void main(String[] args) {

    }


}
