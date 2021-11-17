/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið telur upp í 200 og prentar út texta Hæ,Hó eða Hí eftir
 *  hvort talan sem komið er að er deilanleg með 3, 5 eða 7, ef hún er ekki
 *  deilanleg þá prentast út talan í staðin. Ef talan er deilanleg með 12
 *  er byrjað að skrifa í nýja línu.
 *
 *
 *****************************************************************************/


public class HaeHoHi {

    public static void main(String[] args) {

        for (int i = 1; i <= 200; i++) {

            if (i % 3 == 0) {

                System.out.print("Hæ");

            }

            if (i % 5 == 0) {

                System.out.print("Hó");

            }

            if (i % 7 == 0) {

                System.out.print("Hí");

            }

            if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {

                System.out.print(i);

            }

            if (i % 12 == 0) {

                System.out.println();

            }

            else {

                System.out.print(", ");

            }

        }


    }

}
