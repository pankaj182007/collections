package map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Hashmap {
    public static void main(String[] args) {
        Map<String,Integer> courses=new HashMap();
        courses.put("java",4000);
        courses.put("Spring",2000);
        courses.put("Sql",2000);
        courses.put("Android",5000);
        courses.put("PHP",4000);

        System.out.println(courses);
        //searching for same value
       courses.entrySet().stream().filter((e)-> e.getValue()==4000).forEach(System.out::println);
    }
}
