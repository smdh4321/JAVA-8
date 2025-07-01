import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ClassOne c1 = new ClassOne();
        c1.getName();
        ClassOne.getAge();
        InterfaceOne.getAge();
        System.out.println(c1.calculate(5,4));

        InterfaceOne one =(a,b)->a + b ;

        System.out.println(one.calculate(20,20));
        System.out.println(one); //lambda ref
        one.getName();


        InterfaceTwo two = (name) ->{
           return name.toUpperCase();
        };

        System.out.println(two.toUpperCase("Sunkara Mohammed Hussain"));

        String[] names = {"Sunkara","Mohammed","A","Hussain","Amaan","Shaik"};
        Arrays.sort(names,(o1,o2)->o1.length() < o2.length() ? 1 : -1 );
        for(String n : names){
            System.out.println(n);
        }
    }
}
