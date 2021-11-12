/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið tekur inn nafn á skrá (nafnASkra) og orð (ord).
 *  Forritið lesið úr skránni ótilgreindan fjölda lína. Ef lína inniheldur
 *  orðið ord hækkar teljarinn um einn. Aðferðin skilar fjölda lína
 *  sem innihalda orðið ord.
 *
 *
 *****************************************************************************/

public class Leit {
    public static void main(String[] args) {


        System.out.println("heiltalan " + leit("nemendur.txt", "@"));
        System.out.println("heiltalan " + leit("nemendur.txt", "dóttir"));
        System.out.println("heiltalan " + leit("nemendur.txt", "Reykjavík"));
        System.out.println("heiltalan " + leit("nemendur.txt", "son"));

    }

    /**
     * Forritið opnar textaskrá og fer yfir textan og skilar hversu oft orðið sem leitað er að
     * kemur fyrir í textanum.
     * @param nafnASkra - tekið úr textadocumentinu "nemendur.txt"
     * @param ord - orðið sem leitað er að í nafnASkrá
     * @return - hversu oft orðið er í skránni
     */
    public static int leit(String nafnASkra, String ord) {

        In s = new In(nafnASkra);
        int talning = 0;

        while (s.hasNextLine()) {
            String lina = s.readLine();
            if (lina.contains(ord)) {
                talning++;
            }
        }
        s.close();
        return talning;
    }
}
