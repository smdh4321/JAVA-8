package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,20,25,30);
        list.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));

        List<String> names = Arrays.asList("Sunkara","Mohammed","Hussain");
        List<String> namesUpperCase = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(namesUpperCase);

        List<Integer> len = names.stream().map(name -> name.length()).collect(Collectors.toList());
        System.out.println(len);
    }
}
