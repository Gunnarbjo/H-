/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak 
 *
 *
 *****************************************************************************/

public class Circle extends Shape {

    public Circle(double w) {
        setWidth(w);

    }

    public double getArea() {
        return Math.pow(getWidth() / 2, 2) * Math.PI;
    }

    public static void main(String[] args) {
        Circle c = new Circle(3.0);
        System.out.printf(" %5.2f %n", c.getArea());
    }
}
