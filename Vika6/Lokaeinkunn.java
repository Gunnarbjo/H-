/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið tekur inn 4 tölur af skipanalínu þar sem
 * hver tala er á bilinu 0-10. Tölurnar eru útkoma nemanda á fjórum þáttum
 * í námskeiði, fyrirlestraæfingar, skilaverkefni, miðmisserispróf og lokapróf.
 * Gefið er heiltölufylkið {10, 20, 20, 50} sem gefur til kynna vægi ofangreindra þátta í
 * prósentum. Ef einkunn einstakra þátta, þ.e. fyrirlestraæfingar, skilaverkefni eða
 * miðmisserispróf er lægri en niðurstaða á lokaprófi gildir lokaprófið meira sem því nemur
 * og þátturinn þá 0. Forritið á að reikna út lokaeinkunn. Ef færri eða fleiri tölur eru settar
 * inn á skipanalínu þá á að birta villu Rangur fjöldi.
 *
 *
 *****************************************************************************/

public class Lokaeinkunn {
    public static void main(String[] args) {

        int[] einkunn = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            einkunn[i] = Integer.parseInt(args[i]);
        }
        if (args.length != 4) {
            System.out.print("Rangur fjöldi");
            return;
        }
        int[] vaegi = { 10, 20, 20, 50 };
        double[] lokaEinkunn = new double[4];

        for (int i = 0; i < args.length - 1; i++) {
            if (einkunn[i] >= einkunn[3]) {
                lokaEinkunn[i] = ((einkunn[i] / 100.0) * vaegi[i]);
            }
            else if (einkunn[i] < einkunn[3]) {
                vaegi[3] = vaegi[3] + vaegi[i];
                vaegi[i] = 0;
            }
        }
        lokaEinkunn[3] =((1.0 * einkunn[3] * vaegi[3]) / 100);

        double sum = 0;

        for (int i = 0; i < lokaEinkunn.length; i++){
            sum += lokaEinkunn[i];
        }

        System.out.println(sum);
    }

}

