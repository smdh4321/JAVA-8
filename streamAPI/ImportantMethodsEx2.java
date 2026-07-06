package streamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImportantMethodsEx2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,3,5,6,1,3,2,7,9);

        //sorted()
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        List<Integer> sortedList2 = list.stream().sorted((n1,n2) -> n2.compareTo(n1)).collect(Collectors.toList());
        System.out.println(sortedList2);

        System.out.println("--------------------------------");

        //anyMatch()

        Set<String> names = new HashSet<>();
        names.add("Sunkara");
        names.add("Mohammed");
        names.add("Hussain");

        boolean anyMatchRes = names.stream().anyMatch(name -> name.startsWith("S"));
        System.out.println(anyMatchRes);

        System.out.println("--------------------------------");

        //allMatch()
        boolean allMatchRes = names.stream().allMatch(name -> name.startsWith("S"));
        System.out.println(allMatchRes);

        System.out.println("--------------------------------");

        //noneMatch()
        boolean noneMatchRes = names.stream().noneMatch(name -> name.startsWith("X"));
        System.out.println(noneMatchRes);
        System.out.println("--------------------------------");

        //findAny()
        Optional<Integer> findAnyRes= list.stream().findAny();
        System.out.println(findAnyRes.get());
        System.out.println("--------------------------------");

        //findFirst()
        Optional<Integer> findFirstRes= list.stream().findFirst();
        System.out.println(findFirstRes.get());
        System.out.println("--------------------------------");

        //concate Streams

        List<String> l1 = Arrays.asList("ABC","DEF","GHI");
        List<String> l2 = Arrays.asList("JKL","MNO","PQR");

        Stream s1 = l1.stream();
        Stream s2 = l2.stream();

        List<String> concateStream = (List<String>) Stream.concat(s1, s2).collect(Collectors.toList());
        System.out.println(concateStream);
        System.out.println("--------------------------------");


    }
}
