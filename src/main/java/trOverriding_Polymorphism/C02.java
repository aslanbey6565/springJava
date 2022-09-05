package trOverriding_Polymorphism;

public class C02 extends C01{
    private void method4(){
        System.out.println("child method");
        //Parent classtaki private method4 e child classtan ulasamadigimiz icin
        // java bu iki methodu TAMAMEN FARKLI IKI METHOD olarak kabul eder
    }
    protected String method3(){
        return "java";
    }
    @Override
    public void method2() {
        System.out.println("Child method2");
    }

    public static void main(String[] args) {
        C02 obj = new C02();

        obj.method1();//Parent method 1
        obj.method2();//Child method2

        C01 obj2=new C02();
        obj2.method1(); //Parent method 1
        obj2.method2();//Child method2

        C01 obj3=new C01();
        obj3.method1();//Parent method 1
        obj3.method2();//Parent method 2
    }


}
