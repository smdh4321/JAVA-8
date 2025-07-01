public interface InterfaceTwo {
    String toUpperCase(String name);
    default void getName(){
        System.out.println("This is Interface Two");
    }
}
