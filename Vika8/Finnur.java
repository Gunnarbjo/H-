/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak 
 *
 *
 *****************************************************************************/

public class Finnur {
    public static int finna(int[] a, int x) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int N = 10;
        int[] a = new int [N];
        int x = Integer.parseInt(args[0]);
        int saetiTolu = finna(a, x);
        for (int i = 0; i < 10; i++) {
            a[i] = StdRandom.uniform(1, 10);
        }
        if (saetiTolu > 0) {
            System.out.print(x + " er í sæti " + saetiTolu);
        }
        else {
            System.out.print(x + " er ekki í fylkinu.");
        }
    }
}
