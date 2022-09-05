package trConstructor;

import com.beust.ah.A;

public class Araba {
        /* Javada her class olusturuldugunda
           Java o classlardan ileride objeler uretmek gerekecegini bilir ve
           biz ozellikle belirtmesek de Java her kosulda classa bir constructor koyar


           Javanin class olusturruken classa koydugu constructora DEFAULT CONST. denir ve bu const. gorunmez.

           Eger gorunmesini istersek; defaul const. ile ayni gorevi yapan
           bir const. olusturabliriz veya istersek ayni jliptan farkli dsesenlerde objeler olusturmak icin
           farkli ozelliklerde const. da olusturabiliriz.
           Const. birbirinden farklilastiran tek ayricalik kullanilan parametre sayisi ve parametre data turleridir.

         */
    public  Araba(){
        System.out.println("Parametresiz const. calisti");

    }
    /* Bir kod blogunun method veya constructor olmasindan emin olmak isterseniz iki dikkat etmelisiniz;
       1) Constructorlarin ismi class ismi ile ayni olmak zorunda yani buyuk harfle baslar
       2) Constructorlarin return type olmaz


     */
    public  Araba(String renk){
        System.out.println("Renkli araba uretildi");
    }
    public Araba(int yil){
        System.out.println(yil + "Model araba uretildi");
    }
    public Araba(int yil, String renk)
    {
        System.out.println(yil + "Model " + renk + "renginde bir araba uretildi");
    }    }

