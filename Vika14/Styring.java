/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak 
 *
 *
 *****************************************************************************/

public class Styring implements StyringSkil {

   private boolean stada;

    public void kveikja() {
        stada = true;

    }

    public void slokkva() {
        stada = false;

    }

    public boolean erKveikt() {
       if(stada){
           return true;
       }
       else return false;
    }

    public static void main(String[] args) {
        Styring s = new Styring();
        s.kveikja();
        System.out.println(s.erKveikt());
        s.slokkva();
        System.out.println(s.erKveikt());

    }
}
