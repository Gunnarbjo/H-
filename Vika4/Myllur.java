/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  :Tekur inn töluna lengdaf skipanalínu og prentar út eftirfarandi
 *  línu sem samanstendur af jafnmörgum myllumerkjum og talan segir til um.
 *
 *
 *****************************************************************************/

public class Myllur {
    public static void main(String[] args) {

        int lengd = Integer.parseInt(args[0]);
        System.out.println("Myllurnar");

        for (int i = 1; i <= lengd; i++) {
            System.out.print(i);
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }

        }

    }
}
