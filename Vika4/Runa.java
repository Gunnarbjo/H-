/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  :Tekur inn heiltöluna:tala af skipanalínu,og prentar út
 *  runu af 0 og 1 af lengd "tala".Ef tala er ekki heiltala þá prentast
 *  út "Ólöglegt inntak"
 *
 *
 *****************************************************************************/

public class Runa {
    public static void main(String[] args) {
        try {
            int tala = Integer.parseInt(args[0]);
        }
        catch (Exception e) {
            System.out.println("Ólöglegt inntak");
            return;
        }
        int i;
        int tala = Integer.parseInt(args[0]);
        int o = 0;
        if (tala < 0) {
            tala = tala * -1;
        }
        for (i = 1; i <= tala; i++) {
            if (tala % i == 0) {
                System.out.print("1");
                o++;
            }
            else {
                System.out.print("0");
            }
        }
            System.out.println();
            System.out.print(o);

    }
}
