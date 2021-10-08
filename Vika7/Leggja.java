import java.awt.Color;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið teiknar umferðaskiltið fyrir bannað að leggja.
 *  Forritið á  að  gagnast  hönnuði  umferðaskilta  sem  er  að
 *  prófa  mismunandi útgáfur  af  skiltinu. Hönnuðurinn vill geta skoðað
 *  það með mismunandi radíus og halla á borðanumí miðjunni
 *
 *
 *****************************************************************************/

public class Leggja {
    public static void main(String[] args) {
        StdDraw.setScale(-1.0, 1.0);
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        inntak.useLocale(Locale.US);

        double radianar = inntak.nextDouble();
        double halliGradur = Math.toRadians(inntak.nextDouble());

        double innriHringur = radianar * 0.9;
        double margfoldun = -radianar + 0.1 * radianar;

        double x1 = margfoldun * Math.cos(halliGradur);
        double y1 = margfoldun * Math.sin(halliGradur);


        double[] x = { x1, -x1 };
        double[] y = { y1, -y1 };

        StdDraw.setPenColor(Color.red);
        StdDraw.filledCircle(0.0, 0.0, radianar);
        StdDraw.setPenColor(Color.blue);
        StdDraw.filledCircle(0.0, 0.0, innriHringur);
        StdDraw.setPenColor(Color.red);
        StdDraw.setPenRadius(radianar * 0.05);
        StdDraw.polygon(x, y);

    }
}
