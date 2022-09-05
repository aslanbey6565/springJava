package trStaticKeyword;

public class Static02 {

    public static void main(String[] args) {

        //Baska classtaki static uyelere ulasmak icin classismi.staticuyeismi ile alabiliriz
        System.out.println(Static01.okulTlf);
        Static01.okulTlf="987654321";
        System.out.println(Static01.okulTlf);

        // static olmayan baska class uyelerine ulasmak icin obje olusturmaliyiz.
        // Obje ile yapilan atamalar sadece o obje icin gecerli olur

        Static01 obj1=new Static01();
        Static01 obj2=new Static01();
        System.out.println(obj2.okulismi);
        obj2.okulismi="Burhanbey";
        System.out.println(obj1.okulismi);
        System.out.println(obj2.okulismi);

    }
}
