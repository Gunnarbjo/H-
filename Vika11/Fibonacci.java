/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið er endurhvæmt fall sem tekur inn tvo bókstafi og eina
 *  heiltölu og prentar út fibonacci orð með bókstöfunum með fjölda endurtekninga
 *  sem sagt er til með heiltölunni.
 *
 *
 *****************************************************************************/

public class Fibonacci {
    public static void main(String[] args) {

        int n = 10;
        System.out.println(f('e', 'f', n));

    }

    /**
     * Fallið tekur inn 2 heiltölur og síðan hversu oft á að prenta stafina í röð sem
     * ákvarðast af fibonacci reglunni
     * @param a - fyrri bókstafurinn
     * @param b - seinni bókstafurinn
     * @param n - heiltala
     * @return - Streng af bókstöfum sem ákvarðast af fibonacci og heiltölunni
     */
    public static String f(char a, char b, int n) {

        if (n == 0) {
            return Character.toString(a);
        }
        if (n == 1) {
            return Character.toString(b);
        }
            return f(a,b,n-1) + f(a,b,n-2);

    }
}
