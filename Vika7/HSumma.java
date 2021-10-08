import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  :Forritið les inn af staðalinntaki eina heiltölu N sem segir til
 *  um fjölda lína og dálka í tvívíðu fylki a. Fjöldi lína og dálka er sá sami.
 *  Svo les forritið inn NxN heiltöluraf staðalinntaki a. Forritið á að prenta
 *  út hornasummu fylkisins a frá efra hægra horni til neðra vinstra horns.
 *
 *
 *****************************************************************************/

public class HSumma {
    public static void main(String[] args) {
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        int form = inntak.nextInt();
        int[][] fylki = new int[form][form];

        while (inntak.hasNext()) {
            for (int i = 0; i < form; i++) {
                for (int j = 0; j < form; j++)
                    fylki[i][j] = inntak.nextInt();

            }
        }
        int summa = 0;
        for (int i = 0; i < form; i++) {
            summa = summa + fylki[i][form - i - 1];
        }
        System.out.print(summa);

    }
}

