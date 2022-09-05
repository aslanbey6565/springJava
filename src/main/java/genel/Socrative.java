package genel;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Socrative {

    public static void main(String[] args) {
        //Create an integer list, add 5 elements in it, remove the even elements, change the odd elements to 22
        //[12, 3, 7, 24, 11] ==> [22, 22, 22]


//        List<Integer> al = new ArrayList<>();
//        al.add(12);
//        al.add(10);
//        al.add(16);
//        al.add(5);
//        al.add(13);
//        System.out.println(al);
//
//
//        for(int i=0; i<al.size(); i++){
//            if(al.get(i)%2==0){
//                al.remove(i);
//                i--;
//            }else{
//                al.set(i, 22);//set() method is for updating list elements
//            }
//        }
//        }}


//        List<Integer> bb = new ArrayList<>();
//        bb.add(2);
//        bb.add(4);
//        bb.add(5);
//        bb.add(1);
//        bb.add(3);
//        System.out.println(bb);
//
//        for (int i = 0; i < bb.size(); i++) {
//            if (bb.get(i) % 2 == 0) {
//                bb.remove(i);
//                i--;
//
//            }else{
//                bb.set(i, 15555);
//            }
//
//        }
//        System.out.println(bb);
//
//        List<String> bb = new ArrayList<>();
//        bb.add("Maria");
//        bb.add("Saria");
//        bb.add("Lamia");
//        bb.add("Lania");
//        bb.add("Palia");
//        System.out.println(bb);
//
//
//        for(int i=0; i< bb.size(); i++){
//        String element = bb.get(i);
//        if(element.startsWith("L") && element.endsWith("a")){
//            bb.remove(element);
//            i--;
//
//
//        }
//
//
//
//
//    }
//        System.out.println(bb);}}


//        ArrayList<Integer> mainList = new ArrayList<>();
//
//        mainList.add(2);
//        mainList.add(1);
//        mainList.add(2);
//        mainList.add(4);
//        mainList.add(25);
//        mainList.add(2);
//        mainList.add(1);
//        mainList.add(25);
//        System.out.println(mainList);
//
//        List<Integer> myList = new ArrayList<>();
//        for(Integer w : mainList){
//            if(!myList.contains(w)){
//            myList.add(w);
//        }
//        System.out.println(myList);
        int arr[] = {2, 4, 6, 8};

        List<Integer> list = new ArrayList<>();

        int i = 0;

        do {

            list.add(arr[i]);

            i++;

        } while (i < arr.length);

        System.out.println(list);
        }}

