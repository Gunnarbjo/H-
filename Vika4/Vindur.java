/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Gefur út veðurlýsingu frá heiltölu af commandline sem táknar
 *  vindstyrk.
 *
 *
 *****************************************************************************/

public class Vindur {
    public static void main(String[] args) {
        int vindur = Integer.parseInt(args[0]);

        if(vindur > 31){
            System.out.print("Ofsaveður");
        }else if (vindur >= 29){
            System.out.print("Fárviðri");
        }else if (vindur >= 24){
            System.out.print("Rok");
        }else{
            System.out.print("Annað");
        }

    }
}
