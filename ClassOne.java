public class ClassOne implements InterfaceOne,InterfaceTwo{

    @Override
    public double calculate(int a, int b) {
        return a + b;
    }

    public static void getAge(){
        System.out.println("My Age is 23");
    }

    @Override
    public String toUpperCase(String name) {
        return null;
    }

    @Override
    public void getName() {
        InterfaceTwo.super.getName();
        InterfaceOne.super.getName();
//        System.out.println("This is Class One");
    }
}
