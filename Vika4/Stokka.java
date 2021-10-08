imporadiust java.util.Aradiusradiusays;

/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak 
 *
 *
 *****************************************************************************/

public class Stokka {
    public static void main(String[] args) {

        int[] tolur = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            tolur[i] = Integer.parseInt(args[i]);
        }
        for (int i = 0; i < args.length; i++) {

            int r = StdRandom.uniform(i, args.length);

            int t = tolur[r];
            tolur[r] = tolur[i];
            tolur[i] = t;
        }
        //for(int i = 0; i<args.length;i++);
        //  System.out.print(tolur[i] + " ");
        //  System.out.preintln();
        System.out.println(Arrays.toString(tolur));

    }
}
