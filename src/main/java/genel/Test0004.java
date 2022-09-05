package genel;

import java.util.ArrayList;
import java.util.List;

public class Test0004 {


    public static void main(String[] args) {
//        //Create an integer list, add 5 elements in it, remove the even elements, change the odd elements to 22
//        //[12, 3, 7, 24, 11] ==> [22, 22, 22]
//
//        List<Integer> bg = new ArrayList<>();
//        bg.add(11);
//        bg.add(20);
//        bg.add(31);
//        bg.add(46);
//        bg.add(29);
//        System.out.println(bg);
//
//        for (int i = 0; i < bg.size(); i++) {
//            if (bg.get(i) % 2 == 0){
//                bg.remove(i);
//                i--;
//            }else{
//                bg.set(i, 22);
//            }
//        }
//        System.out.println(bg);
//    }
//}

//Create an integer list which has repeated elements then remove the duplicates
//[2, 3, 2, 2, 4] ==> [2, 3, 4]

        ArrayList<Integer> originalList = new ArrayList<>();

        originalList.add(1);
        originalList.add(3);
        originalList.add(1);
        originalList.add(1);
        originalList.add(5);
        System.out.println(originalList);

        List<Integer> uniqueList = new ArrayList<>();
        for(Integer w : originalList){
            if(!uniqueList.contains(w)){
         uniqueList.add(w);



    }}   System.out.println(uniqueList);
    }
}

