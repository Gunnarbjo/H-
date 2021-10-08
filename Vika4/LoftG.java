/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Athugar loftgæði út frá þeirri heiltölu sem sett er inn af
 *  commandline
 *
 *
 *****************************************************************************/

public class LoftG {
    public static void main(String[] args) {
        try{
           int a = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException e){
            System.out.print("Ólöglegt inntak - Sláðu inn heiltölu");
            return;
        }
        catch (ArrayIndexOutOfBoundsException f){
            System.out.print("Vantar inntak - Sláðu inn heiltölu");
            return;
        }
        int a = Integer.parseInt(args[0]);
        String c = "";


        if (a < 0) {
            c = "Sláðu inn jákvæða tölu";
        }else if(a <= 350){
            c = "Góð";
        }else
            c = "Ekki góð";

        System.out.print(c);

    }
}
