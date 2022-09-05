package trStaticKeyword;

public class StaticKeyword {

    static int number;
    int nomber;

    public static void main(String[] args) {
        System.out.println("Number : " + number);//0
        //System.out.println("Number : " + nomber); Static degil kullanamayiz
        StaticKeyword obj1=new StaticKeyword();
        System.out.println(obj1.nomber);//0

        number++;
        obj1.nomber++;
        System.out.println(number);
        System.out.println(obj1.nomber);
        System.out.println();

    }



}
