import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið athugar spil og raðar þeim í röð eftir sort og gildi
 *
 *
 *****************************************************************************/

public class SpilR {
    private String sort;
    private String gildi;

    public SpilR(String s, String g) {
        sort = s;
        gildi = g;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpilR spilR = (SpilR) o;
        return sort.equals(spilR.sort) && gildi.equals(spilR.gildi);
    }

    public int hashCode() {
        return Objects.hash(sort, gildi);
    }

    public Comparator<SpilR> getGildiComparator() {
        return new GildiComparator();
    }

    /**
     * Ber saman gildi spila
     */
    private class GildiComparator implements Comparator<SpilR> {
        private String[] gildiSpil = {
                "Ás", "Tvistur", "Þristur", "Fjarki", "Fimma", "Sexa",
                "Sjöa", "Átta", "Nía", "Tía", "Gosi", "Drottning", "Kóngur"
        };

        /**
         *
         * @param s1 fyrra spil
         * @param s2 seinna spil
         * @return Skilar röð spilana eftir gildi
         */
        public int compare(SpilR s1, SpilR s2) {
            int a = leita(gildiSpil, s1.gildi);
            int b = leita(gildiSpil, s2.gildi);

            return Integer.compare(a, b);
        }

        /**
         *  Leitar að streng í menginu gildiSpil
         * @param s strengur í gildispil
         * @param c strengur sem leitað er að
         * @return hvar strengurinn er í gildiSpil
         */
        private int leita(String[] s, String c) {
            for (int i = 0; i < s.length; i++) {
                if (c.equals(s[i])) return i;
            }
            return 0;
        }
    }

    public Comparator<SpilR> getSortComparator() {
        return new SortComparator();
    }

    /**
     * ber saman sort spila
     */
    private class SortComparator implements Comparator<SpilR> {
        private String[] sort = { "Hjarta", "Spaði", "Tígull", "Lauf" };

        /**
         *
         * @param s1 fyrra spil
         * @param s2 seinna spil
         * @return skilar röð spilana eftir sort
         */
        public int compare(SpilR s1, SpilR s2) {

            int a = leita(sort, s1.sort);
            int b = leita(sort, s2.sort);

            return Integer.compare(a, b);

        }

        /**
         *  leitar að streng í sort
         * @param s strengur í sort
         * @param c strengur sem leitað er að
         * @return hvar strengurinn sem leitað er að er í sort
         */
        private int leita(String[] s, String c) {
            for (int i = 0; i < s.length; i++) {
                if (c.equals(s[i])) return i;
            }
            return 0;
        }
    }

    public String toString() {
        return "SpilR{" +
                "sort='" + sort + '\'' +
                ", gildi='" + gildi + '\'' +
                '}';
    }

    public static void main(String[] args) {

        SpilR s1 = new SpilR("Þristur", "Tígull");
        SpilR s2 = new SpilR("Fjarki", "Lauf");
        SpilR s3 = new SpilR("Átta", "Spaði");
        SpilR s4 = new SpilR("Kóngur", "Hjarta");
        SpilR s5 = new SpilR("Tía", "Lauf");
        SpilR s6 = new SpilR("Tvistur", "Tígull");
        SpilR s7 = new SpilR("Gosi", "Hjarta");

        SpilR spilin[] = { s1, s2, s3, s4, s5, s6, s7 };

        System.out.println(Arrays.toString(spilin));

        Arrays.sort(spilin, spilin[0].getSortComparator());
        for (SpilR spila : spilin) System.out.println(spila.toString());
    }

}

