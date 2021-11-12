import java.awt.Color;
import java.util.Arrays;

/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið teiknar mynd sem er af stærðinni n x m ferningar þar sem
 *  ferningarnir eru af hálfbreidd b. Ferningarnir eru málaðir í röð af handahófi
 *  í reit x,y þar sem x er á bilinu 0 að n (n ekki meðtalin) og
 *  y á bilinu 0 að m (m ekki meðtalin). Ef búið er að mála ferning er ekki
 *  fundinn nýr litur og hann ekki málaður aftur.
 *  Fallið skilar n x m fylki af taginu Color.
 * Fallið reynir að teikna ferninga tilraunir sinnum.
 *
 *
 *****************************************************************************/

public class Malverk {
    public static void main(String[] args) {

        Color[][] litir1 = mala(100, 100, 0.05, 10000);
        for (int i = 0; i < litir1.length; i++) {
            System.out.print(Arrays.toString(litir1[i]));
        }

    }

    /**
     *
     * @param n - x hlið tenigns
     * @param m - y hlið tenings
     * @param b - helmingur hvers fernings
     * @param tilraunir - hversu margar ýtranir eru gerðar
     * @return - fylki af kössum í mismunandi lit
     */
    public static Color[][] mala(int n, int m, double b, int tilraunir) {
        Color colorOutArray[][] = new Color[n][m];

        for (int i = 0; i < tilraunir; i++) {
            int nTala = StdRandom.uniform(0, n);
            int mTala = StdRandom.uniform(0, m);


            if (colorOutArray[nTala][mTala] == null) {

                int r = StdRandom.uniform(256);
                int g = StdRandom.uniform(256);
                int bl = StdRandom.uniform(256);

                Color c = new Color(r, g, bl);

                colorOutArray[nTala][mTala] = c;
            }
        }

        for (int i = 0; i < colorOutArray.length; i++) {
            for (int j = 0; j < colorOutArray[i].length; j++) {
                if (colorOutArray[i][j] == null) {
                    StdDraw.setPenColor(Color.WHITE);
                    StdDraw.filledSquare(i, j, b);
                }
                else {
                    StdDraw.setPenColor(colorOutArray[i][j]);
                    StdDraw.filledSquare(i * b + b / 2, j * b + b / 2, b / 2);
                }
            }
        }

        return colorOutArray;
    }
}
