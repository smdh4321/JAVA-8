import java.util.*;
import java.util.stream.Collectors;

public class CollectorsClassEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten");

        //toList()
        List<String> toListRes = list.stream().collect(Collectors.toList());
        System.out.println(toListRes);
        System.out.println("----------------------");

        //toSet()
        Set<String> toSetRes = list.stream().collect(Collectors.toSet());
        System.out.println(toSetRes);
        System.out.println("----------------------");

        //toMap() variant one
        Map<String, Integer> toMapRes = list.stream().collect(Collectors.toMap(e -> e, s -> s.length()));
        System.out.println(toMapRes);
        System.out.println("-----------------------");

        //toMap() variant two
        //this method helps us to avoid key collision while working with map
        Map<Integer,String> toMapRes2 = list.stream()
                .collect(Collectors.toMap(s -> s.length(),e -> e,(oldVal,newVal) -> oldVal +" : "+ newVal));
        System.out.println(toMapRes2);
        System.out.println("-----------------------");

        //toCollection()
        TreeSet<String> ascFormat = list.stream().collect(Collectors.toCollection(() -> new TreeSet<>()));
        System.out.println(ascFormat);
        System.out.println("-----------------------");

        //counting()
        long count = list.stream().collect(Collectors.counting());
        System.out.println(count);
        System.out.println("-----------------------");

        //joining() variant 1
        String collect1 = list.stream().collect(Collectors.joining());
        System.out.println(collect1);
        System.out.println("-----------------------");

        //joining() variant 2
        String collect2 = list.stream().collect(Collectors.joining(","));
        System.out.println(collect2);
        System.out.println("-----------------------");

        //joining() variant 3
        String collect3 = list.stream().collect(Collectors.joining(",","{","}"));
        System.out.println(collect3);
        System.out.println("-----------------------");

        //partioningBy() variant 1
        Map<Boolean,List<String>> res = list.stream().collect(Collectors.partitioningBy(s -> s.length() > 3));
        System.out.println(res);
        System.out.println("-----------------------");

        //partioningBy() variant 2
        Map<Boolean,Long> res2 = list.stream().collect(Collectors.partitioningBy(s -> s.length() > 3, Collectors.counting()));
        System.out.println(res2);
        System.out.println("-----------------------");

        //groupingBy() variant 1
        Map<Integer, List<String>> res3 = list.stream().collect(Collectors.groupingBy(s -> s.length()));
        System.out.println(res3);
        System.out.println("-----------------------");

        //groupingBy() variant 2
        Map<Integer, String> res4 = list.stream().collect(Collectors.groupingBy(s -> s.length(),Collectors.joining("=>")));
        System.out.println(res4);
        System.out.println("-----------------------");

        //groupingBy() variant 3
        Map<Integer, List<String>> res5 = list.stream().collect(Collectors.groupingBy(s -> s.length(),
                Collectors.mapping(s -> s.toUpperCase(), Collectors.toList())));
        System.out.println(res5);
        System.out.println("-----------------------");

        //summarizingInt() -> we can calculate min, max, sum, avg, count etc

        int[] arr = {1,2,3,4,5};
        IntSummaryStatistics collect = Arrays.stream(arr).boxed().collect(Collectors.summarizingInt(n -> n));
        System.out.println("Min value is " + collect.getMin());
        System.out.println("Max value is " + collect.getMax());
        System.out.println("Sum value is " + collect.getSum());
        System.out.println("Avg value is " + collect.getAverage());
        System.out.println("Count value is " + collect.getCount());
        System.out.println("-----------------------");

        //minBy()
        Optional<Integer> collect4 = Arrays.stream(arr).boxed().collect(Collectors.minBy(Comparator.comparingInt(n -> n)));
        System.out.println(collect4.get());
        System.out.println("-----------------------");

        //maxBy()
        Optional<Integer> collect5 = Arrays.stream(arr).boxed().collect(Collectors.maxBy(Comparator.comparingInt(n -> n)));
        System.out.println(collect5.get());
        System.out.println("-----------------------");

        //summingInt()
        Integer collect6 = Arrays.stream(arr).boxed().collect(Collectors.summingInt(n -> n));
        System.out.println(collect6);
        System.out.println("-----------------------");

        //averagingInt()
        Double collect7 = Arrays.stream(arr).boxed().collect(Collectors.averagingInt(n -> n));
        System.out.println(collect7);

    }
}
