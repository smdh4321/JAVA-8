
import java.util.Optional;

public class OptionalClassEx2 {
    public static void main(String[] args) {
        Optional<String> emptyOpt = Optional.empty();
        System.out.println(emptyOpt);

        String name = null;

//        Optional<String> nameOpt = Optional.of(name);
//        System.out.println(nameOpt.get());

        Optional<String> canBeNullable = Optional.ofNullable(name);
        System.out.println(canBeNullable);
        
//        isPresent()
        if(canBeNullable.isPresent()){
            System.out.println("Name is present");
        }else{
            System.out.println("name is not present");
        }
        
//        ifPresent()
        System.out.println("o");
        canBeNullable.ifPresent(n -> System.out.println(n));
        System.out.println("k");
        canBeNullable.ifPresentOrElse(n -> System.out.println(n),() -> System.out.println("Not"));

        System.out.println(canBeNullable.orElse("Name is not there"));
        System.out.println(canBeNullable.orElseGet(() -> "Name is not there"));
//        System.out.println(canBeNullable.get());

    }
}
