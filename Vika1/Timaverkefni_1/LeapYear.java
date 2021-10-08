/******************************************************************************
 *  Nafn    : Gunnar Björn Þrastarson
 *  T-póstur: gbt6@hi.is
 *
 *  Lýsing  : les inn ártal af command line og gefur út
 *            True eða False hvort árið sé hlaupár
 *
 *
 *****************************************************************************/

package Timaverkefni_1;

public class LeapYear {
    public static void main(String[] args) {
        int year =Integer.parseInt(args[0]);
        // Er deilanlegt með 4 en ekki 100
        boolean isLeapYear = year % 4 == 0 && year % 100 != 0;

        //epa deilanlegt með 400
        isLeapYear = isLeapYear || (year % 400 == 0);
        System.out.println(isLeapYear);


    }
}
