/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Tekur 2 heiltölur af skipalínu og athugar hvort báðar/0nnur eða
 *  hvorug sé jákvæð.
 *
 *
 *****************************************************************************/

    public class Positive2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if (a > 0 && b > 0){
            System.out.print("Báðar jákvæðar");
        }else if (a < 0 && b > 0 || a > 0 && b < 0){
            System.out.print("Önnur jákvæð");
        }else{
            System.out.print("Hvorug jákvæð");
        }

    }
}
