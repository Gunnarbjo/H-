/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið athugar hvort talan úr StdRandom sé minni eða stærri en
 *  o.5 og oppnar eða lokar kössum eftir því, það keyrir svo þá tilraun í gegn
 *  aftur og aftur þar til að það er búið að ná í þann fjölda hermana sem
 *  gefnar eru á skipanalínu og prentar þá fjölda lokana þegar kassarnir
 *  ná í maxKassa ásamt prósentunni af þeim hermunum sem ná því og meðaltalið
 *  af því hversu oft hver while lykkja þarf að keyra til þess að komast á enda.
 *
 *
 *****************************************************************************/

public class Kassar {
    public static void main(String[] args) {
        int upphafKassar = Integer.parseInt(args[0]);
        int maxKassar = Integer.parseInt(args[1]);
        int fjHermana = Integer.parseInt(args[2]);
        int kassar = upphafKassar;
        int l = 0;
        int keyrsla = 0;
        double a = 0;
        long c;

        for (int i = 0; i < fjHermana; i++) {
            kassar = upphafKassar;
            while (kassar > 0 && kassar < maxKassar) {
                keyrsla++;
                a = StdRandom.uniform(0.0, 1.0);
                if (a < 0.5) {
                    kassar += 1;

                }
                else {
                    kassar -= 1;
                }
                if (kassar == maxKassar) {
                    l++;
                    break;

                }
            }

        }
        long p = Math.round((1.0 * keyrsla) / fjHermana);
        c = Math.round(100.0 * l / fjHermana);
        System.out.println("Fjöldi lokana " + l + " eftir " + fjHermana + " hermanir");
        System.out.println("Hlutfall lokana er " + c + "%");
        System.out.println("Meðalfjöldi athugana í hermun er " + p);

    }
}
