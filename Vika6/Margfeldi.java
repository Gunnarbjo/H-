/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið les inn þrjú eða fleiri heiltölugildi af skipanalínu.
 * Forritið margfaldar tvö undangengin stök, i-1 og i-2 og setur margfeldið í stak i í nýju
 * fylki. Fyrsta stakið inniheldur margfeldi af tveimur síðustu stökunum og annað stakið
 * hefur margfeldi af fyrsta og síðasta stakinu og svo koll af kolli.
 *
 *
 *****************************************************************************/

public class Margfeldi {
    public static void main(String[] args) {

        int[] tolurInn = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            tolurInn[i] = Integer.parseInt(args[i]);
        }
        int[] tolurUt = new int[tolurInn.length];
        int N = tolurInn.length;

        tolurUt[0] = tolurInn[N - 1] * tolurInn[N - 2];
        tolurUt[1] = tolurInn[0] * tolurInn[N -1];
        System.out.print(tolurUt[0] + " " + tolurUt[1] + " ");

        for(int i = 2; i < N; i++){
            tolurUt[i] = tolurInn[i-1] * tolurInn[i - 2];
            System.out.print(tolurUt[i] + " ");
        }
        System.out.println();



        }
    }

