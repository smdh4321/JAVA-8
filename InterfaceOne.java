public interface InterfaceOne {

    double calculate(int a, int b);
    static void getAge(){
        System.out.println("My Age is 22");
    }
    default void getName(){
        System.out.println("This is Interface One");
    }
}
