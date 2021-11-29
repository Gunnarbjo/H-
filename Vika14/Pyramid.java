/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : forritið reiknar út og prentar volume og are af píramída
 *
 *
 *****************************************************************************/

public class Pyramid extends Shape {
    private double length;

    /**
     *
     * @param height lengd
     * @param width breydd
     * @param pheight hæð
     */
    public Pyramid(double height, double width, double pheight) {
        setWidth(width);
        setHeight(pheight);
        length = height;
    }

    public double getArea() {
        return length * getWidth() + length * Math.sqrt(
                Math.pow(getWidth() / 2, 2) + Math.pow(getHeight(), 2))
                + getWidth() * Math.sqrt(Math.pow(length / 2, 2) + Math.pow(getHeight(), 2));
    }

    public double getVolume() {
        return (length * getWidth() * getHeight()) / 3;
    }

    public static void main(String[] args) {
        Pyramid p = new Pyramid(3.0, 4.0, 2.0);
        System.out.printf("%5.2f %n", p.getArea());
        System.out.printf("%5.2f %n", p.getVolume());
    }
}
