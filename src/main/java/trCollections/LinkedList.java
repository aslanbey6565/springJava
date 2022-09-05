package trCollections;

public class LinkedList {

    //Nesnelerden olusan bir toplulugu bir arada tutar

    /*
        Set = Icindeki hersey unique
        Queue = Siralama onemli
        Linked =Birbirine bagli
        Tree = Dogal sira = natural order
        Hash = Bir algoritmadir = Her elemente benzersiz bir numara-kod verir

        LinkedList;
        Ilk eleman her zaman head dir ve data yoktur burda, sadece address vardir
        Son eleman nulli point eder
        Her elemanin icinde data ve address kismi vardir
        Tum elemanlar pointerlar/ addressler kullanilarakbirbirine baglanir
        Her eleman node olarak adlandirilir
        Pointer yapisindan dolayi bir elemana ulasmada yavastirlar
     */

    public static void main(String[] args) {

        java.util.LinkedList<Integer> list=new java.util.LinkedList<>();
        list.add(5);
        list.add(10);// add methodu Listten geldigi icin hep sona ekler
        list.addFirst(11); //addFirst dequeden gelir
        list.addLast(12); //addlast dequeden gelir
        System.out.println(list);//[11, 5, 10, 12]

        list.add(2,25);
        System.out.println(list); //[11, 5, 25, 10, 12]


    }
}
