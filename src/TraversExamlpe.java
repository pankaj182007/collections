import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TraversExamlpe {
    public static void main(String[] args) {
        List<String> nameArray1=new ArrayList<String>();

        //Adding element
        nameArray1.add("Pankaj");
        nameArray1.add("Amit");
        nameArray1.add("Rahul");
        nameArray1.add("Ankit");
        nameArray1.add("Anuj");

        // 1. For Each loop for collection
        System.out.println("ForEach loop for collection");
        for (String i : nameArray1)
        {
            System.out.print(i+"\t" +i.length()+"\t");
            StringBuffer br=new StringBuffer(i);
            //to reverse the string
            System.out.println(br.reverse());
        }

        System.out.println("\n-----------------------------------------------------");
        // 2. forEach method in collection framework
        System.out.println("forEach method in collection framework");
        nameArray1.forEach(i->{
            System.out.print(i+"\t" +i.length()+"\t");
            StringBuffer br=new StringBuffer(i);
            //to reverse the string
            System.out.println(br.reverse());

        });

        System.out.println("\n-----------------------------------------------------");
        // 3.Using Iterator : Forward traversal
        System.out.println("using iterator in collection framework");
        Iterator<String> itr = nameArray1.iterator();
        while (itr.hasNext())
        {
            String i=itr.next();
            System.out.print(i+"\t" +i.length()+"\t");
            StringBuffer br=new StringBuffer(i);
            //to reverse the string
            System.out.println(br.reverse());
        }
        
        System.out.println("\n-----------------------------------------------------");
        // 3.Using ListIterator : Forward traversal
        System.out.println("using List iterator in collection framework");
        ListIterator<String> litr = nameArray1.listIterator(nameArray1.size());
        while (litr.hasPrevious())
        {
            String i=litr.previous();
            System.out.print(i+"\t" +i.length()+"\t");
            StringBuffer br=new StringBuffer(i);
            //to reverse the string
            System.out.println(br.reverse());
        }


    }
}
