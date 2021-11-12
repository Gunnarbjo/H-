/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Klasi sem hefur API til að lesa gögn af staðalinntaki í heiltölu eða kommutölu
 *  einvítt eða tvívítt fylki
 *
 *****************************************************************************/

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadArray1 {
    private static Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);

    /**
     * Les inn einvítt fylki af staðalinntaki. Fyrst er víddin lesin og síðan jafnmörg stök og
     * víddin segir til um
     *
     * @return skilar fylkinu
     * @throws NoSuchElementException - ef ekki nógu mörg stök eru í staðalinntaki eða
     *                                þau eru ekki af kommutölutagi
     */
    public static double[] read1DdoubleArray() throws NoSuchElementException {
        int n = s.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextDouble();
        return a;
    }

    public static void main(String[] args) {
        s.useLocale(Locale.US);
        double[] m = read1DdoubleArray();
        System.out.println(Arrays.toString(m));

    }
}
