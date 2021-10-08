/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Athugar hvort input frá command line sé heiltala og ef það er
 *  heiltala þá athugar forritið hvort að sú tala sé innan markana [5,50]
 *
 *
 *****************************************************************************/

public class InnanMarka {
    public static void main(String[] args) {

       try{
           int tala = Integer.parseInt(args[0]);
       }catch(Exception e){
           System.out.print("Ekki heiltala");
           return;
       }
       int tala =Integer.parseInt(args[0]);

        if(tala <= 50 && tala >=5)
        {
            System.out.print("Innan marka");
        }else {
            System.out.print("Utan marka");
        }


    }
}

