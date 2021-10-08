/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Býr til random tölu milli 0 og 1 og athugar hvort að hún sé minni
 *  en 0.8, ef hún er það prenar hún töluna en hættir að prenta þegar talan er
 *  stærri en 0.8.
 *
 *
 *****************************************************************************/

public class Slembi {
    public static void main(String[] args) {

      double a;
        while((a = StdRandom.uniform(0.0 , 1.0))<0.8) {
            System.out.println(a);
        }
    }
}
