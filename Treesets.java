package com.company.kumar;
import  java.util.*;
import java.util.Set;

public class Treesets
{
    public static void main(String[] args) {
        TreeSet<String> tr=new <String>TreeSet();
        tr.add("east");
        tr.add("west");
        tr.add("south");
        tr.add("north");
        tr.add("earth");

          /*16. Write a Java program to remove a given element from a tree set.*/
        System.out.println("original element "+tr);
           System.out.println("removing given set element  "+tr.remove("north"));
        System.out.println("after removing set element "+tr);


        /* 14. Write a Java program to retrieve and remove the first element of a tree set
        System.out.println("original set"+tr);
        System.out.println("removing first element ----->"+tr.pollFirst());
        System.out.println("after removing first element "+tr);
         */

        /*15. Write a Java program to retrieve and remove the last element of a tree set.
        System.out.println("original set "+tr);
        System.out.println("removing last element -----> "+tr.pollLast());
        System.out.println("after removing last element ----->"+tr);
         */

       /*12. Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element
           TreeSet<Integer> ts=new TreeSet<Integer>();
           ts.add(8);
           ts.add(13);
           ts.add(32);
           ts.add(96);
           ts.add(35);
           ts.add(95);
           ts.add(65);
           ts.add(89);
//        System.out.println("strictly greater than or equal to the given 12 <--->"+ts.higher(12));
//        System.out.println("strictly greater than or equal to the given 25 <--->"+ts.higher(25));

        /*13. Write a Java program to get an element in a tree set which is strictly less than the given element.
        System.out.println("strictly less than 33=="+ts.lower(33));
        System.out.println("strictly less than 88=="+ts.lower(88));

        */



           ///--------------------------------------------------------------------------------------->
      /*10. Write a Java program to get the element in a tree set which is greater than or equal to the given element
        TreeSet <Integer>tree_num = new TreeSet<Integer>();
        TreeSet <Integer>treeheadset = new TreeSet<Integer>();

        // Add numbers in the tree
        tree_num.add(10);
        tree_num.add(22);
        tree_num.add(36);
        tree_num.add(25);
        tree_num.add(16);
        tree_num.add(70);
        tree_num.add(82);
        tree_num.add(89);
        tree_num.add(14);
        System.out.println("Greater than or equal to 86 : "+tree_num.ceiling(50));
        System.out.println("Greater than or equal to 29 : "+tree_num.ceiling(29));

       */



        /* 9. Write a Java program to find the numbers less than 7 in a tree set
        TreeSet <Integer>tree_num = new TreeSet<Integer>();
        TreeSet <Integer>treeheadset = new TreeSet<Integer>();

        // Add numbers in the tree
        tree_num.add(1);
        tree_num.add(2);
        tree_num.add(3);
        tree_num.add(5);
        tree_num.add(6);
        tree_num.add(7);
        tree_num.add(8);
        tree_num.add(9);
        tree_num.add(10);

        treeheadset=(TreeSet)tree_num.headSet(7);

        for (Integer ttr:treeheadset) {
            System.out.println(ttr);
        }

         */




        /*7. Write a Java program to get the number of elements in a tree set.
        System.out.println("the number of elements in tr set "+tr.size());

         */

        /*6. Write a Java program to clone a tree set list to another tree set.
        TreeSet trs=new TreeSet<>();
        System.out.println("original set "+tr);
        System.out.println("before clone trs "+trs);
        trs=(TreeSet)tr.clone();
        System.out.println("after clone "+trs);
         */

        /*5. Write a Java program to get the first and last elements in a tree set.
        System.out.println("original set "+tr);
        System.out.println(" last element------> "+tr.last());
        System.out.println("first element------> "+tr.first());
         */

         /* 4.Write a Java program to create a reverse order view of the elements contained in a given tree set.
            Iterator itr1= tr.descendingIterator();
            while (itr1.hasNext()){
                System.out.println(itr1.next());
            }

          */

       /* 3. Write a Java program to add all the elements of a specified tree set to another tree set.
           TreeSet <String> tr1=new <String>TreeSet();
           tr1.add("pass");
           tr1.add("mass");
           tr1.add("bass");
           tr1.add("cash");
           tr.addAll(tr1);
        System.out.println(" tree set to another tree set "+tr);
*/
        /*8. Write a Java program to compare two tree sets.*/
     /*   System.out.println("compare two tree");
        for (String ss:tr) {
            System.out.println(tr1.add(tr.contains(ss)?"yes":"no"));
        }*/

       /* 1.Write a Java program to create a new tree set, add some names (string) and print out the tree set.
       System.out.println("append tree list "+tr);*/


       /* //2.Write a Java program to iterate through all elements in a tree set.
        System.out.println("iteration in tree set");
        for (String o:tr) {
            System.out.println(o);
        }*/




    }

}
