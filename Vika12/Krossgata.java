/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Forritið tekur inn tvö orð og athugar hvort að þau séu með
 *  sameglinlegan staf og skilar niðurstöðunni og hvaða sæti stafurinn er.
 *  Ef ekki finnst sameginlegur stafur skilar það niðurstöðunni null
 *
 *
 *****************************************************************************/

public class Krossgata {
    public static void main(String[] args) {
        String[] strengir1 = { "afmæli", "bál", };
        StdOut.println(finnaOrd(strengir1));

        String[] strengir2 = { "bók", "aldur" };
        StdOut.println(finnaOrd(strengir2));
    }
    public static TvoOrd samiStafur(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int pos1;
        int pos2;
        for (int i = 0; i < n1; i++) {
            if (!s1.equals(s2) && s2.contains(s1.substring(i, i + 1))) {
                pos1 = i;
                for (int j = 0; j < n2; j++) {
                    if (s1.contains(s2.substring(j, j + 1))) {
                        pos2 = j;
                        return new TvoOrd(s1, pos1, s2, pos2);
                    }
                }
            }
        }
        return null;
    }
    public static TvoOrd finnaOrd(String[] ordK) {
        for (int i = 0; i < ordK.length; i++) {
            TvoOrd k = finnaOrd(ordK, ordK[i]);
            if (k != null) {
                return k;
            }
        }
        return null;
    }

    public static TvoOrd finnaOrd(String[] ordK, String s) {
        for (int i = 0; i < ordK.length; i++) {
            TvoOrd t = samiStafur(ordK[i], s);
            if (t != null) {
                return t;
            }
        }
        return null;
    }

}
