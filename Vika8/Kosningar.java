import java.util.Arrays;

/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið reyknar út landstölu atkvæða við hvern þingmann.
 *
 *
 *****************************************************************************/

public class Kosningar {
    public static double[][] landstolur(int[] atkvaedi, int[] thingmenn) {
        double[][] nidurstada = new double[9][thingmenn.length];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < thingmenn.length; j++) {
                nidurstada[i][j] = atkvaedi[j] * 1.0 / (thingmenn[j] + i + 1);
            }
        }
        return nidurstada;
    }

    public static void main(String[] args) {

        int[] atkvaedi = { 27699, 44371, 13519, 55758, 40581 };
        int[] thingmenn = { 9, 14, 3, 16, 12 };
        double[][] lokatolur = landstolur(atkvaedi, thingmenn);

        for(int i = 0; i< lokatolur.length; i++ ){
            System.out.println(Arrays.toString(lokatolur[i]));
        }


    }
}
