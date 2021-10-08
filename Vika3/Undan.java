/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Athugar hvort árið sé á undan úr tveim dagsetningum
 *
 *
 *****************************************************************************/

public class Undan {
    public static void main(String[] args) {

        int d1 = Integer.parseInt(args[0]);
        int m1 = Integer.parseInt(args[1]);
        int ar1 = Integer.parseInt(args[2]);
        int d2 = Integer.parseInt(args[3]);
        int m2 = Integer.parseInt(args[4]);
        int ar2 = Integer.parseInt(args[5]);

        boolean undan = (ar1 <= ar2) && (m1 <= m2) && (d1 <= d2);

        System.out.print("Fyrri dagsetningin er á undan seinni:" + undan);
    }
}
