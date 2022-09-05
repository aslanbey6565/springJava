package trException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02FileInputStream {
    public static void main(String[] args) {

        //Bir kod yazilirken olasi exceptionlar ongorulup exception olustugunda Javanin ne yapmasinin istedigimiz belirtilmelidir.
        // Eger exception olustugunda kodun calismaya devam etmesini istemiyorsak method isminin yanina olusabilecek exceptioni deklare edebiliriz
        String dosyayolu="src/main/java/trExceptio/dosya.text";

        try {
            FileInputStream fls= new FileInputStream(dosyayolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
