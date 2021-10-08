/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak 
 *
 *
 *****************************************************************************/

public class test2 {
    public static void main(String[] args) {

        StdDraw.setScale(-1.0 , 2.0);

        for (int i = 0; i < 5; i++) {

            double x = 0.05 + i * 0.2;
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.filledSquare(x, 0.5, 0.05);
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledSquare(x + 0.1, 0.5, 0.05);

        }
    }
}
