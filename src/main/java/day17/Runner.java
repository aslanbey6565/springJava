package day17;

public class Runner {


    public static void main(String[] args) {
        StaticKeyword03 std1 = new StaticKeyword03();
        System.out.println(std1.setStdId("Tom Hanks", "Math"));// ==> TH20229011001

        StaticKeyword03 std2 = new StaticKeyword03();
        System.out.println(std2.setStdId("Jane Jackson", "Art"));// ==> JJ20229031002
    }


}
