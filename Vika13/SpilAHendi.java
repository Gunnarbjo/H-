import java.util.Arrays;

/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið Heldur utan um spil og vinnur með Forritinu Spil til
 *  þess að bæta við og taka af spil úr hendi
 *
 *
 *****************************************************************************/


public class SpilAHendi {

    private int mestiFjoldi;
    private Spil[] fylkjaSpil;
    public SpilAHendi(int n) {
        mestiFjoldi = n;
        fylkjaSpil = new Spil[mestiFjoldi];
    }
    public void baetaVidSpili(Spil s) {
        for (int i = 0; i < fylkjaSpil.length; i++) {
            if (fylkjaSpil[i] == s) break;
            if (fylkjaSpil[i] == null) {
                fylkjaSpil[i] = s;
                break;
            }
        }
    }
    public Spil takaSpilAfHendi() {
        Spil temp;
        if (fylkjaSpil[fylkjaSpil.length - 1] != null) {
            temp = fylkjaSpil[fylkjaSpil.length - 1];
            fylkjaSpil[fylkjaSpil.length - 1] = null;
            return temp;
        }
        else {
            for (int i = 1; i < fylkjaSpil.length; i++) {
                if (fylkjaSpil[i] == null) {
                    temp = fylkjaSpil[i - 1];
                    fylkjaSpil[i - 1] = null;
                    return temp;
                }
            }
        }
        return null;
    }
    public String toString() {
        return Arrays.toString(fylkjaSpil);
    }
    public static void main(String[] args) {
        SpilAHendi prufa = new SpilAHendi(4);
        System.out.println(prufa.takaSpilAfHendi());
        Spil s1 = new Spil("Þristur", "Tígull");
        Spil s2 = new Spil("Fjarki", "Lauf");
        Spil s3 = new Spil("Átta", "Spaði");
        Spil s4 = new Spil("Kóngur", "Hjarta");
        Spil s5 = new Spil("Tía", "Lauf");
        Spil s6 = new Spil("Tvistur", "Tígull");
        Spil s7 = new Spil("Gosi", "Hjarta");
        prufa.baetaVidSpili(s1);
        prufa.baetaVidSpili(s2);
        prufa.baetaVidSpili(s3);
        prufa.baetaVidSpili(s4);
        prufa.baetaVidSpili(s5);
        prufa.baetaVidSpili(s6);
        prufa.baetaVidSpili(s7);
        System.out.println(prufa.toString());
    }
}
