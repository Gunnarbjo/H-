/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak 
 *
 *
 *****************************************************************************/
public class Stjornur {
    public static String Stjarna(int n) {

        String stjornurTala = "";
        for (int i = 0; i < n; i++) {
            stjornurTala += "*";
        }
        return stjornurTala;
    }
        public static void main(String[] args) {
            int n = Integer.parseInt(args[0]);
            String stjornurSamtals = Stjarna(n);
            System.out.print(stjornurSamtals);

        }

}