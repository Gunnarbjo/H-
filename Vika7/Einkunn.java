import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið les inn af skipanalínu kommutölu sem segir til um lágmarkseinkunn
 *  til að standast námskeið. Forritið á svo að lesa inn af
 *  staðalinntakiótilgreindan fjölda einkunna sem eru kommutölur.
 *  Forritið prentar út fjölda nemenda sem stóðust prófið og hlutfall þeirra í
 *  prósentummeð einum aukastaf.
 *
 *
 *****************************************************************************/

public class Einkunn {
    public static void main(String[] args) {

        double lagmarkseinkunn = Double.parseDouble(args[0]);
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        inntak.useLocale(Locale.US);
        int nemendur = 0;
        int nadu = 0;

        while (inntak.hasNext()) {
            nemendur++;
            double einkunn = inntak.nextDouble();

            if (einkunn >= lagmarkseinkunn) {
                nadu++;
            }
        }

        double hlutfall = (nadu * 100.0) / (nemendur);
        System.out.printf(nadu + " nemendur náðu sem er %.1f%%" , hlutfall);
    }
}
