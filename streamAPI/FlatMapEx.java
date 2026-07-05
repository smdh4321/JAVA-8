package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    int roll;
    String name;
    int marks;

    Student(int roll, String name, int marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}

public class FlatMapEx {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2);
        List<Integer> list2 = Arrays.asList(3,4);
        List<Integer> list3 = Arrays.asList(5,6,7);

        List<List<Integer>> list4 = Arrays.asList(list1,list2,list3);

        List<Integer> result = list4.stream().flatMap(x -> x.stream()).map(n -> n + 10).collect(Collectors.toList());

        System.out.println(result);

        System.out.println("---------------------------------------------");

        List<Student> stList = new ArrayList<>();
        stList.add(new Student(1,"ABC",89));
        stList.add(new Student(2,"DEF",90));
        stList.add(new Student(3,"GHI",75));

        List<Student> stList2 = new ArrayList<>();
        stList2.add(new Student(4,"JKL",98));
        stList2.add(new Student(5,"MNO",76));
        stList2.add(new Student(6,"PQR",100));

        List<List<Student>> studentsList = Arrays.asList(stList,stList2);

        List<String> resList = studentsList.stream()
                .flatMap(x -> x.stream())
                .filter(b -> b.marks > 80)
                .map(n -> n.name)
                .collect(Collectors.toList());

        System.out.println(resList);


    }
}
