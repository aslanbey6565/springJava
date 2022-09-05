package trArrayList;

import day17.StaticKeyword01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ders25ArrayList02 {
    public static void main(String[] args) {

        // add()
        // size()
        // isEmpty()
        // set() == change elements
        // get(index) == istenen indexteki elmani dondurur
        // remove() ==> true veya false deger verir
        // sonucu yazdirmak icin if else ile yazdirilir
        // contains() ==> errayListte bir elemanin olup olmadigini kontrol eder / tru-false
        // Collections.sort() ==> arrayListteki elemanlari kucukten buyuge siralar
        // equals() => ayni listteki ayni indexteki elementlerin olup olmadigini kontrol eder
        // clear() ==> arraydeki tum elemanlari siler


        // contains()
//        List<String> words = new ArrayList<>();
//        words.add("D");
//        words.add("M");
//        words.add(1, "T");
//        words.add(0, "T");
//        System.out.println(words); //[T, D, T, M]
//
//        System.out.println(words.contains("T")); //True
//        System.out.println(words.contains("F")); //False
//
//        List<String> characters = new ArrayList<>();
//        characters.add("M");
//        characters.add("T");
//
//        System.out.println(characters.containsAll(characters)); //True
//        characters.add("F");
//        System.out.println(characters.containsAll(words)); //False


        // verilen arrayden istenilen elemanlari silip, kalamlari yeni array olarak yazdirin


//        int arr[] = {3, 4, 2, 3, 5, 7, 3, 8, 5, 2, 4};
//        int unwanted = 7;

//
//    }
//
//    private static void noneedsil(int[] arr, int noneed) {
//
//
//        List<Integer> newList = new ArrayList<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != unwanted) {
//                newList.add(arr[i]);
//
//            }
//
//        }
//        System.out.println(newList);
//    }
//}

//         int counter=0;
//         for(int i =0; i<arr.length; i++){
//         if(arr[i]==noneed) {
//             counter++;
//
//         }
//    }
//         int arrNew[]=new int[arr.length-counter];
//         int index=0;
//            for(int i=0; i< arr.length; i++){
//                if(arr[i] !=noneed){
//                    arrNew[index]=arr[i];
//                    index++;
//                }
//
//                }
//        System.out.println(Arrays.toString(arrNew));
//            }
//}

        // tekrar eden sayilari 1 kere yazma
        //[1,3,5,3,5,6,1,7] ==== [1,3,5,6,7]

//
//        List<Integer> numbers=new ArrayList<>();
//        numbers.add(1);
//        numbers.add(3);
//        numbers.add(5);
//        numbers.add(3);
//        numbers.add(5);
//        numbers.add(6);
//        numbers.add(1);
//        numbers.add(7);
//
//        norpeat(numbers);
//
//
//    }
//
//    private static void norpeat(List<Integer> numbers) {
//
//        List<Integer> norepeat = new ArrayList<>();
//
//        for(int i =0; i<numbers.size(); i++){
//         if(!norepeat.contains(numbers.get(i))) {
//             norepeat.add(numbers.get(i));
//
//         }}
//        System.out.println(norepeat); //[1, 3, 5, 6, 7]



        // bir listten ortalamanin ustunde olan element sayisini bulunuz


//        List<Double> num=new ArrayList<>();
//        num.add(1.3);
//        num.add(3.5);
//        num.add(5.0);
//        num.add(3.0);
//        num.add(5.0);
//        num.add(6.0);
//        num.add(1.0);
//        num.add(7.0);
//
//        double avarage=0.0;
//        double sum=0.0;
//
//        for(int i=0; i<num.size(); i++) {
//            sum += num.get(i);
//        }
//
//        avarage=sum/ num.size();
//        System.out.println(avarage);
//
//
//        // ortalamanin ustunde olanlari liste at
//
//        List<Double> overAvarage=new ArrayList<>();
//
//        for (int i=0; i< num.size(); i++){
//
//           if (num.get(i)>avarage){
//               overAvarage.add(num.get(i));
//
//           }
//
//            }
//        System.out.println(overAvarage);



        // Verilen listede istenen iki indexteki elementlerin yerini kalici olarak degistirin



        List<Integer> num=new ArrayList<>();
        num.add(1);
        num.add(3);
        num.add(5);
        num.add(3);
        num.add(5);
        num.add(6);
        num.add(1);
        num.add(7);

        int firstIndex=2;
        int secondIndex=5;


        num=swapElements(num,firstIndex,secondIndex);

    }

    public static List<Integer> swapElements(List<Integer> num, int firstIndex, int secondIndex) {



        return  num;


    }
}
