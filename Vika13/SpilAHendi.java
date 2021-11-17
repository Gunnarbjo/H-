/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/


public class SpilAHendi {

    private int mestiFjoldi;

    private Spil[] fylkjaSpil;


    public SpilAHendi(int n) {

        mestiFjoldi = n;

        fylkjaSpil = new Spil[n];

    }


    public void baetaVidSpili(Spil s) {


        for (int i = 0; i < mestiFjoldi; i++) {

            if (s == null) break;

            if (s.equals(fylkjaSpil[i])) {

                s = null;

            }

            fylkjaSpil[fylkjaSpil.length - 1] = s;

        }


    }


    public Spil takaSpilAfHendi() {


        if (fylkjaSpil.length == 0) {

            return null;

        }

        Spil temp = fylkjaSpil[fylkjaSpil.length - 1];

        fylkjaSpil[fylkjaSpil.length - 1] = null;

        return temp;

    }


    public String toString() {

        return "SpilAHendi{}";

    }


    public static void main(String[] args) {


        String[] rank = {

                "Ás", "Tvistur", "Þristur", "Fjarki", "Fimma",

                "Sexa", "Sjöa", "Átta", "Nía", "Tía", "Gosi", "Drottning", "Kóngur"

        };


        String[] suit = { "Hjarta", "Spaði", "Tígull", "Lauf" };


        SpilAHendi hendi = new SpilAHendi(5);


        Spil s1 = new Spil(suit[StdRandom.uniform(suit.length)],

                           rank[StdRandom.uniform(rank.length)]);

        hendi.baetaVidSpili(s1);


        Spil s2 = new Spil(suit[StdRandom.uniform(suit.length)],

                           rank[StdRandom.uniform(rank.length)]);

        hendi.baetaVidSpili(s2);


    }

}
