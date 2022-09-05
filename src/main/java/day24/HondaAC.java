package day24;

interface HondaAc {
     /*
        For classes multible inheritence impossible, but for Interfaces multiply inheritence is supported by Java
        You cannot create object from Interfaces.
        Interfaces do not have constructors but remember "abstract classes" have
     */

    /*
    Variables:
        1)Every variable is "public", "static", "final" in the interface
        2)If you want type "public", "static", "final" explicitly to make your code more readable
          mostly we do not type "public", "static", "final" explicitly because it is well known by everyone
        3)"final" variables must be initialized because of that every variable in an interface must be initialized
        4)If you have some variables whose signatures are same in parent interfaces, when you call them you have to
          declare the name of the interface otherwise it will give compile time error
    */
    String make = "Samsung";
    double price = 890.00;

    /*
    Methods
        1)All methods in an interface must be abstract
        2)Using "abstract" keyword for methods is optional
        3)All methods in an interface must be "public"
        4)Normally, we cannot put "methods with body" in an interface but Java created "default method" you can use them in an interface
          they will have body
    */
    void cool();
    void run();

    //1) "default" over here is not "access modifier", it is for creating method with body in an interface
    default void bacteriaKiller(){
        System.out.println("This AC kills %99.9 bacteria");
    }
    //2) By using "static" keyword, you can create method with body in an interface
    static void climateCool(){
        System.out.println("This AC cools according to the climate");
    }

}

