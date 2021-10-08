import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.Locale;

/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið teiknar hringi ef þeir falla innan(ekki á jaðrinum)
 *  tiltekins ramma. Síðan les forritið inn af fyrstu línu ramman sem fjórar tölur
 * (x1,y1) neðra vinstra hornið
 * (x2, y2) efrahægra hornið
 * og teiknar ramman eftir þeim.
 * Forritið  les svo inn ótilgreindan fjölda af þrenndumog teiknar
 * hringina ef þeir eru innan rammans.
 *
 *****************************************************************************/

public class Hringir {
    public static void main(String[] args) {

        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        inntak.useLocale(Locale.US);

        double x1 = inntak.nextDouble();
        double y1 = inntak.nextDouble();
        double x2 = inntak.nextDouble();
        double y2 = inntak.nextDouble();
        double x = (x1 + x2) / 2;
        double y = (y1 + y2) / 2;
        double breidd = Math.abs(x1 - x2) / 2;
        double haed = Math.abs(y1 - y2) / 2;
        StdDraw.setScale(-1.0, 1.0);
        StdDraw.rectangle(x, y, breidd, haed);

        while (inntak.hasNext()){
            double xHringur = inntak.nextDouble();
            double yHringur = inntak.nextDouble();
            double radius = inntak.nextDouble();

            if (xHringur+radius>x2||xHringur+radius<x1);
            else if (xHringur-radius>x2||xHringur-radius<x1);
            else if (yHringur+radius>y2||yHringur+radius<y1);
            else if (yHringur-radius>y2||yHringur-radius<y1);
            else StdDraw.circle(xHringur, yHringur, radius);

            StdDraw.circle(xHringur,yHringur,radius);
        }

    }
}
