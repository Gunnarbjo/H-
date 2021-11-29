import java.nio.charset.StandardCharsets;
import java.util.Scanner;


/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Scannerinn les inn og forritið skoðar hvort það sem
 *  kemur inn sé leyfilegt eða ekki, ef leyfilegt þá prentar það hversu margir
 *  kúnnar fóru í gegn, ef ekki leyfilegt prentar það gallað
 *
 *
 *****************************************************************************/

public class Tekk {
    /**
     *Tekur inn runu af gögnum og athugar hvort það
     * @return Heiltölufjölda kúnna eða Gölluð
     */
    public static String tekk() {
        Scanner stdin = new Scanner(System.in, StandardCharsets.UTF_8);
        int count = 0;
       for(String s: stdin.nextLine().split(" ")){
           try{
               int i = Integer.parseInt(s);
               if(i != count + 1) {
                   return "Gölluð";
               }
           }
           catch (NumberFormatException ignored) {

           }
           ++count;
       }

        return count + "";

    }

    public static void main(String[] args) {

        System.out.println(tekk());
    }
}
