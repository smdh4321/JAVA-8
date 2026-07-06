package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student1{
    String name;
    int score;

    Student1(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString(){
        return name + " -> "+ score;
    }

    public int getScore(){
        return this.score;
    }

    public String getName(){
        return this.name;
    }
}
public class ParallelStreamsEx {
    public static void main(String[] args) {
        List<Student1> list = new ArrayList<>();
        list.add(new Student1("ABC",75));
        list.add(new Student1("DEF",85));
        list.add(new Student1("GHI",88));
        list.add(new Student1("JKL",72));
        list.add(new Student1("MNO",95));

        //using stream() method --> Sequential processing
        List<Student1> result = list.stream().filter(x -> x.score > 70).limit(3).collect(Collectors.toList());
        System.out.println(result);

        System.out.println("--------------------------------");

        //using parallelStream() method --> parallel processing
        list.parallelStream().filter(a -> a.score > 80).limit(2).forEach(x -> System.out.println(x.getName()+" "+x.getScore()));

        System.out.println("--------------------------------");

        //convert stream() into parallelStream() using parallel() method
        List<Student1> res = list.stream().parallel().filter(x -> x.score > 70).limit(3).collect(Collectors.toList());
        System.out.println(res);

    }
}
