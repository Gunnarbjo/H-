/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  :Forritið tekur inn gögn um hvort akreinavari bíls eigi að
 * gef viðvörun þegar bílstjóri hans gefur merki um að skipta um akrein
 *
 *
 *****************************************************************************/

public class Vari {
    public static void main(String[] args) {
        char bill1Stefna = args[0].charAt(0);
        char bill2Stefna = args[1].charAt(0);
        int fjarlaegd = Integer.parseInt(args[2]);

        if (fjarlaegd > 4 || fjarlaegd < -4){
            System.out.print("Engin hætta: of langt í burtu");
        }else if(bill1Stefna != bill2Stefna){
            System.out.print("Engin hætta: stefna ekki á sömu akrein");
        }else
            switch(bill1Stefna){
                case 'H':
                    System.out.print("varúð til hægri");
                    break;
                case 'V':
                    System.out.print("Varúð til vinstri");
                    break;
                default: break;

            }

        }

    }
