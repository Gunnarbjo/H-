/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið tekur inn fyrverandi sæti lags og svo núverandi sæti
 *  lagsins og prentar út hver mismunurinn sér ásamt titli og flytjanda.
 *
 *
 *****************************************************************************/

public class Lag {
    private String titill;
    private String flytjandi;
    private int saetiTop40RUV;

    public static void main(String[] args) {

        Lag lag1 = new Lag("Næsta líf", "GDRN");
        System.out.println(lag1);
        lag1.setSaetiTop40RUV(5);
        System.out.println(lag1.setSaetiTop40RUV(20));


    }

    /**
     *
     * @param titill titill lagsins
     * @param flytjandi flytjandi lagsins
     */
    public Lag(String titill, String flytjandi) {
        this.titill = titill;
        this.flytjandi = flytjandi;

    }

    public int getSaetiTop40RUV() {
        return saetiTop40RUV;
    }

    /**
     * Athugar hversu mikið lagið hefur breytt um sæti á listanum
     *
     * @param saeti það sæti sem listinn var í
     * @return skilar af sér hvaða breytingu lagið hefur orðið fyrir á listanum
     */
    public int setSaetiTop40RUV(int saeti) {
        int temp = this.saetiTop40RUV;
        saetiTop40RUV = saeti;
        if (temp == 0) {
            return 40;
        }
        else if (saeti == 0) {
            return temp - 40;
        }
        else {
            return (temp - saeti);
        }
    }

    public String getTitill() {
        return titill;
    }

    public String getFlytjandi() {
        return flytjandi;
    }

    /**
     * tekur inn titil og flytjanda og setur inn í streng
     *
     * @return Skilar af sér streng fyrir main fallið til að prenta
     */
    public String toString() {
        return "Lag{titill='" + titill + "', flytjandi='" + flytjandi + "'}";
    }
}
