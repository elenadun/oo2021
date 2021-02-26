import java.util.ArrayList;

public class ToDos {
    
  public static void main(String[] args) {
    
    // Arraylist ToDo koostamine
    ArrayList<String> ElenaToDos = new ArrayList<String>();

    //Arraylisti sisse lisamine .add abil
    ElenaToDos.add("kaia poes");
    ElenaToDos.add("pesta aknad");
    ElenaToDos.add("teha ara kodutoo");
    ElenaToDos.add("lugeda raamat");
    ElenaToDos.add("pesta porandad");
    ElenaToDos.add("vaadata uut sarja");
    
    ElenaToDos.remove("kaia poes"); //kustuta
    
    // leida indeks 
    int needToDo = ElenaToDos.indexOf("pesta porandad");
      
    // printida mida on vaja teha ToDost
    System.out.println(needToDo + " punkt on veel tegemata");

  }
  
}