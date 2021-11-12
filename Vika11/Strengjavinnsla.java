/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forrit sem skiptir út "og" fyrir "eða" í strengnum
 *  "Á hrekkajavöku er græin og gaman og nammi"
 *
 *
 *****************************************************************************/

public class Strengjavinnsla {
    public static void main(String[] args) {
        String s = "Á hrekkjavöku er grín og gaman og nammi";
        String nyttS = skiptaUt(s, "og", "eða");
        System.out.println(nyttS);

    }
    public static String skiptaUt(String s, String u, String v){
        String a = s.replace(u, v);
        return a;

    }
}
