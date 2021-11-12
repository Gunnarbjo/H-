import java.awt.*;
/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið finnur andhverfu litar sem sett er inn.
 *
 *
 *****************************************************************************/

public class Andhverfa {
    public static void main(String[] args) {
        Color litur = new Color (100, 150, 30);

        System.out.println(andhverfa(litur));
    }
    public static Color andhverfa(Color c){

        return new Color(255 - c.getRed(), 255 - c.getGreen(), 255 - c.getBlue());
    }
}
