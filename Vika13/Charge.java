import java.util.Objects;

/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  :Lýsing  : Forritið telur upp í 200 og prentar út texta Hæ,Hó eða Hí eftir
 * því hvort talan sem komið er að er deilanleg með 3, 5 eða 7, ef hún er ekki
 * deilanleg þá prentast út talan í staðin. Ef talan er deilanleg með 12
 * er byrjað að skrifa í nýja línu.
 *
 *****************************************************************************/


public class Charge {

    private final double rx, ry;   // position

    private final double q;        // charge


    public boolean equals(Object c) {

        if (this == c) return true;

        if (c == null || getClass() != c.getClass()) return false;

        Charge charge = (Charge) c;

        return Objects.equals(rx, charge.rx) && Objects.equals(ry, charge.ry);

    }


    public int hashCode() {

        return Objects.hash(rx, ry, q);

    }


    public Charge(double x0, double y0, double q0) {

        rx = x0;

        ry = y0;

        q = q0;

    }


    public double potentialAt(double x, double y) {

        double k = 8.99e09;

        double dx = x - rx;

        double dy = y - ry;

        return k * q / Math.sqrt(dx * dx + dy * dy);

    }


    public String toString() {

        return q + " at (" + rx + ", " + ry + ")";

    }


    public static void main(String[] args) {

        double x = Double.parseDouble(args[0]);

        double y = Double.parseDouble(args[1]);

        Charge c1 = new Charge(0.51, 0.63, 21.3);

        Charge c2 = new Charge(0.13, 0.94, 81.9);

        StdOut.println(c1);

        StdOut.println(c2);

        double v1 = c1.potentialAt(x, y);

        double v2 = c2.potentialAt(x, y);

        StdOut.println(v1 + v2);

    }

}
