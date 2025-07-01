import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PreDefinedFunctionsEx {
    public static void main(String[] args) {
//        Supplier Functional Interface --> Contains get() method
//        Supplier<LocalDateTime> dateTime = () -> LocalDateTime.now();
//        System.out.println(dateTime.get());

//        Consumer fuctional Interface -> contains accept method
//        List<String> names =
//                List.of("Sunkara","Mohammed","Hussain","Bharath","Aziz");
//        Consumer<String> changeToUpperCase =
//                str -> System.out.println(str.toUpperCase());
//
//        names.forEach(changeToUpperCase);

//        Predicate Functional Interface -> returns boolean value T/F contains
//        test() method
//        Predicate<Integer> age = num -> num > 20;
//        System.out.println(age.test(10));

//        Employee e =new Employee();
//        e.setId(1);
//        e.setSal(27000);
//        e.setGender("FEMALE");
//
//        Predicate<Employee> salCheck = emp -> emp.getSal() > 26000;
//        Predicate<Employee> genderCheck = emp -> emp.getGender().equalsIgnoreCase("FEMALE");
//
//        System.out.println( salCheck.and(genderCheck).test(e));
//
//        System.out.println(genderCheck.negate().test(e));

//        Function Functional Interface
//        Function<Integer, Double> func = i -> (double) (i*i);
//        System.out.println(func.apply(5));
//
//        Function<String, String> func2 = String::toUpperCase;
//
//        System.out.println(func2.apply("Hussain Sunkara"));
//
//        Function<String, String> funcNull = str ->
//                str == null ? "Enter valid name" : str;
//
//        System.out.println(funcNull.andThen(func2).apply(null));
//        try{
//            System.out.println(funcNull.compose(func2).apply(null));
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }



    }
}
