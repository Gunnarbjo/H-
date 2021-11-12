/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak 
 *
 *
 *****************************************************************************/

import java.awt.Color;

public class ColorBrot {
    public static void main(String[] args) {
        Square square = lesaMidja("midja.txt");
        int n = Integer.parseInt(args[0]);
        int ITERS = Integer.parseInt(args[1]);
        // read in color map
        Color[] colors = lesaColors("mandel.txt", ITERS);
        Picture picture = reiknaMandelBrot(square, n, ITERS, colors);

        picture.show();
    }

    /**
     *
     * Skilar nokkrum ítrunum til að athuga hvort c = a + ib er í Mandelbrot
     * þar sem i stendur fyrir imaginary
     * @param z0 a + ib
     * @param d ef talan er hærri en 2
     * @return Skilar nokkrum ítrunum af a + ib
     */
    public static int mand(Complex z0, int d) {
        Complex z = z0;
        for (int t = 0; t < d; t++) {
            if (z.abs() > 2.0) return t;
            z = z.times(z).plus(z0);
        }
        return d;
    }

    /**
     *Les inn gildi fyrir x, y og stærð
     * @param s midja.txt skrá
     * @return skilar af sér nýjum streng með x, y og size
     */
    public static Square lesaMidja(String s) {
        In in = new In(s);
        double x = in.readDouble();
        double y = in.readDouble();
        int size = in.readInt();
        return new Square(x, y, size);
    }

    /**
     *
     * @param s stærð kassans
     * @param n hversu margar víddir eru í kassanum
     * @param iterations hversu margar ýtranir
     * @param colors fylki af litum
     * @return mynd í lit
     */
    public static Picture reiknaMandelBrot(Square s, int n, int iterations, Color[] colors) {
        // compute Mandelbrot set
        Picture picture = new Picture(n, n);
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                Complex z0 = new Complex(s.getX0(col, n), s.getY0(col, n));
                int t = mand(z0, iterations - 1);
                picture.set(col, n - 1 - row, colors[t]);
            }
        }
        return picture;
    }

    /**
     * Les inn litaröð og setur inn í fylki
     * @param skra mandel.txt skrá
     * @param itranir hversu oft er ítrað
     * @return fylki af litum
     */
    public static Color[] lesaColors(String skra, int itranir) {
        In in = new In(skra);
        Color[] colors = new Color[itranir];
        for (int t = 0; t < itranir; t++) {
            int r = in.readInt();
            int g = in.readInt();
            int b = in.readInt();
            colors[t] = new Color(r, g, b);
        }
        return colors;
    }
}
