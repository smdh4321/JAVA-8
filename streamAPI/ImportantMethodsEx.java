package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//distinct() limit() skip() --> non-terminal methods
//count() forEach() reduce() toArray() --> terminal methods
public class ImportantMethodsEx {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("car","bus","bicycle","car","bus","bike");

        //distinct()
        vehicles.stream().distinct().forEach(System.out :: println);
        System.out.println("------------------");

        //count()
        long c = vehicles.stream().distinct().count();
        System.out.println(c);
        System.out.println("------------------");

        //limit()
        vehicles.stream().limit(3).forEach(System.out :: println);

        System.out.println("------------------");

        //min()
        List<Integer> list = Arrays.asList(1,2,4,5,2,4,6,7,9,0);

        Optional<Integer> min = list.stream().min((n1, n2) -> n1.compareTo(n2));
        System.out.println(min.get());

        System.out.println("--------------------");

        //max()
        Optional<Integer> max = list.stream().max((n1, n2) -> n1.compareTo(n2));
        System.out.println(max.get());
        System.out.println("--------------------");

        //reduce()
        List<String> names = Arrays.asList("Sunkara","Mohammed","Hussain");
        Optional<String> reduce = names.stream().reduce((value, combinedVal) -> value + combinedVal);
        System.out.println(reduce.get());
        System.out.println("--------------------");

        //toArray()
        List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Object[] arr = l1.stream().toArray();
        System.out.println(arr.length);
        for(Object ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println("--------------------");


        //skip()
        List<Integer> res = l1.stream().skip(1).collect(Collectors.toList());
        System.out.println(res);

    }
}
