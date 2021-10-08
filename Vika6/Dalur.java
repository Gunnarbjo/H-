/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak 
 *
 *
 *****************************************************************************/

public class Dalur {
    public static void main(String[] args) {

        int N = args.length;
        int[] dalur = new int[N];
        int lengd = 0;

        for(int i = 0; i < N; i++){
           dalur[i] = Integer.parseInt(args[i]);
        }
        int minnsta = dalur[0];
        int minnstaIndex = 0;

        for(int i = 1; i < N-1; i++){
            int p = i + 1;
            if (dalur[i] > dalur[p]){
                minnsta = dalur[p];
                minnstaIndex = p;
            }
        }
        if (minnstaIndex != 0 && dalur[minnstaIndex - 1] > dalur[minnstaIndex]) {
            while (minnsta == dalur[minnstaIndex]) {
                lengd++;
                minnstaIndex++;
                if (minnstaIndex == N) break;
            }
        }
        if (minnstaIndex != N && minnsta < dalur[minnstaIndex]) {
            System.out.println("Lengd dals er " + lengd);
        }
        else System.out.println("Lengd dals er " + 0);

    }
}
