/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak 
 *
 *
 *****************************************************************************/

public class BFylki {
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);

        boolean[][] t = new boolean[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++){
                t[i][j] = StdRandom.bernoulli();
            }
        }
        for(int i=0;i<M; i++){
            for(int j=0; j < N; j++){
                if(t[i][j])
                    System.out.print("* ");
                else
                    System.out.print("% ");
            }
        }
        System.out.println();
    }
}
