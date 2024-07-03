package setCollection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
    public static void main(String[] args) {
        Set<Integer> nunSet =new HashSet();
// set does not allow duplicate values

        nunSet.add(12);
        nunSet.add(674);
        nunSet.add(45);
        nunSet.add(34);
        nunSet.add(86);
        nunSet.add(3563);

        System.out.println(nunSet);
        System.out.println("Size of set "+ nunSet.size());


        //Tree set is a sorted set work on BST

        Set treeSet=new TreeSet();
        treeSet.addAll(nunSet);
        System.out.println("Tree Set "+ treeSet);
    }

}
