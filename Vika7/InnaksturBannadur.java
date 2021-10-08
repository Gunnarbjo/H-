import java.awt.Color;

/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak 
 *
 *
 *****************************************************************************/

public class InnaksturBannadur {
    public static void main(String[] args) {
        StdDraw.setPenColor(Color.red);
        StdDraw.filledCircle(0.5, 0.5, 0.1);

        StdDraw.setPenColor(Color.yellow);
        StdDraw.filledRectangle(0.5, 0.5, 0.08, 0.015);

    }
}
