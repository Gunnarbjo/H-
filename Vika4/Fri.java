/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : Segir hvort það sé virkur dagur eða helgi út frá þeim bókstaf sem
 *  sett er inn í forritið, ef vitlaus stafur kemur inn lætur hún vita að það
 *  sé villa í inntaki.
 *
 *
 *****************************************************************************/

public class Fri {
    public static void main(String[] args) {
        char dagur = args[0] .charAt(0);


        switch (dagur){
            case 'M':
            case 'Þ':
            case 'I':
            case 'F':
            case 'Ö':
                System.out.println("Virkur dagur");
                break;
            case 'L':
            case 'S':
                System.out.println("Helgi");
                break;
            default:
                System.out.println("Villa í inntaki");
                break;
        }

    }
}
