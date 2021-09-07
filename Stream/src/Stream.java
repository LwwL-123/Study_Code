import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {

        ArrayList<student> students = new ArrayList<>();
        students.add(new student(1, "lzw"));
        students.add(new student(1, "lzw"));
        students.add(new student(2, "lzww"));
        students.add(new student(3, "lzwww"));
        students.add(new student(4, "lzwwww"));
        students.add(new student(5, "lzwwwww"));


        //filter
        System.out.println(students.stream().filter(x -> x.getId() > 3).collect(Collectors.toList()));

        //distinct去除重复元素
        System.out.println(students.stream().distinct().collect(Collectors.toList()));

        //forEach
        students.stream().forEach(System.out::println);

        //map
        System.out.println(students.stream().map(s -> {
            s.setId(s.getId() + 1);
            return s;
        }).collect(Collectors.toList()));


    }
}
