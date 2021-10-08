/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið á að telja hve oft hliðinhá teningi kemur upp
 *  og prenta þá útkomu. Talan hverður að vera á bilinu 1 og 6, annars
 *  er prentað Ólögleg hlið.
 *
 *****************************************************************************/

public class Teningur {
    public static void main(String[] args) {
        int t = Integer.parseInt(args[0]);
        int h = Integer.parseInt(args[1]);
        int k = 0;

        if (h > 0 && h < 7) {
            for (int i = 0; i < t; i++) {
                int d = StdRandom.uniform(1, 7);
                if (d == h) {
                    k++;
                }
            }
            System.out.println(k);
        }
        else {
            System.out.print("Ólögleg hlið");
        }



    }
}
