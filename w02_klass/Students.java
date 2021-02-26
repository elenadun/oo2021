import java.util.ArrayList;
 
public class Students {
  public static void main(String[] args) {
    
     // create an ArrayList called studentList, which initially holds []
        ArrayList<String> studentList = new ArrayList<String>();
    
    // add students to the ArrayList
    studentList.add("Joosep");
    studentList.add("Liisa");
    studentList.add("Saskia");
    studentList.add("Toni");
    
    // remove John from the ArrayList, then Lily
    studentList.remove(0);
    studentList.remove("Liisa");
    
    
    System.out.println(studentList);
  }
}
    

