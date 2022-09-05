package trArrayList;

import java.util.ArrayList;
import java.util.List;

public class Ders24ArrayList {

    public static void main(String[] args) {
//
//        // Create list (ArrayList)
//
//        List<Integer> numbersList=new ArrayList<>();
//        System.out.println(numbersList);
//
//
//        numbersList.add(5);
//        System.out.println(numbersList);
//
//        numbersList.add(3);
//        System.out.println(numbersList);
//
//        numbersList.add(0, 7);
//        numbersList.add(2, 7);
//        System.out.println(numbersList);

          //METHODS

        // add()
        // size()
        // isEmpty()
        // set() == change elements
        // get(index) == istenen indexteki elmani dondurur
        // remove() ==> true veya false deger verir
        // sonucu yazdirmak icin if else ile yazdirilir
//
//
//        List<String> names=new ArrayList<>();
//
//        names.add("Burhan");
//        names.add("Eli");
//        names.add("Oli");
//        System.out.println(names);
//
//        boolean result= names.remove("Eli");
//        if(result==true){
//            System.out.println("Name removed");
//        }else {
//            System.out.println("There is no name to remove");
//        }
//        System.out.println(names);
//
//
//        result= names.remove("elll");
//        if(result==true){
//            System.out.println("Name removed");
//        }else {
//            System.out.println("There is no name to remove");
//        }
//        System.out.println(names.remove(1));


//        List<Integer> numbers=new ArrayList<>();
//
//        numbers.add(5);
//        numbers.add(3);
//        numbers.add(0,7);
//        numbers.add(2,7);
//        System.out.println(numbers);//[7, 5, 7, 3]
//
//        numbers.remove(3);
//
//        System.out.println(numbers);//[7, 5, 7]
//
//
//
//        //Set()
//
//        List<String> names=new ArrayList<>();
//
//        names.add("Burhan");
//        names.add("Eli");
//        names.add("Oli");
//        System.out.println(names);//[Burhan, Eli, Oli]
//
//        names.set(1,"Busem");
//        System.out.println(names);//[Burhan, Busem, Oli]
//
//        List<String> logList=new ArrayList<>();
//
//        logList.add(names.set(2, "Gurmo"));
//
//        System.out.println(names);
//        System.out.println(logList);

        //get(index)

        List<Integer> numbers=new ArrayList<>();

        numbers.add(5);
        numbers.add(3);
        numbers.add(0,7);
        numbers.add(2,7);
        System.out.println(numbers);//[7, 5, 7, 3]


        System.out.println(numbers.get(2)); // 7
        System.out.println(numbers);// [7, 5, 7, 3]


    }
}
