package trConstructor;

public class Counter {

    int count;
    static int stCounter;

    public  Counter(){
        count++;
        stCounter++;
    }
    public int getCount(){
        return count;
    }
    public static int getStCounter(){
        return stCounter;
    }

    public static void main(String[] args) {
        Counter cs1=new Counter();
        Counter cs2=new Counter();
        Counter cs3=new Counter();
        Counter cs4=new Counter();
        Counter cs5=new Counter();
        Counter cs6=new Counter();
        System.out.println("Count is :" + cs6.getCount());
        System.out.println("stCount :" + cs6.getStCounter());

    }
}
