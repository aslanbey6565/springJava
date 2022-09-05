package trException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

        //ic ice try catch
        //  TEK TRY MULTIBLKE CATCH



public class FileInputStream02 {
    public static void main(String[] args) {
        String dosyYolu="src/main/java/trException/dosya.text";

        try {
            FileInputStream fis = new FileInputStream(dosyYolu);
            int k =0;
            while((k=fis.read())!=-1) {
                System.out.print((char)k);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

            /*
                Exceptionlar icinde parent child iliskisi vardir.
                Eger bir kod birden icin birden fazla exception
                 olusma ihtimali varsa oncelikle olasi exceptionlar
                 parent child iliskisi tasiyormu bakmak gerekir.
                 Eger parent child iliskisi yoksa istedigimiz sirada catch cumleleri olusturabilriiz


            Alti kirmizi cizgili her cod commpile error degildir
         */


    }
}
