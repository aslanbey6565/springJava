package trInheritanceOverriding;

public class Personal {
    public String statu="Personel";
    public String haklari="Herkes esittir";
    public String izinler= "Tum personel yilda 4 hafta izin kullanir";
    public void mesai(){
        System.out.println("herkes 5 gun 8 saat calisir");
    }
    public void maasHesapla(){
        System.out.println("Tum personel 8*30*10" + (30*8*10)+ "maasla calisir");
    }
}
