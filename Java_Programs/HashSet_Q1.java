//Let's see a simple example of HashSet. Notice, the elements iterate in an unordered collection.

    import java.util.*;
    class HashSet_Q1{
     public static void main(String args[]){
      //Creating HashSet and adding elements
        HashSet<String> set=new HashSet<String>();
               set.add("One");
               set.add("Two");
               set.add("Three");
               set.add("Four");
               set.add("Five");
               //Traversing elements
               Iterator<String> i=set.iterator();
               while(i.hasNext())
               {
               System.out.println(i.next());
               }
     }
    }
