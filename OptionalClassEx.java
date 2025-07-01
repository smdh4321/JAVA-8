import java.util.Optional;

public class OptionalClassEx {
    public static void main(String[] args) {
//        Optional Class
        Optional<String> name = getName();
//        name.ifPresentOrElse(
//                val -> System.out.println(val.toUpperCase()),
//                ()-> System.out.println("value is not present or it is empty"));

//        Optional<String> value = name.filter(val -> val.equalsIgnoreCase("Hussain"));
//        System.out.println(value.orElse("Name doesn't match"));

        Optional<String> value = name.
                filter(val -> val.equalsIgnoreCase("Hussain")).
                map(val->val.toUpperCase());
        System.out.println(value.orElse("Name doesn't match"));

//        String res=name.orElse("value is not present or it is empty");
//        System.out.println(res.toUpperCase());
    }
    public static Optional<String> getName(){
        String name = "Hussain";
        Optional<String> value;

        if(name == null){
            value = Optional.empty();
        }else{
            value = Optional.of(name);
        }
        return value;
    }
}
