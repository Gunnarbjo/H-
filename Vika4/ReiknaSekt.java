/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Reyknar út sekt fyrir hraðakstur þar sem 2 tölur frá skipanalínu
 *  gefa okkur hámarkshraða og hin hraða bílsins.
 *
 *
 *****************************************************************************/

public class ReiknaSekt {
    public static void main(String[] args) {
        double hamarkshradi = Double.parseDouble(args[0]);
        double hradiBils = Double.parseDouble(args[1]);

        int a = 5000;
        int b = 10000;
        int c = 15000;
        double d = hradiBils - hamarkshradi;
        double y = 0.0;

        if (hradiBils <= hamarkshradi){
            System.out.print("Engin sekt");
            return;
        }else if (hamarkshradi <= 30){
            y = d * a;
        }else if (hamarkshradi <= 60){
            y = d * b;
        }else if (hamarkshradi > 60){
            y = d * c;
        }
        System.out.print("Sektin er " + y + "kr");

    }
}
