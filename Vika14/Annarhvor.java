/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : forritið tekur inn streng og prentar út annan hvern staf í
 *  strengnum
 *
 *
 *****************************************************************************/

public class Annarhvor {

    /**
     *
     * @param s Strengur
     * @return Streng með öðrumhverjum staf úr fyrri streng
     */
    public static String annarhvor(String s) {

        String strengur = "";

        for (int i = 0; i < s.length(); i+=2) {
            //char a += s.charAt(i);
             strengur += s.charAt(i);
           // strengur += String.valueOf(a);
        }
        return strengur;
    }

    public static void main(String[] args) {

        System.out.println(annarhvor("abrakadabra"));
        System.out.println(annarhvor("babubabuba"));
        System.out.println(annarhvor("lalalalalala"));
        System.out.println(annarhvor("nanananana"));
        System.out.println(annarhvor(""));

    }
}
