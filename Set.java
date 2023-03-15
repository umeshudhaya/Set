package com.company.kumar;

import java.util.*;

public class Set {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add("Chennai");
        hs.add("Banglore");
        hs.add("Delhi");
        hs.add("Kerala");
        hs.add("Jammu");

        System.out.println(hs);
        /*12. Write a Java program to remove all of the elements from a hash set.
        System.out.println("before removing elements "+hs);
        hs.removeAll(hs);
        System.out.println("after removing elements  "+hs);
         */


        /*11. Write a Java program to compare two sets and retain elements which are same on both sets.*/
         HashSet hs2=new HashSet<>();
         hs2.add("Banglore");
         hs2.add(" Jammu ");
         hs2.add("Chennai");
         hs2.add("malaysia");
         hs2.add("Kerala");

//        System.out.println("hashset hs2 "+hs2);
//        hs.retainAll(hs2);
//        System.out.println("after retain "+hs);



        /*10. Write a Java program to compare two hash set. */
        for (Object ops1:hs) {
            System.out.println(hs2.add(hs.contains(ops1)?"yes":"no"));
        }


        /*9. Write a Java program to convert a hash set to a List/ArrayList.
        List <String>list=new ArrayList<String>(hs);
        System.out.println("hashset convert to List/ArrayList ");
        for (String str:list) {
            System.out.println(str);
        }
         */


        /*8. Write a Java program to convert a hash set to a tree set.
        TreeSet treeSet=new TreeSet<>(hs);
        for (Object obs:treeSet) {
            System.out.println(obs);
        }
         */

        /*7. Write a Java program to convert a hash set to an array.
         Object [] obj1=hs.toArray();
        for (Object ob:hs) {
            System.out.println(ob);
        }
         */

        /*6. Write a Java program to clone a hash set to another hash set.
        HashSet hs1=new HashSet<>();
         hs1=(HashSet)hs.clone();
        System.out.println("cloned   hashset"+hs1);

         */


         /*5. Write a Java program to test a hash set is empty or not.
        System.out.println("Original Hash Set: " + hs);
        System.out.println("Checking the above array list is empty or not! "+hs.isEmpty());
        System.out.println("Remove all the elements from a Hash Set: ");
        hs.removeAll(hs);
        System.out.println("Hash Set after removing all the elements "+hs);

          */

        /*
        4. Write a Java program to empty an hash set.

        System.out.println(" original hashset  "+hs);
        hs.removeAll(hs);
        System.out.println("Hash Set after removing all the elements "+hs);

         */

        /*3. Write a Java program to get the number of elements in a hash set.

        System.out.println("number of elements in hashset"+hs.size());

         */

        /*1. Write a Java program to append the specified element to the end of a hash set

          System.out.println("append the specified elements"+hs);

         */
        /* 2. Write a Java program to iterate through all elements in a hash list.
        for (Object b:hs) {
            System.out.println(b);
        }*/
    }

}
