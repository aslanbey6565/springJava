package trCollections;

import java.util.HashSet;
import java.util.Set;

public class Hash {
    public static void main(String[] args) {

        String str ="Java cok guzel";
        System.out.println(str.hashCode());

        String str2 ="Hava cok guzel";
        System.out.println(str2.hashCode());

        Set<Integer> sayikumesi=new HashSet<>();
        System.out.println(sayikumesi.hashCode()); //0

        sayikumesi.add(10);
        System.out.println(sayikumesi.hashCode());//10
        sayikumesi.add(30);
        System.out.println(sayikumesi.hashCode());//30
    }
}
