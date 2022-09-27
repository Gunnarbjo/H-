import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Filterout{
    public static void main(String[] args){
        double lower = Double.parseDouble(args[0]);
        double higher  = Double.parseDouble(args[1]);
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        
        while(s.hasNext()){
            double nr = s.nextDouble();
            if(nr > lower && nr < higher ){
                System.out.print(nr + " ");
            }
        }

        s.close();
    }
}