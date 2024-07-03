package arrayList;

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {


    //Type safe arrayList
    List <String> nameArray1=new ArrayList<String>();

    //Adding element
    nameArray1.add("Pankaj");
    nameArray1.add("Amit");
    nameArray1.add("Rahul");

        System.out.println(nameArray1);
        System.out.println("Size of array"+nameArray1.size());
        System.out.println(nameArray1.contains("Rahul"));


    //UnType safe arrayList
        List nameArray2=new LinkedList();

        //Adding element
        nameArray2.addAll(nameArray1);
        nameArray2.add(12);
        nameArray2.add(36);

        System.out.println(nameArray2);
        System.out.println("Size of list"+ nameArray2.size());
        System.out.println(nameArray2.contains(145));

}
}
