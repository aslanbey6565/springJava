package trInheritanceOverriding;

public class Isci extends Personal{
    public String statu="isci";
    public String haklari="isciler kidem taz alirlar";
   public String ikramiye="Yilda bir kez ikramiyesi var";

    public void mesai(){
        System.out.println("tum isciler 40 saat calisir");
    }
    public void maasHesapla(){
        System.out.println("Tum isciler 8*30*15" + (30*8*15)+ "maasla calisir");
    }
}

