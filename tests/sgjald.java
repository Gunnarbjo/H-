public class sgjald{

    private static int europe(int x){
        int price = 0;
        if(x < 3){
            price += (x*500) + 400;
        }else{
            price += (3*500) + ((x-3)*1000) + 400;
        }
        return price;
    }
    private static int usa(int x){
        int price = 0;
        if(x < 3){
            price += ((x*500) + 600)*1.05;
        }else{
            price += ((3*500) + ((x-3)*1000) + 600)*1.05;
        }
        return price;

    }
    public static void main(String[] args){
        int weight = Integer.parseInt(args[0]);
        char continent = args[1].charAt(0);
        int price = 0;

        switch(continent){
            case 'E':
                price = europe(weight);
                break;
            case 'U':
                price = usa(weight);
                break;

        }
        System.out.println(price);
    }
}