/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Tekur tímann á því hversu lengi tekur að keyra kóðann
 *
 *
 *****************************************************************************/

public class Maeling {
    public static void main(String[] args) {
        System.out.println(maelaDouble(1000000000));
        System.out.println(maelaDouble(100000000));
    }

    public static double maelaDouble(int fjoldiSkrefa) {
       Stopwatch s = new Stopwatch();
        double total = 0;
        for (int i = 0; i < fjoldiSkrefa; i++)
            total += i;
        return s.elapsedTime();
    }
}
