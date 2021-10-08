/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak 
 *
 *
 *****************************************************************************/

public class dalur2 {
    public static void main(String[] args) {

        int N = args.length;
        int[] dalur = new int[N];
        int lengd = 0;

        for (int i = 0; i < N; i++) {
            dalur[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < N; i++) {
            if (dalur[0] == dalur[1]) {
                return;
            }
            if (dalur[i] > dalur[i + 1])
                return;
            while (dalur[i] == dalur[i + 1]) {
                lengd++;
            }
        }
        System.out.print(lengd);


    }
}
