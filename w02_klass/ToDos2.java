import java.util.*;
// java.util.* on kogu klasside importimine
public class ToDos2 {

  public static void main(String args[]) { 
      int count[] = {3,1,6,5,4,2};

      // Set koostamine
      Set<Integer> set = new HashSet<Integer>(); 

      try {
         for(int i = 0; i < 5; i++) {
            set.add(count[i]);
         }
         System.out.println(set);

         //TreeSet on (Java TreeSet class is part of Java’s collections framework)
         TreeSet sortedSet = new TreeSet<Integer>(set);

         System.out.println("Sorteeritud list:");
         System.out.println(sortedSet);

         System.out.println( (Integer)sortedSet.first() + " punkt ToDost: kaia poes");
         System.out.println( (Integer)sortedSet.last() + " punkt ToDost: vaadata uut sarja");
      }
      catch(Exception e) {} //catch exception (Java catch block is used to handle the Exception by declaring the type of exception within the parameter) 
   }
  
} 
