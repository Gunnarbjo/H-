/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið hermir eftir myndlykkli í heimahúsi þar sem notandi
 *  getur flakkað milli stöðva í ólýnulegri dagskrá
 *
 *
 *****************************************************************************/

public class Sjonvarp implements SjonvarpSkil{

    private boolean stada;
    private int stodvar;
    private int nuverandistod = 1;
    private int klukka;
    private String[][] dagskra;

    /**
     * Sjónvarp frumstillt með dagskrá
     * @param dagskra textaskjal sem tekið er inn
     */
    public Sjonvarp(String[][] dagskra) {
        this.stodvar = dagskra.length;
        this.dagskra = dagskra.clone();

    }

    /**
     * Kveikja á sjónvarpi
     */
    public void kveikja() {
        stada = true;

    }

    /**
     * Slökkva á sjónvarpi
     */
    public void slokkva() {
        stada = false;

    }

    /**
     * Skipta á stöð þannig að núverandi stöð sé stöð
     * @param stod stöðin sem við erum á
     */
    public void skiptaUmStod(int stod) {
        if (stada && stodvar >= stod) {
            nuverandistod = stod;
        }

    }

    /**
     * Klukkan færð eina klukkustund áfram, ef hægt er
     */
    public void afram() {
        if (stada && klukka < dagskra[0].length - 1) {
            klukka++;
        }

    }

    /**
     * Klukkan færð eina klukkustund afturábak, ef hægt er
     */
    public void afturabak() {
        if (stada && klukka > 0) {
            klukka--;
        }

    }

    public String toString() {
        if (!stada) {
            return "";
        }
        return "Á stöð " + nuverandistod +
                " klukkan " + klukka +
                " er " + dagskra[nuverandistod - 1][klukka];
    }

    public static void main(String[] args) {
        int MAXTIMI = Integer.parseInt(args[1]);
        In in = new In(args[0]);
        int fjoldiStodva = Integer.parseInt(args[2]);
        String[][] dagskra = new String[fjoldiStodva][MAXTIMI];
        for (int i = 0; i < fjoldiStodva; i++) {
            dagskra[i] = in.readLine().split(",");
        }
        Sjonvarp s = new Sjonvarp(dagskra);
        s.kveikja();
        s.afram();
        s.skiptaUmStod(2);
        System.out.println("test 1 skipta um stöð: " + s);
        s.skiptaUmStod(fjoldiStodva);
        System.out.println("test 2 síðasta stöð " + s);
        s.afturabak();
        s.skiptaUmStod(2);
        System.out.println("test 3 afturábak " + s);
        for (int i = 0; i < 5; i++)
            s.afram();
        System.out.println("test 4 síðasta klukka " + s);
        s.afram();
        System.out.println("test 5 áfram en ekki hægt að fara lengra: " + s);
        s.skiptaUmStod(fjoldiStodva + 1);
        System.out.println("test 6 ólögleg stöð staða óbreytt " + s);


    }
}
