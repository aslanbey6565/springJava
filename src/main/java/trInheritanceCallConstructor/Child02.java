package trInheritanceCallConstructor;

public class Child02 {

    public static class Child extends Parent{
        Child(){
            super();
            System.out.println("Child class parametresiz cons");
        }
        Child(int s){
            System.out.println("Child class parametreli const.");
        }
        Child(int sayi1, int sayi2){
            //Eger parent classtan parametresiz const degilde
            // baska bir const calistirmak isterseniz
            // bunu child classtaki
            // constrin ILK SATIRINA yazmalisiniz
            super(sayi1,sayi2);
            System.out.println("iki parametreli const.");
        }


        public static void main(String[] args) {
            Child child= new Child(5,8);

        }

    }}

