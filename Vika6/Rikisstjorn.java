/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið tekur inn fjölda flokka, meirkhluta og hámarksfjölda leyfilegra
 *  flokka og athugar hvort hægt sé að mynda ríkisstjórn eða ekki.
 *
 *
 *****************************************************************************/

public class Rikisstjorn {
    public static void main(String[] args) {

        char[] flokkar = { 'B', 'C', 'D', 'F', 'J', 'M', 'P', 'S', 'V' };
        int N = args.length;
        int[] fjoldiFlokka = new int[N - 2];
        final int meirihluti = Integer.parseInt(args[N - 2]);
        final int MAX = Integer.parseInt(args[N - 1]);

        for (int i = 0; i < N; i++) {
            fjoldiFlokka[i] = Integer.parseInt(args[i]);
        }
        for (int i = 0; i < N; i++) {
            int random = StdRandom.uniform(i, N - 2);
            int geymsla = fjoldiFlokka[random];
            char geymslaTvo = flokkar[random];
            fjoldiFlokka[random] = fjoldiFlokka[i];
            flokkar[random] = flokkar[i];
            fjoldiFlokka[i] = geymsla;
            flokkar[i] = geymslaTvo;
        }
        int rikisstjorn = 0;
        int i = 0;
        String rikisstrengur = "";
        while (rikisstjorn < meirihluti && rikisstrengur.length() < MAX) {
            rikisstjorn = rikisstjorn + fjoldiFlokka[i];
            rikisstrengur = rikisstrengur + flokkar[i];
            i++;
        }
        if (rikisstjorn > meirihluti) {
            System.out.println(rikisstrengur + " " + rikisstjorn + " " + MAX);
        }
        else {
            System.out.println(
                    "Ekki tókst að mynda ríkisstjórn með " + MAX + "flokkum " + rikisstrengur);
        }


    }
}
