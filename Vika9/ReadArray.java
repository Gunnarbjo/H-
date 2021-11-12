import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið inniheldur tvö föll, read1DintArray og read2DintArray sem
 *  reikna og svo main fallið sem prufar föllin.
 *
 *
 *****************************************************************************/

public class ReadArray {


    private static Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);

    public static void main(String[] args) {

        int[] prufa1 = read1DintArray();
        System.out.println(Arrays.toString(prufa1));

        int[][] prufa2 = read2DintArray();
        System.out.println(Arrays.toString(prufa2));


    }

    /**
     * Les inn einvítt fylki af staðalinntaki. Fyrst er víddin lesin og síðan jafnmörg stök og
     * víddin segir til um
     *
     * @return - skilar fylkinu
     * @throws NoSuchElementException -ef ekki nógu mörg stök eru í staðalinntaki eða
     *                                þau eru ekki af kommutölutagi
     */
    public static double[] read1DdoubleArray() throws NoSuchElementException {
        int n = s.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextDouble();
        return a;
    }


    /**
     * @return - returnar einvíðu fylki
     * @throws NoSuchElementException - kastar villu ef fallið er vitlaust
     */
    public static int[] read1DintArray() throws NoSuchElementException {
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        return a;

    }

    /**
     * @return - returnar tvívíðu fylki
     * @throws NoSuchElementException - kastar villu ef fallið er vitlaust
     */
    public static int[][] read2DintArray() throws NoSuchElementException {
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = s.nextInt();

            }
        }
        return a;
    }
}