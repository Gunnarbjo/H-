/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið tekur inn 3 heiltölur í main falli og hendir því í
 *  fallið printNumber sem reiknar út n-1 niður í 1 og skilar af sér streng
 *  með tölunum sem fallið reiknar sem main fallið tekur og prentar út.
 *
 *
 *****************************************************************************/

public class Printnum {
    public static void main(String[] args) {

        int prufa1 = Integer.parseInt(args[0]);
        int prufa2 = Integer.parseInt(args[1]);
        int prufa3 = Integer.parseInt(args[2]);

        String utkoma1 = printNumber(prufa1);
        String utkoma2 = printNumber(prufa2);
        String utkoma3 = printNumber(prufa3);

        System.out.println(utkoma1);
        System.out.println(utkoma2);
        System.out.println(utkoma3);
    }

    /**
     * Fallið tekur inn int tölu og breytir henni í streng í minkandi röð n, n-1.....
     *þar til það stoppar í 1, ef talan er 0 skilar það af sér tómum streng.
     *
     * @param n - heiltala sem fallið tekur inn
     * @return - skilar af sér tölum í streng í lækkandi röð
     */
    public static String printNumber(int n) {

        String strengur = " " + n;

        if(n==0){
            return "";
        }
            return strengur + " " + printNumber(n - 1);


    }
}